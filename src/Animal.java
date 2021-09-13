public class Animal {

    protected double x;
    protected double y;
    protected String nome;
    
    protected double pulo;
    protected String verbo;
    protected String type;

    Animal(double newX, double newY, String newNome) {
        this.x = newX;
        this.y = newY;
        this.nome = newNome;
    }

    public void setX(int newX) {
        this.x = newX;
    }

    public void setY(int newY) {
        this.y = newY;
    }

    public void setPulo(double newPulo) {
        this.pulo = newPulo;
    }

    public void setType(String newType) {
        this.type = newType;
    }

    public void setVerbo(String newVerbo) {
        this.verbo = newVerbo;
    }

    public void adicionaX(double pulo) {
        this.x += pulo;
    }
    
    public void adicionaY(double pulo) {
        this.y += pulo;
    }

    public String getNome() {
        return this.nome;
    }

    public String getType() {
        return this.type;
    }
    
    public double getX() {
    	return this.x;
    }
    
    public double getY() {
    	return this.y;
    }
    
    public String getVerbo() {
    	return this.verbo;
    }
    
    public String exibeAnimal() {
    	return "" + this.type + " " + this.nome + " no ponto (" + this.x + "," + this.y + ")";
    }

    // deve estar declarado para aplicarmos polimorfismo
    public void mover() {}

}