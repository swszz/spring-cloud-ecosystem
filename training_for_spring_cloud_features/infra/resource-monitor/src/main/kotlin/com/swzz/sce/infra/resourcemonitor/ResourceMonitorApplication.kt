package com.swzz.sce.infra.resourcemonitor

import de.codecentric.boot.admin.server.config.EnableAdminServer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
internal class ResourceMonitorApplication

internal fun main(args: Array<String>) {
    runApplication<ResourceMonitorApplication>(*args)
}
