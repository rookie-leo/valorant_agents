package com.valoran.agents

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@SpringBootApplication
class AgentsApplication

fun main(args: Array<String>) {
	runApplication<AgentsApplication>(*args)
}
