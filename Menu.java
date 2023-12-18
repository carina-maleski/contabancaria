package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		//Teste da Classe Conta Corrente
		ContaCorrente cc1 = new ContaCorrente(2,231,1,"Mariana",15000.0f,1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		
		//Teste da Classe Conta Poupança
		ContaPoupanca cp1 = new ContaPoupanca(3,123,2,"Victor",100000.0f,15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();
		
		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println(Cores.TEXT_CYAN + Cores.ANSI_BLACK_BACKGROUND);
			System.out.println("*****************************************");
			System.out.println("*                                       *");
			System.out.println("*            BANCO JAVA 71              *");
			System.out.println("*                                       *");
			System.out.println("*****************************************");
			System.out.println("*                                       *");
			System.out.println("*   1 - Criar Conta                     *");
			System.out.println("*   2 - Listar todas as Contas          *");
			System.out.println("*   3 - Buscar Conta por Número         *");
			System.out.println("*   4 - Atualizar Dados da Conta        *");
			System.out.println("*   5 - Apagar Conta                    *");
			System.out.println("*   6 - Sacar                           *");
			System.out.println("*   7 - Depositar                       *");
			System.out.println("*   8 - Transferir valores entre Contas *");
			System.out.println("*   9 - Sair                            *");
			System.out.println("*                                       *");
			System.out.println("*****************************************");
			System.out.println("                                         ");
			System.out.println("Entre com a opção desejada:              ");
			System.out.println("                                         ");
			System.out.println(Cores.TEXT_RESET);
			
			try {
			opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite os valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}
			
			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco Java 71 - O seu futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Criar conta\n\n");
				
				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as Contas\n\n");
				
				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da Conta - por Número\n\n");
				
				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar Dados da Conta\n\n");
				
				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar Conta\n\n");
				
				keyPress();
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");

				keyPress();
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");

				keyPress();
				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Transferência entre Contas\n\n");

				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "Opção Inválida!\n" + Cores.TEXT_RESET);
				keyPress();
				break;
			}

		}

	}
	
	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente!");
		}
	}
	public static void sobre() {
		System.out.println("\n*****************************************");
		System.out.println("Projeto Desenvolvido por:");
		System.out.println("Carina Maleski");
		System.out.println("https://github.com/carina-maleski");
		System.out.println("*****************************************");
	}

}
