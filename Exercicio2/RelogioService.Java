// classe que orquestra todas as outras
class RelogioService {
    private RelogioDisplay display = new RelogioDisplay();
    private RelogioFileService fileService = new RelogioFileService();
    private RelogioAlarme alarme = new RelogioAlarme();

    public void executarRelogio() throws IOException {
        display.mostrarHora();
        fileService.salvarHoraEmArquivo();
        alarme.tocarAlarme();
    }
}

