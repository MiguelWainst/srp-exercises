# Exercícios — SRP (Single Responsibility Principle)

## Objetivo
Refatorar as classes fornecidas aplicando o **Princípio da Responsabilidade Única (SRP)**.

Cada classe possui múltiplas responsabilidades. Sua tarefa é dividi-las em novas classes menores e coesas.

---

## Instruções
1. Escolha um dos arquivos `.java` e analise as responsabilidades acumuladas.
2. Crie novas classes no mesmo pacote, separando cada papel distinto.
3. Dê nomes claros e significativos às novas classes (ex: `ServicoEmail`, `Repositorio`, `GeradorRelatorio`, etc).
4. Após refatorar, teste o comportamento mantendo a mesma lógica geral.

---

## Exercícios

| Arquivo | Contexto |
|----------|-----------|
| `Exercicio1_Boletim.java` | Boletim de aluno, notas, persistência e email |
| `Exercicio2_RelogioDigital.java` | Relógio com alarme e gravação em arquivo |
| `Exercicio3_BackupAutomatizado.java` | Sistema de backup e notificação |
| `Exercicio4_ChatApp.java` | Aplicativo de mensagens e armazenamento |
| `Exercicio5_ContaBancaria.java` | Conta bancária com persistência e notificação |

---

## Dica
Se você precisar explicar em **mais de uma frase** o que uma classe faz, ela provavelmente **viola o SRP**.

# srp-exercises
# srp-exercises
