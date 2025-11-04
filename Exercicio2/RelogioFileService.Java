// classe que salva a hora em arquivo
class RelogioFileService {
    public void salvarHoraEmArquivo() {
        try (FileWriter f = new FileWriter("hora.txt")) {
            f.write(LocalTime.now().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}