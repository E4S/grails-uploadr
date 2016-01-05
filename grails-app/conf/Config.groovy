log4j = {
    error 'org.codehaus.groovy.grails',
          'org.springframework',
          'org.hibernate',
          'net.sf.ehcache.hibernate'
}

// used by the demo tag
uploadr.defaultUploadPath = "${System.getProperty('user.home')}/Downloads/uploadr"
// used by the cleanUploadedFilesJob Quartz job (on ci and development)
uploadr.maxAgeUploadedFile = 1000 * 60 * 60 * 4  // 4 hours in milliseconds
