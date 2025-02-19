import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeTarefas {
	private List<Tarefa> tarefas;
	private int proximoId = 1;

	public GerenciadorDeTarefas() {
		this.tarefas = new ArrayList<>();
	}

	public void adicionarTarefa(String descricao) {
		Tarefa novaTarefa = new Tarefa(proximoId++, descricao);
		tarefas.add(novaTarefa);
		System.out.println("Tarefa adicionada: " + novaTarefa);
	}

	public void listarTarefas() {
		if (tarefas.isEmpty()) {
			System.out.println("Nenhuma tarefa encontrada.");
		} else {
			for (Tarefa tarefa : tarefas) {
				System.out.println(tarefa);
			}
		}
	}

	public void concluirTarefa(int id) {
		for (Tarefa tarefa : tarefas) {
			if (tarefa.getId() == id) {
				tarefa.marcarComoConcluida();
				System.out.println("Tarefa concluída: " + tarefa);
				return;
			}
		}
		System.out.println("Tarefa não encontrada.");
	}

	public void removerTarefa(int id) {
		tarefas.removeIf(tarefa -> tarefa.getId() == id);
		System.out.println("Tarefa removida com sucesso.");
	}
}
