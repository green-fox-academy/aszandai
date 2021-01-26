package com.greenfox.restdemo.service.log;

import com.greenfox.restdemo.model.log.Log;
import com.greenfox.restdemo.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService {
    LogRepository logRepository;

    @Autowired
    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }
    public void addToLog(String endpoint, String data) {
        logRepository.save(new Log(endpoint, data));
    }
}
