/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Amanda
 */
public class Servico {
    
    private int id;
    private String Descricao;
    private int Maodeobra;
    private double Custo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        this.Descricao = descricao;
    }

    public int getMaodeobra() {
        return Maodeobra;
    }

    public void setMaodeobra(int maodeobra) {
        this.Maodeobra = maodeobra;
    }

    public double getCusto() {
        return Custo;
    }

    public void setCusto(double custo) {
        this.Custo = custo;
    } 

    @Override
    public String toString() {
        return getDescricao(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

