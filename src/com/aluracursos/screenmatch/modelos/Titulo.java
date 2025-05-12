package com.aluracursos.screenmatch.modelos;

public class Titulo {
    private String nombre;
    private int fechaLanzamiento;
    private int duracionMinutos;
    private boolean incluidoEnPlan;
    private double sumaEvaluaciones;
    private int totalEvaluaciones;

    //metodos para consultar

    public String getNombre() {
        return nombre;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }


    //metodos para ingresar datos

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    //metodo para obtener valores privados
    public int getTotalEvaluaciones(){
        return totalEvaluaciones;
    }


    //creo un metodo
    public void muestraFichaTecnica(){
        System.out.println("Mi pelicula es: "+ nombre);
        System.out.println("Su fecha de lanzamiento es: "+ fechaLanzamiento);
        System.out.println("Su duración es: " + getDuracionMinutos() + " minutos.");

    }

    public void evalua( double nota){
        sumaEvaluaciones = sumaEvaluaciones + nota;
        totalEvaluaciones++;
    }
    public double calcularMedia(){
        return sumaEvaluaciones / totalEvaluaciones;
    }

}
