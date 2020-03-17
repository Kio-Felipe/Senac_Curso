import java.nio.channels.FileLockInterruptionException;
import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o codigo do pedido");
        int cod = leitor.nextInt();

        leitor = new Scanner(System.in);
        System.out.println("Quantos?");

        double quant = leitor.nextDouble();

         String resultado;


        switch (cod){
            case 100:
                resultado = "Cachorro Quente \n" +
                             "Quantidade:" + quant +
                              "\nTotal: " + quant * 1.2;
            break;

            case 101:
                resultado = "Bauru Simples \n"  +
                            "Quantidade: " + quant +
                             "\nTotal: " + quant * 1.3;
            break;

            case 102:
                resultado = "Bauru com ovo \n" +
                            "Quantidade: " + quant +
                             "\nTotal: "   + quant * 1.5;
            break;

            case 103:
                resultado = "Hambúrguer \n" +
                             "Quantidade: " + quant +
                             "\nTotal: " + quant * 1.2;
            break;

            case 104:
                resultado = "Cheeseburguer \n" +
                             "Quantidade: " + quant +
                             "\nTotal: " + quant * 1.3;
            break;

            case 105:
                resultado = "Refrigerante \n" +
                             "Quantidade: " + quant +
                             "\nTotal: " + quant * 1.00;

                break;
            default:
                resultado = "Código invalido";

        }
        System.out.println("================");
        System.out.println(resultado);
        System.out.println("================1");
    }
}
