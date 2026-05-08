/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author proto
 */

import bean.BeanComprasProdutos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DaoComprasProdutos extends DaoAbstract {

    Connection con;

    @Override
    public void insert(Object object) {

        BeanComprasProdutos compraProduto =
                (BeanComprasProdutos) object;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sistemaroger?useTimezone=true&serverTimezone=UTC",
                "root",
                "75821021rR!2020"
            );

            String sql = "INSERT INTO compras_produtos ("
                    + "id_compra,"
                    + "id_produto,"
                    + "rhg_quantidade,"
                    + "rhg_valor_unitario"
                    + ") VALUES (?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, compraProduto.getId_compra());
            ps.setInt(2, compraProduto.getId_produto());
            ps.setInt(3, compraProduto.getRhg_quantidade());
            ps.setDouble(4, compraProduto.getRhg_valor_unitario());

            ps.execute();

            System.out.println("Compra produto salva!");

        } catch (Exception erro) {

            System.out.println("Erro ao salvar compra produto!");
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