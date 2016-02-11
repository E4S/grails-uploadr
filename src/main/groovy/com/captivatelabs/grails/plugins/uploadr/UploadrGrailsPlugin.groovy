package com.captivatelabs.grails.plugins.uploadr

class UploadrGrailsPlugin {
    def version = "3.1-SNAPSHOT"
    def grailsVersion = "3.1 > *"
    def loadBefore = ['jquery', 'asset-pipeline', 'sass-asset-pipeline']
    def profiles = ['web']
    def author = "Dustin D. Clark"
    def authorEmail = "dustin@captivatelabs.com"
    def title = "HTML5 drag and drop multi-file upload plugin"
    def description = "HTML5 drag and drop multi-file upload plugin"
    def documentation = "https://github.com/dustindclark/grails-uploadr/blob/master/README.md"
    def license = "APACHE"
    def issueManagement = [system: "github", url: "https://github.com/dustindclark/grails-uploadr/issues"]
    def scm = [url: "https://github.com/dustindclark/grails-uploadr"]
    def organization = [name: "Captivate Labs, Inc", url: "http://www.captivatelabs.com/"]
}
