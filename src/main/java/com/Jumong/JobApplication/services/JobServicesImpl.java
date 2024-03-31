package com.Jumong.JobApplication.services;


import com.Jumong.JobApplication.data.models.Job;
import com.Jumong.JobApplication.data.repositories.JobRepository;
import com.Jumong.JobApplication.dtos.request.AddJobRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobServicesImpl implements JobServices {
    @Autowired
    private JobRepository jobRepository;
    @Override
    public void addJob(AddJobRequest addJobRequest) {
        Job job = new Job();
        job.setCompanyName(addJobRequest.getCompanyName());
        job.setTitle(addJobRequest.getTitle());
        job.setDescription(addJobRequest.getDescription());
        job.setMinSalary(addJobRequest.getMinSalary());
        job.setMaxSalary(addJobRequest.getMaxSalary());
        job.setLocation(addJobRequest.getLocation());
        jobRepository.save(job);

    }

//    @Override
//    public Job findJob(Job job) {
//        Job foundJob = jobRepository.findById(job);
//        return foundJob;
//    }

    @Override
    public List<Job> jobs(String companyName) {
        List<Job> jobs = new ArrayList<>();
        for (Job job : jobRepository.findAll()){
            if (job.getCompanyName().equalsIgnoreCase(companyName)){
                jobs.add(job);
            }
        }
        return jobs;
    }

    @Override
    public List<Job> findAll() {
        return jobRepository.findAll();
    }

    @Override
    public void delete(Job job) {
        //Job deleteJob = jobRepository.findById(title);
    }

    @Override
    public void delete(String CompanyName) {

    }
}
