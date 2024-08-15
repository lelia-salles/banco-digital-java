package util;

import java.util.function.Consumer;

public class Utils {
    public static void executarOperacao(Consumer<String> operacao, String mensagem) {
        operacao.accept(mensagem);
    }
}
