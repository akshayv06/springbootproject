package com.springbootproject.repository;

import com.springbootproject.model.Job;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface JobRepository extends MongoRepository<Job, String> {
    List<Job> findByRequiredSkillsIn(List<String> skills);
    List<Job> findByLocation(String location);
}
