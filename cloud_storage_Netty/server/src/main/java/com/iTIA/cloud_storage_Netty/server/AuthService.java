package com.iTIA.cloud_storage_Netty.server;

public interface AuthService {
    String getDesktopByLoginAndPassword (String login, String password);
    boolean registration (String login, String password);
}
