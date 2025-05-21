/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.etec.exercicio1.teste;
 
import br.edu.etec.exercicio1.teste.model.Carro;
 
public class TesteVeiculo {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat Argo", "Vermelho", 4);
 
        carro.acelerar(60);
        carro.frear(15);
 
        carro.exibirInformacoes();
    }
}