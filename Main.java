package MeuProjeto;

public class Main {

	public static void main(String[] args) {
		
		
		Cadastro cadastro = new Cadastro();
		
		cadastro.cadastro();
		
		
		Cliente cliente = new Cliente();
		Conta conta_corrente = new Conta();	
		
		cliente.banco = cliente.banco;
		cliente.agencia = 100;
		cliente.conta = 34567;
		cliente.cpf = "123.456.788.90";
		cliente.nome = cliente.nome;
		cliente.nascimento = "15/06/1995";
		cliente.endereco = "Av. dos Autonomistas 234";
		cliente.telefone = 119123456;
		cliente.senha = cliente.senha;
		
		
		cliente.MostrarCliente();
		
		conta_corrente.numDoc = 23456789;
		conta_corrente.agencia = cliente.agencia;
		conta_corrente.conta = cliente.conta;
		conta_corrente.valor = conta_corrente.valor;
		conta_corrente.acao = conta_corrente.acao;
		conta_corrente.dataOc = "20/10/2021";
		conta_corrente.saldoAnt = conta_corrente.saldoAnt;
		conta_corrente.saldoDep = conta_corrente.saldoDep;
		
		conta_corrente.Atualizar_Saldo();


	}

}
