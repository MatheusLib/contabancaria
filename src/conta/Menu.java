package conta;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while(true) {
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
			System.out.println("\nEntre com a opção desejadan");
			
			opcao = leia.nextInt();
			if (opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu futuro começa aqui");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println("Criar Conta\n\n");
								
				break;
			case 2:
				System.out.println("Listar todas as Contas\\n\\n");
								
				break;
			case 3:
				System.out.println("Buscar Conta por número\\n\\n");
								
				break;
			case 4:
				System.out.println("Atualizar Dados da Conta\\n\\n");
								
				break;
			case 5:
				System.out.println("Apagar a Conta\\n\\n");
								
				break;
			case 6:
				System.out.println("Sacar\\n\\n");
								
				break;
			case 7:
				System.out.println("Depositar\\n\\n");
								
				break;
			case 8:
				System.out.println("Transferir Valores entre Contas\\n\\n");
								
				break;
			default:
				System.out.println("\nOpção Inválida\n");
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
