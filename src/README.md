# 📚 Tabuada em Java

Este é um programa simples em **Java** que apresenta um menu interativo no terminal.  
O usuário pode escolher entre:

1. Gerar a tabuada de um número
2. Receber uma saudação
3. Encerrar o programa

O projeto foi feito como exercício de prática com estruturas de repetição, condicionais e tratamento de exceções.

---

## 🗂 Estrutura do projeto

tabuada-java/
│
├── src/
│ └── Main.java
├── .gitignore
└── README.md

markdown
Copiar código

- **`src/`** → pasta com o código-fonte.
- **`.gitignore`** → evita que arquivos temporários ou de compilação sejam enviados ao GitHub.
- **`README.md`** → documentação do projeto.

---

## 🚀 Como executar

### Pré-requisitos
- Ter o **Java JDK** instalado (versão 8 ou superior).

### Passos
1. Abra o terminal na pasta `tabuada-java`.
2. Compile o código:

```bash
javac src/Main.java
Execute o programa:

bash
Copiar código
java -cp src Main
🖥️ Exemplo de uso
diff
Copiar código
=== MENU ===
1 - Tabuada
2 - Dizer Olá
3 - Sair
Escolha uma opção: 1

Digite um número maior que ZERO: 5

Você digitou: 5
=== Tabuada do 5 ===
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
...
5 x 10 = 50
======================
🛠️ Tecnologias utilizadas
Java

Scanner (entrada de dados)

Estruturas de repetição (while, for)

Estruturas condicionais (switch)

Tratamento de exceções (try/catch)

✨ Aprendizados
Criar menus interativos no terminal.

Validar entrada de dados do usuário.

Tratar erros de entrada de forma segura.

Organizar projetos Java de forma profissional.

📌 Autor
Feito por Rafael de Melo Silva 👋
