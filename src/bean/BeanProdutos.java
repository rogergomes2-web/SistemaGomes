/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package bean;
/**
 *
 * @author proto
 */


public class BeanProdutos {

    private int id_produto;
    private int id_categoria;
    private String rhg_descricao;
    private String rhg_nome;
    private int rhg_quantidade_estoque;
    private double rhg_valor_compra;
    private double rhg_valor_venda;

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getRhg_descricao() {
        return rhg_descricao;
    }

    public void setRhg_descricao(String rhg_descricao) {
        this.rhg_descricao = rhg_descricao;
    }

    public String getRhg_nome() {
        return rhg_nome;
    }

    public void setRhg_nome(String rhg_nome) {
        this.rhg_nome = rhg_nome;
    }

    public int getRhg_quantidade_estoque() {
        return rhg_quantidade_estoque;
    }

    public void setRhg_quantidade_estoque(int rhg_quantidade_estoque) {
        this.rhg_quantidade_estoque = rhg_quantidade_estoque;
    }

    public double getRhg_valor_compra() {
        return rhg_valor_compra;
    }

    public void setRhg_valor_compra(double rhg_valor_compra) {
        this.rhg_valor_compra = rhg_valor_compra;
    }

    public double getRhg_valor_venda() {
        return rhg_valor_venda;
    }

    public void setRhg_valor_venda(double rhg_valor_venda) {
        this.rhg_valor_venda = rhg_valor_venda;
    }
}
