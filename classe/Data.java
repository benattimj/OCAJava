package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	public String obterDataFormatada() {
		return String.format("%d/%d/%d\n", dia, mes, ano);
	}

	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}

}
