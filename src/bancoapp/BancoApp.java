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
    private static ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
    private static Scanner sc = new Scanner(System.in);
    private static int tempo = 0;

    /**
     * Método que adiciona um novo cliente na fila conforme a idade acrescido do tempo
     */
    public static void adicionarClienteFila() {
        String nome;
        int idade;
        System.out.print("Nome: ");
        nome = sc.next();
        System.out.print("Idade: ");
        idade = sc.nextInt();
        System.out.println("--- Cliente adicionado ---\n");
        tempo++;

        listaCliente.add(new Cliente(idade, nome, tempo));
    }

    /**
     * Método que exibe todos os clientes existentes na fila ou devolve uma mensagem caso não exista cliente na fila
     */
    public static void exibirClientes() {
        if (listaCliente.isEmpty()) {
            System.out.println("--- Não há clientes na fila ---\n");
        } else {
            System.out.print("--- Inicio da listagem ---\n");
            for (Cliente cliente : listaCliente) {
                if (cliente.getIdade() >= 65) {
                    System.out.println("Cliente prioritário: " + cliente.toString());
                } else {
                    System.out.println("Cliente nao prioritário: " + cliente.toString());

                }
            }
            System.out.println("--- Fim da listagem ---\n");
        }

    }

    /**
     * Método que realiza o atendimento dos clientes prioritarios e exclui da lista depois de atender
     */
    public static void atenderClientePrioritario() {
        if (listaCliente.isEmpty()) {
            System.out.println("--- Não há clientes na fila ---\n");
        } else {
            for (int i = 0; i < listaCliente.size(); i++) {
                if (listaCliente.get(i).getIdade() >= 65) {
                    System.out.println("Cliente " + listaCliente.get(i).getNome() + " prioritário atendido.\n");
                    listaCliente.remove(i);
                }
            }
        }
    }

    /**
     * Método que realiza o atendimento dos clientes nao prioritarios e exclui da lista depois de atender
     */
    public static void atenderClienteNaoPrioritario() {
        if (listaCliente.isEmpty()) {
            System.out.println("--- Não há clientes na fila ---\n");
        } else {
            for (int i = 0; i < listaCliente.size(); i++) {
                if (listaCliente.get(i).getIdade() < 65) {
                    System.out.println("Cliente " + listaCliente.get(i).getNome() + " nao prioritário atendido.\n");
                    listaCliente.remove(i);
                }
            }
        }
    }

    /**
     * Método main que exibe um menu e demais ações do sistema
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcao = 0;
        do {
            System.out.println("1 - Adicionar cliente na fila");
            System.out.println("2 - Atender clientes prioritarios");
            System.out.println("3 - Atender clientes não prioritarios");
            System.out.println("9 - Listar clientes");
            System.out.println("0 - Sair");
            System.out.println("---------");
            System.out.print("Digite a sua opção: ");
            opcao = sc.nextInt();
            System.out.print("---------\n\n");
            switch (opcao) {
                case 1:
                    adicionarClienteFila();
                    break;
                case 2:
                    atenderClientePrioritario();
                    break;
                case 3:
                    atenderClienteNaoPrioritario();
                    break;
                case 9:
                    exibirClientes();
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
