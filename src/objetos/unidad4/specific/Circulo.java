package objetos.unidad4.specific;

import java.awt.*;

import objetos.unidad4.general.Figura;

public class Circulo extends Figura {

    public Circulo() {
        super("Circulo");
    }

    public Circulo(Color color) {
        super("Circulo", color);
    }

    public void dibuja(){
        System.out.println("Soy circulo");
    }

}
