import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) { // 3 = sair
            System.out.println("=== MENU ===");
            System.out.println("1 - Tabuada");
            System.out.println("2 - Dizer Olá");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = in.nextInt();

            switch (opcao) {
                case 1:
                    int numero = 0;
                    boolean numeroValido = false;

                    while (!numeroValido) {
                        try {
                            System.out.print("Digite um número maior que ZERO: ");
                            numero = in.nextInt();

                            if (numero > 0) {
                                numeroValido = true; // válido, sai do loop
                            } else {
                                System.out.println("❌ O número precisa ser maior que ZERO.");
                            }

                        } catch (Exception e) {
                            System.out.println("❌ Entrada inválida! Digite apenas números.");
                            in.nextLine(); // limpa o buffer
                        }
                    }

                    System.out.println("Você digitou: " + numero);
                    System.out.println("=== Tabuada do " + numero + " ===");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numero + " x " + i + " = " + (numero * i));
                    }
                    break;

                case 2:
                    System.out.println("Olá, usuário!");
                    break;

                case 3:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("❌ Opção inválida! Tente novamente.");
            }
            System.out.println("======================");
        }

        in.close();
        System.out.println("Programa encerrado! 👋");
    }
}