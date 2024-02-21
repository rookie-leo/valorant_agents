package com.valoran.agents.adapter.`in`.http.client.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class AgentDataClientResponse (
    @JsonProperty("uuid")
    val uuid: String? = null,

    @JsonProperty("displayName")
    val displayName: String? = null,

    @JsonProperty("description")
    val description: String? = null,

    @JsonProperty("developerName")
    val developerName: String? = null,
)