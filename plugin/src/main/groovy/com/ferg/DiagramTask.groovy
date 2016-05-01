package com.ferg

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.InputFiles

class DiagramTask extends DefaultTask {
    @InputFiles Iterable<File> classpath
    @OutputDirectory File generatedFileDir = project.file("${project.buildDir}/generated")

    String message = 'Starting Generation'

    @TaskAction
    def generate() {
        println message
    }
}
