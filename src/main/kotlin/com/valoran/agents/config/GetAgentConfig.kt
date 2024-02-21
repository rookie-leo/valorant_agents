package com.valoran.agents.config

import com.valoran.agents.adapter.out.GetAgentAdapter
import com.valoran.agents.application.core.usecase.GetAllAgentsUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class GetAgentConfig {

    @Bean
    fun getAllAgentsUseCase(agentAdapter: GetAgentAdapter) = GetAllAgentsUseCase(agentAdapter)

}