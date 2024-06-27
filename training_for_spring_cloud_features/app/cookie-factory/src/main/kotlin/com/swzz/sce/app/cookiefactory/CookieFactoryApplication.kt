package com.swzz.sce.app.cookiefactory

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class CookieFactoryApplication

fun main(args: Array<String>) {
    runApplication<CookieFactoryApplication>(*args)
}
