/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio3.teste.model;
 
public class NotificacaoEntrega extends Notificacao {
    public NotificacaoEntrega(String destinatario, String mensagem) {
        super(destinatario, mensagem, TipoNotificacao.ENTREGA);
    }
 
    @Override
    public void enviar() {
        System.out.println("[ENTREGA] " + getMensagem() + " | Flor pronta para entrega!");
    }
 
    public void enviar(String nomeFlor) {
        System.out.println("[ENTREGA] Entrega da flor: " + nomeFlor + " para " + getDestinatario());
    }
}