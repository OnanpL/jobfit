package com.jobfit.jobfit.job;

import java.time.LocalDate;

public class Job {
    private final Long id;
    private final String company;
    private final String title;
    private final String location;
    private final LocalDate deadline;
    
    public Job(Long id, String company, String title, String location, LocalDate deadline) {
        this.id = id;
        this.company = company;
        this.title = title;
        this.location = location;
        this.deadline = deadline;
    }
    
    public Long getId() {
        return id;
    }
    public String getCompany() {
        return company;
    }
    public String getTitle() {
        return title;
    }
    public String getLocation() {
        return location;
    }
    public LocalDate getDeadline() {
        return deadline;
    }
}
