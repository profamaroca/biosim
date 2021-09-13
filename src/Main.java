import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static ArrayList<Animal> array = new ArrayList<Animal>(); // uma lista de variáveis genéricas

    public static void main(String [] args) {

        menu();

    }

    public static void menu() {

        System.out.println("\n[1] Criar novo animal");
        System.out.println("[2] Listar animais criados");
        System.out.println("[3] Iniciar simulacao com todos os animais criados");
        System.out.println("[4] Encerrar o programa");

        int op = scan.nextInt();

        if (op == 1) {
            menu1();
        } else if (op == 2) {
            menu2(array);
        } else if (op == 3) {
            menu3();
        } else if (op == 4) {
            System.out.println("Encerrando o programa...");
        } 

    }

    public static void menu1() {

        String nome;
        double newX;
        double newY;
        int op1;
        
        scan.nextLine();

        System.out.println("\nDigite o nome do seu animal:");
        nome = scan.nextLine();

        System.out.println("\nDigite a coordenada X do animal:");
        newX = scan.nextDouble();

        System.out.println("\nDigite a coordenada Y do animal:");
        newY = scan.nextDouble();

        System.out.println("\nDigite o tipo do animal");
        System.out.println("[1] Peixe");
        System.out.println("[2] Anfibio");
        System.out.println("[3] Passaro");

        op1 = scan.nextInt();

        if (op1 == 1) {
            Animal peixe1 = new Peixe(newX, newY, nome);
            array.add(peixe1);

            System.out.println("Animal adicionado com sucesso! Voltando ao menu inicial...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                System.out.println("Houve um erro: " + ex.getMessage());
            }

            menu();
        } else if (op1 == 2) {
            Animal anfibio1 = new Anfibio(newX, newY, nome);
            array.add(anfibio1);

            System.out.println("Animal adicionado com sucesso! Voltando ao menu inicial...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                System.out.println("Houve um erro: " + ex.getMessage());
            }

            menu();
        } else if (op1 == 3) {
            Animal passaro1 = new Passaro(newX, newY, nome);
            array.add(passaro1);

            System.out.println("Animal adicionado com sucesso! Voltando ao menu inicial...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                System.out.println("Houve um erro: " + ex.getMessage());
            }

            menu();
        }

    }

    public static void menu2(ArrayList<Animal> arrayAnimais) {

        System.out.println("Listando animais criados:");
        for (Animal animal : arrayAnimais) {
            System.out.println("" + animal.getType() + " " + animal.getNome());
        }

        System.out.println("Voltando ao menu inicial...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            System.out.println("Houve um erro: " + ex.getMessage());
        }
        menu();

    }

    public static void menu3() {

        System.out.println("Digite a duracao, em segundos, da simulacao:");
        int segundos = scan.nextInt();

        for (int i = 0; i < segundos; i++) {
        	
            for (Animal animal : array) {
            	// informação para o usuário
                System.out.print(animal.exibeAnimal());
                
                animal.mover();
                
                // informação para o usuário
                System.out.print(" " + animal.getVerbo() + " para o ponto (" + animal.getX() + "," + animal.getY() + ")" );
            }
            
            try {
                System.out.println("\n------------- final da lista");
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Ocorreu um erro: " + ex.getMessage());
            }
        }

        System.out.println("\nVoltando ao menu inicial...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Houve um erro: " + ex.getMessage());
        }
        menu();

    }
}