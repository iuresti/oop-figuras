package objetos.unidad4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import objetos.unidad4.general.Figura;
import objetos.unidad4.views.View;
import objetos.unidad4.views.WorkArea;

public class App {


    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.refresh();

        WorkArea workArea = new WorkArea();

        doSomething(workArea);

        doSomething2(workArea);

    }

    private static void dibujaFiguras(List<Figura> figuras) {
        Iterator<Figura> figurasIterator = figuras.iterator();

        while (figurasIterator.hasNext()){
            Figura figura = figurasIterator.next();

            figura.dibuja();
        }
    }

    public static void doSomething(View view){
        List<Figura> figuras = new LinkedList<>();

        view.refresh(figuras);
    }

    public static void doSomething2(Persistable persistable){
        persistable.save();
    }
}
