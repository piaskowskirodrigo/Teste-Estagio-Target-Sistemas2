
public class Exercicio3Soma {
	public static void main(String[] args) {
        int i = 12;
        int soma = 0;
        int k = 1;

        while (k < i) {
            k = k + 1;
            soma = soma + k;
        }

        System.out.println("A soma dos números de 1 a " + i + " é: " + soma);
    }
}


