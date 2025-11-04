// Classe responsável por salvar boletim em arquivo
class BoletimFileService {
    public void salvarEmArquivo(Boletim boletim) throws IOException {
        try (FileWriter writer = new FileWriter(boletim.getNomeAluno() + "_boletim.txt")) {
            writer.write("Aluno: " + boletim.getNomeAluno() + "\n");
            writer.write("Média: " + boletim.calcularMedia() + "\n");
            writer.write("Situação: " + boletim.gerarSituacao() + "\n");
        }
    }
}
