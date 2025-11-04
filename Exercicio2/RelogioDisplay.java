import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;

// classe que mostra a hora atual
class RelogioDisplay {
    public void mostrarHora() {
        System.out.println(LocalTime.now());
    }
}

/*
violações do SRP

a classe faz várias coisas diferentes

mostra a hora (interface com o usuário)

salva a hora em arquivo (persistência)

toca alarme (função separada de controle)

-----------------------------------------

explicação

agora cada classe faz só uma coisa

fica mais simples de manter e testar

o RelogioService junta tudo e controla a execução

isso deixa o código mais limpo e fácil de reutilizar
*/