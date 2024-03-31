package com.Jumong.JobApplication.dtos.request;

import lombok.Data;

@Data
public class AddJobRequest {
    private String companyName;
    private String title;
    private String description;
    private String minSalary;
    private String maxSalary;
    private String location;
}
