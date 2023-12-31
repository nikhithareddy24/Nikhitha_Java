package demo.src.main.java.com.example.demo.controllers;

import com.example.demo.model.SubmissionDTO;
import com.example.demo.service.SubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/submission")
public class SubmissionController {

    private final SubmissionService submissionService;

    @Autowired
    public SubmissionController(SubmissionService submissionService) {
        this.submissionService = submissionService;
    }

    @GetMapping("get/{id}")
    public SubmissionDTO getSubmission(@PathVariable String id) {
        return submissionService.getSubmission(id);
    }

    @GetMapping("/getAll")
    public List<SubmissionDTO> getAll(){
        return submissionService.getAll();
    }

    @PostMapping(path="/add")
    public SubmissionDTO addSubmission(@RequestBody SubmissionDTO submission) {
        return submissionService.addSubmission(submission);

    }

    @PutMapping("update")
    public SubmissionDTO updateSubmission( @RequestBody SubmissionDTO submission) {
        return  submissionService.updateSubmission(submission);

    }

    @DeleteMapping("delete/{id}")
    public void deleteSubmission(@PathVariable String id) {
        submissionService.deleteSubmission(id);

    }


}