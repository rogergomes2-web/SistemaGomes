/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author proto
 */


import bean.BeanCategorias;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DaoCategorias extends DaoAbstract {

    Connection con;

    @Override
    public void insert(Object object) {

        BeanCategorias categoria = (BeanCategorias) object;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sistemaroger?useTimezone=true&serverTimezone=UTC",
                "root",
                "75821021rR!2020"
            );

            String sql = "INSERT INTO categorias ("
                    + "rhg_codigo, "
                    + "rhg_descricao, "
                    + "rhg_nome, "
                    + "rhg_observacao, "
                    + "rhg_setor, "
                    + "rhg_status"
                    + ") VALUES (?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, categoria.getRhg_codigo());
            ps.setString(2, categoria.getRhg_descricao());
            ps.setString(3, categoria.getRhg_nome());
            ps.setString(4, categoria.getRhg_observacao());
            ps.setString(5, categoria.getRhg_setor());
            ps.setString(6, categoria.getRhg_status());

            ps.execute();

            System.out.println("Categoria salva!");

        } catch (Exception erro) {
            System.out.println("Erro ao salvar categoria!");
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
