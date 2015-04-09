<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    <title>Jasmine Spec Runner</title>

    <link rel="stylesheet" type="text/css" href="${resource(dir: 'js/jasmine/lib/jasmine-1.3.1', file: 'jasmine.css', base: resourceBase)}">

    <g:each var="scriptDesc" in="${scripts}">
      <script type="text/javascript" src="${resource(dir: scriptDesc.dir, file: scriptDesc.file, base: scriptDesc.base)}"></script>
    </g:each>

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
</html>
