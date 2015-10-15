/*
 * Copyright 2015, HM Revenue & Customs. All rights reserved.
 * This file and its contents are the property of HM Revenue & Customs.
 */
/**
 * 
 */
package io.acuity.web.config;

import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author 7827660
 *
 */
@Configuration
public class ApplicationConfiguration {

    @Bean
    public EmbeddedServletContainerFactory embeddedServletContainerFactory() {
        TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();
        tomcat.setPort(9091);
        return tomcat;
    }

}

