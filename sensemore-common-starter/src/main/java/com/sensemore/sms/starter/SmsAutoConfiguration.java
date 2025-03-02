package com.sensemore.sms.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@ConditionalOnClass(value = SmsService.class)//当SmsService类存在时生效
@EnableConfigurationProperties(SmsProperties.class)//绑定Properties
public class SmsAutoConfiguration {
    @Autowired
    SmsProperties smsProperties;

    @Bean  
    @ConditionalOnMissingBean //如果没有SmsService对象就初始化
    public SmsService smsService(){
        SmsService smsService = new SmsService();
        smsService.setSmsProperties(smsProperties);
        return smsService;
    }
}