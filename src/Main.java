import com.aluracursos.screenmatch.modelos.Peliculas;

public class Main {
    public static void main(String[] args) {
        //creo un objeto
        Peliculas pelicula1 = new Peliculas();
        //creo atributos
        pelicula1.setNombre("Encanto");
        pelicula1.setFechaLanzamiento(2009);
        pelicula1.setDuracionMinutos(177);
        //imprimo en consola
        System.out.println("Mi pelicula es: "+ pelicula1.getNombre());
        System.out.println("Su fecha de lanzamiento es: "+ pelicula1.getFechaLanzamiento());
        System.out.println("Su duración es: " + pelicula1.getDuracionMinutos() + " minutos.");

        Peliculas pelicula2 = new Peliculas();
        pelicula2.setNombre("Matrix");
        pelicula2.setFechaLanzamiento(1998);
        pelicula2.setDuracionMinutos(180);

        System.out.println("\nMi pelicula es: "+ pelicula2.getNombre());
        System.out.println("Su fecha de lanzamiento es: "+ pelicula2.getFechaLanzamiento());
        System.out.println("Su duración es: " + pelicula2.getDuracionMinutos() + " minutos.");

        //dirección de memoria en java es unica del objeto, esta dirección aparece al imprimir un objeto
        System.out.println(pelicula2);

        pelicula1.muestraFichaTecnica();
        pelicula2.muestraFichaTecnica();

        //prueba de metodo evalua
        pelicula1.evalua(10);
        pelicula1.evalua(10);
        pelicula1.evalua(10);
        System.out.println(pelicula1.getTotalEvaluaciones());
        System.out.println(pelicula1.calcularMedia());

        System.out.println(pelicula1.calcularMedia());



    }
}