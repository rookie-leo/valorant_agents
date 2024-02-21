package com.valoran.agents.application.ports.out

import com.valoran.agents.application.core.Agent

interface GetAgentOutPutPort {
    fun getAgents(): String
    fun getAgentById(id: String): Agent
}
