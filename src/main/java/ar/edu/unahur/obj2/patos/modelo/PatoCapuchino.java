package ar.edu.unahur.obj2.patos.modelo;

public class PatoCapuchino extends Pato {

    public PatoCapuchino() {
        super(new VueloConAlas());
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un Pato Capuchino");
    }
}
