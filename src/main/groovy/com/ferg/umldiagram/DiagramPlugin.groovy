package com.ferg.umldiagram

import org.gradle.api.Project
import org.gradle.api.Plugin

class DiagramPlugin implements Plugin<Project> {
    void apply(Project target) {
        target.task('hello', type: DiagramTask)
    }
}
