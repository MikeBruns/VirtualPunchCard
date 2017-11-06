package com.VirtualPunchCard.app.Controllers;

import java.sql.*;

/**
 * Login service to validate the credentials of an attempted login.
 */
public class LoginService {

    LoginService() {
    }


    public boolean validCredentials(String userName, String password) {
        boolean loginResult = false;
        try {
            String login_select =
                    "SELECT loginID, passwordID "       +
                    "FROM login "		    	        +
                    "WHERE loginID = "  +  userName     +
                    "AND passwordID = " +  password;

            //Change structure, url should not look like this
            Connection conn = DriverManager.getConnection("jdbc:sqlite:../../../../database.db");
            Statement statement = conn.createStatement();
            statement.execute(login_select);
            ResultSet results = statement.getResultSet();

            if(results.next()) {
                loginResult = true;
            }
            return loginResult;
        } catch (SQLException sqlError) {
            System.out.println("Unexpected exception : " +
                        sqlError.toString() + ", sqlstate = " +
                        sqlError.getSQLState());
            sqlError.printStackTrace();
        }

        return loginResult;
    }
}