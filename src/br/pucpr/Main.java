package br.pucpr;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("DIGITA UMA FRASE PARA CRIPTOGRAFAR/DESCRIPTOGRAFAR:");
        String text = in.nextLine();
        System.out.println("Qual método de criptografia gostaria de utilizar?");
        System.out.println("1 - Algoritmo de Caesar");
        System.out.println("2 - Troca de letras");
        int option = Integer.parseInt(in.nextLine());
        if (option == 1) {
            System.out.println("Gostaria de criptografar ou descriptografar?");
            System.out.println("1 - Criptografar");
            System.out.println("2 - Descriptografar");
            option = Integer.parseInt(in.nextLine());
            if (option == 1) {
                Criptografia caesar = new Caesar();
                System.out.println(caesar.criptografar(text));
            } else if (option == 2) {
                Criptografia caesar = new Caesar();
                System.out.println(caesar.descriptografar(text));
            } else {
                System.out.println("Nenhuma escolha realizada, saindo do sistema");
                System.exit(0);
            }
        } else if (option == 2) {
            System.out.println("Gostaria de criptografar ou descriptografar?");
            System.out.println("1 - Criptografar");
            System.out.println("2 - Descriptografar");
            option = Integer.parseInt(in.nextLine());
            if (option == 1) {
                Criptografia troca = new TrocaLetras();
                System.out.println(troca.criptografar(text));
            } else if (option == 2) {
                Criptografia troca = new TrocaLetras();
                System.out.println(troca.descriptografar(text));
            }
        } else {
            System.out.println("Escolha uma das opções");
        }
    }
}


