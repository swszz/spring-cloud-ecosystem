package com.swzz.sce.app.automationorder

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@FeignClient(name = "API-GATEWAY")
interface CookieShopClient {
    @PostMapping("/cookies")
    fun order(@RequestBody type: String)
}