package MeuProjeto;

import java.util.Scanner;

public class Cliente {

	int agencia;
	int conta;
	String cpf;
	String nascimento;
	String endereco;
	int telefone;
	String senha;
	String nome;
	String banco;
	String sobrenome;
	
	Scanner sc = new Scanner(System.in);
	
	public void MostrarCliente() {
		System.out.println("Digite o seu nome: ");
		nome = sc.next();
		
		System.out.println("Digite o nome do banco que deseja entrar: ");
		banco = sc.next();
		
		System.out.println("Digite a sua senha(Ate quatro digitos): ");
		senha = sc.next();
		
		System.out.println("--- Dados do Cliente ---");
		System.out.println("Banco: " + banco);
		System.out.println("Agencia: " + agencia);
		System.out.println("Conta: " + conta);
		System.out.println("CPF: " + cpf);
		System.out.println("Nome: " + nome);
		System.out.println("Nascimento: " + nascimento);
		System.out.println("Endereço: " + endereco);
		System.out.println("Telefone: " + telefone);
		System.out.println("Senha: ****");

	
}
	
}
