public class FiguraGeometrica {
    private int numeroLati;

    public FiguraGeometrica(int numeroLati){

        this.numeroLati = numeroLati; //setNUmeroLati(numeroLati)
    }

    public int getNumeroLati(){

        return this.numeroLati;
    }

    public void setNumeroLati(int n){
        this.numeroLati = n;
    }

    @Override //annotation
    public String toString(){
        //return this.getClass().getName();
        return "FiguraGeometrica {numeroLati: " +this.numeroLati+"}";
    }

    @Override
    public boolean equals(Object x){
        int n = ((FiguraGeometrica)x).getNumeroLati();
        if(n==this.numeroLati) return true;
        else return false;
    }

}
