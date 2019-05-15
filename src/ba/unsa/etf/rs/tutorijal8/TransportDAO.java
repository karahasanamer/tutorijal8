package ba.unsa.etf.rs.tutorijal8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TransportDAO {

    private static TransportDAO instance;
    private static Connection connection;

    private static PreparedStatement addDriver;
    private static PreparedStatement addBus;
    private static PreparedStatement addBusToDriver;
    private static PreparedStatement deleteBus;
    private static PreparedStatement deleteDriver;


    private TransportDAO() {

        try {
            connection = DriverManager.getConnection("jbdc:sqlite:baza.db");
            initializeStatements();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        setupDatabase();
        initializeStatements();
    }

    private void setupDatabase() {

        String sql= "";
        URL x = getClass().getResource("/setupDatabase.sql");
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(x.getFile());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    private void initializeStatements() {
    }


    public static TransportDAO getInstance(){

        if(instance == null){
            instance = new TransportDAO();
        }
        return instance;

    }

}
