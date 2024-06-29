package com.swzz.sce.app.automationorder

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.cloud.task.configuration.EnableTask
import reactor.core.publisher.Hooks

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableTask
class AutomationOrderApplication

fun main(args: Array<String>) {
    Hooks.enableAutomaticContextPropagation()
    runApplication<AutomationOrderApplication>(*args)
}

