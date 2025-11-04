import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Classe responsável pelos dados e cálculo do boletim
public class Boletim {
    private String nomeAluno;
    private List<Double> notas = new ArrayList<>();

    public Boletim(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public double calcularMedia() {
        return notas.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }

    public String gerarSituacao() {
        double media = calcularMedia();
        return media >= 7 ? "Aprovado" : "Reprovado";
    }

    public String getNomeAluno() {
        return nomeAluno;
    }
}

/*
A classe faz várias coisas diferentes:

Gerencia dados do aluno e suas notas

Calcula a média e situação (lógica de negócio)

Salva o boletim em arquivo (persistência)

Envia o boletim por e-mail (comunicação)

---------------------------------------------

Com a refatoração:

Cada classe tem apenas uma responsabilidade

Fica mais fácil dar manutenção, pois mudar o cálculo da média não afeta o envio de e-mail

Permite reuso, já que o serviço de e-mail ou arquivo pode ser usado em outros sistemas

O código fica mais limpo, organizado e testável
*/