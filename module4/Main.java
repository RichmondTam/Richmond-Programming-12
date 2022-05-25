import org.apache.commons.io.FilenameUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    static DatabaseHandler handler;


    public static void addData(String fileName){  //add data to table
        String path= String.valueOf(Paths.get(fileName)); //get path of files
        String extension = FilenameUtils.getExtension(fileName); //get extension of files
        String qu = null;
        try {
            qu = "INSERT INTO TABLE VALUES (" +
                    "'" + fileName + "'," +
                    "'" + path + "'," +
                    "'" + extension + "'," +
                    "'" + Files.size(Path.of(path)) + "')";
        } catch (IOException e) {
            e.printStackTrace();
        }
        handler.execAction(qu);

    }

    public static void main(String[] args) {
        handler = DatabaseHandler.getHandler();

        String qu = "SELECT * FROM FILES WHERE NAME = ' '";
        ResultSet resultSet = handler.execQuery(qu);
        try {
            while (resultSet.next()) {
                String filename = resultSet.getString("file_name");
                String path = resultSet.getString("path");
                System.out.println("Entry: File Name" + filename + "\tName: " + path);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        addData(" ");

    }
}