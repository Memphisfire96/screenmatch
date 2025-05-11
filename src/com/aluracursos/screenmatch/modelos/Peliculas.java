package com.aluracursos.screenmatch.modelos;

public class Peliculas {
    //atributos
    private String nombre;
    private int fechaLanzamiento;
    private int duracionMinutos;
    private boolean incluidoEnPlan;
    private double sumaEvaluaciones;
    private int totalEvaluaciones;

    //metodo para obtener valores privados
   public int getTotalEvaluaciones(){
        return totalEvaluaciones;
    }


    //creo un metodo
   public void muestraFichaTecnica(){
        System.out.println("Mi pelicula es: "+ nombre);
        System.out.println("Su fecha de lanzamiento es: "+ fechaLanzamiento);
        System.out.println("Su duración es: " + duracionMinutos + " minutos.");

    }

    public void evalua( double nota){
        sumaEvaluaciones = sumaEvaluaciones + nota;
        totalEvaluaciones++;
    }
    public double calcularMedia(){
        return sumaEvaluaciones / totalEvaluaciones;
    }



}
