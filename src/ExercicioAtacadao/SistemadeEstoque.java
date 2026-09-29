package ExercicioAtacadao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

    public class SistemadeEstoque {

        private Scanner entrada = new Scanner(System.in);

        private HashMap<String, Usuarios> usuarios = new HashMap<>();

        private ArrayList<Alimentos> alimentos = new ArrayList<>();

        public void iniciar() {

            int opcao;

            do {
                System.out.println("\n===== MENU INICIAL =====");
                System.out.println("1 - Adicionar usuario");
                System.out.println("2 - Entrar no sistema");
                System.out.println("3 - Sair");
                System.out.print("Escolha: ");

                opcao = Integer.parseInt(entrada.nextLine());

                switch (opcao) {

                    case 1:
                        adicionarUsuario();
                        break;

                    case 2:
                        if (login()) {
                            menuEstoque();
                        }
                        break;

                    case 3:
                        System.out.println("Sistema encerrado.");
                        break;

                    default:
                        System.out.println("Opcao invalida.");
                }

            } while (opcao != 3);
        }

        private void adicionarUsuario() {

            System.out.print("Digite o email: ");
            String email = entrada.nextLine();

            if (usuarios.containsKey(email)) {
                System.out.println("Email ja cadastrado.");
                return;
            }

            System.out.print("Digite a senha: ");
            String senha = entrada.nextLine();

            Usuarios usuario = new Usuarios(email, senha);

            usuarios.put(email, usuario);

            System.out.println("Usuario cadastrado!");
        }

        private boolean login() {

            System.out.print("Digite o email: ");
            String email = entrada.nextLine();

            System.out.print("Digite a senha: ");
            String senha = entrada.nextLine();

            Usuarios usuario = usuarios.get(email);

            if (usuario != null && usuario.Verificacao(senha)) {
                System.out.println("Login realizado!");
                return true;
            }

            System.out.println("Email ou senha incorretos.");
            return false;
        }

        private void menuEstoque() {

            int opcao;

            do {
                System.out.println("\n===== MENU DO ESTOQUE =====");
                System.out.println("1 - Cadastrar alimento");
                System.out.println("2 - Listar alimentos");
                System.out.println("3 - Sair da conta");
                System.out.print("Escolha: ");

                opcao = Integer.parseInt(entrada.nextLine());

                switch (opcao) {

                    case 1:
                        cadastrarAlimento();
                        break;

                    case 2:
                        listarAlimentos();
                        break;

                    case 3:
                        System.out.println("Saindo da conta...");
                        break;

                    default:
                        System.out.println("Opcao invalida.");
                }

            } while (opcao != 3);
        }

        private void cadastrarAlimento() {

            System.out.print("Nome do alimento: ");
            String nome = entrada.nextLine();

            System.out.print("Quantidade: ");
            int quantidade = Integer.parseInt(entrada.nextLine());

            System.out.print("Preco: ");
            double preco = Double.parseDouble(
                    entrada.nextLine().replace(",", ".")
            );

            System.out.print("Descricao: ");
            String descricao = entrada.nextLine();

            Alimentos alimento = new Alimentos(nome, preco, descricao);

            alimentos.add(alimento);

            System.out.println("Alimento cadastrado!");
        }

        private void listarAlimentos() {

            if (alimentos.isEmpty()) {
                System.out.println("Nenhum alimento cadastrado.");
                return;
            }

            for (Alimentos alimento : alimentos) {
                alimento.apresentacoao();
                System.out.println("----------------");
            }
        }
    }
