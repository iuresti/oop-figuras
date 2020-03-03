package objetos.unidad4;

import java.util.Iterator;
import java.util.List;

import objetos.unidad4.views.View;

public class Editor {

    private List<View> views;

    public void refresh() {

        Iterator<View> iterator = views.iterator();

        while(iterator.hasNext()) {
            View view = iterator.next();

            view.refresh(figuras);
        }

    }
}
