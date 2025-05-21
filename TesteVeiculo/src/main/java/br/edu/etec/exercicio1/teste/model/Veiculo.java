/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio1.teste.model;
 
public class Veiculo {
    protected String modelo;
    protected String cor;
    protected int velocidade;
 
    public Veiculo(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
        this.velocidade = 0;
    }
 
    public void acelerar(int incremento) {
        velocidade += incremento;
    }
 
    public void frear(int decremento) {
        velocidade -= decremento;
    }
 
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade: " + velocidade + " km/h");
    }
}