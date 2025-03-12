# Kafka Consumer
This repository contains a Kafka Consumer implementation using Java and Apache Kafka. The project demonstrates how to consume messages from a Kafka topic efficiently.
## Features
* Implements a Kafka Consumer using Java.
* Consumes messages from a specified Kafka topic.
* Configurable Kafka properties for seamless integration.
* Utilizes Kafka consumer APIs for message consumption.
* Suitable for microservices and event-driven architectures.
## Prerequisites
Ensure you have the following installed:

* Java 8 or later
* Apache Kafka
* Zookeeper (for Kafka)
* Maven (for dependency management)

## Installation
1. Clone the repository:

                                    git clone https://github.com/raviProgrammer/kafka_consumer.git
                                    
                                    cd kafka_consumer
                                    
2. Build the project using Maven:

                                    mvn clean install
   
3. Start Kafka and Zookeeper.

## Usage
1. Configure the Kafka broker address and topic name in the application.properties file.
2. Run the Kafka Consumer:

                                    mvn spring-boot:run
   
3. Monitor the consumed messages in the application logs.
