package com.springcourse.springconfigserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringConfigServerApplication

fun main(args: Array<String>) {
	runApplication<SpringConfigServerApplication>(*args)
}
