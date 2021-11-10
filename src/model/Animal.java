/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.swing.JTextField;

/**
 *
 * @author Aluno
 */
public class Animal {
    
    private int cod_animal;
    private float peso_animal;
    private float prodmes_animal;
    private float proddia_animal;
    private String classe_animal;
    private String status_animal;
    private Date datanascimento_animal;
    private String observacoes_animal;

    public String getObservacoes_animal() {
        return observacoes_animal;
    }

    public void setObservacoes_animal(String observacoes_animal) {
        this.observacoes_animal = observacoes_animal;
    }
    
    public void setPeso_animal(Float peso_animal) {
        this.peso_animal = peso_animal;
    }

    public void setStatus_animal(String status_animal) {
        this.status_animal = status_animal;
    }
    
    
    
    public String getStatus_animal() {
        return status_animal;
    }
   
    
    public float getProddia_animal() {
        return proddia_animal;
    }

    public void setProddia_animal(float proddia_animal) {
        this.proddia_animal = proddia_animal;
    }

    public float getProdmes_animal() {
        return prodmes_animal;
    }

    public void setProdmes_animal(float prodmes_animal) {
        this.prodmes_animal = prodmes_animal;
    }

    public String getClasse_animal() {
        return classe_animal;
    }

    public void setClasse_animal(String classe_animal) {
        this.classe_animal = classe_animal;
    }

    public Date getDatanascimento_animal() {
        return datanascimento_animal;
    }

    public void setDatanascimento_animal(Date datanascimento_animal) {
        this.datanascimento_animal = datanascimento_animal;
    }
    
    public int getCod_animal() {
        return cod_animal;
    }

    public void setCod_animal(int cod_animal) {
        this.cod_animal = cod_animal;
    }

    public float getPeso_animal() {
        return peso_animal;
    }

    public void setPeso_animal(float peso_animal) {
        this.peso_animal = peso_animal;
    }

      
}
