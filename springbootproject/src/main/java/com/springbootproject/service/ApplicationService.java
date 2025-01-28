package com.springbootproject.service;

//import com.springbootproject.model.Application;
import com.springbootproject.model.JobApplication;
import com.springbootproject.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    public JobApplication applyForJob(String userId, String jobId) {
        JobApplication application = new JobApplication();
//        Application application=  new Application();

        application.setUserId(userId);
        application.setJobId(jobId);
        application.setStatus("applied");
        return applicationRepository.save(application);
    }

    public List<JobApplication> getUserApplications(String userId) {
        return applicationRepository.findByUserId(userId);
    }
}
