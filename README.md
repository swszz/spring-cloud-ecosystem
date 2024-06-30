# spring-cloud-ecosystem

- 클라우드 서비스에서 제공하는 분산 컴퓨팅을 활용하기 위한 개념인 클라우드 네이티브에 대해 학습합니다.
- Spring 생태계 내에서 쉽게 활용할 수 있도록 Spring Cloud 생태계에 대해 학습합니다.

---

## Ecosystem

![spring-cloud-ecosystem](./resources/images/spring-cloud-ecosystem.png)

---

## TOC

### Introduction

- What is Cloud Native?
- Why Cloud Native?

### Concept of Cloud Native Features

- Distributed tracing
- Distributed/versioned configuration
- Service registration and discovery
- Routing
- Service-to-service calls
- Load balancing
- Circuit Breakers
- Distributed messaging
- Short lived microservices (tasks)
- Consumer-driven and producer-driven contract testing

---

## Install

### 0. install docker from [Docker](https://docs.docker.com/engine/install/)

### 1. clone this repository

```shell
git clone https://github.com/swszz/spring-cloud-ecosystem.git
```

### 1. change directory

```shell
cd spring-cloud-ecosystem
```

### 2. build spring cloud ecosystem applications

```shell
./gradlew clean build
```

### 3. build images use docker compose

```shell
docker-compose -f ./training_for_spring_cloud_features/docker-compose.yaml build
```

### 4. run built images use docker compose

```shell
docker-compose -f ./training_for_spring_cloud_features/docker-compose.yaml up
```

### 5. surf on spring cloud ecosystem infrastructures

- [Service Discovery (Eureka)](http://localhost:8761)
- [Trace System (Zipkin)](http://localhost:9411/zipkin)
    - [Trace Sample](http://localhost:9411/zipkin/?serviceName=automation-order)
        - execute run query
- [Resource Monitor (Spring Admin)](http://localhost:9090)
- [Batch, Task and Deploy Monitor (Spring Cloud Dataflow)](http://localhost:9393/dashboard) 