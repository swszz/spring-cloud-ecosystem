package com.swzz.sce.app.cookie.shop

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/cookies")
internal class CookieController {
    @GetMapping
    suspend fun getCookies() = setOf("matcha", "carrot")
}