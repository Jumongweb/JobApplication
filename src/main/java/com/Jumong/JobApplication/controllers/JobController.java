package com.Jumong.JobApplication.controllers;

import com.Jumong.JobApplication.data.models.Job;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobController {
    private List<Job> jobs;

    public List<Job> Jobs(){
        return jobs;
    }
}
