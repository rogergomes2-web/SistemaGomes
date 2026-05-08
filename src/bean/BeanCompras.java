/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author proto
 */


public class BeanCompras {

    private int id_compra;
    private int id_fornecedor;
    private String rhg_data_compra;
    private String rhg_forma_pagamento;
    private String rhg_numero_nota;
    private double rhg_valor_total;

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public String getRhg_data_compra() {
        return rhg_data_compra;
    }

    public void setRhg_data_compra(String rhg_data_compra) {
        this.rhg_data_compra = rhg_data_compra;
    }

    public String getRhg_forma_pagamento() {
        return rhg_forma_pagamento;
    }

    public void setRhg_forma_pagamento(String rhg_forma_pagamento) {
        this.rhg_forma_pagamento = rhg_forma_pagamento;
    }

    public String getRhg_numero_nota() {
        return rhg_numero_nota;
    }

    public void setRhg_numero_nota(String rhg_numero_nota) {
        this.rhg_numero_nota = rhg_numero_nota;
    }

    public double getRhg_valor_total() {
        return rhg_valor_total;
    }

    public void setRhg_valor_total(double rhg_valor_total) {
        this.rhg_valor_total = rhg_valor_total;
    }
}
