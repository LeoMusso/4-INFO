package com.company;

public class Temperatura {
    private double tempC;
    private double tempF;

    public Temperatura(double tC, double tF){
        this.tempC = tC;
        this.tempF = tF;
    }

    public double getGradiC(){return this.tempC;}
    public void setGradiC(double tC){this.tempC = tC;}
    public double getGradiF(){return this.tempF;}
    public void setGradiF(double tC){this.tempF = (tC * 9/5) + 32;}
}
