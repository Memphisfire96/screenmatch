package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

//aplico herencia con extends
public class Peliculas extends Titulo implements Clasificacion {
    //atributos
   private String director;

   //metodos getter y setter


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        //realizo un casteo
        return (int) calcularMedia();
    }

    //sobreescribiendo el metodo para obtener nombres de objetos mas relevantes.

    @Override
    public String toString() {
        return "Película: " + this.getNombre() + " (" + this.getFechaLanzamiento() + ")";
    }
}



