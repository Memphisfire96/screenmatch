public class Peliculas {
    //atributos
    String nombre;
    int fechaLanzamiento;
    int duracionMinutos;
    boolean incluidoEnPlan;

    //creo un metodo
    void muestraFichaTecnica(){
        System.out.println("Mi pelicula es: "+ nombre);
        System.out.println("Su fecha de lanzamiento es: "+ fechaLanzamiento);
        System.out.println("Su duración es: " + duracionMinutos + " minutos.");

    }



}
