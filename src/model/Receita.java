/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author notebook
 */
public class Receita {
    private int cod_receita;
    private String descricao_receita;
    private float valor_receita;
    private Date data_receita;

    public int getCod_receita() {
        return cod_receita;
    }

    public void setCod_receita(int cod_receita) {
        this.cod_receita = cod_receita;
    }

    public String getDescricao_receita() {
        return descricao_receita;
    }

    public void setDescricao_receita(String descricao_receita) {
        this.descricao_receita = descricao_receita;
    }

    public float getValor_receita() {
        return valor_receita;
    }

    public void setValor_receita(float valor_receita) {
        this.valor_receita = valor_receita;
    }

    public Date getData_receita() {
        return data_receita;
    }

    public void setData_receita(Date data_receita) {
        this.data_receita = data_receita;
    }
    
    
}
