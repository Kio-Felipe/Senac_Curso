import java.util.Scanner;

public class Exemplo2 {
    private static Object String;

    public static void main(String[] args) {
        final String login = "Admin";
        final String senha = "senac2020";
        // Mostre bem vindo caso o usuário informe
        // o login e a senha correta
        // caso contrario informe que a senha está errada



        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o login"); //mensagem de login
        String loginUsuario = leitor.nextLine();

        if(loginUsuario.equals(login)){
            System.out.println("Informe sua senha"); // mensagem de senha
            String senhaUsuario = leitor.nextLine();
            if (senhaUsuario.equals(senha)){
                System.out.println("Bem vindo");

            }else {
                System.out.println("Senha Errada");
            }


        }else{
            System.out.println("Login invalido");
        }




    }
}
