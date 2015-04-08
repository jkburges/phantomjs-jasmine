class PhantomjsJasmineGrailsPlugin {
    def version = "0.0.1"
    def grailsVersion = "1.3.7 > *"
    def dependsOn = [:]

    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    def author = "Jon Burgess"
    def authorEmail = "jkburges@gmail.com"
    def title = "PhantomJS Jasmine test runner"
    def description = '''\\
Runs jasmine tests using PhantomJS.
'''

    // URL to the plugin's documentation
    def documentation = "https://github.com/jkburges/phantomjs-jasmine"

    def environments = ['test']

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }
}
