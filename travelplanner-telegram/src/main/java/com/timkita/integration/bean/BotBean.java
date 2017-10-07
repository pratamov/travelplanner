package com.timkita.integration.bean;

import org.springframework.stereotype.Component;

@Component
public class BotBean {

    public String process(String message) {
        if (message == null) {
            return null;
        }

        return "Halo " + message.replace("\"", "-");
    }

}
