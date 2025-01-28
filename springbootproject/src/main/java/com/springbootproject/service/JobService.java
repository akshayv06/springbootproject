package com.springbootproject.service;

import com.springbootproject.model.Job;
import com.springbootproject.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    public List<Job> searchJobsBySkills(List<String> skills) {
        return jobRepository.findByRequiredSkillsIn(skills);
    }

    public List<Job> searchJobsByLocation(String location) {
        return jobRepository.findByLocation(location);
    }

    public Job postJob(Job job) {
        return jobRepository.save(job);
    }
}
