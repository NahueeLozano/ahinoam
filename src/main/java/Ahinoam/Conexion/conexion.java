package Ahinoam.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
public static Connection getConexion(){
    Connection conexion = null;
    var baseDatos = "ahinoam";
    var url = "jdbc:mysql://localhost:3306/" + baseDatos;
    var usuario = "root";
    var password = "";

    try{
        Class.forName("com.mysql.cj.jdbc.Drivers");
        conexion = DriverManager.getConnection(url,usuario,password);


    } catch (Exception e) {
        System.out.println("error a la base de datos "+ e.getMessage());
    }
     return conexion;

}

}
