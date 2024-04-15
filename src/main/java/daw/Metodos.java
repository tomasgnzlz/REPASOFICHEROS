/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author tomas
 */
public class Metodos {

    // Método para leer un fichero csv y guardarlo en una lista de String
    public static List<String> leerFichero(String nombreFichero) {
        List<String> lista = new ArrayList<>();
        try {
            lista = Files.readAllLines(Paths.get(nombreFichero), StandardCharsets.ISO_8859_1);
            //lista = Files.readAllLines(Paths.get(nombreFichero), StandardCharsets.UTF_8);

            if (!lista.isEmpty()) {
                lista.remove(0);
                //HAgo que no lea la primera linea, que sino al pasar los datos
                // al  objeto vehiculo, el año no es un String. 
            }
        } catch (IOException ioe) {
            System.out.println("Error accediendo a fichero: " + nombreFichero);
        }
        return lista;
    }

    public static List<ClasePojo> obtenerListaEmpleados(List<String> lista) {
        List<ClasePojo> listaEmpleados = new ArrayList<>();
        DateTimeFormatter formatFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatHora = DateTimeFormatter.ofPattern("H:mm");

        for (String l : lista) {
            // Separo la lineas por las comas que tengan
            //String[] array = l.split(",");
            String[] array = l.split("(\",\")|(\")");

            String nombre = (array[1].isEmpty() ? null : array[1]);
            String dniPasaporte = (array[2].isEmpty() ? null : array[2]);
            String tipoPersonal = (array[3].isEmpty() ? null : array[3]);
            String puestoTrabajo = (array[4].isEmpty() ? null : array[4]);
            boolean horarioPersonalizado = (array[5].isEmpty() ? null : (array[5].equalsIgnoreCase("si")) ? true : false);
            LocalDate fechaAlta = (array[6].isEmpty()) ? null : LocalDate.parse(array[6], formatFecha);
            LocalDate fechaBaja = (array[7].isEmpty()) ? null : LocalDate.parse(array[7], formatFecha);
            LocalTime horasIniciales = (array[8].isEmpty()) ? null : LocalTime.parse(array[8], formatHora);
            String totalHoras = (array[9].isEmpty()) ? null : array[9];
            boolean activo = (array[10].isEmpty() ? null : (array[10].equalsIgnoreCase("S")) ? true : false);

            ClasePojo aux = new ClasePojo(nombre, dniPasaporte, tipoPersonal, puestoTrabajo, horarioPersonalizado, fechaAlta, fechaBaja, horasIniciales, totalHoras, activo);

            listaEmpleados.add(aux);
        }
        return listaEmpleados;
    }

    // ***************************** EJERCICIO 4 *****************************
    public static List<String> cuatro1(List<ClasePojo> listaEmpleados) {
        return listaEmpleados.stream().map(p -> p.getPuestoTrabajo()).distinct().toList();
    }

    public static Integer cuatro2(List<ClasePojo> listaEmpleados) {
        return (int) listaEmpleados.stream().filter(p -> p.isActivo()).count();
    }

    public static List<String> cuatro3(List<ClasePojo> listaEmpleados) {
        return listaEmpleados.stream().filter(p -> !(p.isActivo())).map(p -> p.getDniPasaporte()).sorted().toList();
    }

    public static String cuatro4(List<ClasePojo> listaEmpleado) {
        return listaEmpleado.stream()
                .max((e1, e2) -> Integer.compare(Integer.parseInt(e1.getTotalHoras().split(":")[0]),
                Integer.parseInt(e2.getTotalHoras().split(":")[0]))).toString();
    }

    // ***************************** EJERCICIO 5 *****************************
    public static String[][] leerFicheroTXT(String nombreFichero) {
        List<String> lineas;
        String[][] matriz = null;
        try {
            lineas = Files.readAllLines(Paths.get(nombreFichero));

            // Genero la matriz a partir del archivo
            matriz = new String[lineas.size()][]; // Le doy las filas que tiene el archivo
            for (int i = 0; i < lineas.size(); i++) {
                // A cada fila le pongo el número de columnas que tiene esa fila
                matriz[i] = new String[lineas.get(i).length()];
                // Relleno la matriz
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = String.valueOf(lineas.get(i).charAt(j));
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return matriz;
    }

}
