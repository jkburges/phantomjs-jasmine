ant.mkdir(dir:"${basedir}/test/jasmine")
ant.mkdir(dir:"${basedir}/src/jasmine")

// Copy required javascript files.
ant.copy(todir: "${basedir}/src/jasmine")
{
	fileset(dir: "${pluginBasedir}/src/jasmine")
}
