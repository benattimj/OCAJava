package fundamentos;

public class Account {

	private String name; // variavel de instância

	// Método para definir o nome do objeto

	public void setName(String name) {

		this.name = name; // armazena o nome
	}

	// metodo para recupera o nome do objeto
	
	public String getName() {
		
		return name; // retorna o valor do nome para o chamador
	}
	
}// fim da classe
