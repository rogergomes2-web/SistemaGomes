/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author proto
 */


import bean.BeanVendaProdutos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DaoVendaProdutos extends DaoAbstract {

    Connection con;

    @Override
    public void insert(Object object) {

        BeanVendaProdutos vendaProduto = (BeanVendaProdutos) object;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/SistemaRoger?useTimezone=true&serverTimezone=UTC",
                "root",
                "75821021rR!2020"
            );

            String sql = "INSERT INTO venda_produtos ("
                    + "id_produto,"
                    + "id_venda,"
                    + "rhg_quantidade,"
                    + "rhg_valor_unitario"
                    + ") VALUES (?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, vendaProduto.getId_produto());
            ps.setInt(2, vendaProduto.getId_venda());
            ps.setInt(3, vendaProduto.getRhg_quantidade());
            ps.setDouble(4, vendaProduto.getRhg_valor_unitario());

            ps.execute();

            System.out.println("Venda produto salva!");

        } catch (Exception erro) {

            System.out.println("Erro ao salvar venda produto!");
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
