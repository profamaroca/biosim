public class Peixe extends Animal {

    Peixe(double newX, double newY, String newNome) {
        super(newX, newY, newNome);
        super.setType("Peixe");
        super.setVerbo("nadou");
        super.setPulo(1);
    }

    public void mover() { // responsável APENAS pelo movimento de um peixe 
        this.adicionaY(this.pulo);
    }

}