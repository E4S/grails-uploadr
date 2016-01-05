grails.project.work.dir = "target"

grails.project.dependency.resolver = "maven"
grails.project.dependency.resolution = {
    inherits "global"
    log "warn"
    checksums true
    legacyResolve false

    repositories {
        mavenLocal()
        grailsCentral()
        mavenCentral()
    }

    plugins {
        build(":release:3.1.2", ":rest-client-builder:2.1.1") {
            export = false
        }

        // when running the plugin
        provided("org.grails.plugins:tomcat:8.0.30",
                 "org.grails.plugins:jquery:1.11.1",
                 "org.grails.plugins:cache:1.1.8",
                 "org.grails.plugins:sass-asset-pipeline:2.6.7") {
            // this is a plugin only plugin, should not be transitive to the application
            export = false
        }

        // dependencies
        compile("org.grails.plugins:asset-pipeline:2.6.10") {
            export = false
        }
    }
}
