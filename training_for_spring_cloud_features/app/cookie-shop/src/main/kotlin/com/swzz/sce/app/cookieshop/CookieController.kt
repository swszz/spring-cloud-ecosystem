package com.swzz.sce.app.cookieshop

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@EnableConfigurationProperties(CookieProperties::class)
internal class CookieController(
    private val properties: CookieProperties,
) {
    @GetMapping("/cookies")
    suspend fun getCookies() = properties.names
}