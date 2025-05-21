package org.example;

public class ParametrosConta {

    private String numeroConta;
    private String nomeConta;
    private String usuarioLogado;

    private ParametrosConta(){};
    private static ParametrosConta instance = new ParametrosConta();

    public static ParametrosConta getInstance(){
        return instance;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
}
