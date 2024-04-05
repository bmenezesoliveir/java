import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Bruno Menezes";
        String tipoConta = "Conta Corrente";
        int saldo = 200;
        int opcao;

        String menu = """
                +++++++++++++++++++++++++++
                Digite sua Opcao:
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Depositar Valor
                4 - Sair             
                                
                """;
        System.out.println(menu);

        Scanner scanner = new Scanner(System.in);
        opcao = scanner.nextInt();

        do {
            switch (opcao) {
                case 1:
                    System.out.println(" O saldo da sua conta é de : " + saldo);
                    break;
                case 2:
                    System.out.println(" Digite o valor a transferir : ");
                    int valorTransferencia = scanner.nextInt();
                    if (valorTransferencia > saldo) {
                        System.out.println(" Saldo insuficiente ");
                    } else {
                        saldo -= valorTransferencia;
                        System.out.println(" Transferencia efetuada com Sucesso! Seu novo saldo: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println(" Digite o valor a ser Depositado: ");
                    int valorDeposito = scanner.nextInt();
                    saldo += valorDeposito;
                    System.out.println(" Deposito efetuado com Sucesso! Seu novo saldo é de: " + saldo);
                    break;
                case 4:
                    System.out.println("Encerrando o sistema!");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
            System.out.println(menu);
            opcao = scanner.nextInt();
        } while (opcao != 4);


    }
}