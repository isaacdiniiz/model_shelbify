package br.com.shelbify.modelos;

import br.com.shelbify.interfaces.AudioFunctions;

public class Audio implements AudioFunctions {
    private String titulo;
    private int totalDeReproducoes;
    private int totalDeCurtidas;
    private double classificacao;

    @Override
    public void curte() {
        this.totalDeCurtidas++;
    }

    // getters e setters
    @Override
    public void reproduz() {
        this.totalDeReproducoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // apenas getters para os atributos que nao sao titulo
    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }
}