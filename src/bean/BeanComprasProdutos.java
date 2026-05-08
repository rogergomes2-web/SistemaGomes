/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author proto
 */

public class BeanComprasProdutos {

    private int id_compra_produto;
    private int id_compra;
    private int id_produto;
    private int rhg_quantidade;
    private double rhg_valor_unitario;

    public int getId_compra_produto() {
        return id_compra_produto;
    }

    public void setId_compra_produto(int id_compra_produto) {
        this.id_compra_produto = id_compra_produto;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
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