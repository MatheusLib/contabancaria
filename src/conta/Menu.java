package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		ContaController contas = new ContaController();
		int opcao, numero, agencia, tipo, aniversario;
		String titular;
		float saldo, limite;
		
		ContaCorrente cc1 = new ContaCorrente(contas.gerarNumero(), 123, 1, "João da Silva", 1000f, 100.0f);
		contas.cadastrar(cc1);

		ContaCorrente cc2 = new ContaCorrente(contas.gerarNumero(), 124, 1, "Maria da Silva", 2000f, 100.0f);
		contas.cadastrar(cc2);

		ContaPoupanca cp1 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Mariana dos Santos", 4000f, 12);
		contas.cadastrar(cp1);

		ContaPoupanca cp2 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Juliana Ramos", 8000f, 15);
		contas.cadastrar(cp2);
		

		// TESTE CLASSE CONTA
		// Agora a classe conta será abstrata e não teraá mais objeto
		/*
		 * 
		 * Conta c1 = new Conta(123, 003, 22, "Matheus L.", 12000.00f); c1.visualizar();
		 * c1.sacar(999999f); c1.visualizar(); c1.depositar(500f); c1.visualizar();
		 * c1.sacar(300f); c1.visualizar();

		// Teste da Classe Conta Corrente
		ContaCorrente cc1 = new ContaCorrente(124, 003, 1, "Fatmia J.", 0.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();

		// Teste da Classe Conta Poupança
		ContaPoupanca cp1 = new ContaPoupanca(125, 003, 2, "Valmir Q.", 100000.0f, 15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();
		 */
		while (true) {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND);
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
			System.out.println("\nEntre com a opção desejada\n" + Cores.TEXT_RESET);

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 9) {
				System.out.println(Cores.TEXT_RESET + "\nBanco do Brazil com Z - O seu futuro começa aqui");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Criar Conta\n\n");
				
				System.out.println("Digite o Numero da Agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o Nome do Titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

				do {
					System.out.println("Digite o Tipo da Conta (1-CC ou 2-CP): ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);

				System.out.println("Digite o Saldo da Conta (R$): ");
				saldo = leia.nextFloat();

				switch (tipo) {
					case 1 -> {
						System.out.println("Digite o Limite de Crédito (R$): ");
						limite = leia.nextFloat();
						contas.cadastrar(
								new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
					}
					case 2 -> {
						System.out.println("Digite o dia do Aniversario da Conta: ");
						aniversario = leia.nextInt();
						contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo,
								aniversario));
					}
				}

				keyPress();

				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as Contas\\n\\n");
				contas.listarTodas();
				keyPress();

				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Buscar Conta por número\\n\\n");
				keyPress();

				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar Dados da Conta\\n\\n");
				keyPress();

				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar a Conta\\n\\n");
				keyPress();

				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Sacar\\n\\n");
				keyPress();

				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Depositar\\n\\n");
				keyPress();

				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Transferir Valores entre Contas\\n\\n");
				keyPress();

				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida\n" + Cores.TEXT_RESET);
				keyPress();

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

	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}

}
