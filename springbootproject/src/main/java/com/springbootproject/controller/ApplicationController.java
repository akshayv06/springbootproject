package com.springbootproject.controller;

//import com.springbootproject.model.Application;
import com.springbootproject.model.JobApplication;
import com.springbootproject.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @PostMapping("/user")
    public JobApplication applyForJob(@RequestParam String userId, @RequestParam String jobId) {
        return applicationService.applyForJob(userId, jobId);
    }

    @GetMapping("/user/{userId}")
    public List<JobApplication> getUserApplications(@PathVariable String userId) {
        return applicationService.getUserApplications(userId);
    }
}