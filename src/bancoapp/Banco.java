/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoapp;

import java.util.ArrayList;

/**
 *
 * @author Diego Cansi Matte <diego.cansi at ibm.com>
 */
public class Banco {

    private ArrayList<Cliente> listaCliente;

    public Banco() {
        listaCliente = new ArrayList<>();
    }

    /**
     * Método que faz o atendimento do caixa e passando o número do mesmo por parâmetro
     * @param nroCaixa 
     */
    public void atenderCliente(int nroCaixa) {
        if (nroCaixa > 0 && nroCaixa <= 5) {
            for (Cliente c : listaCliente) {
                if (c.getIdade() >= 65) {
                    listaCliente.remove(c);
                    return;
                }
            }
        } else {
            throw new IndexOutOfBoundsException("Não há ninguém na fila");
        }
        listaCliente.remove(0);
    }

    public void adicionarClienteFila(Cliente c) {
        listaCliente.add(c);
    }

    /**
     * Método que exibe todos os clientes existentes na fila ou devolve uma mensagem caso não exista cliente na fila
     */
    public void exibirClientes() {
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
     * ---- MÉTODO NÃO UTILIZADO ----
     */
    public void atenderClientePrioritario() {
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
     * ---- MÉTODO NÃO UTILIZADO ----
     */
    public void atenderClienteNaoPrioritario() {
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

}
