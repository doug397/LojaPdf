package loja;

public class Cliente {
	
	private String nome;
	private String cpf;
	
	public Cliente(String nome, String cpf){
		this.nome=nome;
		this.cpf=cpf;
		
	}
	
	
	public void detalhesCliente(){
		
		System.out.println("Dados do Cliente");
		System.out.println("Nome:"+this.getNome());
		System.out.println("CPF: "+this.getCpf());
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

}
