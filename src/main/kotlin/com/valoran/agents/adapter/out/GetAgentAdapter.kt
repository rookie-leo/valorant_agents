package com.valoran.agents.adapter.out

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.valoran.agents.adapter.`in`.http.client.ValorantClient
import com.valoran.agents.adapter.`in`.http.client.response.AgentClientResponse
import com.valoran.agents.application.core.Agent
import com.valoran.agents.application.functions.toDomain
import com.valoran.agents.application.ports.out.GetAgentOutPutPort
import org.springframework.stereotype.Component

@Component
class GetAgentAdapter(
    private val valorantClient: ValorantClient
) : GetAgentOutPutPort {
    override fun getAgents(): String {
        return try {
           valorantClient.getAgents()
        } catch (e: Exception) {
            throw RuntimeException("Error getting agents", e)
        }
    }

    override fun getAgentById(id: String): Agent {
        try {
            val agentResponse = valorantClient.getAgentById(id)
            return agentMapper(agentResponse)
        } catch (e: Exception) {
            throw e
        }

    }

    private fun agentMapper(agentResponse: String): Agent {
        val agentClientResponse = jacksonObjectMapper().readValue(agentResponse, AgentClientResponse::class.java)
        return agentClientResponse.agentData.toDomain()
    }
}
