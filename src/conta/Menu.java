package conta;

import java.util.Scanner;

import conta.model.Conta;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		//TESTE CLASSE CONTA
		Conta c1 = new Conta(123, 003, 22, "Matheus", 12000.00f);
		c1.visualizar();
		c1.sacar(999999f);
		c1.visualizar();
		c1.depositar(500f);
		c1.visualizar();
		c1.sacar(300f);
		c1.visualizar();

		
		
		int opcao;
		
		while(true) {
			System.out.println(Cores.TEXT_YELLOW+Cores.ANSI_BLACK_BACKGROUND);
			System.out.println("***********************************************************");
			System.out.println("\n\t\tBanco do Brasil com Z\n");
			System.out.println("***********************************************************");
			System.out.println("\n\n\t1- Criar a Conta");
			System.out.println("\t2- Listar todas as Contas");
			System.out.println("\t3- Buscar Conta por número");
			System.out.println("\t4- Atualizar Dados da Conta");
			System.out.println("\t5- Apagar a Conta");
			System.out.println("\t6- Sacar");
			System.out.println("\t7- Depositar");
			System.out.println("\t8- Transferir Valores entre Contas");
			System.out.println("\t9- Sair\n");
			System.out.println("***********************************************************");
			System.out.println("\nEntre com a opção desejada\n"+Cores.TEXT_RESET);
			
			opcao = leia.nextInt();
			if (opcao == 9) {
				System.out.println(Cores.TEXT_RESET+"\nBanco do Brazil com Z - O seu futuro começa aqui");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Criar Conta\n\n");
								
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Listar todas as Contas\\n\\n");
								
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Buscar Conta por número\\n\\n");
								
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Atualizar Dados da Conta\\n\\n");
								
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Apagar a Conta\\n\\n");
								
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Sacar\\n\\n");
								
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Depositar\\n\\n");
								
				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Transferir Valores entre Contas\\n\\n");
								
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD+"\nOpção Inválida\n"+Cores.TEXT_RESET);
				break;
			}

		}

	}

	private static void sobre() {
		// TODO Auto-generated method stub
		System.out.println("\n***********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Matheus Henrique Alexandre Libanio - mlibanio97@gmail.com");
		System.out.println("Github - https://github.com/MatheusLib");
		System.out.println("\n***********************************************************");
		
		
	}

}
