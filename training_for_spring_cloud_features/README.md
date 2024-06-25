# training for spring cloud features

## setup

### 1. build image for resource-monitor & service discovery

```
cd {$repository-root}/training_for_spring_cloud_features
docker build -t resource-monitor infra/resource-monitor/.
docker build -t service-discovery infra/service-discovery/.
docker build -t api-gateway infra/api-gateway/.
docker build -t configuration-server infra/configuration-server/.
docker build -t cookie-shop app/cookie-shop/.
```

### 2. run docker compose

```
docker-compose up 
```

### 3. check application ui

- [service-discovery](http://localhost:8761/)
- [resource-monitor](http://localhost:9090/)

