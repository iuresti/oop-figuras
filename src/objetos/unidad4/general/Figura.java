package objetos.unidad4.general;

import java.awt.*;

public class Figura {
    private String name;
    private Color color;

    protected Figura(String name){
        this(name, Color.RED);
    }

    protected Figura(String name, Color color){
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    protected void dibuja(){
        System.out.println("Soy figura");
    }

    @Override
    public String toString() {
        return name;
    }
}
