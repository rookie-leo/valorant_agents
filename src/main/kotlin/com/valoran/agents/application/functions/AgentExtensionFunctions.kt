package com.valoran.agents.application.functions

import com.valoran.agents.adapter.`in`.http.controller.response.AgentResponse
import com.valoran.agents.application.core.Agent

fun Agent.toResponse() = AgentResponse(
    agentId = this.agentId,
    agentName = this.agentName,
    description = this.description,
    developerName = this.developerName
)