package com.sensemore.agent.starter;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@ConditionalOnClass(value = AgentService.class)//当SmsService类存在时生效
@EnableConfigurationProperties(AgentProperties.class)//绑定Properties
public class AgentAutoConfig {

    // @Autowired
    // AgentProperties agentProperties;

    @Bean  
    @ConditionalOnMissingBean //如果没有SmsService对象就初始化
    public AgentService agentService(AgentProperties agentProperties){
        AgentService agentService = new AgentService(agentProperties);
        return agentService;
    }
}
