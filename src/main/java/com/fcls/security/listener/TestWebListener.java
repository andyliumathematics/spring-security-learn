package com.fcls.security.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class TestWebListener implements ServletRequestListener {
    /**
     * The request is about to go out of scope of the web application. The default implementation is a NO-OP.
     *
     * @param sre Information about the request
     */
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("listener.............................");
        ServletRequestListener.super.requestDestroyed(sre);
    }

    /**
     * The request is about to come into scope of the web application. The default implementation is a NO-OP.
     *
     * @param sre Information about the request
     */
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("listener-----------------:)");
        ServletRequestListener.super.requestInitialized(sre);
    }
}
