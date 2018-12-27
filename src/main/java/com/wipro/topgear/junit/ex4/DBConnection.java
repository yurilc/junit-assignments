package com.wipro.topgear.junit.ex4;

public class DBConnection {
    public String connect(String driverName, String url, String username, String password) {
        if("test-driver".equals(driverName) && "test-url".equals(url) && "test-username".equals(username) && "test-password".equals(password)) {
            return "success";
        } else {
            return "failure";
        }
    }
}
