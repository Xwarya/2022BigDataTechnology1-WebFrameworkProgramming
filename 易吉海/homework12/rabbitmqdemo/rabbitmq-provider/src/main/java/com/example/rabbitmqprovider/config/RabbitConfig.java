package com.example.rabbitmqprovider.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    @Bean
    public Queue queue(){
        return new Queue("test");
    }
    DirectExchange directExchange(){
        return new DirectExchange("directExchange");
    }
    @Bean
    Binding bindingDirect() {
        return BindingBuilder.bind(queue()).to(directExchange()).with("TestDirectRouting");
    }
}
