public class Anfibio extends Animal {

    Anfibio(double newX, double newY, String newNome) {
        super(newX, newY, newNome);
        super.setType("Anfibio");
        super.setVerbo("pulou");
        super.setPulo(1.5);
    }

    public void mover() { // responsável APENAS pelo movimento de um anfibio 
        this.adicionaX(this.pulo);
        this.adicionaY(this.pulo);
    }

}