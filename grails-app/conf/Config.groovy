// configuration for plugin testing - will not be included in the plugin zip

log4j = {
    // Example of changing the log pattern for the default console
    // appender:
    //
    //appenders {
    //    console name:'stdout', layout:pattern(conversionPattern: '%c{2} %m%n')
    //}

    error  'org.codehaus.groovy.grails.web.servlet',  //  controllers
           'org.codehaus.groovy.grails.web.pages', //  GSP
           'org.codehaus.groovy.grails.web.sitemesh', //  layouts
           'org.codehaus.groovy.grails.web.mapping.filter', // URL mapping
           'org.codehaus.groovy.grails.web.mapping', // URL mapping
           'org.codehaus.groovy.grails.commons', // core / classloading
           'org.codehaus.groovy.grails.plugins', // plugins
           'org.codehaus.groovy.grails.orm.hibernate', // hibernate integration
           'org.springframework',
           'org.hibernate',
           'net.sf.ehcache.hibernate'

    warn   'org.mortbay.log'
}

grails.views.default.codec="none" // none, html, base64
grails.views.gsp.encoding="UTF-8"

// quartz configuration
quartz {
    autoStartup = true
    jdbcStore = false
    waitForJobsToCompleteOnShutdown = true
}

//// make sure quartz automatically start in development and ci instances
//environments {
//    development {
//        quartz {
//            autoStartup = true
//        }
//    }
//    ci {
//        quartz {
//            autoStartup = true
//        }
//    }
//}

// used by the demo tag
uploadr.defaultUploadPath="${System.getProperty('user.home')}/Downloads/uploadr"
// used by the cleanUploadedFilesJob Quartz job (on ci and development)
uploadr.maxAgeUploadedFile=1000 * 60  * 60  * 4  // 4 hours in milliseconds