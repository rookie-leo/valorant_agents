package com.valoran.agents.http.controller.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class AgentResponse (

    @JsonProperty("data")
    val agentData: AgentDataResponse
)
