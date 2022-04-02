package com.onrsgr.rws.personelservice.personelmanagement.Configuration;

import com.onrsgr.rws.personelservice.personelmanagement.ResponseMessages.PersonelControlRespMessage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ResponseMessageConfiguration {

    @Bean
    @Scope(value = "prototype")
    public PersonelControlRespMessage personelControlRespMessage() {
        return new PersonelControlRespMessage();
    }
}
