package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo {
    //atributos
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    //sobrecarga de metodo
    @Override
    public int getDuracionMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;

    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
}

