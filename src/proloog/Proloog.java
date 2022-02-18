/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proloog;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MINEDUCYT
 */
public class Proloog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        List<String> EstimadosM = new ArrayList<>();
        EstimadosM.add("Ana");
        EstimadosM.add("pedro");
        EstimadosM.add("Luis");
        EstimadosM.add("Juan");
        EstimadosM.add("Mateo");
        //a pedro y a juan le gusta bailar \\
//     System.out.println("quieres saber quienes son los hombres que conoce maria escribe: 1");
//     System.out.println("quieres saber quienes son los hombres que estima maria escribe: 2");
//        

// 
        int resp;
        do {
            System.out.println("Quieres saber quienes son las personas que conoce maria escribe: 1");
            System.out.println("Quieres saber quienes son los hombres que conoce maria escribe: 2");
            System.out.println("Quieres saber quienes son los hombres que estima maria escribe: 3");
            System.out.println("Escribe una de las opciones");
            resp = s.nextInt();
        } while (resp > 3);
        switch (resp) {
            case 1:
                System.out.println("las personas que maria conoce son :\n "+ EstimadosM.get(0) + "\n"
                        + EstimadosM.get(1) + "\n"
                        + EstimadosM.get(2) + "\n"
                        + EstimadosM.get(3) + "\n"
                        + EstimadosM.get(4));
                break;
            case 2:
                System.out.println("Los hombres que conoce maria:\n " + EstimadosM.get(1) + "\n"
                        + EstimadosM.get(2) + "\n"
                        + EstimadosM.get(3) + "\n"
                        + EstimadosM.get(4));
                break;

            case 3:
                System.out.println("Las personas que maria estima mas son:\n " + EstimadosM.get(1) + "\n"
                        + EstimadosM.get(2));
                break;
            case 4:
            default:
                System.out.println("Solo números entre 1 y 3");

        }

    }
}
