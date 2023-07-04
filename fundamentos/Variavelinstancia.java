package fundamentos;

public class Variavelinstancia {
	
	private String cor;    // vari�vel de inst�ncia 'cor'
    private String modelo; // vari�vel de inst�ncia 'modelo'

    // M�todo para definir a cor do carro
    public void setCor(String cor) {
        this.cor = cor; // atribui o valor da cor � vari�vel 'cor'
    }

    // M�todo para definir o modelo do carro
    public void setModelo(String modelo) {
        this.modelo = modelo; // atribui o valor do modelo � vari�vel 'modelo'
    }

    // M�todo para obter a cor do carro
    public String getCor() {
        return cor; // retorna o valor da vari�vel 'cor'
    }

    // M�todo para obter o modelo do carro
    public String getModelo() {
        return modelo; // retorna o valor da vari�vel 'modelo'
    }
}