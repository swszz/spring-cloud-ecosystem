# spring-cloud-ecosystem

- 클라우드 서비스에서 제공하는 분산 컴퓨팅을 활용하기 위한 개념인 클라우드 네이티브에 대해 학습합니다.
- Spring 생태계 내에서 쉽게 활용할 수 있도록 Spring Cloud 생태계에 대해 학습합니다.

---

## ecosystem

![spring-cloud-ecosystem](./resources/images/spring-cloud-ecosystem.png)

---

## toc

### introduction

- what is Cloud Native?
- why Cloud Native?

### concept of cloud native features

- distributed tracing
- distributed/versioned configuration
- service registration and discovery
- routing
- service-to-service calls
- load balancing
- circuit Breakers
- distributed messaging
- short lived microservices (tasks)
- consumer-driven and producer-driven contract testing

---

## install

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