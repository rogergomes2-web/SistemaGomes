/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author proto
 */


import bean.BeanFornecedores;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DaoFornecedores extends DaoAbstract {

    Connection con;

    @Override
    public void insert(Object object) {

        BeanFornecedores fornecedor =
                (BeanFornecedores) object;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sistemaroger?useTimezone=true&serverTimezone=UTC",
                "root",
                "75821021rR!2020"
            );

            String sql = "INSERT INTO fornecedores ("
                    + "rhg_ativo,"
                    + "rhg_bairro,"
                    + "rhg_cep,"
                    + "rhg_cidade,"
                    + "rhg_cnpj,"
                    + "rhg_contato_responsavel,"
                    + "rhg_email,"
                    + "rhg_endereco,"
                    + "rhg_estado,"
                    + "rhg_inscricao_estadual,"
                    + "rhg_nome,"
                    + "rhg_numero,"
                    + "rhg_telefone,"
                    + "rhg_tipo_produto"
                    + ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, fornecedor.getRhg_ativo());
            ps.setString(2, fornecedor.getRhg_bairro());
            ps.setString(3, fornecedor.getRhg_cep());
            ps.setString(4, fornecedor.getRhg_cidade());
            ps.setString(5, fornecedor.getRhg_cnpj());
            ps.setString(6, fornecedor.getRhg_contato_responsavel());
            ps.setString(7, fornecedor.getRhg_email());
            ps.setString(8, fornecedor.getRhg_endereco());
            ps.setString(9, fornecedor.getRhg_estado());
            ps.setString(10, fornecedor.getRhg_inscricao_estadual());
            ps.setString(11, fornecedor.getRhg_nome());
            ps.setString(12, fornecedor.getRhg_numero());
            ps.setString(13, fornecedor.getRhg_telefone());
            ps.setString(14, fornecedor.getRhg_tipo_produto());

            ps.execute();

            System.out.println("Fornecedor salvo!");

        } catch (Exception erro) {

            System.out.println("Erro ao salvar fornecedor!");
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
