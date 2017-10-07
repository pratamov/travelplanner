package com.timkita.integration.router;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.timkita.integration.bean.BotBean;

@Component
public class TelegramRouter extends RouteBuilder {

    @Autowired
    private BotBean botBean;

    @Override
    public void configure() throws Exception {

        from("telegram:bots")
        	.bean(botBean)
        	.to("telegram:bots");

    }
}
