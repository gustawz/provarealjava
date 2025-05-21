/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.etec.exercicio3.teste;
 
import br.edu.etec.exercicio3.teste.model.*;
 
public class TesteFloricultura {
    public static void main(String[] args) {
        NotificacaoEntrega entrega = new NotificacaoEntrega("Joana", "Buque de rosas vermelhas amanha às 10h.");
        NotificacaoCuidados cuidados = new NotificacaoCuidados("Carlos", "Regue as orquídeas duas vezes por semana e mantenha em local com luz indireta.");
 
        entrega.preparar();
        entrega.enviar();
        entrega.enviar("Orquidea branca");
 
        cuidados.preparar();
        cuidados.enviar();
        System.out.println("Resumo: " + cuidados.resumoRapido());
    }
}