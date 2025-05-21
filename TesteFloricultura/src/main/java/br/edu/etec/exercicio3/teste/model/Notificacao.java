/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio3.teste.model;
 
public class Notificacao {
    private String destinatario;
    private String mensagem;
    private TipoNotificacao tipo;
 
    public Notificacao(String destinatario, String mensagem, TipoNotificacao tipo) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
        this.tipo = tipo;
    }
 
    public String getDestinatario() { return destinatario; }
    public String getMensagem() { return mensagem; }
    public TipoNotificacao getTipo() { return tipo; }
 
    public void preparar() {
        System.out.println("Preparando notificacao para " + destinatario);
    }
 
    public void enviar() {
        System.out.println("Enviando: " + mensagem);
    }
}