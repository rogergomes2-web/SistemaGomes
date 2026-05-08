/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author proto
 */


public class BeanVendas {

    private int id_venda;
    private int id_cliente;
    private int id_usuario;
    private String rhg_data_venda;
    private String rhg_forma_pagamento;
    private double rhg_valor_total;

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getRhg_data_venda() {
        return rhg_data_venda;
    }

    public void setRhg_data_venda(String rhg_data_venda) {
        this.rhg_data_venda = rhg_data_venda;
    }

    public String getRhg_forma_pagamento() {
        return rhg_forma_pagamento;
    }

    public void setRhg_forma_pagamento(String rhg_forma_pagamento) {
        this.rhg_forma_pagamento = rhg_forma_pagamento;
    }

    public double getRhg_valor_total() {
        return rhg_valor_total;
    }

    public void setRhg_valor_total(double rhg_valor_total) {
        this.rhg_valor_total = rhg_valor_total;
    }
}
