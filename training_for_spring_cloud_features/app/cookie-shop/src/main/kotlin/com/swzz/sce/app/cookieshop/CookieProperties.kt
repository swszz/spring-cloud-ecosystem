package com.swzz.sce.app.cookieshop

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.cloud.context.config.annotation.RefreshScope

@ConfigurationProperties(value = "cookie")
@RefreshScope
data class CookieProperties(
    val names: List<String>,
)