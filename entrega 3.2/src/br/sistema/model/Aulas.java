package br.sistema.model;

public class Aulas {
    private String introducao;
    private String variaveis;
    private String strings;
    private String arraylist;


    public String getIntroducao() {
        return introducao;
    }

    public void setIntroducao(String introducao) {
        this.introducao = introducao;
    }

    public String getVariaveis() {
        return variaveis;
    }

    public void setVariaveis(String variaveis) {
        this.variaveis = variaveis;
    }

    public String getStrings() {
        return strings;
    }

    public void setStrings(String strings) {
        this.strings = strings;
    }

    public String getArraylist() {
        return arraylist;
    }

    public void setArraylist(String arraylist) {
        this.arraylist = arraylist;
    }

    @Override
    public String toString() {
        return "Aulas{" +
                "introducao='" + introducao + '\'' +
                ", variaveis='" + variaveis + '\'' +
                ", strings='" + strings + '\'' +
                ", arraylist='" + arraylist + '\'' +
                '}';
    }
}
