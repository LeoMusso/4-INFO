package com.company;

public class Velocita {
    private double velocita;

    public Velocita() {
        this.velocita = 0;
    }

    public double getVelocita(){return  this.velocita;}
    public void setVelocitaKm(double vKm){this.velocita = vKm * 3.6;}
    public void setVelocitaM(double vM){this.velocita = vM;}
}
