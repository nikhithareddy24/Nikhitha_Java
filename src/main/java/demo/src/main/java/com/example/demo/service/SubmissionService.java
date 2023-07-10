package demo.src.main.java.com.example.demo.service;

import com.example.demo.model.SubmissionDTO;

import java.util.List;

public interface SubmissionService {
    SubmissionDTO getSubmission(String id);

    SubmissionDTO addSubmission(SubmissionDTO submission);

    SubmissionDTO updateSubmission(SubmissionDTO submission);

    SubmissionDTO deleteSubmission(String id);

    List<SubmissionDTO> getAll();

}