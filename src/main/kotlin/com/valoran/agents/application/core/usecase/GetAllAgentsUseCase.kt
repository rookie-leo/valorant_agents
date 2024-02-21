package com.valoran.agents.application.core.usecase

import com.valoran.agents.adapter.out.GetAgentAdapter
import com.valoran.agents.application.core.Agent
import com.valoran.agents.application.ports.out.GetAllAgentsOutputPort

class GetAllAgentsUseCase(
    private val agentAdapter: GetAgentAdapter
): GetAllAgentsOutputPort {
    override fun getAgents(): String {
        return agentAdapter.getAgents()
    }

    override fun getAgentById(id: String): Agent {
        return agentAdapter.getAgentById(id)
    }

}
