import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\n===== Gerenciador de Tarefas =====");
			System.out.println("1. Adicionar Tarefa");
			System.out.println("2. Listar Tarefas");
			System.out.println("3. Concluir Tarefa");
			System.out.println("4. Remover Tarefa");
			System.out.println("5. Sair");
			System.out.print("Escolha uma opção: ");

			int opcao = scanner.nextInt();
			scanner.nextLine(); // Consumir a quebra de linha

			switch (opcao) {
				case 1:
					System.out.print("Descrição da tarefa: ");
					String descricao = scanner.nextLine();
					gerenciador.adicionarTarefa(descricao);
					break;
				case 2:
					gerenciador.listarTarefas();
					break;
				case 3:
					System.out.print("ID da tarefa para concluir: ");
					int idConcluir = scanner.nextInt();
					gerenciador.concluirTarefa(idConcluir);
					break;
				case 4:
					System.out.print("ID da tarefa para remover: ");
					int idRemover = scanner.nextInt();
					gerenciador.removerTarefa(idRemover);
					break;
				case 5:
					System.out.println("Saindo...");
					scanner.close();
					return;
				default:
					System.out.println("Opção inválida. Tente novamente.");
			}
		}
	}
}
