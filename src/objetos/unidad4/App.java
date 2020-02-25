package objetos.unidad4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import objetos.unidad4.general.Figura;
import objetos.unidad4.specific.Circulo;
import objetos.unidad4.specific.Cuadrado;
import objetos.unidad4.specific.Triangulo;

public class App {

    public static void main(String[] args) {
        List<Figura> figuras = new LinkedList<>();

        Figura circulo = new Circulo();

        figuras.add(new Cuadrado());
        figuras.add(circulo);
        figuras.add(new Triangulo());

        //dibujaFiguras(figuras);

        circulo.dibuja();

    }

    private static void dibujaFiguras(List<Figura> figuras) {
        Iterator<Figura> figurasIterator = figuras.iterator();

        while (figurasIterator.hasNext()){
            //figurasIterator.next().dibuja();
            //System.out.println("Figura:" + );
        }
    }
}
