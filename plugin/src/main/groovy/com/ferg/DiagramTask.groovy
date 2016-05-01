package com.ferg

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class DiagramTask extends DefaultTask {
    @InputFiles Iterable<File> classpath
    @OutputDirectory File generatedFileDir = project.file("${project.buildDir}/generated")

    String message = 'Starting Generation'

    @TaskAction
    def generate() {
        println message
    }
}
