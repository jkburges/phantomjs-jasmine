/*
 * Copyright 2013 IMOS
 *
 * The phantomjs/jasmine plugin is distributed under the terms of the GNU General Public License
 *
 */
package grails.plugin.jasmine

import org.codehaus.groovy.grails.test.GrailsTestTypeResult

class JasmineTestTypeResult implements GrailsTestTypeResult {

    int failCount = 0
    int passCount = 1

    JasmineTestTypeResult(int jasmineExitCode) {
        this.passCount = jasmineExitCode == 0 ? 1 : 0
        this.failCount = jasmineExitCode == 0 ? 0 : 1
    }

    int getFailCount() {
        return failCount
    }

    int getPassCount() {
        return passCount
    }
}