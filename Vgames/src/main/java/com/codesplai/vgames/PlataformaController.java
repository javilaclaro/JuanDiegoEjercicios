package com.codesplai.vgames;

import java.util.ArrayList;
import java.util.List;

import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class PlataformaController {

    // getAll devuelve todos los registros de la tabla
    public static List<Plataforma> getAll() {
        List<Plataforma> listaPlataforma = new ArrayList<Plataforma>();
        String sql = "select * from plataformas";

        try (Connection conn = DBConn.getConn(); Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Plataforma u = new Plataforma(rs.getInt("id_plataforma"), rs.getString("plataforma"));
                listaPlataforma.add(u);
            }
        } catch (Exception e) {
            String s = e.getMessage();
            System.out.println(s);
        }
        return listaPlataforma;

    }

}