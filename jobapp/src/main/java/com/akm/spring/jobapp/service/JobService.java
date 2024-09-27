package com.akm.spring.jobapp.service;

import com.akm.spring.jobapp.model.JobPost;
import com.akm.spring.jobapp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo jobRepo;
    public void addJob(JobPost jobPost)
    {
        jobRepo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs()
    {
        return jobRepo.getAllJobs();
    }
}
