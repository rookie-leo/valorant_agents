package com.valoran.agents.http.controller

import com.valoran.agents.http.client.ValorantClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/valorant/agents")
class ValorantAgentsController(
    private val valorantClient: ValorantClient
) {

    @GetMapping
    fun getAllAgents(): String {
        return valorantClient.getAgents()
    }

    @GetMapping("/{id}")
    fun getAgentById(@PathVariable id: String): String {
        return valorantClient.getAgentById(id)
    }

}