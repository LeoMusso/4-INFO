public class FiguraTest {
    public static void main(String[] args) {
        FiguraGeometrica figura = new FiguraGeometrica(3);
        int numLati = figura.getNumeroLati();
        System.out.println("Numero lati: " +numLati);
        figura.setNumeroLati(4);
        numLati = figura.getNumeroLati();

        System.out.println("Nuovo numero lati: " +numLati);
        System.out.println(figura);

        System.out.println("Nuovo numero lati: " +figura.getNumeroLati());

        //Ciclo for per aumentare il valore da 4 a 8
        //inizializzo i con il metodo getNumeroLati = 4
        for (int i = figura.getNumeroLati(); i < 9; i++){
            figura.setNumeroLati(i); //setto il numero dei lati a i
            System.out.println(figura.getNumeroLati()); //stampo la figura come output
        }

        System.out.println(figura);

        FiguraGeometrica figura2 = new FiguraGeometrica(5);
        if(figura2.equals(figura))
            System.out.println("Figure uguali");
        else
            System.out.println("Figure diverse");
    }
}
