package com.Jumong.JobApplication.services;


import com.Jumong.JobApplication.data.models.Job;
import com.Jumong.JobApplication.dtos.request.AddJobRequest;

import java.util.List;

public interface JobServices {
    void addJob(AddJobRequest addJobRequest);
    Job findJob(Job job);
    List<Job> jobs(String companyName);

    List<Job> findAll();
    void delete(Job job);

    void delete(String CompanyName);

}
