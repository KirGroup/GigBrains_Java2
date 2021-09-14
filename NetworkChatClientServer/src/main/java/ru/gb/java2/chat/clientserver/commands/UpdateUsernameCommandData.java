package ru.gb.java2.chat.clientserver.commands;

import java.io.Serializable;

public class UpdateUsernameCommandData implements Serializable {

    private final String username;

    public UpdateUsernameCommandData(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
