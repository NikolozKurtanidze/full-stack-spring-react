package com.example.springRestMySQL.service;

import com.example.springRestMySQL.entity.Worker;

import java.util.List;

public interface FindWorkerService {

    void createWorker(String name, String position);

    Worker getWorker(Long id);

    List<Worker> getAllWorkers();

    void removeWorker(Long id);
}
