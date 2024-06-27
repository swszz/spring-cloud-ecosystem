package com.swzz.sce.app.cookieshop

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.cloud.stream.function.StreamBridge
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
@EnableConfigurationProperties(CookieProperties::class)
class CookieController(
    private val properties: CookieProperties,
    private val streamBridge: StreamBridge,
) {
    @GetMapping("/cookies")
    suspend fun getCookies() = properties.names

    @PostMapping("/cookies")
    @ResponseStatus(HttpStatus.ACCEPTED)
    fun orderCookies(@RequestBody type: String) {
        streamBridge.send("orderProducer-out-0", type)
    }
}