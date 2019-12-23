package com.lowes.neo4jKafkaEventReader.controller;


import com.lowes.neo4jKafkaEventReader.service.KafkaEventService;
import org.neo4j.ogm.model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/neo4j/kafkaEvent")
public class KafkaEventController {

    @Autowired
    private KafkaEventService kafkaEventService;

    @GetMapping("/all")
    public List<Result> getAllKafkaEvents() {
        return kafkaEventService.getAllKafkaEvents();
    }

    @GetMapping("/{kafkaEvent}")
    public Result getKafkaEvent(@PathVariable String kafkaEvent) {
        return kafkaEventService.getKafkaEvent(kafkaEvent);
    }
}
