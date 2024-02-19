package com.valoran.agents.http.controller

import com.fasterxml.jackson.databind.ObjectMapper
import com.valoran.agents.http.client.ValorantClient
import com.valoran.agents.http.controller.response.AgentDataResponse
import com.valoran.agents.http.controller.response.AgentResponse
import org.springframework.http.ResponseEntity
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
    fun getAgentById(@PathVariable id: String): ResponseEntity<AgentDataResponse> {
        val objectMapper = ObjectMapper()
        val agent = objectMapper.readValue(valorantClient.getAgentById(id), AgentResponse::class.java)

        return ResponseEntity.ok(agent.agentData)
    }

}