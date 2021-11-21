public class TelevisoreTest {
    public static void main(String[] args){
        System.out.println("Televisore 1");
        Televisore televisore= new Televisore(23,30,15,5);
        int Pollici= televisore.getPollici();
        System.out.println("Pollici: "+Pollici);
        int Volume= televisore.getVolume();
        System.out.println("Volume: "+Volume);
        int Lum= televisore.getLum();
        System.out.println("Luminosità: "+Lum);
        int Canale= televisore.getCanale();
        System.out.println("Canale: "+Canale);
        televisore.canaleSuccessivo();
        televisore.alzaVolume();
        televisore.aumentaLum();
        Volume= televisore.getVolume();
        Lum= televisore.getLum();
        Canale= televisore.getCanale();
        System.out.println("");
        System.out.println("Aumentiamo il volume, la luminosità e il canale.");
        System.out.println("Pollici: "+Pollici);
        System.out.println("Volume: "+Volume);
        System.out.println("Luminosità: "+Lum);
        System.out.println("Canale: "+Canale);

        //NUOVO OGGETTO
        Televisore televisore2 = new Televisore(23, 31, 16, 6);
        System.out.println(" ");
        System.out.println("Televisore 2");
        Pollici= televisore2.getPollici();
        System.out.println("Pollici: "+Pollici);
        Volume= televisore2.getVolume();
        System.out.println("Volume: "+Volume);
        Lum= televisore2.getLum();
        System.out.println("Luminosità: "+Lum);
        Canale= televisore2.getCanale();
        System.out.println("Canale: "+Canale);

        if(televisore2.equals(televisore))
            System.out.println("Televisori Uguali");
        else
            System.out.println("Televisori Diversi");
    }
}
