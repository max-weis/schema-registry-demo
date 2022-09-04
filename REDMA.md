# Schema Registry Demo

This project demonstrates the use of a schema registry with [Apache Avro](https://avro.apache.org/)

## Build

Run `mvn package` on the root level of the repository.
This will generate two container images. This will build the Quarkus Apps und their corresponding container image.

## Run

Run `docker compose -f ./build/docker-compose.yaml` on the root level of the repository to run the infrastructure and producer/consumer.
To register the Avor schema run: `python3 ./build/register_schema.py http://localhost:8081 profile ./profile-producer/src/main/avro/profile.avsc`

### Produce a message

Navigate to [http://localhost:9080/q/swagger-ui](http://localhost:9080/q/swagger-ui) and use the Swagger UI to produce a message.
After the message has been send, you can view the log of the consumer to check if it worked.
