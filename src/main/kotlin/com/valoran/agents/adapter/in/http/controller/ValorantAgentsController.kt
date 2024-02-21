package com.valoran.agents.adapter.`in`.http.controller

import com.fasterxml.jackson.databind.ObjectMapper
import com.valoran.agents.adapter.`in`.http.client.response.AgentDataClientResponse
import com.valoran.agents.adapter.`in`.http.client.response.AgentClientResponse
import com.valoran.agents.adapter.`in`.http.controller.response.AgentResponse
import com.valoran.agents.adapter.out.GetAgentAdapter
import com.valoran.agents.application.functions.toResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/valorant/agents")
class ValorantAgentsController(
    private val agentAdapter: GetAgentAdapter
) {

    @GetMapping
    fun getAllAgents(): List<AgentResponse> {
        return agentAdapter.getAgents().map { it.toResponse() }
    }

    @GetMapping("/{id}")
    fun getAgentById(@PathVariable id: String): ResponseEntity<AgentDataClientResponse> {
        TODO("Not yet implemented")
    }

}