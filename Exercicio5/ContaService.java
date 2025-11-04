// classe que orquestra tudo
class ContaService {
    private ContaBancaria conta = new ContaBancaria()
    private GeradorExtrato extrato = new GeradorExtrato()
    private RepositorioConta repositorio = new RepositorioConta()
    private ServicoEmail emailService = new ServicoEmail()

    public void processarConta(double deposito, double saque, String email) {
        conta.depositar(deposito)
        conta.sacar(saque)
        extrato.gerarExtrato(conta)
        repositorio.salvarNoBanco(conta)
        emailService.enviarEmail(email)
    }
}

/*
responsabilidades distintas

a classe faz várias coisas diferentes

controla o saldo (regras de negócio)

gera extrato (apresentação de dados)

salva no banco (persistência)

envia e-mail (notificação)

--------------------------------------------------

explicação

com o envio de e-mail separado, dá pra mudar o modo de notificação (tipo mandar sms ou push) sem mexer nas regras da conta
isso evita erros e deixa o código mais flexível pra futuras alterações
cada parte é independente, o que facilita manutenção e testes
*/