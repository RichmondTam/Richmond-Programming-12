import javax.swing.*;
import java.sql.*;

public class DatabaseHandler {
    private static final String DB_url = "jdbc:derby:database/forum;create=true";
    private static Connection conn = null;
    private static Statement stmt = null;
    public static DatabaseHandler handler;

    public DatabaseHandler() {
        createConnection();
        createTable();
    }

    private void createTable() { // create table with four fields
        String TABLE_NAME = "FILES";
        try {
            stmt = conn.createStatement();
            DatabaseMetaData dmn = conn.getMetaData();
            ResultSet tables = dmn.getTables(null, null, TABLE_NAME, null);
            if (tables.next()) {
                System.out.println("Table" + TABLE_NAME + "exists");
            } else {
                String statement = "CREATE TABLE" + TABLE_NAME + "(" + "fileName varchar(200) primary key,\n" + "path varchar(200),\n" + "extension varchar(200),\n" + "size of byte varchar(200)";
                System.out.println(statement);
                stmt.execute(statement);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "setting up database");
        }
    }

    private void createConnection() {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            conn = DriverManager.getConnection(DB_url);
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }


    }

    public void execAction(String qu) {
        try {
            stmt = conn.createStatement();
            stmt.execute(qu);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(), "Error Occured", JOptionPane.ERROR_MESSAGE);
            System.out.println("exception at execQuery" + e.getLocalizedMessage());

        }
    }

    public ResultSet execQuery(String query) {
        ResultSet resultSet;

        try {
            stmt=conn.createStatement();
            resultSet=stmt.executeQuery(query);
        }catch(SQLException e){
            System.out.println("Exception at Execute query");
            return null;
        }
        return resultSet;
    }
    public static DatabaseHandler getHandler(){
        if(handler == null){
            handler = new DatabaseHandler();
        }
        return handler;
    }
}