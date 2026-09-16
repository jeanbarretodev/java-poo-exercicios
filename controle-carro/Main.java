import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    static void main() {
        var car = new Car();
        int option;

        do {
            System.out.println("Ligado: " + car.getOn() + "\nMarcha: " + car.getGear() + "\nVelocidade: " + car.getSpeed());
            System.out.println("===ESCOLHA UMA OPÇÃO===");
            System.out.println("1. Ligar o carro");
            System.out.println("2. Desligar o carro");
            System.out.println("3. Acelerar");
            System.out.println("4. Desacelerar");
            System.out.println("5. Virar para a esquerda");
            System.out.println("6. Virar para a direita");
            System.out.println("7. Aumentar a marcha");
            System.out.println("8. Diminuir a marcha");
            System.out.println("0. Sair");
            System.out.println("=======================");
            option = scanner.nextInt();

            switch (option){
                case 1 -> car.turnOn();
                case 2 -> car.turnOff();
                case 3 -> car.accelerate();
                case 4 -> car.decreaseSpeed();
                case 5 -> car.turnLeft();
                case 6 -> car.turnRight();
                case 7 -> car.gearUp();
                case 8 -> car.gearDown();
                case 0 -> System.exit(0);
                default -> System.out.println("Escolha uma opção válida.");
            }
        } while (true);
    }
}