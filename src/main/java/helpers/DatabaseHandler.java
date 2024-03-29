package helpers;

import helpers.Queries.OtherQueries;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseHandler {

    public static void main(String[] args) {

        DatabaseHandler databaseHandler = new DatabaseHandler();
        ArrayList<String> testData = databaseHandler.getIdFromDataBase(OtherQueries.getNewTrucksTC());
        System.out.println(testData.get(0));
    }

    public ArrayList<String> getOTPFromDataBase(String query) {
        // Build sql server jdbc connection url use sql server account authentication.
        String host = "192.168.6.24";
        String dbName = "security_master_qa";
        String connectionUserName = "QA";
        String connectionPassword = "QA@123";

        String sqlServerConnectionUrl = "jdbc:sqlserver://" + host + ";databaseName=" + dbName + ";user=" + connectionUserName + ";password=" + connectionPassword + "";

        // Declare the JDBC objects.
        Connection dbConnection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        List<String> returnedResultSet = new ArrayList<String>();

        String OtpNumber = null;

        try {
            // Get connection.
            dbConnection = DriverManager.getConnection(sqlServerConnectionUrl);

            // Execute sql and return data result.
            String SQL = query;
            statement = dbConnection.createStatement();
            resultSet = statement.executeQuery(SQL);

            // ArrayLists to store column's results sets
            ArrayList<String> receiptsResultSet = new ArrayList<String>();

            // Loop the data result and display the data.
            while (resultSet.next()) {

                // Storing results sets into ArrayLists
                OtpNumber = String.valueOf(receiptsResultSet.add(resultSet.getString("OTPCode")));
            }

            // Adding all results sets into the main returnedResultSet to be returned to the requester
            returnedResultSet.add(receiptsResultSet.get(0));

            // Printing values of results sets
            System.out.println("A : " + receiptsResultSet.get(0));

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

            if (dbConnection != null) {
                try {
                    dbConnection.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
        return (ArrayList<String>) returnedResultSet;
    }

    public ArrayList<String> getIdFromDataBase(String query) {
        // Build sql server jdbc connection url use sql server account authentication.
        String host = "192.168.6.24";
        String dbName = "security_master_qa";
        String connectionUserName = "QA";
        String connectionPassword = "QA@123";

        String sqlServerConnectionUrl = "jdbc:sqlserver://" + host + ";databaseName=" + dbName + ";user=" + connectionUserName + ";password=" + connectionPassword + "";

        // Declare the JDBC objects.
        Connection dbConnection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        List<String> returnedResultSet = new ArrayList<String>();

        String id = null;

        try {
            // Get connection.
            dbConnection = DriverManager.getConnection(sqlServerConnectionUrl);

            // Execute sql and return data result.
            String SQL = query;
            statement = dbConnection.createStatement();
            resultSet = statement.executeQuery(SQL);

            // ArrayLists to store column's results sets
            ArrayList<String> receiptsResultSet = new ArrayList<String>();

            // Loop the data result and display the data.
            while (resultSet.next()) {

                // Storing results sets into ArrayLists
                id = String.valueOf(receiptsResultSet.add(resultSet.getString("id")));
            }

            // Adding all results sets into the main returnedResultSet to be returned to the requester
            returnedResultSet.add(receiptsResultSet.get(0));

            // Printing values of results sets
            System.out.println("A : " + receiptsResultSet.get(0));

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

            if (dbConnection != null) {
                try {
                    dbConnection.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
        return (ArrayList<String>) returnedResultSet;
    }
}
