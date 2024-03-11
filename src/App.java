//Algoritmo de busqueda binaria en java

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int inicio, fin, mitad;
        int numero;
        int n;
        Scanner entrada = new Scanner(System.in);

        //Creamos un array de enteros para almacenar los numeros.
        int nums[];
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo: "));
        nums = new int [n];
        
        for (int i=0;i<n;i++){
            System.out.print(i+1 + ". Ingrese un numero: ");;
            nums[i] = entrada.nextInt();
        }
        //Se ordena el arreglo de forma ascendente para evitar problemas con la busqueda binaria
        Arrays.sort(nums);

        //Se muestra el arrego
        System.out.print("\nEl arreglo es: ");
        for (int i : nums) {
            System.out.print(i + " ");
        }
        
        System.out.print("\nNumero a buscar: ");
        numero = entrada.nextInt();
        //Establecemos el rango de busqueda en la lista de numeros
        inicio = 0;
        fin = nums.length-1;

        while (fin >= inicio){
            mitad = (inicio+fin)/2;
            if (nums[mitad] == numero) {
                System.out.println("El numero "+numero+" se encuentra en la posicion "+mitad);
                break;
            }
            else if (nums[mitad] < numero) {
                inicio = mitad + 1;
            } 
            else {
                fin = mitad - 1;
            }
        }
        if (fin < inicio) {
            System.out.println("No se ha encontrado el numero introducido.");
        }
    }
}
