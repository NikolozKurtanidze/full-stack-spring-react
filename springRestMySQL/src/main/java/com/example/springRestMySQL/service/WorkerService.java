package com.example.springRestMySQL.service;


import com.example.springRestMySQL.entity.Worker;

import java.util.List;

public interface WorkerService {

    void createAndSaveWorker(String name, String position);

    Worker findWorker(Long id);

    List<Worker> getAllWorkers();

    void removeWorker(Long id);
}
