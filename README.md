---

Gerenciador de Tarefas

Este é um simples Gerenciador de Tarefas desenvolvido em Java. O projeto permite aos usuários adicionar, listar, concluir e remover tarefas de uma lista. O sistema de tarefas é gerenciado através de um menu interativo no console.

Estrutura do Projeto

A estrutura do projeto é a seguinte:

```
GerenciadorDeTarefas/
│── src/
│   │── Main.java
│   │── Tarefa.java
│   │── GerenciadorDeTarefas.java
│── README.md
│── .gitignore
│── database.db (se usar SQLite)
```

Funcionalidades

- Adicionar Tarefa: Permite ao usuário adicionar uma nova tarefa, fornecendo uma descrição.
- Listar Tarefas: Exibe todas as tarefas cadastradas, com seu status (pendente ou concluída).
- Concluir Tarefa: Permite ao usuário marcar uma tarefa como concluída.
- Remover Tarefa: Permite ao usuário remover uma tarefa da lista.

Pré-requisitos

- JDK 8 ou superior: Certifique-se de que o Java esteja instalado corretamente no seu sistema.
- IDE: Você pode usar qualquer IDE para Java, como IntelliJ IDEA ou VS Code.

Como Executar

1. Clonar o Repositório

Primeiro, clone o repositório para a sua máquina local:

```
git clone https://github.com/seu-usuario/gerenciador-de-tarefas.git
```

2. Compilar e Executar

Para compilar e executar o projeto, abra a pasta `src/` no seu IDE ou execute os seguintes comandos no terminal:

- Navegue até a pasta onde o projeto foi clonado:

```
cd GerenciadorDeTarefas/src
```

- Compile o projeto (dependendo da sua IDE, isso pode ser feito automaticamente):

```
javac *.java
```

- Execute o projeto:

```
java Main
```

3. Usar o Gerenciador

O aplicativo será executado no console. O usuário poderá escolher as opções do menu interativo, digitando o número correspondente à ação desejada.

Exemplos de Uso

Adicionar Tarefa

Quando você selecionar a opção "1. Adicionar Tarefa", será solicitado que você forneça uma descrição para a tarefa. Após inserir, a tarefa será adicionada à lista.

```
1. Adicionar Tarefa
Descrição da tarefa: Comprar leite
Tarefa adicionada: 1 - Comprar leite [Pendente]
```

Listar Tarefas

Selecionando a opção "2. Listar Tarefas", todas as tarefas cadastradas serão exibidas:

```
2. Listar Tarefas
1 - Comprar leite [Pendente]
```

Concluir Tarefa

Ao selecionar a opção "3. Concluir Tarefa", você pode informar o ID da tarefa para marcá-la como concluída:

```
3. Concluir Tarefa
ID da tarefa para concluir: 1
Tarefa concluída: 1 - Comprar leite [Concluída]
```

Remover Tarefa

A opção "4. Remover Tarefa" permite que você remova uma tarefa informando seu ID:

```
4. Remover Tarefa
ID da tarefa para remover: 1
Tarefa removida com sucesso.
```

Tecnologias Utilizadas

- Java: Linguagem de programação usada para o desenvolvimento do projeto.
- Estruturas de Dados: Listas (ArrayList) para armazenar e gerenciar as tarefas.
- Scanner: Para leitura de entradas do usuário no console.

---
