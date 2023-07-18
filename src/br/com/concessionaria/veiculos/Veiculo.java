package br.com.concessionaria.veiculos;

public class Veiculo {
    public String placa, numeroChassi, cor;
    private int ano, modelo, kmRodas;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNumeroChassi() {
        return numeroChassi;
    }

    public void setNumeroChassi(String numeroChassi) {
        this.numeroChassi = numeroChassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getKmRodas() {
        return kmRodas;
    }

    public void setKmRodas(int kmRodas){
        this.kmRodas = kmRodas;
    }
    public Veiculo(String placa, String numeroChassi, String cor, int ano, int modelo, int kmRodas) {
        this.placa = placa;
        this.numeroChassi = numeroChassi;
        this.cor = cor;
        this.ano = ano;
        this.modelo = modelo;
        this.kmRodas = kmRodas;
    }
}
