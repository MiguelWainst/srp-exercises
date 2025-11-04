class BoletimEmailService {
    public void enviarEmail(String email, Boletim boletim) {
        System.out.println("Enviando boletim de " + boletim.getNomeAluno() + " para " + email);
    }
}