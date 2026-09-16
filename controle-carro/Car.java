/*
 * Representa um carro com funcionalidades básicas de ligar, desligar,
 * acelerar, desacelerar, trocar marchas e virar.
 */

public class Car {

    private boolean isOn;
    private int gear;
    private int speed;

    public Car(){
        isOn = false;
        gear = 0;
        speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getOn() {
        return isOn;
    }

    public int getGear() {
        return gear;
    }

    public void turnOn(){
        if (!isOn){
            isOn = true;
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void turnOff(){
        if (isOn){
            if (speed == 0 && gear == 0){
                isOn = false;
            } else {
                System.out.println("Para desligar o carro, é preciso estar parado e em ponto morto.");
            }
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    /**
     * Retorna a velocidade mínima/máxima para a marcha especificada.
     *
     * @param gear marcha para a qual se deseja obter a velocidade almejada
     * @return a velocidade mínima/máxima em km/h para essa marcha
     */
    private int getMinSpeedForGear(int gear){
        return switch (gear){
            case 1 -> 0;
            case 2 -> 21;
            case 3 -> 41;
            case 4 -> 61;
            case 5 -> 81;
            case 6 -> 101;
            default -> 0;
        };
    }

    private int getMaxSpeedForGear(int gear){
        return switch (gear){
            case 1 -> 20;
            case 2 -> 40;
            case 3 -> 60;
            case 4 -> 80;
            case 5 -> 100;
            case 6 -> 120;
            default -> 0;
        };
    }

    /**
     * Acelera ou desacelera o carro em 1 km/h, respeitando o limite máximo/mínimo de velocidade
     * da marcha atual. Não tem efeito se o carro estiver desligado ou em ponto morto.
     */
    public void accelerate(){
        if (!isOn){
            System.out.println("O carro está desligado.");
            return;
        }
        if (gear == 0){
            System.out.println("O carro está em ponto morto.");
            return;
        }

        if (speed < getMaxSpeedForGear(gear)){
                speed += 1;
        } else {
                System.out.println("Velocidade máxima atingida, troque de marcha.");
        }
    }

    public void decreaseSpeed(){
        if (!isOn){
            System.out.println("O carro está desligado.");
            return;
        }
        if (gear == 0){
            System.out.println("O carro está em ponto morto.");
            return;
        }

        if (speed > getMinSpeedForGear(gear)){
            speed -= 1;
        } else {
            System.out.println("Velocidade mínima atingida, troque de marcha.");
        }
    }

    /*
     * Verifica se o carro pode virar para a esquerda ou direita, baseado na velocidade atual.
     * O carro só pode virar se estiver ligado e a velocidade estiver entre 0 e 40 km/h.
     */
    private boolean canTurn(){
        return speed > 0 && speed <= 40;
    }

    public void turnLeft(){
        if (!isOn){
            System.out.println("O carro está desligado.");
            return;
        }
        if (canTurn()){
            System.out.println("Virando para a esquerda...");
        } else {
            System.out.println("A velocidade deve estar entre 0 e 40 para fazer a curva.");
        }
    }

    public void turnRight(){
        if (!isOn){
            System.out.println("O carro está desligado.");
            return;
        }
        if (canTurn()){
            System.out.println("Virando para a direita...");
        } else {
            System.out.println("A velocidade deve estar entre 0 e 40 para fazer a curva.");
        }
    }

    /*
     * Troca a marcha do carro, verificando se a velocidade atual é compatível com a nova marcha e respeitando
     * os limites mínimo e máximo de velocidade para alterar.
     */
    private void changeGear(int newGear){
        if (!isOn){
            System.out.println("O carro está desligado.");
            return;
        }
        if (newGear < 0 || newGear > 6){
            System.out.println("Marcha inválida. Escolha entre 0 e 6.");
            return;
        }

        int minSpeedForNewGear = getMinSpeedForGear(newGear);
        int maxSpeedForNewGear = getMaxSpeedForGear(newGear);

        if (speed >= minSpeedForNewGear && speed <= maxSpeedForNewGear){
            gear = newGear;
        } else {
            System.out.println("Velocidade incompatível com a marcha " + newGear + ".");
        }
    }

    public void gearUp(){
        if (!isOn){
            System.out.println("O carro está desligado.");
            return;
        }
        if (gear >= 6){
            System.out.println("O carro já está na maior marcha. (6)");
            return;
        }

        changeGear(gear + 1);
    }

    public void gearDown(){
        if (!isOn){
            System.out.println("O carro está desligado.");
            return;
        }
        if (gear == 0){
            System.out.println("O carro já está em ponto morto.");
            return;
        }

        changeGear(gear - 1);
    }

}
