package br.com.concessionaria.oficina;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

import br.com.concessionaria.funcionarios.Mecanico;
import br.com.concessionaria.estrutura.Peca;
import br.com.concessionaria.veiculos.Veiculo;

public class Oficina {
    private String nomeOficina;
    private int pecasNecessarias=0;
    public ArrayList<Mecanico> mecanicos;
    public ArrayList<Peca> pecas;
    public ArrayList<Veiculo> veiculos;
    private Random random = new Random();
    private int randomNumber, randomadd, randomrmv;

    public Oficina(String nomeOficina) {
        this.nomeOficina = nomeOficina;
        veiculos = new ArrayList<Veiculo>();
        mecanicos = new ArrayList<Mecanico>();
        pecas = new ArrayList<Peca>();
    }

    public void adicionarMecanico(Mecanico mecanico){
        mecanicos.add(mecanico);
    }
    public void removerMecanico(Mecanico mecanico){
        mecanicos.remove(mecanico);
    }
    public void adicionarPeca(Peca peca){
        pecas.add(peca);
    }

    public void removerPeca(Peca peca){
        pecas.remove(peca);
    }

    public void adicionarVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
        randomadd = random.nextInt(3) + 1;
        for(int i = 0; i < randomadd; i++){
            float valorRandomPeca = random.nextFloat() * 100;

            String indiceString = Integer.toString(1 + pecas.size());
            Peca peca = new Peca("01/01/2001","peca" + indiceString, valorRandomPeca);
            adicionarPeca(peca);

            /*
            Caso queira informar os atributos através do usuário, deve-se usar a sequencia de comandos abaixo:

            Scanner scan = new Scanner(System.in);
            System.out.println("data de compra da peça: ");
            String dataCompra = scan.nextLine();
            System.out.println("Nome da peça: ");
            String nome = scan.nextLine();
            System.out.println("Valor da peça: ");
            float valor = scan.nextFloat();

            Peca peca = new Peca(dataCompra, nome, valor);
             */
        }

    }

    public void removerVeiculo(Veiculo veiculo){
        veiculos.remove(veiculo);
        randomrmv = random.nextInt(3) + 1;
        for(int i = 0; i < randomrmv; i++){
            pecas.remove(pecas.size()-1);
        }
    }

    public String exibirPlaca(){
        StringBuilder nomePlaca = new StringBuilder("Placas: \n");
        for (Veiculo placa: veiculos) {
            nomePlaca.append(placa.getPlaca()).append("\n");
        }
        return nomePlaca.toString();
    }

    public String exibirMecanicos(){
        StringBuilder nomeMecanico = new StringBuilder("Mecanicos: \n");
        for (Mecanico nome: mecanicos) {
            nomeMecanico.append(nome.getNomeMecanico()).append(" atende ").append(nome.getCarrosSimultaneos()).append(" carros simultaneos").append("\n");
        }
        return nomeMecanico.toString();
    }

    public String exibirDadosPecas(){
        StringBuilder dadosPecas = new StringBuilder("Dados das Peças:\n");
        for(Peca dados: pecas){
            dadosPecas.append(dados.getDadosGeral()).append("\n");
        }
        return dadosPecas.toString();
    }

    public int verificarPecasRevisao(){
        if(veiculos == null || veiculos.size() == 0){
            System.out.println("Não há veículos a serem revisados");
        } else {
            for(int i = 0; i< veiculos.size(); i++){
                randomNumber = random.nextInt(3) + 1;
                pecasNecessarias += randomNumber;
            }
            System.out.println(veiculos.size() + " veículos, com um total de " + pecasNecessarias + " pecas a serem revisadas");
        }
        return pecasNecessarias;
    }

    public boolean realizarRevisaoVeiculos() {

        boolean hasMecanicos;
        boolean revisaoPossivel;
        int somaAtendimentos=0;

        for(Mecanico carrossimultaneos : mecanicos){
            somaAtendimentos += carrossimultaneos.getCarrosSimultaneos();
        }
        hasMecanicos = somaAtendimentos > veiculos.size();

        if (veiculos == null || veiculos.size() == 0) {
            revisaoPossivel = false;
            System.out.println("Não há veículos a serem revisados");
        } else {
            if (pecas.size() >= pecasNecessarias && hasMecanicos) {
                revisaoPossivel = true;
                System.out.println(exibirMecanicos());
                System.out.println(exibirPlaca());

                // System.out.println(exibirDadosPecas());
            } else {
                System.out.println("nao foi possível fazer simultaneamente a revisão");
                revisaoPossivel = false;
            }
        }
        return revisaoPossivel;
    }

    public float valorTotalPecas(){
        float somaPecas=0;
        for(Peca p1 : pecas){
            System.out.println(p1.getNomePeca() + " " + new DecimalFormat(".##").format(p1.getValor()) + "R$");
            somaPecas += p1.getValor() * pecasNecessarias;
        }
        return  somaPecas;
    }
}
