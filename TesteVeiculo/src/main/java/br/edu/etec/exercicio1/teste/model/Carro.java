/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio1.teste.model;
 
public class Carro extends Veiculo {
    private int numeroPortas;
 
    public Carro(String modelo, String cor, int numeroPortas) {
        super(modelo, cor);
        this.numeroPortas = numeroPortas;
    }
 
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Numero de portas: " + numeroPortas);
    }
}