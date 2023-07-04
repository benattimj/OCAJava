package fundamentos;

public class Variavelinstancia {
	
	private String cor;    // variável de instância 'cor'
    private String modelo; // variável de instância 'modelo'

    // Método para definir a cor do carro
    public void setCor(String cor) {
        this.cor = cor; // atribui o valor da cor à variável 'cor'
    }

    // Método para definir o modelo do carro
    public void setModelo(String modelo) {
        this.modelo = modelo; // atribui o valor do modelo à variável 'modelo'
    }

    // Método para obter a cor do carro
    public String getCor() {
        return cor; // retorna o valor da variável 'cor'
    }

    // Método para obter o modelo do carro
    public String getModelo() {
        return modelo; // retorna o valor da variável 'modelo'
    }
}