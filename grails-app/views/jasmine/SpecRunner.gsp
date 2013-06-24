<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
  "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Jasmine Spec Runner</title>

  <link rel="shortcut icon" type="image/png" href="../../src/jasmine/lib/jasmine-1.3.1/jasmine_favicon.png">
  <link rel="stylesheet" type="text/css" href="../../src/jasmine/lib/jasmine-1.3.1/jasmine.css">
  
  <g:resource dir="js" file="mycode.js" />
  
  <script type="text/javascript" src="../../src/jasmine/lib/jasmine-1.3.1/jasmine.js"></script>
  <script type="text/javascript" src="../../src/jasmine/lib/jasmine-1.3.1/jasmine-html.js"></script>
  <script type="text/javascript" src="../../src/jasmine/lib/phantom-jasmine/console-runner.js"></script>

  <!-- include source files here... -->
  <script type="text/javascript" src="../../web-app/js/Player.js"></script>
  <script type="text/javascript" src="../../web-app/js/Song.js"></script>

  <!-- include spec files here... -->
  <script type="text/javascript" src="spec/SpecHelper.js"></script>
  <script type="text/javascript" src="spec/PlayerSpec.js"></script>

  <script type="text/javascript">
    (function() {
      var jasmineEnv = jasmine.getEnv();
      jasmineEnv.updateInterval = 1000;

      var htmlReporter = new jasmine.HtmlReporter();
      jasmineEnv.addReporter(htmlReporter);

      jasmineEnv.specFilter = function(spec) {
        return htmlReporter.specFilter(spec);
      };

      var console_reporter = new jasmine.ConsoleReporter();
      jasmineEnv.addReporter(console_reporter);
      window.console_reporter = console_reporter;

      var currentWindowOnload = window.onload;

      window.onload = function() {
        if (currentWindowOnload) {
          currentWindowOnload();
        }
        execJasmine();
      };

      function execJasmine() {
        jasmineEnv.execute();
      }

    })();
  </script>

</head>

<body>
<!--
<script type="text/javascript">
  var console_reporter = new jasmine.ConsoleReporter()
  jasmine.getEnv().addReporter(new jasmine.TrivialReporter());
  jasmine.getEnv().addReporter(console_reporter);
  jasmine.getEnv().execute();
</script>
-->
</body>
</html>