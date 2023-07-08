public class aula12 {
        public class Cadastro {
            public static void main(String[] args) {
                List<Pessoa> cadastro = new ArrayList<>();
                Scanner scanner = new Scanner(System.in);

                while (true) {
                    System.out.println("MENU");
                    System.out.println("1 - Cadastrar pessoa");
                    System.out.println("2 - Exibir cadastro");
                    System.out.println("0 - Sair");
                    System.out.print("Escolha uma opção: ");
                    int opcao = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcao) {
                        case 1:
                            cadastrarPessoa(cadastro, scanner);
                            break;
                        case 2:
                            exibirCadastro(cadastro);
                            break;
                        case 0:
                            System.out.println("Encerrando o programa. Até mais!");
                            return;
                        default:
                            System.out.println("Opção inválida. Por favor, escolha novamente.");
                            break;
                    }
                }
            }
    }
}

