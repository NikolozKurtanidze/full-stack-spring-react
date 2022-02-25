package com.example.springRestMySQL.controller;


import com.example.springRestMySQL.entity.Worker;
import com.example.springRestMySQL.service.FindWorkerService;
import lombok.RequiredArgsConstructor;
import org.hibernate.jdbc.Work;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@CrossOrigin
@RequestMapping("workers")
@RequiredArgsConstructor
public class WorkerController {
    private final FindWorkerService findWorkerService;

    @GetMapping
    ResponseEntity<List<Worker>> getAllWorkers(){
        return ResponseEntity.ok(findWorkerService.getAllWorkers());
    }

    @PostMapping
    void addWorker(@RequestBody Worker worker){
        findWorkerService.createWorker(worker.getName(), worker.getPosition());
    }

    @GetMapping("/{id}")
    ResponseEntity<Worker> getWorker(@PathVariable(required = true) Long id){
        return ResponseEntity.ok(findWorkerService.getWorker(id));
    }

    @DeleteMapping("/{id}")
    void deleteWorker(@PathVariable(required = true) Long id){
        findWorkerService.removeWorker(id);
    }
}
