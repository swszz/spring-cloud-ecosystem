package com.swzz.sce.app.cookieshop

import org.springframework.boot.context.event.ApplicationStartedEvent
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.cloud.stream.function.StreamBridge
import org.springframework.context.event.EventListener
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Hooks
import java.util.*


@RestController
@EnableConfigurationProperties(CookieProperties::class)
class CookieController(
    private val properties: CookieProperties,
    private val streamBridge: StreamBridge,
) {
    @EventListener(ApplicationStartedEvent::class)
    fun setup() {
        Hooks.enableAutomaticContextPropagation()
    }

    @GetMapping("/cookies")
    suspend fun getCookies() = properties.names

    @PostMapping("/cookies")
    @ResponseStatus(HttpStatus.ACCEPTED)
    fun orderCookies(@RequestBody type: String) {
        streamBridge.send("orderProducer-out-0", type)
    }
}