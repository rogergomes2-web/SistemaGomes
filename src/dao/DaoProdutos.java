/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author proto
 */


import bean.BeanProdutos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DaoProdutos extends DaoAbstract {

    Connection con;

    @Override
    public void insert(Object object) {

        BeanProdutos produto = (BeanProdutos) object;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sistemaroger?useTimezone=true&serverTimezone=UTC",
                "root",
                "75821021rR!2020"
            );

            String sql = "INSERT INTO produtos ("
                    + "id_categoria, "
                    + "rhg_descricao, "
                    + "rhg_nome, "
                    + "rhg_quantidade_estoque, "
                    + "rhg_valor_compra, "
                    + "rhg_valor_venda"
                    + ") VALUES (?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, produto.getId_categoria());
            ps.setString(2, produto.getRhg_descricao());
            ps.setString(3, produto.getRhg_nome());
            ps.setInt(4, produto.getRhg_quantidade_estoque());
            ps.setDouble(5, produto.getRhg_valor_compra());
            ps.setDouble(6, produto.getRhg_valor_venda());

            ps.execute();

            System.out.println("Produto salvo!");

        } catch (Exception erro) {
            System.out.println("Erro ao salvar produto!");
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
