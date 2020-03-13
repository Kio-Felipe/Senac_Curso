import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade = leitor.nextInt();

        // idade < 16 - n vota
        // idade >= 16 e < 18 e >=60 - facultativo
        // idade >=18 e idade<60

        if (idade < 16) {
            System.out.println("Não pode votar");
        } else if (idade < 18) {
            System.out.print("Voto Facultativo adolescente");
        } else if (idade < 60) {
            System.out.println("Voto obrigatorio");
        } else {
            System.out.println("Voto Faculdativo idoso");
        }
    }
}