/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Aluno
 */
public class Custo {
    private int cod_custo;
    private String descricao_custo;
    private float valor_custo;
    private Date data_custo;
    private String status_custo;

    public int getCod_custo() {
        return cod_custo;
    }

    public void setCod_custo(int cod_custo) {
        this.cod_custo = cod_custo;
    }

    public String getDescricao_custo() {
        return descricao_custo;
    }

    public void setDescricao_custo(String descricao_custo) {
        this.descricao_custo = descricao_custo;
    }

    public float getValor_custo() {
        return valor_custo;
    }

    public void setValor_custo(float valor_custo) {
        this.valor_custo = valor_custo;
    }

    public Date getData_custo() {
        return data_custo;
    }

    public void setData_custo(Date data_custo) {
        this.data_custo = data_custo;
    }

    public String getStatus_custo() {
        return status_custo;
    }

    public void setStatus_custo(String status_custo) {
        this.status_custo = status_custo;
    }

    


}
