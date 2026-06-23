package com.ayush.portfolio_api.service;

import org.springframework.stereotype.Service;

import com.ayush.portfolio_api.model.Project;

@Service
public class ProjectService {

    public Project createProject(Project project) {
        return project;
    }

    public String getProjectById(int id) {
        return "Project ID : " + id;
    }

    public String updateProject(int id, Project project) {
        return "Updated Project " + id + " : " + project.getName();
    }

    public String deleteProject(int id) {
        return "Deleted Project : " + id;
    }
}