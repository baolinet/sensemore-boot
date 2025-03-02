package com.sensemore.agent.starter;

public class AgentService {
    AgentProperties agentProperties;

    public AgentProperties getAgentProperties(){
        return agentProperties;
    }

    public void setAgentProperties(AgentProperties agentProperties){
        this.agentProperties = agentProperties;
    }

    public AgentService(AgentProperties agentProperties){
        this.agentProperties = agentProperties;
    }

    public String call(String content){
        return "AgentProperties{" +
                "provider='" + agentProperties.getProvider()+ '\'' +
                ", apikey='" + agentProperties.getApiKey()+ '\'' +
                ", content='" + content +
                '}';
    }
}
