package com.wallacesintra.firstSpring

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HttpController {
    @GetMapping
    fun helloWorld() = "Hello Spring World, First Wallace "
}