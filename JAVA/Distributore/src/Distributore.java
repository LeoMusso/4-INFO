public class Distributore {
    private int quantita;
    private int prodotto;
    private double prezzo;
    private double portafoglio;

    public Distributore(int q, int p, double pr, double po){
        this.quantita = q;
        this.prodotto = p;
        this.prezzo = pr;
        this.portafoglio = po;
    }
    public void setQuantita(int q){
        quantita=q;
    }
    public int getQuantita(){
        return this.quantita;
    }
    public void setProdotto(int p){
        prodotto=p;
    }
    public int getProdotto(){
        return this.prodotto;
    }
    public void setPrezzo(double pr, int q){
        q = getQuantita();
        this.prezzo = pr * q;
    }
    public double getPrezzo(){
        return this.prezzo;
    }
    public void setPortafoglio(double po){
        portafoglio=po;
    }
    public double getPortafoglio(){
        return this.portafoglio;
    }
    public void pagamento(double prezzo, double portafoglio){
        if(prezzo<portafoglio){
            portafoglio=portafoglio-prezzo;
            System.out.println("Nel portafoglio ti rimangono: " +portafoglio);
        }else{
            System.out.println("Credito insufficente, inserire almeno: " +prezzo);
        }

    }
    public boolean equals(Object x) {
        int q = ((Distributore)x).getQuantita();
        int p = ((Distributore)x).getProdotto();
        double pr = ((Distributore)x).getPrezzo();
        double po = ((Distributore)x).getPortafoglio();
        System.out.println(" ");
        System.out.println("Equals");
        System.out.println("Quantità distributore 1: " +this.quantita);
        System.out.println("Quantità distributore 2: " +q);
        System.out.println("Prodotto distributore 1: " +this.prodotto);
        System.out.println("Prodotto distributore 2: " +p);
        System.out.println("Prezzo distributore 1: " +this.prezzo);
        System.out.println("Prezzo distributore 2: " +pr);
        System.out.println("Portafoglio distributore 1: " +this.portafoglio);
        System.out.println("Portafoglio distributore 2: " +po);
        if(q == this.quantita && p == this.prodotto && pr == this.prezzo && po == this.portafoglio) {
            return true;
        }
        else {
            return false;
        }
    }
}