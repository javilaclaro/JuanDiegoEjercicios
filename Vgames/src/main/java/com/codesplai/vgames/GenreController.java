package com.codesplai.vgames;

import java.util.ArrayList;
import java.util.List;

import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class GenreController {

    // getAll devuelve todos los registros de la tabla
    public static List<Genre> getAll() {
        List<Genre> listaGenres = new ArrayList<Genre>();
        String sql = "select * from generos";

        try (Connection conn = DBConn.getConn(); Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Genre u = new Genre(rs.getInt("id_genero"), rs.getString("genre"));
                listaGenres.add(u);
            }
        } catch (Exception e) {
            String s = e.getMessage();
            System.out.println(s);
        }
        return listaGenres;

    }

    public static void create(Genre genero) {
        String sql = "INSERT INTO genres (genre) VALUES (?)";

        try (Connection conn = DBConn.getConn();
                PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql)) {

            pstmt.setString(1, genero.genre);
            pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
