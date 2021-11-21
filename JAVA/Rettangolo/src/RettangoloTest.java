public class RettangoloTest {
    public static void main(String[] args){
        Rettangolo rettangolo= new Rettangolo(5,3);
        int Base= rettangolo.getBase();
        System.out.println("Base: "+Base);
        int Altezza= rettangolo.getAltezza();
        System.out.println("Altezza: "+Altezza);
        int Area= rettangolo.calcolaArea();
        System.out.println("Area: "+Area);
        int Perimetro= rettangolo.calcolaPerimetro();
        System.out.println("Perimetro: "+Perimetro);

        //NUOVO OGGETTO
        Rettangolo rettangolo2 = new Rettangolo(5, 4);
        System.out.println(" ");
        System.out.println("Rettangolo 2");
        Base= rettangolo2.getBase();
        System.out.println("Base: "+Base);
        Altezza= rettangolo2.getAltezza();
        System.out.println("Altezza: "+Altezza);
        Area= rettangolo2.calcolaArea();
        System.out.println("Area: "+Area);
        Perimetro= rettangolo2.calcolaPerimetro();
        System.out.println("Perimetro: "+Perimetro);

        if(rettangolo2.equals(rettangolo))
            System.out.println("Rettangoli uguali");
        else
            System.out.println("Rettangoli diversi");
    }
}
