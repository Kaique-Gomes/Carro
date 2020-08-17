/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

import java.util.Scanner;

public class Classe {

 private String nome, modelo, numPessoas, ano, fabricante, cor;

    public Classe(String nome, String modelo, String numPessoas, String ano, String fabricante, String cor) {
        this.nome = nome;
        this.modelo = modelo;
        this.numPessoas = numPessoas;
        this.ano = ano;
        this.fabricante = fabricante;
        this.cor = cor;
    }
    public static void main(String[] args) {
        String m, n, p, a, f, c;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Coloque o nome do carro : ");
        n = ler.next();
        System.out.println("Qual a marca do seu carro ?");
        m = ler.next();
        System.out.println("Quantos lugares tem ? ");
        p = ler.next();
        System.out.println("Qual ano ele é ?");
        a = ler.next();
        System.out.println("Qual a cor do seu carro?");
        c = ler.next();
        
        System.out.println("Seu carro é um : " +n);
        System.out.println("da marca :"+m);
        System.out.println("de "+p+" lugares");
        System.out.println("com o modelo de "+a);
        System.out.println("da cor "+c);
       
    }
    
}
