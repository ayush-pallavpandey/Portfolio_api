package com.ayush.portfolio_api.model;

public class Project {

    private String name;
    private String technology;

    public Project() {
    }

    public Project(String name, String technology) {
        this.name = name;
        this.technology = technology;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }
}