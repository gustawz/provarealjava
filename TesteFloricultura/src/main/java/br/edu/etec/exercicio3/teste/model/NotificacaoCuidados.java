/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio3.teste.model;
 
public class NotificacaoCuidados extends Notificacao {
    public NotificacaoCuidados(String destinatario, String mensagem) {
        super(destinatario, mensagem, TipoNotificacao.CUIDADOS);
    }
 
    @Override
    public void enviar() {
        String msg = getMensagem().length() > 100 ? getMensagem().substring(0, 100) : getMensagem();
        System.out.println("[CUIDADOS] " + msg);
    }
 
    public String resumoRapido() {
        return getMensagem().substring(0, Math.min(30, getMensagem().length()));
    }
}