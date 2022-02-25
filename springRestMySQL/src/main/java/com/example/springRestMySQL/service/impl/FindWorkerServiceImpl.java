package com.example.springRestMySQL.service.impl;

import com.example.springRestMySQL.entity.Worker;
import com.example.springRestMySQL.service.FindWorkerService;
import com.example.springRestMySQL.service.WorkerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class FindWorkerServiceImpl implements FindWorkerService {
    private final WorkerService workerService;

    @Override
    public void createWorker(String name, String position) {
        workerService.createAndSaveWorker(name, position);
    }

    @Override
    public Worker getWorker(Long id) {
        return workerService.findWorker(id);
    }

    @Override
    public List<Worker> getAllWorkers() {
        return workerService.getAllWorkers();
    }

    @Override
    public void removeWorker(Long id) {
        workerService.removeWorker(id);
    }

}
