
package com.mycompany.contaterminal;

import java.util.Scanner;


public class ContaTerminal {

    public static void main(String[] args) {
        int numeroConta;
        String agencia;
        String nomeCliente;
        Float saldo;
         
        Scanner entradaDados = new Scanner(System.in);
          System.out.printf("Por favor, digite o número da Conta !\n");
        numeroConta = entradaDados.nextInt();
          System.out.printf("Por favor, digite o número da Agencia !\n");
        agencia = entradaDados.next();
          System.out.printf("Por favor, digite o nome do titular da Conta !\n");
        nomeCliente = entradaDados.next();
          System.out.printf("Por favor, digite um valor para Deposito !\n");
        saldo = entradaDados.nextFloat();
        
        System.out.println("Olá" + " " + nomeCliente);
        System.out.println("obrigado por criar uma conta em nosso banco.");
        System.out.println("sua agência é:" + " " + agencia + " " + "conta:" + " " + numeroConta);
        System.out.printf("e seu saldo:%.2f\n", saldo);
        System.out.println("já está disponível para saque.");
    }
}
