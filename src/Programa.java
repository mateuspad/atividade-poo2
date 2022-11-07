import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {		
		
		Contato contato1 = new Contato();
		contato1.setNome("João");
		contato1.setTelefone("997411254");
		contato1.setAniversario("08/08/1985");
		contato1.setEmail("joao@gmail.com");
		contato1.setID(50);
		
		Contato contato2 = new Contato();
		contato2.setNome("Maria");
		contato2.setTelefone("995611254");
		contato2.setAniversario("15/02/1999");
		contato2.setEmail("maria@gmail.com");
		contato2.setID(60);
		
		Contato contato3 = new Contato();
		contato3.setNome("Fernando");
		contato3.setTelefone("995658254");
		contato3.setAniversario("15/02/1999");
		contato3.setEmail("fernando@gmail.com");
		contato3.setID(70);
		
		Contato contato4 = new Contato();
		contato4.setNome("Luana");
		contato4.setTelefone("999638254");
		contato4.setAniversario("18/05/1997");
		contato4.setEmail("luana@gmail.com");
		contato4.setID(80);
		
		//Contato para adicionar
		Contato contato5 = new Contato();
		contato5.setNome("Elmario");
		contato5.setTelefone("999128254");
		contato5.setAniversario("10/02/1982");
		contato5.setEmail("elmario@gmail.com");
		contato5.setID(90);
		
		Contato contato6 = new Contato();
		contato6.setNome("Manuela");
		contato6.setTelefone("997868254");
		contato6.setAniversario("10/02/1992");
		contato6.setEmail("manuela@gmail.com");
		contato6.setID(100);
		
		ArrayList<Contato> contatos = new ArrayList<Contato>();	
		contatos.add(contato1);
		contatos.add(contato2);
		contatos.add(contato3);
		contatos.add(contato4);
		//Não coloquei aqui o contato5 pois será adicionado pelo método da agenda
		contatos.add(contato6);
		
		Agenda agenda = new Agenda();
		agenda.setContatos(contatos);
		agenda.Adiciona(contato5);
		agenda.Remove(contato5);
		agenda.Remove(contato5);
		agenda.Remove(contato5);

		agenda.Exibe();
		
		System.out.println();
		System.out.println("---------------------Testando buscas-----------------------");
		agenda.Exibe(agenda.BuscaPorNome("Luana"));
		agenda.Exibe(agenda.BuscaPorTelefone("997868254"));
		agenda.Exibe(agenda.BuscaPorEmail("joao@gmail.com"));
	}
}

