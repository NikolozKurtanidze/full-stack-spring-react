package com.example.springRestMySQL.service.impl;

import com.example.springRestMySQL.exceptions.WorkerNotFoundException;
import com.example.springRestMySQL.entity.Worker;
import com.example.springRestMySQL.repository.WorkerRepository;
import com.example.springRestMySQL.service.WorkerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class WorkerServiceImpl implements WorkerService {
    private final WorkerRepository workerRepository;


    @Override
    public void createAndSaveWorker(String name, String position) {
        try {
            Worker worker = Worker.builder()
                    .name(name)
                    .position(position)
                    .build();
            workerRepository.save(worker);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Worker findWorker(Long id) {
        return workerRepository.findById(id).orElseThrow(() -> new WorkerNotFoundException(id));
    }

    @Override
    public List<Worker> getAllWorkers() {
        return workerRepository.findAll();
    }

    @Override
    public void removeWorker(Long id) {
        Worker temp = workerRepository.findById(id).orElseThrow(() -> new WorkerNotFoundException(id));
        workerRepository.delete(temp);
    }
}
