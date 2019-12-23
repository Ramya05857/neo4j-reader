# Spring Boot application to read data from neo4j graph database

## REST endpoint
   - `/neo4j/kafkaEvent/all` - returns all kafka events
   - `/neo4j/kafkaEvent/{kafakevnt}` - returns specific kafka event

## Neo4J 
- Docker command to bring up Neo4J server
```
docker run --publish=7474:7474 --publish=7687:7687 neo4j:3.0
```
- Neo4J Browser URL
```
http://localhost:7474/browser
```
