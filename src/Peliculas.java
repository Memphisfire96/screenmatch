public class Peliculas {
    //atributos
    String nombre;
    int fechaLanzamiento;
    int duracionMinutos;
    boolean incluidoEnPlan;
    private double sumaEvaluaciones;
    private int totalEvaluaciones;

    //metodo para obtener valores privados
    int getTotalEvaluaciones(){
        return totalEvaluaciones;
    }


    //creo un metodo
    void muestraFichaTecnica(){
        System.out.println("Mi pelicula es: "+ nombre);
        System.out.println("Su fecha de lanzamiento es: "+ fechaLanzamiento);
        System.out.println("Su duración es: " + duracionMinutos + " minutos.");

    }

    void evalua( double nota){
        sumaEvaluaciones = sumaEvaluaciones + nota;
        totalEvaluaciones++;
    }
    double calcularMedia(){
        return sumaEvaluaciones / totalEvaluaciones;
    }



}
