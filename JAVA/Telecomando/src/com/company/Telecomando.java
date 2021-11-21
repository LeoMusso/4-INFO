package com.company;

public class Telecomando {
    private int canale;
    private boolean acceso;
    private int volume;
    private int volumeMax;
    private int canaleMax;

    public Telecomando(int c, int v){
        this.canale = c;
        this.acceso = false;
        this.volume = v;
        this.canaleMax = 500;
        this.volumeMax = 100;
    }

    public boolean getOnOff(){return this.acceso;}
    public void setOnOff(boolean statoTv){
        if(statoTv)
        {
            this.acceso = true;
        }
        else
        {
            this.acceso = false;
        }
    }
    public int getCanale(){return this.canale;}
    public void setCanale(int c){
        if(c > 0 && c < this.canaleMax)
        {
            this.canale = c;
        }
    }
    public int getVolume(){return this.volume;}
    public void setVolume(int v) {
        int i = 0;
        if(v > 0 && v < 100)
        {
            while(i < v)
            {
                this.volume = i;
                i++;
            }
        }
    }
}
