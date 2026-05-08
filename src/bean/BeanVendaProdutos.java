/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author proto
 */


public class BeanVendaProdutos {

    private int id_venda_produto;
    private int id_produto;
    private int id_venda;
    private int rhg_quantidade;
    private double rhg_valor_unitario;

    public int getId_venda_produto() {
        return id_venda_produto;
    }

    public void setId_venda_produto(int id_venda_produto) {
        this.id_venda_produto = id_venda_produto;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public int getRhg_quantidade() {
        return rhg_quantidade;
    }

    public void setRhg_quantidade(int rhg_quantidade) {
        this.rhg_quantidade = rhg_quantidade;
    }

    public double getRhg_valor_unitario() {
        return rhg_valor_unitario;
    }

    public void setRhg_valor_unitario(double rhg_valor_unitario) {
        this.rhg_valor_unitario = rhg_valor_unitario;
    }
}