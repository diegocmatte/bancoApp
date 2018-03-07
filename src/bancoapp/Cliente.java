package bancoapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego Cansi Matte <diego.cansi at ibm.com>
 */
public class Cliente {
    
    private int idade;
    private String nome;
    private int tempo;

    public Cliente(int idade, String nome, int tempo) {
        this.idade = idade;
        this.nome = nome;
        this.tempo = tempo;
    }

    public int getIdade() {
        return idade;
    }
    
    public int getTempo(){
        return tempo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idade=" + idade + ", nome=" + nome + ", tempo=" + tempo +"}";
    }
    
    
}
