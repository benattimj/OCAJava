package fundamentos;

import java.util.Scanner;

public class Carro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar a quantidade de carros a serem criados
        System.out.print("Quantos carros você deseja criar? ");
        int quantidadeCarros = scanner.nextInt();

        Carro[] carros = new Carro[quantidadeCarros];

        // Criar os carros com base nos dados do usuário
        for (int i = 0; i < quantidadeCarros; i++) {
            System.out.println("Carro #" + (i + 1));
            
            // Solicitar a cor do carro
            System.out.print("Informe a cor do carro: ");
            String cor = scanner.next();

            // Solicitar o modelo do carro
            System.out.print("Informe o modelo do carro: ");
            String modelo = scanner.next();

            // Criar o objeto Carro com base nos dados fornecidos
            Carro carro = new Carro();
            carro.setCor(cor);
            carro.setModelo(modelo);

            carros[i] = carro;
        }

        // Exibir os detalhes dos carros criados
        System.out.println("Detalhes dos carros criados:");
        for (Carro carro : carros) {
            System.out.println("Cor: " + carro.getCor() + ", Modelo: " + carro.getModelo());
        }
    }

	private String getCor() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getModelo() {
		// TODO Auto-generated method stub
		return null;
	}

	private void setCor(String cor) {
		// TODO Auto-generated method stub
		
	}

	private void setModelo(String modelo) {
		// TODO Auto-generated method stub
		
	}
}