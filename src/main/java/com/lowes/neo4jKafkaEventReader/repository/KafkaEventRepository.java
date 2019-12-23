package com.lowes.neo4jKafkaEventReader.repository;

import org.neo4j.ogm.model.Result;
import org.neo4j.ogm.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class KafkaEventRepository {

    @Autowired
    private Session session;

    public List<Result> getAllKafkaEvents() {
        Result result = session.query("MATCH (k:KafkaEvent) RETURN k", new HashMap<>());
        return Stream.of(result).collect(Collectors.toList());
    }

    public Result getKafkaEvent(String kafkaEvent) {
        HashMap<String, Object> parameters = new HashMap<>();
        parameters.put("kafkaEvent", kafkaEvent);
        return session.query("MATCH (n:KafkaEvent {message: $kafkaEvent}) RETURN n", parameters);
    }
}