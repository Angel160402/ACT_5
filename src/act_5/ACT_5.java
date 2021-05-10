/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act_5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ACT_5 {
    
    static void encabezados() {
        System.out.println("UNIVERSIDAD AUTÓNOMA DE CAMPECHE");
        System.out.println("FACULTAD DE INGENIERÍA");
        System.out.println("INGENIERÍA EN SISTEMAS COMPUTACIONALES");

    }

    static void separador() {
        System.out.println("[-----------------------------------------------]");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        encabezados();
     /* 
        //1.- Imprima un arreglo que tenga los
        //nombres de los días de la semana.
      System.out.println("[---------EJERCICIO 1----------]");
        String numE[]=new String[7];
        
        numE[0]="DOMINGO";
        numE[1]="LUNES";
        numE[2]="MARTES";
        numE[3]="MIERCOLES";
        numE[4]="JUEVES";
        numE[5]="VIERNES";
        numE[6]="SABADO";
       
        for (int i = 0; i < 7; i++) {
            System.out.println(numE[i]);
        }
     
     //2.-Imprima utilizando los ciclos for el
     //arreglo de dos dimensiones de los personajes de Star War.
         System.out.println("[------EJERCICIO 2-------]");
        String[][] STwars;
         STwars= new String[16][3];
    STwars[0][0]="Luke Skywalker";
    STwars[0][1]="172";
    STwars[0][2]="male";
    
    STwars[1][0]="R2-D2";
    STwars[1][1]="96";
    STwars[1][2]="n/a";
    
    STwars[2][0]="C-3PO";
    STwars[2][1]="167";
    STwars[2][2]="n/a";
    
    STwars[3][0]="Drath vader";
    STwars[3][1]="202";
    STwars[3][2]="male";
    
    STwars[4][0]="Laia Organa";
    STwars[4][1]="150";
    STwars[4][2]="female";
    
    STwars[5][0]="Owen Lars";
    STwars[5][1]="178";
    STwars[5][2]="male";
    
    STwars[6][0]="Beru Whitesun";
    STwars[6][1]="165";
    STwars[6][2]="Female";
    
    STwars[7][0]="R5-D4";
    STwars[7][1]="97";
    STwars[7][2]="n/a";
    
    STwars[8][0]="Bigga Darkiighter";
    STwars[8][1]="182";
    STwars[8][2]="male";
    
    STwars[9][0]="Obi-Wan ";
    STwars[9][1]="Obi-Wan Kenobi";
    STwars[9][2]="Anakin Skywaler";
    
    STwars[10][0]="Yoda";
    STwars[10][1]="66";
    STwars[10][2]="male";
    
    STwars[11][0]="Jek Tono Pokins";
    STwars[11][1]="180";
    STwars[11][2]="male";
    
    STwars[12][0]="Jabba Tiure";
    STwars[12][1]="175";
    STwars[12][2]="Hermaphrodite";
    
    STwars[13][0]="Han solo";
    STwars[13][1]="160";
    STwars[13][2]="male";
    
    STwars[14][0]="Chewbacca";
    STwars[14][1]="228";
    STwars[14][2]="male";
    
    STwars[15][0]="Anakin Skywalker";
    STwars[15][1]="188";
    STwars[15][2]="";
    
     for (int i = 0; i < 16; i++) {
         for (int j = 0; j < 3; j++) {
          System.out.println("PERSONAJE: ["+ i +"][" +j+ "]: " 
                  + STwars[i][j]);       
         }  
    }
     */
     /*
     //3.-Dado el arreglo de dos dimensiones
     //del alfabeto y su correspondencia en código morse, imprima la letra y su código
     //morse asignado.
     System.out.println("[-----------EJERCICIO 3----------]");
        String[][] Letras;
    Letras= new String[26][2];
        Letras[0][0] = "A";
        Letras[1][0] = "B";
        Letras[2][0] = "C";
        Letras[3][0] = "D";
        Letras[4][0] = "E";
        Letras[5][0] = "F";
        Letras[6][0] = "G";
        Letras[7][0] = "H";
        Letras[8][0] = "I";
        Letras[9][0] = "J";
        Letras[10][0] = "K";
        Letras[11][0] = "L";
        Letras[12][0] = "M";
        Letras[13][0] = "N";
        Letras[14][0] = "O";
        Letras[15][0] = "P";
        Letras[16][0] = "Q";
        Letras[17][0] = "R";
        Letras[18][0] = "S";
        Letras[19][0] = "T";
        Letras[20][0] = "U";
        Letras[21][0] = "V";
        Letras[22][0] = "W";
        Letras[23][0] = "X";
        Letras[24][0] = "Y";
        Letras[25][0] = "Z";

        Letras[0][1] = ".-";
        Letras[1][1] = "-...";
        Letras[2][1] = "-.-.";
        Letras[3][1] = "-..";
        Letras[4][1] = ".";
        Letras[5][1] = "..-.";
        Letras[6][1] = "--.";
        Letras[7][1] = "...";
        Letras[8][1] = "..";
        Letras[9][1] = ".---";
        Letras[10][1] = "-.-";
        Letras[11][1] = ".-..";
        Letras[12][1] = "--";
        Letras[13][1] = "-.";
        Letras[14][1] = "---";
        Letras[15][1] = ".--.";
        Letras[16][1] = "--.-";
        Letras[17][1] = ".-.";
        Letras[18][1] = "...";
        Letras[19][1] = "-";
        Letras[20][1] = "..-";
        Letras[21][1] = "...-";
        Letras[22][1] = ".--";
        Letras[23][1] = "-..-";
        Letras[24][1] = "-.--";
        Letras[25][1] = "--..";
        for (int i = 0; i < 26; i++) {
        for (int j = 0; j < 2; j++) {
         
          System.out.println("CODIGO: ["+ i +"][" +j+ "]: " 
                  + Letras[i][j]);     
            
         }  
    }
        
        //4.- Lea una palabra, conviertala a un
        //arreglo de caracteres y busque su correspondencia en el código ascii
        System.out.println("[---------EJERCICIO 4-----------]");
       int asciiValue;
        char cChar;
        String sFrase = "Hola";//INGRESA FRASE
        char[]  aChar = sFrase.toCharArray();
        for (int i = 0; i < aChar.length; i++) {
            System.out.println(aChar[i]);
            cChar = aChar[i]; // 72 - 65 = 7
            asciiValue = (int) cChar;
            System.out.println("["+ asciiValue +"]");
          
        }
        */
        //6.- Lea una frase que identifique el sexo
        //de los personajes de StarWar y realice un filtro, para ello utilice un ciclo
        //que imprima el sexo de los personajes seleccionado  [male,
        //female, n/a, hermaphrodite] 
         System.out.println("-----EJERCICIO 6-------");
        Scanner Leer = new Scanner(System.in);
        System.out.println("INGRESE EL NOMBRE DE UN PERSONAJE DE STAR WARS : ");
        String Cadena= Leer.next();
        switch (Cadena) {
            
            case "Luke": System.out.println("ES HOMBRE");
            break;
            case "Chewbacca":System.out.println(" ES HOMBRE");
            break;  
            case "mala": System.out.println("ES MUJER");
            break;
            case "Anakin":System.out.println("ES HOMBRE");
            break;
            case " Han": System.out.println("ES HOMBRE");
            break;
            case "Female": System.out.println("ES MUJER");
            break;
            case "n/a": System.out.println("ES MUJER");
            break;
            case "Hermaphrodite": System.out.println("ES MUJER");
            break;
            case "Jek": System.out.println("ES HOMBRE");
            break;
            case "Jabba": System.out.println("ES UN MOUSTRO");
            break;
            case "Obi-Wan": System.out.println("ES HOMBRE");
            break;
            case "Bigga Darkiighter": System.out.println("ES HOMBRE");
            break;
            case "Yoda": System.out.println("DUENTE VERDE");
            break;
            case "Laia Organa": System.out.println("ES MUJER");
            break;
            case "202": System.out.println("ROBOT");
            break;
            case "182": System.out.println("CAPITAN REX");
            break;
            case "R2-D2": System.out.println("DROIDE");
            break;
            case "Beru": System.out.println("ES MUJER");
            break;
            case"C-3PO":System.out.println("HOMBRE DE PLATA");
            break;
            case"228": System.out.println("PRINCESA");
            break;
            case"160": System.out.println("MAX REBO - ELEFANTE AZUL");
            break;
                                    default:
                System.out.println("PERSONAJE INDEFINIDO");
        }
        
        
    }
    
}
