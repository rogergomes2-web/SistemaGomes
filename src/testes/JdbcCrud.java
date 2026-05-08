package testes;

import bean.BeanCategorias;
import bean.BeanClientes;
import bean.BeanFornecedores;
import bean.BeanUsuarios;

import dao.DaoCategorias;
import dao.DaoClientes;
import dao.DaoFornecedores;
import dao.DaoUsuarios;

public class JdbcCrud {

    public static void main(String[] args) {

    

        BeanClientes cliente = new BeanClientes();

        cliente.setRhg_ativo("S");
        cliente.setRhg_bairro("Centro");
        cliente.setRhg_cep("79900-000");
        cliente.setRhg_cidade("Ponta Porã");
        cliente.setRhg_cpf("000.000.000-00");
        cliente.setRhg_data_nascimento("2008-01-01");
        cliente.setRhg_email("teste@email.com");
        cliente.setRhg_endereco("Rua Teste");
        cliente.setRhg_estado("MS");
        cliente.setRhg_nome("Cliente Teste");
        cliente.setRhg_numero("123");
        cliente.setRhg_rg("123456");
        cliente.setRhg_sexo("Masculino");
        cliente.setRhg_telefone("(67)99999-9999");

        DaoClientes daoCliente =
                new DaoClientes();

        daoCliente.insert(cliente);

        

        BeanCategorias categoria =
                new BeanCategorias();

        categoria.setRhg_codigo("CAT01");
        categoria.setRhg_descricao("Categoria Teste");
        categoria.setRhg_nome("Tênis");
        categoria.setRhg_observacao("Observação");
        categoria.setRhg_setor("Calçados");
        categoria.setRhg_status("A");

        DaoCategorias daoCategoria =
                new DaoCategorias();

        daoCategoria.insert(categoria);

        

        BeanUsuarios usuario =
                new BeanUsuarios();

        usuario.setRhg_ativo("S");
        usuario.setRhg_email("admin@gmail.com");
        usuario.setRhg_login("gomes");
        usuario.setRhg_nivel("Administrador");
        usuario.setRhg_nome("Roger Gomes");
        usuario.setRhg_senha("123");

        DaoUsuarios daoUsuario =
                new DaoUsuarios();

        daoUsuario.insert(usuario);

        

        BeanFornecedores fornecedor =
                new BeanFornecedores();

        fornecedor.setRhg_ativo("S");
        fornecedor.setRhg_bairro("Centro");
        fornecedor.setRhg_cep("79900-000");
        fornecedor.setRhg_cidade("Ponta Porã");
        fornecedor.setRhg_cnpj("00.000.000/0001-00");
        fornecedor.setRhg_contato_responsavel("Roger");
        fornecedor.setRhg_email("fornecedor@gmail.com");
        fornecedor.setRhg_endereco("Rua Teste");
        fornecedor.setRhg_estado("MS");
        fornecedor.setRhg_inscricao_estadual("123456");
        fornecedor.setRhg_nome("Fornecedor Teste");
        fornecedor.setRhg_numero("100");
        fornecedor.setRhg_telefone("(67)99999-9999");
        fornecedor.setRhg_tipo_produto("Calçados");

        DaoFornecedores daoFornecedor =
                new DaoFornecedores();

        daoFornecedor.insert(fornecedor);

        System.out.println("funcionando");
    }
}