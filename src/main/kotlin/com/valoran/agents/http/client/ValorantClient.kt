package com.valoran.agents.http.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(value = "valorant-client", url = "https://valorant-api.com/v1")
interface ValorantClient {

    @GetMapping("/agents")
    fun getAgents(): String

    @GetMapping("/agents/{id}")
    fun getAgentById(@PathVariable id: String): String

}