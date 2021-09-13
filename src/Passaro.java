public class Passaro extends Animal {

    Passaro(double newX, double newY, String newNome) {
        super(newX, newY, newNome);
        super.setType("Passaro");
        super.setVerbo("voou");
        super.setPulo(3);
    }

    public void mover() { // responsável APENAS pelo movimento de um passaro 
        this.adicionaX(this.pulo);
    }

}