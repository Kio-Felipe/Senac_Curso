import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("informe seu salário");
        double salario = leitor.nextDouble();

        System.out.println("Informe seu plano salarial");
        String planoSalarial = leitor.next();

        double novoSalario = 0;

           // para letra minuscula é planoSalarial.toLowerCase();

        switch (planoSalarial.toUpperCase()){ //letra maiuscula
            case "A":
                novoSalario = salario + salario*0.1;
                break;
            case "B":
                novoSalario = salario + salario*0.15;
                break;
            case "C":
                novoSalario = salario + salario*0.2;
                break;

                default:
                    System.out.println("Plano Salarial inválido");
                    System.out.println("Tente novamente indicando A, B ou C");

        }
        System.out.println(novoSalario);
    }
}
