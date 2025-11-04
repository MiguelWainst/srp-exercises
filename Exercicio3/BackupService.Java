// classe que orquestra todas as outras
class BackupService {
    private CopiadorArquivos copiador = new CopiadorArquivos()
    private Compactador compactador = new Compactador()
    private NotificadorEmail notificador = new NotificadorEmail()
    private GerenciadorLog logger = new GerenciadorLog()

    public void executarBackup(String origem, String destino, String destinoZip, String email) {
        copiador.copiarArquivos(origem, destino)
        compactador.compactarArquivos(destinoZip)
        notificador.enviarEmailNotificacao(email)
        logger.registrarLog("backup concluído com sucesso")
    }
}

/*
responsabilidades da classe

a classe faz várias coisas diferentes

copia arquivos

compacta arquivos

envia e-mail de notificação

registra logs

------------------------------------------

explicação

com cada classe cuidando de uma coisa só, fica bem mais fácil mudar uma parte sem quebrar o resto
dá pra reaproveitar o compactador ou o notificador em outros sistemas, tipo um app de upload ou um gerenciador de arquivos
o código fica mais limpo, modular e flexível
*/