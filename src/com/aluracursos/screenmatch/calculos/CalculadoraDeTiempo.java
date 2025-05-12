package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmatch.modelos.Peliculas;
import com.aluracursos.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionMinutos();

    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }
}
