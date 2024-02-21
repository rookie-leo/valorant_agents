package com.valoran.agents.adapter.`in`.http.client.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class AgentClientResponse (

    @JsonProperty("data")
    val agentData: AgentDataClientResponse
)
