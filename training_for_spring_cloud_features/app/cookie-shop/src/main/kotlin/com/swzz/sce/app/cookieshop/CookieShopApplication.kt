package com.swzz.sce.app.cookieshop

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class CookieShopApplication

fun main(args: Array<String>) {
    runApplication<CookieShopApplication>(*args)
}
