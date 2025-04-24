package Pessoa;

import java.util.Scanner;

public class SistemaCadastro {
    public static void main(String[] args) {
        // criamos uma pessoa no sistema
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome..:");
        String nome = scanner.next();
        System.out.print("\nDigite seu CPF..:");
        String cpf = scanner.next();
        Pessoa marcos = new Pessoa(nome, cpf);
        // definimos o endereço de marcos
        marcos.setEndereco("RUA DAS MARIAS");
        // e como definir o nome e cpf do marcos ?
        // imprimindo o marcos sem o nome e cpf

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
    }
}
