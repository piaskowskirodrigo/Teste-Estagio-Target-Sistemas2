import java.util.Scanner;

public class Exercicio2String {
	 public static void main(String[] args) {
	        // Criando um Scanner para receber a string de entrada do usuário
	        Scanner scanner = new Scanner(System.in);

	        // Solicitando a entrada da string
	        System.out.println("Digite uma string:");
	        String entrada = scanner.nextLine();

	        // Variável para contar quantas vezes 'a' ou 'A' aparece
	        int contador = 0;

	        // Percorrendo a string para verificar a presença de 'a' ou 'A'
	        for (int i = 0; i < entrada.length(); i++) {
	            char c = entrada.charAt(i);
	            if (c == 'a' || c == 'A') {
	                contador++;
	            }
	        }

	        // Verificando se a letra 'a' foi encontrada e exibindo o resultado
	        if (contador > 0) {
	            System.out.println("A letra 'a' aparece " + contador + " vezes na string.");
	        } else {
	            System.out.println("A letra 'a' não foi encontrada na string.");
	        }

	        // Fechar o scanner para evitar vazamento de recursos
	        scanner.close();
	    }
}
