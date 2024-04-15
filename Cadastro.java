package MeuProjeto;

import java.util.Random;
import java.util.Scanner;

public class Cadastro {

	String nome;
	int cpf;
	int numero;
	String banco;
	String dec;
	String nascimento;
	String endereco; 
	int telefone;
	String sobrenome;
	
	Scanner sc = new Scanner(System.in);
	
	
	
	public void cadastro() {
		
		System.out.println("Você ja tem cadastro[S/N]");
		dec = sc.next();
		
		Random aleatorio = new Random();
		int conta = aleatorio.nextInt(99999) + 10000;
		
		Random ale = new Random();
		int agencia = ale.nextInt(999) + 100;
		
		if (dec.equals("N")) {
			
			System.out.println("Digite o seu nome: ");
			nome = sc.next();
			
			System.out.println("Digite o seu sobrenome: ");
			sobrenome = sc.next();
			
			System.out.println("Digite o seu nascimento[DD/MM/AAAA]: ");
			nascimento = sc.next();
			
			System.out.println("Digite o seu cpf");
			cpf = sc.nextInt();
			
			System.out.println("Digite o seu endereço: ");
			endereco = sc.next();
			
			System.out.println("Digite o seu telefone: ");
			telefone = sc.nextInt();
			
			
			System.out.println("Digite o banco em que deseja cadastrar: ");
			banco = sc.next();
			
			System.out.println("--- Dados do Cliente ---");
			
			System.out.println("Banco: " + banco);
			System.out.println("Agencia: " + agencia);
			System.out.println("Conta: " + conta);
			System.out.println("CPF: " + cpf);
			System.out.println("Nome: " + nome + " " + sobrenome);
			System.out.println("Nascimento: " + nascimento);
			System.out.println("Endereço: " + endereco);
			System.out.println("Telefone: " + telefone);
			System.out.println("Senha: ****");
			
			
			
			
				
		}
		
		
	}
	
}
