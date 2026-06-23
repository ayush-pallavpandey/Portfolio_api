package com.ayush.portfolio_api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayush.portfolio_api.model.Project;

@RestController
public class PortfolioController {

    @GetMapping("/about")
    public String about() {
        return "Java Developer Portfolio";
    }

    @GetMapping("/contact")
    public String contact() {
        return "ayush@example.com";
    }

    @GetMapping("/experience")
    public String experience() {
        return "Fresher Java Developer";
    }

    @GetMapping("/projects")
    public List<Project> projects() {

        return List.of(
                new Project(
                        "Portfolio API",
                        "Spring Boot"),

                new Project(
                        "Resume Analyzer",
                        "Java + AI"),

                new Project(
                        "Cloud Deployment",
                        "AWS EC2")
        );
    }
}