package Objetos;
import java.util.Random;

public class Personaje extends Thread {
    private Random random = new Random(System.nanoTime());
    private int vida;
    private int fisico;
    private int magia;
    private int nivel;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFisico() {
        return fisico;
    }

    public void setFisico(int fisico) {
        this.fisico = fisico;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int fuerza) {
        this.magia = fuerza;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    //Ataques fisicos
    public int ataqueFisico(){
        int randi = random.nextInt(2);
        return (nivel * fisico * randi);
    }
    //Ataques magicos
    public int ataque_magico(){
        if (magia > 0){
            magia--;
            return nivel*magia;
        }
        else{

            return 0;
        }
    }
    public void danio(int vida){
        this.vida -= vida;
    }


}
