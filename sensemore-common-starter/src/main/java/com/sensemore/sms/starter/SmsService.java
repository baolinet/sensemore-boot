package com.sensemore.sms.starter;
    
public class SmsService {
    SmsProperties smsProperties;

    public SmsProperties getSmsProperties() {
        return smsProperties;
    }

    public void setSmsProperties(SmsProperties smsProperties) {
        this.smsProperties = smsProperties;
    }
	
    //业务
    public String say(String content){
        return "SmsProperties{" +
                "username='" + smsProperties.getUsername()+ '\'' +
                ", password='" + smsProperties.getPassword()+ '\'' +
                ", content='" + content +
                '}';
    }
}
