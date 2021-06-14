package com.iTIA.cloud_storage_Netty.server;

import com.iTIA.cloud_storage_Netty.server.handlers.SQLHandler;

public class DBAuthService implements AuthService{
    @Override
    public String getDesktopByLoginAndPassword(String login, String password) {
        return SQLHandler.getUserDesktop(login, password);
    }

    @Override
    public boolean registration(String login, String password) {
        return false;
    }
}
