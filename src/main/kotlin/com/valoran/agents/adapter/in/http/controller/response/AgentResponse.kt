package com.valoran.agents.adapter.`in`.http.controller.response

import com.fasterxml.jackson.annotation.JsonProperty

data class AgentResponse (
    @JsonProperty("uuid")
    val agentId: String? = null,

    @JsonProperty("displayName")
    val agentName: String? = null,

    @JsonProperty("description")
    val description: String? = null,

    @JsonProperty("developerName")
    val developerName: String? = null,
)