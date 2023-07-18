package br.com.concessionaria;

import br.com.concessionaria.estrutura.Peca;
import br.com.concessionaria.funcionarios.Mecanico;
import br.com.concessionaria.oficina.Oficina;
import br.com.concessionaria.veiculos.Veiculo;

import java.util.Random;

public class Projeto {
    
    public static void main(String[] args) {
        Oficina oficina = new Oficina("G3");
        Random random = new Random();
        Veiculo veiculo1 = new Veiculo("kjk-1243", "5496", "vermelho", 1996, 95, 10);
        Veiculo veiculo2 = new Veiculo("kjk-1244", "5497", "rosa", 2006, 56, 200);
        Veiculo veiculo3 = new Veiculo("kjk-1245", "5498", "branco", 2013, 3, 1058);
        Peca peca1 = new Peca("01/01/2001","peca1", 25.2f);
        Peca peca2 = new Peca("01/01/2001","peca2", 27.2f);
        Peca peca3 = new Peca("01/01/2001","peca3", 98.4f);
        Peca peca4 = new Peca("01/01/2001","peca4", 56.7f);
        Peca peca5 = new Peca("01/01/2001","peca5", 12.5f);
        Peca peca6 = new Peca("01/01/2001","peca6", 18.6f);
        Peca peca7 = new Peca("01/01/2001","peca7", 77.99f);
        Peca peca8 = new Peca("01/01/2001","peca8", 48.25f);
        Peca peca9 = new Peca("01/01/2001","peca9", 16.5f);
        Peca peca10 = new Peca("01/01/2001","peca10", 87.13f);
        Mecanico mecanico1 = new Mecanico("Jhonantan", 15, 2);
        Mecanico mecanico2 = new Mecanico("Leonardo", 30, 1);
        Mecanico mecanico3 = new Mecanico("Bruna", 5, 2);

        oficina.adicionarPeca(peca1);
        oficina.adicionarPeca(peca2);
        oficina.adicionarPeca(peca3);
        oficina.adicionarPeca(peca4);
        oficina.adicionarPeca(peca5);
        oficina.adicionarPeca(peca6);
        oficina.adicionarPeca(peca7);
        oficina.adicionarPeca(peca8);
        oficina.adicionarPeca(peca9);
        oficina.adicionarPeca(peca10);
        oficina.adicionarVeiculo(veiculo1);
        oficina.adicionarVeiculo(veiculo2);
        oficina.adicionarVeiculo(veiculo3);
        oficina.adicionarMecanico(mecanico1);
        oficina.adicionarMecanico(mecanico2);
        oficina.adicionarMecanico(mecanico3);

        int pecasNecessarias = oficina.verificarPecasRevisao();
        boolean revisao = oficina.realizarRevisaoVeiculos();
        System.out.printf("Valor final das peças %.2fR$", oficina.valorTotalPecas());

    }
}
