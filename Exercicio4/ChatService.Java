// classe que orquestra tudo
class ChatService {
    private EnviadorMensagem enviador = new EnviadorMensagem()
    private HistoricoMensagem historico = new HistoricoMensagem()
    private MensagemRepository repositorio = new MensagemRepository()
    private NotificadorContato notificador = new NotificadorContato()

    public void processarMensagem(String texto, String contato) {
        enviador.enviarMensagem(texto)
        repositorio.salvarMensagemNoBanco(texto)
        notificador.notificarContato(contato)
        historico.exibirHistorico()
    }
}

/*
responsabilidades que precisam ser separadas

a classe faz várias coisas diferentes

envia mensagem (lógica principal de envio)

exibe histórico (interface com o usuário)

salva mensagem no banco (persistência)

notifica o contato (comunicação externa)

-------------------------------------------------

vantagem pro time de QA

com cada parte isolada, o time de testes consegue testar cada função separadamente
não precisa rodar o app inteiro pra testar só o envio ou só a notificação
fica mais fácil criar testes automatizados, achar erros e garantir que o sistema tá funcionando certinho
*/