package com.example.qodanaunusedcodereproducer

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {
    @GetMapping("/apiJava")
    fun getJavaDto() : JavaDto = JavaDto()

    @GetMapping("/apiKotlin")
    fun getKotlinDto() : KotlinDto = KotlinDto(data = "x")

}
