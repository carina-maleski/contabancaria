package conta;

import java.util.Scanner;

import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while(true) {
			
			System.out.println(Cores.TEXT_CYAN + Cores.ANSI_BLACK_BACKGROUND);
			System.out.println("*****************************************");
			System.out.println("\n");
			System.out.println("\n         BANCO JAVA 71");
			System.out.println("\n");
			System.out.println("*****************************************");
			System.out.println("\n");
			System.out.println("\n	1 - Criar Conta ");
			System.out.println("\n	2 - Listar todas as Contas");
			System.out.println("\n	3 - Buscar Conta por Número");
			System.out.println("\n	4 - Atualizar Dados da Conta");
			System.out.println("\n	5 - Apagar Conta");
			System.out.println("\n	6 - Sacar");
			System.out.println("\n	7 - Depositar");
			System.out.println("\n	8 - Transferir valores entre Contas");
			System.out.println("\n	9 - Sair");
			System.out.println("\n");
			System.out.println("*****************************************");
			System.out.println("\nEntre com a opção desejada:");
			System.out.println(Cores.TEXT_RESET);
			opcao = leia.nextInt();
			
			if(opcao==9) {
				System.out.println(Cores.TEXT_WHITE_BOLD+"\nBanco Java 71 - O seu futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Criar conta\n\n");
				
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Listar todas as Contas\n\n");
				
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Consultar dados da Conta - por Número\n\n");
				
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Atualizar Dados da Conta\n\n");
				
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Apagar Conta\n\n");
				
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Saque\n\n");
				
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Depósito\n\n");
				
				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Transferência entre Contas\n\n");
				
				break;
				default:
					System.out.println(Cores.TEXT_RED_BOLD+"Opção Inválida!\n"+ Cores.TEXT_RESET);
			}
			
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
