/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Heroi {
    
    private String nome;
    private int idade;
    private String tipo;
    
    @Override
    public String toString() {
        return String.format("Nome: %s%nIdade: %d%nTipo: %s", nome, idade, tipo);
    }
    
    public Heroi(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void ataque() {
        if (this.tipo.equals("mago"))
            System.out.println("O " + this.tipo + " atacou usando magia");
        else if (this.tipo.equals("guerreiro"))
            System.out.println("O " + this.tipo + " atacou usando espada");
        else if (this.tipo.equals("monge"))
            System.out.println("O " + this.tipo + " atacou usando artes marciais");
        else if (this.tipo.equals("ninja"))
            System.out.println("O " + this.tipo + " atacou usando shuriken");
    }
    
    public static Heroi criarHeroi(Scanner input) {
        System.out.println("Cadastro de Heroi");
        System.out.println("=================");

        System.out.print("Qual o nome do seu heroi? ");
        String nome = "";
        do {
            nome = input.next();
            if (!nome.matches("[a-zA-Z]+")) {
                System.out.println("Por favor, insira um nome valido (apenas letras)!");
            }
        } while (!nome.matches("[a-zA-Z]+"));

        int flag = 0;
        int idade = 0;
        do {
            System.out.print("Qual a idade do seu heroi? ");
            idade = input.nextInt();
            if (idade <= 0) {
                System.out.println("Por favor, insira uma idade valida!");
            } else {
                flag = 1;
            }
        } while (flag != 1);

        flag = 0;
        String tipo = "";
        do {
            System.out.print("Qual o tipo do seu heroi? (guerreiro, mago, monge, ninja) ");
            tipo = input.next().toLowerCase();

            // Validar se o tipo inserido está na lista de tipos permitidos
            if (!tipo.equals("guerreiro") && !tipo.equals("mago") && !tipo.equals("monge") && !tipo.equals("ninja")) {
                System.out.println("Por favor, insira um tipo valido!");
            } else {
                flag = 1;
            }
        } while (flag != 1);

        return new Heroi(nome, idade, tipo);
    }
    
    public static Heroi alterarHeroi(Scanner input, Heroi heroiAtual) {
        System.out.println("Alteracao de Heroi");
        System.out.println("=================");

        // Mantendo o nome do herói anterior
        System.out.println("Nome atual: " + heroiAtual.getNome());
        System.out.print("Novo nome? ");
        String nome = "";
        do {
            nome = input.next();
            if (!nome.matches("[a-zA-Z]+")) {
                System.out.println("Por favor, insira um nome valido (apenas letras)!");
            }
        } while (!nome.matches("[a-zA-Z]+"));

        int flag = 0;
        int idade = 0;
        do {
            System.out.print("Nova idade: ");
            idade = input.nextInt();
            if (idade <= 0) {
                System.out.println("Por favor, insira uma idade valida!");
            } else {
                flag = 1;
            }
        } while (flag != 1);

        flag = 0;
        String tipo = "";
        do {
            System.out.print("Novo tipo do heroi? (guerreiro, mago, monge, ninja) ");
            tipo = input.next().toLowerCase();

            // Validar se o tipo inserido está na lista de tipos permitidos
            if (!tipo.equals("guerreiro") && !tipo.equals("mago") && !tipo.equals("monge") && !tipo.equals("ninja")) {
                System.out.println("Por favor, insira um tipo valido!");
            } else {
                flag = 1;
            }
        } while (flag != 1);

        return new Heroi(nome, idade, tipo);
    }
    
}
