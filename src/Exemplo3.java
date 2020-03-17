import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in); //ler oq esta na tela
        int idade = leitor.nextInt();

        String resultado;

        if (idade < 16) {
            resultado = "Você é do time juvenil";
        } else {
            resultado = "Você é do time profissional";
        }

        System.out.println(resultado);
    }
}
