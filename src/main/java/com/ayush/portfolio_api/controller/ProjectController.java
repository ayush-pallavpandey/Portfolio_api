package com.ayush.portfolio_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ayush.portfolio_api.model.Project;
import com.ayush.portfolio_api.service.ProjectService;

@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping("/project")
    public Project createProject(@RequestBody Project project) {
        return projectService.createProject(project);
    }

    @GetMapping("/project/{id}")
    public String getProjectById(@PathVariable int id) {
        return projectService.getProjectById(id);
    }

    @PutMapping("/project/{id}")
    public String updateProject(
            @PathVariable int id,
            @RequestBody Project project) {

        return projectService.updateProject(id, project);
    }

    @DeleteMapping("/project/{id}")
    public String deleteProject(
            @PathVariable int id) {

        return projectService.deleteProject(id);
    }
}