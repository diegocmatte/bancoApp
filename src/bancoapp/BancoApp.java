/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoapp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diego Cansi Matte <diego.cansi at ibm.com>
 */
public class BancoApp {

    /**
     * @param args the command line arguments
     */
    private static int tempo = 0;

    /**
     * Método main que exibe um menu e demais ações do sistema
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banco banco = new Banco();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        
        do {
            System.out.println("1 - Adicionar cliente na fila");
            System.out.println("2 - Atender clientes");
            //System.out.println("3 - Atender clientes não prioritarios");
            System.out.println("9 - Listar clientes");
            System.out.println("0 - Sair");
            System.out.println("---------");
            System.out.print("Digite a sua opção: ");
            opcao = sc.nextInt();
            System.out.print("---------\n\n");
            switch (opcao) {
                case 1:
                    System.out.println("Informe o nome: ");
                    String nome = sc.next();
                    System.out.println("Informe a idade: ");
                    int idade = sc.nextInt();
                    Cliente c = new Cliente(idade, nome, tempo);
                    banco.adicionarClienteFila(c);
                    break;
                case 2:
                    System.out.println("Informe o número do caixa:");
                    int caixa = sc.nextInt();
                    banco.atenderCliente(caixa);
                    break;
                case 9:
                    banco.exibirClientes();
                    break;
                case 0:
                    System.out.println("--- Fim da execução ---\n");
                    System.exit(opcao);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);
    }

}
