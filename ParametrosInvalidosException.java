public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super("Parâmetros inválidos: o segundo parâmetro deve ser maior que o primeiro.");
    }
}


