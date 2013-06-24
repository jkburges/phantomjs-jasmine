loadJasmineTestTypeClass = { ->
    // def doLoad = { -> classLoader.loadClass('grails.plugin.jasmine.JasmineTestType') }
    // try {
    //     doLoad()
    // } catch (ClassNotFoundException e) {
    //     includeTargets << grailsScript("_GrailsCompile")
    //     compile()
    //     doLoad()
    // }

    classLoader.loadClass('grails.plugin.jasmine.JasmineTestType')
}

loadJasmineTestTypes = {
    if (!binding.variables.containsKey("unitTests")) return
    def jasmineTestTypeClass = loadJasmineTestTypeClass()
    //    [unit: unitTests, integration: integrationTests].each { name, types ->
    [unit: unitTests].each { name, types ->
        if (!types.any { it.class == jasmineTestTypeClass }) {
            types << jasmineTestTypeClass.newInstance(name)
        }
    }
}

eventAllTestsStart = {
    loadJasmineTestTypes()
}