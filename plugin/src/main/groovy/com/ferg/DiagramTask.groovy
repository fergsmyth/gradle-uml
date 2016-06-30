package com.ferg

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.InputFiles
import javax.persistence.Entity;
import org.reflections.Reflections;

class DiagramTask extends DefaultTask {
    @InputFiles Iterable<File> source
    @OutputDirectory File generatedFileDir = project.file("${project.buildDir}/generated")

    String targetLocation;

    @TaskAction
    def generate() {
	print "Run generate task"
	source.each { File file -> println file.getName()}
	Reflections reflections = new Reflections("com.ferg");

	print reflections
        for (Class<?> clazz : reflections.getTypesAnnotatedWith(Entity.class)) {
	    print "Inside class printout"
            getLogger().info(clazz.toString());
	    print clazz
        }
    }
}
