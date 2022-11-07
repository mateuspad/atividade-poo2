import java.util.ArrayList;

public class Agenda {
	private ArrayList<Contato> contatos = new ArrayList<Contato>();
	private int count;
	
	public Agenda() {
	}
	
	public Agenda(ArrayList<Contato> contatos, int count) {
		super();
		this.contatos = contatos;
		this.count = count;
	}
	
	public ArrayList<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(ArrayList<Contato> contatos) {
		this.contatos = contatos;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void Adiciona(Contato c){
		contatos.add(c);
		count++;
	}
	
	public boolean Remove(Contato c){
		try { 
			contatos.remove(c); 
			return true; 
		} 
		catch(Exception e){ 
			System.out.println("erro"); 
			return false; 
		}
	}
	
	public Contato BuscaPorNome(String nome){
		Contato resultadoBuscaNome = null;
		for(Contato c : contatos){ 
			if(c.getNome().equalsIgnoreCase(nome)) {
				resultadoBuscaNome = c;			
			}
		}
		return resultadoBuscaNome;
	}

	public Contato BuscaPorTelefone(String telefone){
		Contato resultadoBuscaTelefone = null;
		for(Contato c : contatos){ 
			if(c.getTelefone().equalsIgnoreCase(telefone)) {
				resultadoBuscaTelefone = c;			
			}
		}
		return resultadoBuscaTelefone;
	}
	
	public Contato BuscaPorEmail(String email){
		Contato resultadoBuscaEmail = null;
		for(Contato c : contatos){ 
			if(c.getEmail().equalsIgnoreCase(email)) {
				resultadoBuscaEmail = c;			
			}
		}
		return resultadoBuscaEmail;
	}
	
	public void Exibe(){
		System.out.println(getContatos());
		System.out.println("Número de registros na agenda: " + count);
	}
	
	public void Exibe(Contato contatos){
			System.out.println(contatos);
			System.out.println("Número de registros na agenda: " + count);
	}
}
