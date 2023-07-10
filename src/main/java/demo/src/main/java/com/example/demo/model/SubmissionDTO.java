package demo.src.main.java.com.example.demo.model;

import lombok.Data;

@Data
public class SubmissionDTO {
    private String id;
    private String consultantName;
    private String submissionDate;
    private String leadName;
    private int rate;
    private String salesPersonName;
    private String technology;
    private String vendorName;
}