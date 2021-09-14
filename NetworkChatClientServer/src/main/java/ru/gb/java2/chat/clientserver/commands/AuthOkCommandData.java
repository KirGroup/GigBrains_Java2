package ru.gb.java2.chat.clientserver.commands;

import java.io.Serializable;

public class AuthOkCommandData implements Serializable {

    private final String username;

    public AuthOkCommandData(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
