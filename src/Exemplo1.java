public class Exemplo1 {
    public static void main(String[] args) {
        int idade = 20;

        if (idade >= 16) System.out.println("Voto obrigatorio");

        if (idade == 15) System.out.println("Você tem 15 anos");

        if (idade < 12) System.out.println("É criança");
        else if (idade <= 60) System.out.println("Vote consciente");
        else System.out.print("Parabéns você chegou a melhor idade");

    }
}
