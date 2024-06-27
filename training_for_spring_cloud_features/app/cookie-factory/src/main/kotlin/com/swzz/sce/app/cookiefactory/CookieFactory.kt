package com.swzz.sce.app.cookiefactory

import io.micrometer.observation.ObservationRegistry
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.context.event.ApplicationStartedEvent
import org.springframework.context.annotation.Bean
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component
import reactor.core.publisher.Hooks
import java.util.function.Consumer

@Component
class CookieFactory {
    private val logger: Logger = LoggerFactory.getLogger(this::class.java)

    @EventListener(ApplicationStartedEvent::class)
    fun setup() {
        Hooks.enableAutomaticContextPropagation()
    }

    @Bean
    fun orderConsumer(observationRegistry: ObservationRegistry): Consumer<String> {
        return Consumer { order ->
            logger.info("ordered cookie type : $order")
        }
    }
}