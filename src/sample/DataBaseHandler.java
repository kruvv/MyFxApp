package sample;

import sample.assets.Const;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseHandler extends Configs {

    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;

        Class.forName("com.mysql.cj.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);

        return dbConnection;
    }

    public void signUpUser (String firstName, String lastName, String userName,
                            String  password, String location, String gender) throws SQLException, ClassNotFoundException {
        String insert = "INSERT INTO " + Const.USER_TABLE + "(" +
                Const.USERS_FIRSTNAME + "," + Const.USERS_LASTNAME + "," +
                Const.USERS_USERNAME + "," + Const.USERS_PASSWORD + "," +
                Const.USERS_LOCATION + "," + Const.USERS_GENDER + ")" +
                "VALUE(?,?,?,?,?,?)";

        PreparedStatement statement = getDbConnection().prepareStatement(insert);
        statement.setString(1, firstName);
        statement.setString(2, lastName);
        statement.setString(3, userName);
        statement.setString(4, password);
        statement.setString(5, location);
        statement.setString(6, gender);

        statement.executeUpdate();
    }
}
