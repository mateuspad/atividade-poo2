
public class Contato {
	private int ID;
	private String nome;
	private String telefone;
	private String email;
	private String aniversario;
	
	public Contato() {
	}
	
	public Contato(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAniversario() {
		return aniversario;
	}

	public void setAniversario(String aniversario) {
		this.aniversario = aniversario;
	}

	@Override
	public String toString() {
		return "\nContato [ID=" + ID + ", Nome= " + nome + ", Telefone= " + telefone + ", Email= " + email + ", Aniversário= "
				+ aniversario + "]";
	}
}
