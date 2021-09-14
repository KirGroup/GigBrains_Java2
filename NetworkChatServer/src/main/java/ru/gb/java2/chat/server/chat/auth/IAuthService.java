package ru.gb.java2.chat.server.chat.auth;

public interface IAuthService {

    default void start() {
        // Do nothing
    };

    String getUsernameByLoginAndPassword(String login, String password);

    default void stop() {
        // Do nothing
    }

    void updateUsername(String currentUsername, String newUsername);
}
