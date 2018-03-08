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
    //private static ArrayList listaClientePrioritario = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    private static int tempo = 0;
    
    /**
     * método que adiciona um novo cliente na fila conforme a idade acrescido do tempo
     */
    public static void addClienteFila(){
        String nome;
        int idade;
        System.out.print("Nome: ");
        nome = sc.next();
        System.out.print("Idade: ");
        idade = sc.nextInt();
        System.out.print("---------\n");
        tempo++;
        
        listaCliente.add(new Cliente(idade, nome, tempo));
        
      /*  
        if(idade>=65){
            listaClientePrioritario.add(new Cliente(idade, nome, tempo));
        } else {
            listaClienteNormal.add(new Cliente(idade, nome, tempo));
        }
        */
        
    }
    
    /**
     * método que exibe todos os clientes existentes na fila
     */
    public static void exibeClientes(){
        System.out.print("---------\n");
        for (Cliente cliente : listaCliente) {
            if(cliente.getIdade()>=65){
                System.out.println("Cliente prioritario: "+cliente.toString());
            } else {
                System.out.println("Cliente nao prioritario: "+cliente.toString());
                
            }
        }
        /*
        System.out.println("Clientes prioritários: ");
        for (int i = 0; i < listaClientePrioritario.size(); i++) {
            System.out.println(listaClientePrioritario.get(i).toString());
        }
        System.out.println("Clientes não prioritários: ");
        for (int i = 0; i < listaCliente.size(); i++) {
            System.out.println(listaCliente.get(i).toString());
        }
        */
        System.out.print("----------\n");
    }
    /**
     * método que realiza o atendimento dos clientes
     */
    public static void atenderCliente(){
        for (Cliente c : listaCliente) {
            if(c.getIdade()>=65){
                System.out.println("Cliente prioritario atendido.");
                listaCliente.remove(c);
            } else {
                System.out.println("Cliente nao prioritario atendido.");
                listaCliente.remove(c);
            }
        }
    }
    
    /**
     * método main que exibe um menu e demais ações do sistema
     * @param args 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcao = 0;
        do{
            System.out.println("1 - Adicionar cliente na fila");
            System.out.println("9 - Listar clientes");
            System.out.println("0 - Sair");
            System.out.print("Digite a sua opção: ");
            opcao = sc.nextInt();
            System.out.print("---------\n");
            switch(opcao){
                case 1:
                    addClienteFila();
                    break;
                case 9:
                    exibeClientes();
                    break;
                case 0:
                    System.exit(opcao);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }while (opcao != 0);
    }
    
}
