/*
 * Copyright 2013 IMOS
 *
 * The phantomjs/jasmine plugin is distributed under the terms of the GNU General Public License
 *
 */
package grails.plugin.jasmine

import org.codehaus.groovy.grails.test.support.GrailsTestTypeSupport
import org.codehaus.groovy.grails.test.GrailsTestTypeResult
import org.codehaus.groovy.grails.test.event.GrailsTestEventPublisher
import org.codehaus.groovy.grails.test.report.junit.JUnitReportsFactory
import org.codehaus.groovy.grails.test.support.GrailsTestTypeSupport
import grails.util.Environment

class JasmineTestType extends GrailsTestTypeSupport {

    static final ENVIRONMENT = Environment.TEST.name
    //    static final CONFIG_NAME = "CucumberConfig.groovy"
    // static final CONFIG_PATH = ["grails-app", "conf", CONFIG_NAME].join (File.separator)
    static final NAME = "jasmine"

    JasmineTestType (String testPhase) {
        super (NAME, testPhase)
    }

    @Override
    List<String> getTestExtensions () {
        ["html"]
    }

    @Override
    int doPrepare() {
        1
    }

    @Override
    GrailsTestTypeResult doRun (GrailsTestEventPublisher eventPublisher) {

        def ant = new AntBuilder()
        ant.exec(
        resultproperty:"cmdExit",
        failonerror: "false",
        executable: 'phantomjs') {
            arg(line: "src/jasmine/lib/phantom-jasmine/run_jasmine_test.coffee test/jasmine/SpecRunner.html")
        }

        return new JasmineTestTypeResult(Integer.valueOf(ant.project.properties.cmdExit))
    }

    @Override
    String toString () {
        NAME
    }
}