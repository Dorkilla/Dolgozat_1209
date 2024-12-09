package hu.szamalk.jatekprogram;

import java.util.Arrays;

public class LogikaiJatek extends Jatek {
    private int babuDb;
    private Babu[][] tabla;
    private int sorrend[];

    public LogikaiJatek(){
        this.babuDb=3;
    }

    public LogikaiJatek(int babuDb) {
        if(babuDb>2 && babuDb<16){
            this.babuDb=babuDb;
        }
        this.tabla=new Babu[4][5];
        this.sorrend=new int[10];
    }

    public boolean van8FelettEro(){
        return false;
    }

    @Override
    public void kezd(){
        System.out.println("Kezdés");
    }

    @Override
    public void ment(){
        System.out.println("Mentés");
    }

    @Override
    public void vege(){
        System.out.println("Vége");
    }

    @Override
    public String toString() {
        return "LogikaiJatek{" +
                "babuDb=" + babuDb +
                ", tabla=" + Arrays.toString(tabla) +
                ", sorrend=" + Arrays.toString(sorrend) +
                '}';
    }
}
