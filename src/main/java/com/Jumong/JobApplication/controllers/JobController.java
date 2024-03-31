package com.Jumong.JobApplication.controllers;

import com.Jumong.JobApplication.data.models.Job;
import com.Jumong.JobApplication.dtos.request.AddJobRequest;
import com.Jumong.JobApplication.services.JobServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    private JobServices jobServices;

    @GetMapping("/jobs")
    public List<Job> getJobs(){
        return jobServices.findAll();
    }

    @PostMapping("/jobs")
    public String createJob(@RequestBody AddJobRequest addJobRequest){
        try{
            jobServices.createJob(addJobRequest);
            return String.format("%s added to jobs successfully", addJobRequest.getTitle());
        } catch (Exception e){
            return e.getMessage();
        }
    }

    @DeleteMapping("/jobs")
    public String deleteJob(@RequestBody String title){
        try{
            jobServices.delete(title);
            return String.format("Successfully deleted %s",title);
        } catch (Exception e){
            return e.getMessage();
        }
    }

}
