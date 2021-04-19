public class Usuario {
	private int  telefone;
	private String nome;
	private String email;
	
	public Usuario() {
		this.nome = "";
		this.telefone = "";
		this.email = '*';
	}
	
	public Usuario(int telefone, String nome, String email) {
		this.telefone = telefone;
		this.nome = nome;
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}