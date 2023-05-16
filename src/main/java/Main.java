import Objetos.Personaje;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int random, salud;
        boolean p1 = true;
        boolean p2 = true;

        Random rand = new Random(System.nanoTime());

        Scanner read = new Scanner(System.in);

        Scanner read2 = new Scanner(System.in);

        Personaje jugador1 = new Personaje();
        Personaje jugador2 = new Personaje();

        System.out.println("Dime el nombre del jugador 1 ");
        String player1Nombre = read.nextLine();
        System.out.println("Dime el nombre del jugador 2 ");
        String player2Nombre = read2.nextLine();
        //Personaje 1
        jugador1.setFisico(15);
        jugador1.setMagia(10);
        jugador1.setNivel(2);
        jugador1.setName(player1Nombre);
        jugador1.setVida(100);
        //Personaje 2
        jugador2.setFisico(15);
        jugador2.setMagia(10);
        jugador2.setNivel(2);
        jugador2.setName(player2Nombre);
        jugador2.setVida(100);

        System.out.println(jugador1.getName()+"HP " + jugador1.getVida());
        System.out.println(jugador1.getName()+"HP " + jugador2.getVida());
        do {
            random = rand.nextInt(1);
            if (random == 0 ){
                salud = jugador1.ataqueFisico();
            }else {
                salud = jugador1.ataque_magico();
            }
            System.out.println(jugador1.getName()+"Le ha dado un golpe de : " + salud + "HP");
            jugador2.danio(salud);

            //Personaje 2
            random = rand.nextInt(1);
            if (random == 0 ){
                salud = jugador2.ataqueFisico();
            }else {
                salud = jugador2.ataque_magico();
            }
            System.out.println(jugador2.getName()+"Le ha dado un golpe de : " + salud + "HP");
            jugador1.danio(salud);

            if (jugador1.getVida() <=0){
                p1 = false;
            }else {
                p2 = false;
            }
            System.out.println(jugador1.getName()+"Tiene " + jugador1.getVida() + "Puntos de Salud ");
            System.out.println(jugador2.getName()+"Tiene " + jugador2.getVida() + "Puntos de Salud");



        }while (p1 && p2);

    }
}