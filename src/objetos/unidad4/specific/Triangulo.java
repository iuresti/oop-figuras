package objetos.unidad4.specific;

import java.awt.*;

import objetos.unidad4.general.Figura;

public abstract class Triangulo extends Figura {

    public Triangulo(){
        super("Triangulo");
    }

    public Triangulo(Color color) {
        super("Triangulo", color);
    }

    public void dibuja(){
        System.out.println("Soy triangulo");
    }

}
