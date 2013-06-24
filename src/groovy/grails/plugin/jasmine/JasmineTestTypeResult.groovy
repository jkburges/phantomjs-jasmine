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

    JasmineTestTypeResult(int passCount, int failCount) {
        this.passCount = passCount
        this.failCount = failCount
    }

    int getFailCount() {
        return failCount
    }

    int getPassCount() {
        return passCount
    }
}