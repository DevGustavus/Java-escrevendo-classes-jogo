/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package View;

import Model.Heroi;
import static Model.Heroi.alterarHeroi;
import static Model.Heroi.criarHeroi;
import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class EscrevendoAsClassesDeUmJogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);

        Heroi heroi = criarHeroi(input);

        int opc;
        boolean encerrar = false;

        do {
            System.out.println("\n\n\n\n");
            
            System.out.println("HEROI: " + heroi.toString());

            System.out.println("\n=================");
            System.out.println("Menu do Heroi:");
            System.out.println("1 - Atacar");
            System.out.println("2 - Alterar heroi");
            System.out.println("3 - Encerrar");
            System.out.println("=================");

            System.out.print("Escolha uma opcao: ");
            opc = input.nextInt();

            switch (opc) {
                case 1:
                    heroi.ataque();
                    break;

                case 2:
                    heroi = alterarHeroi(input, heroi);
                    break;

                case 3:
                    encerrar = true;
                    break;

                default:
                    System.out.println("Opcao invalida. Escolha um numero de 1 a 3.");
                    break;
            }
        } while (!encerrar);
    }
}
