eventTestPhaseEnd = { phase ->
    if (phase == "other") {
       println "jasmine" 

	   //phantomjs src/jasmine/lib/phantom-jasmine/run_jasmine_test.coffee src/jasmine/SpecRunner.html

       ant.exec(outputproperty:"cmdOut",
             errorproperty: "cmdErr",
             resultproperty:"cmdExit",
             failonerror: "true",
             executable: 'phantomjs') {
         arg(line: "src/jasmine/lib/phantom-jasmine/run_jasmine_test.coffee src/jasmine/SpecRunner.html")
        }
println "return code:  ${ant.project.properties.cmdExit}"
println "stderr:         ${ant.project.properties.cmdErr}"
println "stdout:        ${ ant.project.properties.cmdOut}"

    }
}

