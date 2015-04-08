[ 'src/jasmine', 'test/jasmine', 'web-app/js' ].each { path ->
    ant.mkdir(dir: "${basedir}/${path}")
    ant.copy(todir: "${basedir}/${path}") {
        fileset(dir: "${pluginBasedir}/${path}")
    }
}
