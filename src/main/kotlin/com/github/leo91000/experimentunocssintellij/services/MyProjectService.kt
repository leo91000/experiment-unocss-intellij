package com.github.leo91000.experimentunocssintellij.services

import com.intellij.openapi.project.Project
import com.github.leo91000.experimentunocssintellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
