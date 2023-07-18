package br.com.concessionaria.estrutura;

import java.text.DecimalFormat;

public class Peca {

    String dataCompra, nomePeca;
    public float valor;

    public Peca(String dataCompra, String nomePeca, float valor) {
        this.dataCompra = dataCompra;
        this.nomePeca = nomePeca;
        this.valor = valor;
    }

    public String getDadosGeral(){
        return nomePeca + " " + new DecimalFormat(".##").format(valor) + "R$" + " " + dataCompra;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getNomePeca() {
        return nomePeca;
    }

    public void setNomePeca(String nomePeca) {
        this.nomePeca = nomePeca;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
