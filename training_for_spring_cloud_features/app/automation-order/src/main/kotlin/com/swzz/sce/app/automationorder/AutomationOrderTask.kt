package com.swzz.sce.app.automationorder

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import java.util.*

@Component
class AutomationOrderTask(
    private val cookieShopClient: CookieShopClient,
) : CommandLineRunner {

    private val logger: Logger = LoggerFactory.getLogger(this.javaClass)
    override fun run(vararg args: String) {
        val type: String = UUID.randomUUID().toString()
        logger.info("order cookie type : $type")
        cookieShopClient.order(type = type)
    }
}