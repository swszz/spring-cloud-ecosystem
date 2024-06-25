package com.swzz.sce.infra.servicediscovery

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
internal class ServiceDiscoveryApplication

internal fun main(args: Array<String>) {
    runApplication<ServiceDiscoveryApplication>(*args)
}
