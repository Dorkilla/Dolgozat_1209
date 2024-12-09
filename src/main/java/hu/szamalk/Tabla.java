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
                System.out.println(T[i][j]);
            }
        }
    }




}

