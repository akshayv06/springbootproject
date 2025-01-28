package com.springbootproject.repository;

//import com.springbootproject.model.Application;
import com.springbootproject.model.JobApplication;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ApplicationRepository extends MongoRepository<JobApplication, String> {
    List<JobApplication> findByUserId(String userId);
}
