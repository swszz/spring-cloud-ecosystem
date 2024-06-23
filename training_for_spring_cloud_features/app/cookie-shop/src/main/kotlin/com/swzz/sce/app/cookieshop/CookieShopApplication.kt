package com.swzz.sce.app.cookieshop

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
internal class CookieShopApplication

internal fun main(args: Array<String>) {
    runApplication<CookieShopApplication>(*args)
}
