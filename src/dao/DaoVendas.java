/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author proto
 */

import bean.BeanVendas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DaoVendas extends DaoAbstract {

    Connection con;

    @Override
    public void insert(Object object) {

        BeanVendas venda = (BeanVendas) object;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sistemaroger?useTimezone=true&serverTimezone=UTC",
                "root",
                "75821021rR!2020"
            );

            String sql = "INSERT INTO vendas ("
                    + "id_cliente,"
                    + "id_usuario,"
                    + "rhg_data_venda,"
                    + "rhg_forma_pagamento,"
                    + "rhg_valor_total"
                    + ") VALUES (?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, venda.getId_cliente());
            ps.setInt(2, venda.getId_usuario());
            ps.setString(3, venda.getRhg_data_venda());
            ps.setString(4, venda.getRhg_forma_pagamento());
            ps.setDouble(5, venda.getRhg_valor_total());

            ps.execute();

            System.out.println("Venda salva!");

        } catch (Exception erro) {

            System.out.println("Erro ao salvar venda!");
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
