package com.ferg

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.InputFiles

import org.reflections.Reflections;

class DiagramTask extends DefaultTask {
    @InputFiles Iterable<File> source
    @OutputDirectory File generatedFileDir = project.file("${project.buildDir}/generated")

    String targetLocation;

    @TaskAction
    def generate() {
	source.each { File file -> println file.getName()}
        println targetLocation
	//Reflections reflections = new Reflections("com.consumer.reflected");

        //for (Class<?> clazz : reflections.getTypesAnnotatedWith(Data.class)) {
            //getLogger().info(clazz.toString());
        //}
    }
}
