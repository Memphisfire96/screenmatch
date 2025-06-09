import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Peliculas;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //creo un objeto
        Peliculas pelicula1 = new Peliculas("Encanto", 120, 2009);
        //creo atributos
        //pelicula1.setNombre("Encanto");
       //pelicula1.setFechaLanzamiento(2009);
        //pelicula1.setDuracionMinutos(120);
        //imprimo en consola
        System.out.println("Mi pelicula es: "+ pelicula1.getNombre());
        System.out.println("Su fecha de lanzamiento es: "+ pelicula1.getFechaLanzamiento());
        System.out.println("Su duración es: " + pelicula1.getDuracionMinutos() + " minutos.");

        Peliculas pelicula2 = new Peliculas("matrix", 180, 1998);


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

        Serie casaDragon = new Serie();

        casaDragon.setNombre("La casa del dragon");
        casaDragon.setFechaLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionMinutos());

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(pelicula1);
        calculadora.incluye(casaDragon);
        System.out.println(calculadora.getTiempoTotal());


        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(pelicula1);

        Episodio episodio1 = new Episodio();
        episodio1.setNombre("La casa");
        episodio1.setNumero(1);
        episodio1.setSerie(casaDragon);
        episodio1.setTotalVisualizaciones(300);

        filtroRecomendacion.filtra(episodio1);

        //nueva implementación

        var peliculaDeKevin = new Peliculas("Interestellar",169, 2014);


        //cre una lista de peliculas
        ArrayList<Peliculas> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeKevin);
        listaDePeliculas.add(pelicula1);

        System.out.println("Tamaño de la lista : "+ listaDePeliculas.size());
        System.out.println("La primera pelicula es: "+ listaDePeliculas.get(0).getNombre());

        System.out.println(listaDePeliculas);



        

    }
}