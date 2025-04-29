public class Main {
    public static void main(String[] args) {
        //creo un objeto
        Peliculas pelicula1 = new Peliculas();
        //creo atributos
        pelicula1.nombre = "Moana";
        pelicula1.fechaLanzamiento = 2016;
        pelicula1.duracionMinutos = 107;
        //imprimo en consola
        System.out.println("Mi pelicula es: "+ pelicula1.nombre);
        System.out.println("Su fecha de lanzamiento es: "+ pelicula1.fechaLanzamiento);
        System.out.println("Su duración es: " + pelicula1.duracionMinutos + " minutos.");


    }
}