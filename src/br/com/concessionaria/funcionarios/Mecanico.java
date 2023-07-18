package br.com.concessionaria.funcionarios;

public class Mecanico {

    private String nomeMecanico;
    private int anosExperiencia;
    private int carrosSimultaneos;

    public String getNomeMecanico() {
        return nomeMecanico;
    }

    public void setNomeMecanico(String nomeMecanico) {
        this.nomeMecanico = nomeMecanico;
    }

    public int getCarrosSimultaneos() {
        return carrosSimultaneos;
    }

    public void setCarrosSimultaneos(int carrosSimultaneos) {
        this.carrosSimultaneos = carrosSimultaneos;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public Mecanico(String nomeMecanico, int anosExperiencia, int carrosSimultaneos) {
        this.nomeMecanico = nomeMecanico;
        this.anosExperiencia = anosExperiencia;
        this.carrosSimultaneos = carrosSimultaneos;
    }
}
