/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomas
 */
public class RepasoExamen {

    public static void main(String[] args) {
        List<String> listaString = new ArrayList<>();
        listaString = Metodos.leerFichero("./RelEmpCenAus.csv");
        listaString.forEach(System.out::println);
        System.out.println("\n");
        List<ClasePojo> listaEmpleados = new ArrayList<>();
        listaEmpleados = Metodos.obtenerListaEmpleados(listaString);
        System.out.println("\n LISTA DE EMPLEADOS DEL FICHERO");
        listaEmpleados.forEach(System.out::println);

        // 
        System.out.println("\nlista trabajso diff");
        List<String> ejUno = new ArrayList<>();
        ejUno = Metodos.cuatro1(listaEmpleados);
        ejUno.forEach(System.out::println);

        //
        System.out.println("\nNumero de trabajadores Activos: " + Metodos.cuatro2(listaEmpleados));
        //
        System.out.println("\n");
        List<String> ejDos = new ArrayList<>();
        ejDos = Metodos.cuatro3(listaEmpleados);
        ejDos.forEach(System.out::println);
        
        // 
        System.out.println("\n");
        System.out.println("------> " +Metodos.cuatro4(listaEmpleados) );
        
        // 
        System.out.println("\n\n\n");
        String[][] matriz = Metodos.leerFicheroTXT("./concierto.txt");

        // Imprimo el array para comprobar
        System.out.println("Imprimo la matriz generada con el fichero:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        

    }

}
