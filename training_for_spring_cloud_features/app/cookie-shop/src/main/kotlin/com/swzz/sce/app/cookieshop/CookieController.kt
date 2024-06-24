package com.swzz.sce.app.cookieshop

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
internal class CookieController {
    @GetMapping("/cookies")
    suspend fun getCookies() = setOf("matcha", "plain")
}