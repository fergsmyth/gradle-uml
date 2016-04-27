package com.ferg.umldiagram

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class DiagramTask extends DefaultTask {
    String greeting = 'hello from DiagramTask'

    @TaskAction
    def greet() {
        println greeting
    }
}
