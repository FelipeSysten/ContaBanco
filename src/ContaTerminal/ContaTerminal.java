/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContaTerminal;

import java.util.Scanner;

/**
 *
 * @author Portaria
 */
public class ContaTerminal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, digite o número da Agência:");
            String agencia = scanner.nextLine();
            System.out.println("Por favor, digite o número da Conta:");
            int numero;
            numero = scanner.nextInt();
            String String = scanner.nextLine(); // Limpar o buffer
            System.out.println("Por favor, digite o nome do Cliente:");
            String nomeCliente = scanner.nextLine();
            System.out.println("Por favor, digite o saldo:");
            double saldo = scanner.nextDouble();
            // Exibindo mensagem com os dados inseridos pelo usuário
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
            // Fechar o scanner
        }
    }
}
