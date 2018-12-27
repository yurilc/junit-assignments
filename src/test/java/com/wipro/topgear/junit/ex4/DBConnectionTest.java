package com.wipro.topgear.junit.ex4;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class DBConnectionTest {

    private static String driverName;
    private static String url;
    private static String username;
    private static String password;

    private DBConnection dbConnection;

    @BeforeClass
    public static void setUpBeforeClass() {
        driverName = "test-driver";
        url = "test-url";
        username = "test-username";
        password = "test-password";
    }

    @Before
    public void setUp() {
        dbConnection = new DBConnection();
    }

    @Test
    public void DBConnectionTestSuccess() {
        String result = dbConnection.connect(driverName, url, username, password);

        assertEquals("Connection should be successful", "success", result);
    }

    @Test
    public void DBConnectionTestWrongDriverName() {
        String result = dbConnection.connect("some-driver", url, username, password);

        assertEquals("Connection should be failure", "failure", result);
    }

    @Test
    public void DBConnectionTestWrongUrl() {
        String result = dbConnection.connect(driverName, "some-url", username, password);

        assertEquals("Connection should be failure", "failure", result);
    }

    @Test
    public void DBConnectionTestWrongUsername() {
        String result = dbConnection.connect(driverName, url, "some-username", password);

        assertEquals("Connection should be failure", "failure", result);
    }

    @Test
    public void DBConnectionTestWrongPassword() {
        String result = dbConnection.connect(driverName, url, username, "some-password");

        assertEquals("Connection should be failure", "failure", result);
    }
}