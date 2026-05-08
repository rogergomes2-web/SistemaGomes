/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.BeanClientes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DaoClientes extends DaoAbstract {

    Connection con;

    @Override
    public void insert(Object object) {

        BeanClientes clientes = (BeanClientes) object;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/SistemaRoger",
                "root",
                "75821021rR!2020"
            );

            String sql = "INSERT INTO clientes ("
                    + "rhg_ativo, "
                    + "rhg_bairro, "
                    + "rhg_cep, "
                    + "rhg_cidade, "
                    + "rhg_cpf, "
                    + "rhg_data_nascimento, "
                    + "rhg_email, "
                    + "rhg_endereco, "
                    + "rhg_estado, "
                    + "rhg_nome, "
                    + "rhg_numero, "
                    + "rhg_rg, "
                    + "rhg_sexo, "
                    + "rhg_telefone"
                    + ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, clientes.getRhg_ativo());
            ps.setString(2, clientes.getRhg_bairro());
            ps.setString(3, clientes.getRhg_cep());
            ps.setString(4, clientes.getRhg_cidade());
            ps.setString(5, clientes.getRhg_cpf());
            ps.setString(6, clientes.getRhg_data_nascimento());
            ps.setString(7, clientes.getRhg_email());
            ps.setString(8, clientes.getRhg_endereco());
            ps.setString(9, clientes.getRhg_estado());
            ps.setString(10, clientes.getRhg_nome());
            ps.setString(11, clientes.getRhg_numero());
            ps.setString(12, clientes.getRhg_rg());
            ps.setString(13, clientes.getRhg_sexo());
            ps.setString(14, clientes.getRhg_telefone());

            ps.execute();

            System.out.println("Cliente salvo!");

        } catch (Exception erro) {

            System.out.println("Erro ao salvar!");
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