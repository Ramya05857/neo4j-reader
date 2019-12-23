package com.lowes.neo4jKafkaEventReader.service;

import com.lowes.neo4jKafkaEventReader.repository.KafkaEventRepository;
import org.neo4j.ogm.model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KafkaEventService {

    @Autowired
    private KafkaEventRepository kafkaEventRepository;

    public List<Result> getAllKafkaEvents() {
        return kafkaEventRepository.getAllKafkaEvents();
    }

    public Result getKafkaEvent(String kafkaEvent) {
        return kafkaEventRepository.getKafkaEvent(kafkaEvent);
    }
}