import java.util.Scanner;

public class TestarCadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        Cliente cliente = new Cliente(nome, cpf);

        while (true) {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 Realizar pedido de Carro");
            System.out.println("2 Realizar pedido de Moto");
            System.out.println("3 Exibir dados do cliente");
            System.out.println("4 Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Modelo do Carro: ");
                String modelo = scanner.nextLine();
                System.out.print("Preço do Carro: ");
                double preco = scanner.nextDouble();
                System.out.print("Ano do Carro: ");
                int ano = scanner.nextInt();
                scanner.nextLine(); 

                Carro carro = new Carro(modelo, preco, ano);
                Pedido pedido = new Pedido(1, cliente, carro);
                pedido.printDados();
            } else if (opcao == 2) {
                System.out.print("Modelo da Moto: ");
                String modelo = scanner.nextLine();
                System.out.print("Preço da Moto: ");
                double preco = scanner.nextDouble();
                System.out.print("Quilometragem da Moto: ");
                double km = scanner.nextDouble();
                scanner.nextLine(); 

                Moto moto = new Moto(modelo, preco, km);
                Pedido pedido = new Pedido(1, cliente, moto);
                pedido.printDados();
            } else if (opcao == 3) {
                cliente.printDados();
            } else if (opcao == 4) {
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}