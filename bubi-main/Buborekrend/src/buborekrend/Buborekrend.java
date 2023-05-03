/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buborekrend;

import java.util.Random;

public class Buborekrend {

    public static void main(String[] args) {
        int[] tomb = randomTomb(10);
        Buborek(tomb);
    }

    private static void Buborek(int[] tomb) {
        

        int n = tomb.length; // A tömb elemeinek száma

        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (tomb[j] > tomb[j + 1]) {
                    int tmp = tomb[j];
                    tomb[j] = tomb[j + 1];
                    tomb[j + 1] = tmp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(tomb[i] + " ");
        }
        System.out.println();
    }
    
    private static int[] randomTomb(int meret){
        int[] tomb = new int [meret];
        Random rnd = new Random();
        for (int i = 0; i < meret; i++) {
            int x = rnd.nextInt(50);
            tomb[i] += x;
        }
        
        return tomb;
    }
        
    }

