includeTargets << grailsScript("_GrailsBootstrap")

target(generateSpecRunner: "Generates SpecRunner.html, which is used to run the jasmine tests.") {
    depends(compile, bootstrap)

    def renderer = appCtx.getBean('groovyPageRenderer')
    def writer = new File(grailsSettings.projectTargetDir, 'SpecRunner.html').newWriter()
    writer << renderer.render(view: '/jasmine/simple', model: [resourceBase: '../web-app'])
    // writer << renderer.render(view: '/jasmine/specRunner')
    writer.close()
}

setDefaultTarget(generateSpecRunner)
