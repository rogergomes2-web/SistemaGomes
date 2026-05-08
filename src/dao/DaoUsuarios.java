/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author proto
 */

import bean.BeanUsuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DaoUsuarios extends DaoAbstract {

    Connection con;

    @Override
    public void insert(Object object) {

        BeanUsuarios usuario = (BeanUsuarios) object;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sistemaroger?useTimezone=true&serverTimezone=UTC",
                "root",
                "75821021rR!2020"
            );

            String sql = "INSERT INTO usuarios ("
                    + "rhg_ativo,"
                    + "rhg_email,"
                    + "rhg_login,"
                    + "rhg_nivel,"
                    + "rhg_nome,"
                    + "rhg_senha"
                    + ") VALUES (?,?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, usuario.getRhg_ativo());
            ps.setString(2, usuario.getRhg_email());
            ps.setString(3, usuario.getRhg_login());
            ps.setString(4, usuario.getRhg_nivel());
            ps.setString(5, usuario.getRhg_nome());
            ps.setString(6, usuario.getRhg_senha());

            ps.execute();

            System.out.println("Usuário salvo!");

        } catch (Exception erro) {

            System.out.println("Erro ao salvar usuário!");
            System.out.println(erro);

        }
    }

    @Override
    public void update(Object object) {
    }

    @Override
    public void delete(Object object) {
    }

    @Override
    public Object list(int id) {
        return null;
    }

    @Override
    public Object listAll() {
        return null;
    }
}
