package com.jackie35er.chattdot

import com.jackie35er.chattdot.config.RsaKeyProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication




@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties::class)
class ChatTdotApplication {
}

fun main(args: Array<String>) {
    runApplication<ChatTdotApplication>(*args)
}
