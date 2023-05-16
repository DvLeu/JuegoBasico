import Objetos.Personaje;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Scanner read2 = new Scanner(System.in);
        Personaje jugador1 = new Personaje();
        Personaje jugador2 = new Personaje();
        System.out.println("Dime el nombre del jugador 1 ");
        String player1Nombre = read.nextLine();
        String player2Nombre = read2.nextLine();

        jugador1.setFisico(15);
        jugador1.setMagia(10);
        jugador1.setNivel(2);
        jugador1.setName(player1Nombre);
        jugador1.setVida(100);

        jugador2.setFisico(15);
        jugador2.setMagia(10);
        jugador2.setNivel(2);
        jugador2.setName(player1Nombre);
        jugador2.setVida(100);

    }
}
