package com.captivatelabs.grails.plugins.uploadr

/**
 *  Uploadr, a multi-file uploader plugin
 *  Copyright (C) 2016 Captivate Labs, Inc
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
class UploadrGrailsPlugin {
    def version = "1.2-SNAPSHOT"
    def grailsVersion = "2.3 > *"
    def loadBefore = ['jquery', 'asset-pipeline', 'sass-asset-pipeline']
    def author = "Jeroen Wesbeek"
    def authorEmail = "work@osx.eu"
    def title = "HTML5 drag and drop multi-file upload plugin"
    def description = "HTML5 drag and drop multi-file upload plugin"
    def documentation = "https://github.com/dustindclark/grails-uploadr/blob/master/README.md"
    def license = "APACHE"
    def issueManagement = [system: "github", url: "https://github.com/dustindclark/grails-uploadr/issues"]
    def scm = [url: "https://github.com/dustindclark/grails-uploadr"]
    def organization = [name: "Captivate Labs, Inc", url: "http://www.captivatelabs.com/"]
    def developers = [[name: "Dustin D. Clark", email: "dustin@captivatelabs.com"]]
}
