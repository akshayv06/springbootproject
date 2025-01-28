package com.springbootproject.controller;

import com.springbootproject.model.Job;
import com.springbootproject.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("/abc")
    public List<Job> getAllJobs() {

        return jobService.getAllJobs();
    }

    @GetMapping("/search")
    public List<Job> searchJobs(@RequestParam List<String> skills, @RequestParam String location) {
        return jobService.searchJobsBySkills(skills);
    }

    @PostMapping("/abcd")
    public Job postJob(@RequestBody Job job) {
        return jobService.postJob(job);
    }
}
