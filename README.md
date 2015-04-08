TODO: attribution to where the code has been adapted from.

## Prerequisites
* phantomjs
* grails 1.3.7

## Getting Started

```
git clone https://github.com/jkburges/phantomjs-jasmine.git
```

Now, configure your project to use the plugin:
TODO


```
cd <your project>
grails install-plugin <path>/phantomjs-jasmine/grails-phantomjs-jasmine-0.1.zip
```

This will install an example spec runner and some example specs.  You will obviously need to update these appropriately, but to check everything is working, we can use the examples:

```grails test-app unit:jasmine```

or just open `<your project>/test/jasmine/SpecRunner.html` in a browser.


