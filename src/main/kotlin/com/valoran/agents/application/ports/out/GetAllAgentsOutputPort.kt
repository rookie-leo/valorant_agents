package com.valoran.agents.application.ports.out

import com.valoran.agents.application.core.Agent

interface GetAllAgentsOutputPort {
    fun getAgents(): String
    fun getAgentById(id: String): Agent
}
