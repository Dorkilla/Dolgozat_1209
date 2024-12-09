package hu.szamalk.jatekprogram;

public class Babu {
    private int ero;
    private String szin;

    public Babu(String szin) {
        this.szin = szin;
        this.ero=1;
    }

    public Babu(int ero, String szin) {
        if(ero>0 && ero<9){
            this.ero = ero;
            this.szin = szin;
        }
    }
}
