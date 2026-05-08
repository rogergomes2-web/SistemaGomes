/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author proto
 */

import bean.BeanCompras;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DaoCompras extends DaoAbstract {

    Connection con;

    @Override
    public void insert(Object object) {

        BeanCompras compra = (BeanCompras) object;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sistemaroger?useTimezone=true&serverTimezone=UTC",
                "root",
                "75821021rR!2020"
            );

            String sql = "INSERT INTO compras ("
                    + "id_fornecedor,"
                    + "rhg_data_compra,"
                    + "rhg_forma_pagamento,"
                    + "rhg_numero_nota,"
                    + "rhg_valor_total"
                    + ") VALUES (?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, compra.getId_fornecedor());
            ps.setString(2, compra.getRhg_data_compra());
            ps.setString(3, compra.getRhg_forma_pagamento());
            ps.setString(4, compra.getRhg_numero_nota());
            ps.setDouble(5, compra.getRhg_valor_total());

            ps.execute();

            System.out.println("Compra salva!");

        } catch (Exception erro) {

            System.out.println("Erro ao salvar compra!");
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