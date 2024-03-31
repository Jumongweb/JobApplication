package com.Jumong.JobApplication.services;


import com.Jumong.JobApplication.data.models.Job;
import com.Jumong.JobApplication.dtos.request.AddJobRequest;

import java.util.List;

public interface JobServices {
    void createJob(AddJobRequest addJobRequest);

    Job findJob(String title);
    List<Job> jobs(String companyName);

    List<Job> findAll();
    void delete(String title);


}
