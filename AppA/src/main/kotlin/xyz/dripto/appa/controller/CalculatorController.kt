package xyz.dripto.appa.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForObject

@RestController
@RequestMapping("/appa")
class CalculatorController(
        val restTemplate: RestTemplate
) {
    @GetMapping("/multiply/{num}")
    fun multiplyBy(@PathVariable("num") i: Int)
            = restTemplate.getForObject<Int>("http://localhost:8082/appb/multiply/${i*2}")
}
