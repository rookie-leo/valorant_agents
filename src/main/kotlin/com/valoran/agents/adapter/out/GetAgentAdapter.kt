package com.valoran.agents.adapter.out

import com.fasterxml.jackson.databind.ObjectMapper
import com.valoran.agents.adapter.`in`.http.client.ValorantClient
import com.valoran.agents.application.core.Agent
import com.valoran.agents.application.ports.out.GetAgentOutPutPort
import org.springframework.stereotype.Component

@Component
class GetAgentAdapter(
    private val valorantClient: ValorantClient
) : GetAgentOutPutPort {
    override fun getAgents(): MutableList<Agent> {
        val agentsResponse = valorantClient.getAgents()
        val agents = mutableListOf<Agent>()

        agentsResponse.let {
            val agent = agentMapper(it)
            agents.add(agent)
        }

        return agents
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
        val objectMapper = ObjectMapper()
        val agent: Agent = objectMapper.readValue(agentResponse, Agent::class.java)
        return agent
    }
}
