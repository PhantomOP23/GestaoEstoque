package controller;

import java.util.Scanner;

import model.Cliente;

public class ControladorMenu {
	static Scanner entrada = new Scanner (System.in);
	static Scanner entradaNumero = new Scanner (System.in);
	static boolean repetir = true;
	public static void menuPrincipal(){
		int opccao;
			System.out.print("=====  BEM-VINDO à Loja CHOO ======\n");
			System.out.println("1.  Clientes\n2.  Produtos\n3.  Inventários\n4.  Vendas\n5.  Relatórios\n6.  Sair"); 
			System.out.println("-----------------------------");
			System.out.print("Seleccione a Operação Desejada: ");
			opccao = entradaNumero.nextInt();
			System.out.println("-----------------------------");
		switch (opccao) {
		case 1:
			menuCliente();			
			break;
		case 2:
			menuProduto();
			break;
		case 6:
			System.out.println("Obrigado, Adeus!");
			return;
		default:
			break;
		}
		menuPrincipal();
	}
	public static void menuCliente (){
		String tempID;
		int opccao;
		System.out.println("\n=========  CLIENTES ========= ");
		System.out.println("   1.1.  Criar Cliente\n   1.2.  Actualizar Cliente\n   1.3.  Remover Cliente\n   1.4.  Imprimir Cliente\n   1.5.  Sair ");
		System.out.println("-----------------------------");
		System.out.print("Seleccione a opção: ");
		opccao = entradaNumero.nextInt();
		System.out.println("-----------------------------");
		
		switch (opccao) {
			case 1:
				System.out.print("Insira o seu codigo de BI: ");
				tempID = entrada.nextLine();
				System.out.print("Insira o Nome: ");
				String tempNome = entrada.nextLine();
				System.out.print("Insira o email: ");
				String tempEmail = entrada.nextLine();
				System.out.print("Insira o codigo postal: ");
				int tempCodigoPostal = entradaNumero.nextInt();
				System.out.print("Insira a Data Nascimento (dd.mm.yyyy): ");
				String tempDataNascimento = entrada.nextLine();
				
				Cliente.criarCliente(tempID, tempNome,tempEmail, tempCodigoPostal, tempDataNascimento);	
				menuCliente();
				break;
			case 3:
				System.out.println("-------LISTA DOS CLIENTES-------");
				ControladorCliente.visualizarCliente();
				System.out.print("Insira o Nome do Cliente: ");
				tempID = entrada.nextLine();
				ControladorCliente.removerCliente(tempID);
				System.out.println("Cliente removido com Sucesso!");
				menuCliente();
				break;
			case 4:
				Cliente.visualizarCliente();
				menuCliente();
				break;
			case 5:
				break;
			default:
				System.out.println("Não existe a opcção escolhida...\nPor favor confira as opcções e escolha novamente:");
				menuCliente();
				break;
		}
	}
	private static void menuProduto() {
//		System.out.println("------------------------------------------------------");
		System.out.println("\n=========  PRODUTOS ========= ");
		System.out.println("1. Criar produto");
		System.out.println("2. Actualizar produto");
		System.out.println("3. Remover produto");
		System.out.println("4. Listar produtos");
		System.out.println("5. Quantidade de produtos no sistema");
		System.out.println("6. Voltar");
		System.out.print("Seleccione a Operação Desejada: ");
		int opccao = entradaNumero.nextInt();
		System.out.println("-----------------------------");
		

		switch (opccao) {
		case 1:
//			ControladorProduto.criarProduto();
			menuProduto();
//			ServiceProduto.criar_produto();
			
			break;
		case 2:
//			ServiceProduto.salvarActualizar();
			break;
		case 3:
//			ServiceProduto.salvarRemover();
			break;
		case 4:
//			ServiceProduto.listar_produto();
			break;
		case 5:
//			System.out.println("Produtos no sistema: "+ServiceProduto.tamanhoProdutos());
			break;
		case 6:
			break;
		default:
			System.out.println("Não existe a opcção escolhida...\nPor favor confira as opcções e escolha novamente:");
			break;
		}
	}
}
	
	
	
//	static boolean repetir = true;
	
//	public static void menuPrincipal(){
//		int opccao;
//		
//		System.out.print("=====  BEM-VINDO à Loja CHOO ======\n");
//		do{
//				System.out.println("1.  Clientes\n2.  Produtos\n3.  Inventários\n4.  Vendas\n5.  Relatórios\n6.  Sair"); 
//				System.out.println("-----------------------------");
//				System.out.print("Seleccione a Operação Desejada: ");
//				opccao = entradaNumero.nextInt();
//				System.out.println("-----------------------------");
//		switch (opccao) {
//		case 1:
//			//boolean repetir= true;
//			do{
//				System.out.println("\n=========  CLIENTES ========= ");
//				menuCliente();			
//			}while(repetir);
//			repetir = true;
//			break;
//		case 6:
//			repetir = false;
//			System.out.println("Obrigado, Adeus!");
//			break;
//
//		default:
//			break;
//		}
//	}while (repetir);
//
//	}
//	public static void menuCliente (){
//		String tempID;
//		int opccao;
//		System.out.println("   1.1.  Criar Cliente\n   1.2.  Actualizar Cliente\n   1.3.  Remover Cliente\n   1.4.  Imprimir Cliente\n   1.5.  Sair ");
//		System.out.println("-----------------------------");
//		System.out.print("Seleccione a opção: ");
//		opccao = entradaNumero.nextInt();
//		System.out.println("-----------------------------");
//		
//		switch (opccao) {
//		case 1:
//			System.out.print("Insira o seu codigo de BI: ");
//			tempID = entrada.nextLine();
//			System.out.print("Insira o Nome: ");
//			String tempNome = entrada.nextLine();
//			System.out.print("Insira o email: ");
//			String tempEmail = entrada.nextLine();
//			System.out.print("Insira o codigo postal: ");
//			int tempCodigoPostal = entradaNumero.nextInt();
//			System.out.print("Insira a Data Nascimento (dd.mm.yyyy): ");
//			String tempDataNascimento = entrada.nextLine();
//			
//			Cliente.criarCliente(tempID, tempNome,tempEmail, tempCodigoPostal, tempDataNascimento);		
//			break;
//		case 3:
//			System.out.println("-------LISTA DOS CLIENTES-------");
//			ControladorCliente.visualizarCliente();
//			System.out.print("Insira o Nome do Cliente: ");
//			tempID = entrada.nextLine();
//			ControladorCliente.removerCliente(tempID);
//			System.out.println("Cliente removido com Sucesso!");
//			break;
//		case 4:
//			Cliente.visualizarCliente();
//			break;
//		case 5:
//			repetir = false;
//			break;
//
//		default:
//			break;
//		}
//	}
//	private static void menuProduto() {
//		System.out.println("------------------------------------------------------");
//		System.out.println("1. Criar produto");
//		System.out.println("2. Actualizar produto");
//		System.out.println("3. Remover produto");
//		System.out.println("4. Listar produtos");
//		System.out.println("5. Quantidade de produtos no sistema");
//		System.out.println("6. Voltar");
//		int opccao = entradaNumero.nextInt();
//
//		switch (opccao) {
//		case 1:
////			ControladorProduto.criarProduto();
//			
////			ServiceProduto.criar_produto();
//			break;
//		case 2:
////			ServiceProduto.salvarActualizar();
//			break;
//		case 3:
////			ServiceProduto.salvarRemover();
//			break;
//		case 4:
////			ServiceProduto.listar_produto();
//			break;
//		case 5:
////			System.out.println("Produtos no sistema: "+ServiceProduto.tamanhoProdutos());
//			break;
//		case 6:
////			menu_primeiro();
//			break;
//		default:
//			System.out.println("Escolha inválida!");
//		}
//		menu_produto();

//	}

		/*

* A título de exemplo segue abaixo o menu amigável:
1.	Clientes
2.	Produtos
3.	Inventarios
4.	Vendas
5.	Relatorios
6.	...

Quando a opção 1 for escolhida, deve aparecer um sub-menu:
1.1	Criar Cliente
1.2	Actualizar Cliente
1.3	Remover Cliente
1.4	...

E assim por diante.
*/


