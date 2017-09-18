/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author silva
 */
public class CacaPalavras {
    public static String NomeBase;
    public static int indexNomeCruzamento1;
    public static int indexNomeCruzamento2;
    public static String nomePalavra1;
    public static String nomePalavra2;    
    public static String nomePalavra3;
    public static String nomePalavra4;
    public static String nomePalavra5;
    public static String nomePalavra6;
    public static String nomePalavra7;
    public static String nomePalavra8;

    public static int IndexnomePalavra3;
    public static int IndexnomePalavra4;
    public static int IndexnomePalavra5;
    public static int IndexnomePalavra6;
    public static int IndexnomePalavra7;
    public static int IndexnomePalavra8;

    public static int indexPala;
    public static int indexBase;
    public static int indexBaseChave;
    public static int indexPa2;
    public static int indexBase2;
    public static int indexPala3;
    public static int indexPala4;
    public static int indexPala5;
    public static int indexPala6;
    public static int indexPala7;
    public static int indexPala8;

    public static int indexBase2Posicao;    
    public static int indexBase3Posicao;    
    public static int indexBase4Posicao;





    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = null;
        Scanner sc2 = null;
        Scanner sc3 = null;

        sc = new  Scanner(new FileInputStream("C:/Users/silva/Desktop/Testepalavras.txt")); 
        sc2 = new  Scanner(new FileInputStream("C:/Users/silva/Desktop/Testepalavras.txt")); 
        sc3 = new  Scanner(new FileInputStream("C:/Users/silva/Desktop/Testepalavras.txt")); 

        
        int valueMaiorPalavra = GetValueMaiorPalavra(sc);
        String NomesCruzamentoDuplo[] = GetNomesCruzamentoDuplos(sc2, NomeBase.charAt(1),NomeBase.charAt(NomeBase.length() -2));
        SetPalavrasComArray(NomesCruzamentoDuplo);
        GetNomesCruzamentosCompletos(sc3, nomePalavra1, nomePalavra2,NomesCruzamentoDuplo );
        
        
        char teste[][] = new char[valueMaiorPalavra][30];
        indexPala =2;
        indexBase2 = (indexNomeCruzamento1 + 2)-1;
        boolean t = false;
        for (int i = 0; i < teste.length; i++) {
             System.out.printf("%d. linha: ", (i));
            for (int j = 0; j < 30; j++) {
                if (i ==0) {
                    teste[i][j] =GetLetrasAlinhatorias() ;
                    System.out.print(teste[i][j]);    
                }
                else{
                    if (i == 3 && j == 19) {
                        int p = 0;
                    }
              if (j == 21 && i == indexPala7 + 3 && i != IndexnomePalavra7 + 3 ) {
                         if (indexPala7 < nomePalavra7.length()) {
                            teste[i][j] = nomePalavra7.charAt(indexPala7);
                            indexPala7++;
                            System.out.print(teste[i][j]); 
                        }else{
                                teste[i][j] = GetLetrasAlinhatorias();
                                System.out.print(teste[i][j]); 
                                t = false;
                        }  
                    }else if(i == IndexnomePalavra7 + 3 && j == 20 + indexBase4Posicao && indexPala7 != 0) {
                            if (indexBase4Posicao < nomePalavra8.length()) {
                                teste[i][j] = nomePalavra8.charAt(indexBase4Posicao);
                                indexBase4Posicao++;
                                if (indexBase4Posicao ==  IndexnomePalavra7 + 1) {
                                    indexPala7++;
                                }
                                System.out.print(teste[i][j]); 
                            }else{
                                teste[i][j] = GetLetrasAlinhatorias();
                                System.out.print(teste[i][j]); 
                                t = false;
                            }  
                    }else if (j == 16 && i == indexPala5 + 4 && i != IndexnomePalavra5 + 4 ) {
                         if (indexPala5 < nomePalavra5.length()) {
                            teste[i][j] = nomePalavra5.charAt(indexPala5);
                            indexPala5++;
                            System.out.print(teste[i][j]); 
                        }else{
                                teste[i][j] = GetLetrasAlinhatorias();
                                System.out.print(teste[i][j]); 
                                t = false;
                        }  
                    }else if(i == IndexnomePalavra5 + 4 && j == 15 + indexBase3Posicao && indexPala5 != 0) {
                            if (indexBase3Posicao < nomePalavra6.length()) {
                                teste[i][j] = nomePalavra6.charAt(indexBase3Posicao);
                                indexBase3Posicao++;
                                if (indexBase3Posicao ==  IndexnomePalavra5 + 1) {
                                    indexPala5++;
                                }
                                System.out.print(teste[i][j]); 
                            }else{
                                teste[i][j] = GetLetrasAlinhatorias();
                                System.out.print(teste[i][j]); 
                                t = false;
                            }  
                    }else if (j == 12 && i == indexPala3 + 1 &&  i != IndexnomePalavra3 +1) {
                         if (indexPala3 < nomePalavra3.length()) {
                            teste[i][j] = nomePalavra3.charAt(indexPala3);
                            indexPala3++;
                            System.out.print(teste[i][j]); 
                        }else{
                                teste[i][j] = GetLetrasAlinhatorias();
                                System.out.print(teste[i][j]); 
                                t = false;
                         }    
                        
                    }else if (i == IndexnomePalavra3 + 1 && j == 11 + indexBase2Posicao) {
                            if (indexBase2Posicao < nomePalavra4.length()) {
                                teste[i][j] = nomePalavra4.charAt(indexBase2Posicao);
                                indexBase2Posicao++;
                                if (indexBase2Posicao ==  IndexnomePalavra3 + 1) {
                                    indexPala3++;
                                }
                                System.out.print(teste[i][j]); 
                            }else{
                                teste[i][j] = GetLetrasAlinhatorias();
                                System.out.print(teste[i][j]); 
                                t = false;
                            }  
                    }else if(j == NomeBase.length() -1 && indexNomeCruzamento2 == 1 && i == indexBase2 ){
                        if (indexPa2 < nomePalavra2.length()) {
                            teste[i][j] = nomePalavra2.charAt(indexPa2);
                            indexPa2++;
                            indexBase2++;
                            System.out.print(teste[i][j]); 
                        }
                    }else if (j == NomeBase.length() -1 && indexNomeCruzamento2 == 2 && i == indexBase2-1) {
                        if (indexPa2 < nomePalavra2.length()) {
                            teste[i][j] = nomePalavra2.charAt(indexPa2);
                            if (indexPa2 == indexNomeCruzamento2) {
                                indexBaseChave ++;
                            }
                            indexPa2++;
                            indexBase2++;
                            System.out.print(teste[i][j]);
                            t = true;
                        }
                    }else if (i == indexNomeCruzamento1 +2) {
                        if (j > 0 && indexBaseChave < NomeBase.length()) {
                            teste[i][j] = NomeBase.charAt(indexBaseChave);
                            indexBaseChave++;
                             if (indexBaseChave == 1) {
                                indexPala++;
                                indexBase++;
                            }
                                System.out.print(teste[i][j]);  
                        }else{
                            teste[i][j] = GetLetrasAlinhatorias();
                            System.out.print(teste[i][j]); 
                            t = false;
                        }
                    }else if (j == 2 && i == indexPala && indexBase < nomePalavra1.length()) {
                        teste[i][j] = nomePalavra1.charAt(indexBase);
                        indexPala++;
                        indexBase++;
                        System.out.print(teste[i][j]);  
                    }else {
                        teste[i][j] = GetLetrasAlinhatorias();
                        System.out.print(teste[i][j]);
                        t = false;
                    }
                }
            }
          System.out.printf("\n");
        }
    }
    private static int GetValueMaiorPalavra(Scanner sc) {
        String palavra = "";
        int valueBase =0;
        int value = 0;
        while (sc.hasNext()) {
            palavra = sc.nextLine();
            value = palavra.length();
            if (value >= valueBase) {
                valueBase = value;
                NomeBase = palavra;
            }
        }
        if (valueBase % 2 == 0) {
             return valueBase + 2;
         } else {
             return valueBase + 1; 
         }
    }

    private static char GetLetrasAlinhatorias() {
       String alphabet = "ABCDEFGHIJLMNOPQRSTUVXZ";
       int N = alphabet.length();
       Random rd = new Random();
       
       return  alphabet.charAt(rd.nextInt(N));
    }

    private static String[] GetNomesCruzamentoDuplos(Scanner sc, char L1, char L2) {
        String a[] = new String[8];
        String palavra = "";
      
        int i = 0;
        while (sc.hasNext()) {
            palavra = sc.nextLine();
            if (!palavra.equals(NomeBase)) {
                for (int j = 0; j < palavra.length(); j++) {
                    if (j !=0 ) {
                        if (palavra.charAt(j) == L1) {
                            if (a[i]== null) {
                               a[i] = palavra;
                               i++;
                               indexNomeCruzamento1 = j;
                               L1 = '1';
                               break;
                            }
                        }
                        if (palavra.charAt(j) == L2) {
                            if (a[i]== null) {
                               a[i] = palavra;
                               i++;
                               indexNomeCruzamento2 = j;
                               L2= '2';
                            }
                        }
                    }
                }
            }
            if (a[1]!= null) {
                break;
            }
        }        
        return a;
    }

    private static void SetPalavrasComArray(String[] NomesCruzamento) {
        if (NomesCruzamento[0] != null) {
            nomePalavra1 = NomesCruzamento[0];
        }
        
        if (NomesCruzamento[1]!=null) {
            nomePalavra2 = NomesCruzamento[1];
        }
    }

    private static void GetNomesCruzamentosCompletos(Scanner sc3, String nomePalavra1, String nomePalavra2, String[] NomesCruzamentoDuplo) {
        int index = 0;
        while (sc3.hasNext()) { 
             String Nome =sc3.nextLine(); 
            if (NomesCruzamentoDuplo[index]== null) {
                if (Nome.equals(nomePalavra1) || Nome.equals(nomePalavra2) || Nome.equals(NomeBase))
                    index--;
                else
                    NomesCruzamentoDuplo[index] = Nome;
            }
            index++;
        }
        String nome2p = "";
        for (int i = 0; i < NomesCruzamentoDuplo.length; i++) {
            if (!NomesCruzamentoDuplo[i].equals(nomePalavra1) && !NomesCruzamentoDuplo[i].equals(nomePalavra2)  && !NomesCruzamentoDuplo[i].equals(NomeBase)) {
                String nome = NomesCruzamentoDuplo[i];
                if (!nome.equals(nome2p)) {
                    for (int j = 0; j < nome.length(); j++) {
                        for (int k = 0; k < NomesCruzamentoDuplo[i + 1].length(); k++) {
                            String nome2 = NomesCruzamentoDuplo[i + 1];
                            nome2p="";
                            if (nome.charAt(j)== nome2.charAt(k)) {
                                 nome2p = NomesCruzamentoDuplo[i + 1];
                                System.out.println("contem");
                                SalvaCruzamentosSimples(nome2p,nome,k,j );
                                break;
                            }
                        }
                        if (nome2p!= "") {
                            break;
                        }
                    }                    
                }
            }
        }
    }

    private static void SalvaCruzamentosSimples(String teste, String nome, int indexnome2,int indexnome) {
        if (nomePalavra3 ==null && nomePalavra4== null) {
            nomePalavra3 = nome;
            nomePalavra4 = teste;
            IndexnomePalavra3 = indexnome;
            IndexnomePalavra4 = indexnome2;
        }else if(nomePalavra5 ==null && nomePalavra6== null){
            nomePalavra5 = nome;
            nomePalavra6 = teste;
            IndexnomePalavra5 = indexnome;
            IndexnomePalavra6 = indexnome2;
        }else if(nomePalavra7 ==null && nomePalavra8== null){
            nomePalavra7 = nome;
            nomePalavra8 = teste;
            IndexnomePalavra7 = indexnome;
            IndexnomePalavra8 = indexnome2;
        }
    }

}
