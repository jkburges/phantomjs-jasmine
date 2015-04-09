loadJasmineTestTypeClass = { ->
    includeTargets << grailsScript("GenerateSpecRunner")
    generateSpecRunner()

    classLoader.loadClass('grails.plugin.jasmine.JasmineTestType')
}

loadJasmineTestTypes = {
    if (!binding.variables.containsKey("unitTests")) {
        return
    }

    def jasmineTestTypeClass = loadJasmineTestTypeClass()

    [unit: unitTests].each { name, types ->
        if (!types.any { it.class == jasmineTestTypeClass }) {
            types << jasmineTestTypeClass.newInstance(name)
        }
    }
}

eventAllTestsStart = {
    loadJasmineTestTypes()
}
