public class BackupAutomatizado {
    public void copiarArquivos(String origem, String destino) {
        System.out.println("Copiando arquivos de " + origem + " para " + destino);
    }

    public void compactarArquivos(String destinoZip) {
        System.out.println("Compactando arquivos em " + destinoZip);
    }

    public void enviarEmailNotificacao(String destinatario) {
        System.out.println("Enviando notificação para " + destinatario);
    }

    public void registrarLog(String mensagem) {
        System.out.println("LOG: " + mensagem);
    }
}
