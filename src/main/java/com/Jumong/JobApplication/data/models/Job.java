package com.Jumong.JobApplication.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Job {
    @Id
    private String companyName;
    private String title;
    private String description;
    private String minSalary;
    private String maxSalary;
    private String location;
}
