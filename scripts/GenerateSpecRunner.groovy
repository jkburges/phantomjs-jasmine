includeTargets << grailsScript("_GrailsBootstrap")

target(generateSpecRunner: "Generates SpecRunner.html, which is used to run the jasmine tests.") {
    depends(compile, bootstrap)

    def renderer = appCtx.getBean('groovyPageRenderer')
    def writer = new File(grailsSettings.projectTargetDir, 'SpecRunner.html').newWriter()

    def model = [
        resourceBase: '../web-app',

        // TODO: replace hard coded scripts with config, glob expansion etc.
        scripts: [
            // Jasmine scripts.
            [ dir: 'js/jasmine/lib/jasmine-1.3.1', file: 'jasmine.js', base: '../web-app' ],
            [ dir: 'js/jasmine/lib/jasmine-1.3.1', file: 'jasmine-html.js', base: '../web-app' ],
            [ dir: 'js/phantom-jasmine', file: 'console-runner.js', base: '../web-app' ],

            // Scripts under test.
            [ dir: 'js', file: 'Player.js', base: '../web-app' ],
            [ dir: 'js', file: 'Song.js', base: '../web-app' ],

            // Spec scripts.
            [ dir: 'test/jasmine', file: 'SpecHelper.js', base: '../' ],
            [ dir: 'test/jasmine', file: 'PlayerSpec.js', base: '../' ]
        ]
    ]

    writer << renderer.render(
        view: '/jasmine/simple',
        model: model
    )

    writer.close()
}

setDefaultTarget(generateSpecRunner)
