package MeuProjeto;

import java.util.Scanner;

public class Conta {

	int numDoc;
	int agencia;
	int conta;
	float valor;
	int acao;
	String dataOc;
	double saldoDep;
	double saldoAnt;
	String rep;
	String tipoConta;
	
	
	public void Atualizar_Saldo() {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indique qual o tipo da conta");
		tipoConta = sc.next();
		
		System.out.println("\n---conta " + tipoConta +"---");
		
		System.out.println("Indique o saldo atual da sua conta: ");
		
		saldoDep = sc.nextDouble();
		saldoAnt = saldoDep;
	
		
		do {
			
		System.out.println("Escolha um para proseguir:");
		System.out.println("1 - Deposito");
		System.out.println("2 - Saque");
		
		acao = sc.nextInt();
		
		switch (acao) {
		
		case 1: {
			
			System.out.println("Indique a quantidade que deseja depositar");
			
			valor = sc.nextFloat();
			
			saldoDep = saldoDep + valor;
			saldoAnt = saldoDep - valor;
			
			System.out.println("Número Documento: " + numDoc);
			System.out.println("Agencia: " + agencia);
			System.out.println("Conta: " + conta);
			System.out.println("Valor: " + valor);
			System.out.println("Data Ocorrencia: " + dataOc);
			System.out.println("Saldo Anterior: " + saldoAnt);
			System.out.println("Saldo atualizado: " + saldoDep);
			System.out.println("Mensagem: Ocorrencia Registrada");
			System.out.println("\nDeseja fazer uma nova ação[S/N]");
			rep = sc.next();
			
			
			
			break;
			
		}
		case 2: {
			
			System.out.println("Indique a quantidade que deseja sacar");
			
			valor = sc.nextFloat();
			
			saldoDep = saldoDep - valor;
			saldoAnt = saldoDep + valor;
			
			if (saldoDep < 0) {
				
				System.out.println("quantidade do saldo invalido");
			}
			
			else {
				
				System.out.println("Número Documento: " + numDoc);
				System.out.println("Agencia: " + agencia);
				System.out.println("Conta: " + conta);
				System.out.println("Valor: " + valor);
				System.out.println("Data Ocorrencia: " + dataOc);
				System.out.println("Saldo Anterior: " + saldoAnt);
				System.out.println("Saldo atualizado: " + saldoDep);
				System.out.println("Mensagem: Ocorrencia Registrada");
				System.out.println("\nDeseja fazer uma nova ação[S/N]");
				rep = sc.next();
				
				
				
			}
			
			break;
			
		
		}
		default:
			System.out.println("Opção invalida");
		}
		}while(rep.equals("S"));
		
		System.out.println("Saldo atual: " + saldoDep);
		System.out.println("Sistema finalizado");
		
		sc.close();

	
}
}
