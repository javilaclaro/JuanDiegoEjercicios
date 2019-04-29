package com.codesplai.vgames;

import java.util.ArrayList;
import java.util.List;

import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class PublisherController {

    // getAll devuelve todos los registros de la tabla
    public static List<Publisher> getAll() {
        List<Publisher> listaPublisher = new ArrayList<Publisher>();
        String sql = "select * from editores";

        try (Connection conn = DBConn.getConn(); Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Publisher u = new Publisher(rs.getInt("id_editores"), rs.getString("publisher"));
                listaPublisher.add(u);
            }
        } catch (Exception e) {
            String s = e.getMessage();
            System.out.println(s);
        }
        return listaPublisher;

    }

}