package com.example.springRestMySQL.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class WorkerNotFoundException extends ResponseStatusException {
    public WorkerNotFoundException(Long id) {
        super(HttpStatus.NOT_FOUND, String.valueOf(id));
    }
}
