package objetos.unidad4.general;

import java.awt.*;

public abstract class Figura {
    private String name;
    private Color color;

    public Figura(String name){
        this(name, Color.RED);
    }

    public Figura(String name, Color color){
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public abstract void dibuja();

    @Override
    public String toString() {
        return name;
    }
}
