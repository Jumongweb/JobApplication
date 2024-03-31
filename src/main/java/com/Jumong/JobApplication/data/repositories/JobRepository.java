package com.Jumong.JobApplication.data.repositories;

import com.Jumong.JobApplication.data.models.Job;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends MongoRepository<Job, String> {

}
