public class DiatributoreTest {

    public static void main(String[] args){
        Distributore macchina = new Distributore(0,0,0,0);
        int quantita = macchina.getQuantita();
        int prodotto = macchina.getProdotto();
        double prezzo = macchina.getPrezzo();
        double portafoglio = macchina.getProdotto();
        System.out.println("numero prodotto selezionato: " +prodotto);
        System.out.println("quantità prodotto selezionata : " +quantita);
        System.out.println("il prezzo del prodotto è: " +prezzo);
        macchina.setProdotto(5);
        macchina.setQuantita(3);
        macchina.setPrezzo(1.5,2);
        macchina.setPortafoglio(10);
        prodotto = macchina.getProdotto();
        quantita = macchina.getQuantita();
        prezzo = macchina.getPrezzo();
        portafoglio = macchina.getPortafoglio();
        System.out.println("numero prodotto selezionato: " +prodotto);
        System.out.println("quantità prodotto selezionata : " +quantita);
        System.out.println("il prezzo del prodotto è: " +prezzo);
        macchina.pagamento(prezzo, portafoglio);

        //NUOVO OGGETTO
        Distributore macchina2 = new Distributore(3,5,3,10);

        if(macchina2.equals(macchina))
            System.out.println("Distributori uguali");
        else
            System.out.println("Distributori diversi");
    }


}
