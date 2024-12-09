package hu.szamalk;

import java.util.Random;

public class Tabla {
    private char[][] T;
    private char UresCella;

    public Tabla(char uresCella) {
        this.T = new char[8][8];
        UresCella = uresCella;

        for(int i=0; i<T.length; i++){
            for(int j=0; j<T[i].length; j++){
                this.T[i][j]=this.UresCella;
                //System.out.println(T[i][j]);
            }
        }
    }

    public String megjelenit(){
        String megjelen="";
        for(int i=0; i<T.length; i++){
            for(int j=0; j<T.length; j++) {
                megjelen += this.T[i][j];
            }
            megjelen+='\n';
        }
        return megjelen;
    }

    public void elhelyez(int N){
        Random rnd=new Random();
        for(int i=0; i<N; i++){
            int sor= rnd.nextInt();
            int oszl= rnd.nextInt();
            if(T[sor][oszl]!=UresCella){
                T[sor][oszl]='K';
            }
        }
    }




}

