package org.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class GreetingTask extends DefaultTask {
    String message = 'Starting Generation'

    @TaskAction
    def generate() {
        println message
    }
}
