package adaitw.java;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Consola {
    private static final Scanner scanner;

    private Consola() {
    }

    public static boolean validarString(String texto, int maximo) {
        return texto.length()<=maximo;
    }

    public static String getString(String mensaje) {
        String texto = "";
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        do{
            System.out.print(mensaje+": ");
            texto = sc.nextLine();
            if(texto.length()>0) correcto=true;
        }while(!correcto);
        return texto;
    }

    public static int validateInt(String prompt, int min, int max) {
        int input;
        do {
            System.out.print(prompt);

            while(!scanner.hasNextInt()) {
                System.out.print(prompt);
                scanner.next();
            }

            input = scanner.nextInt();
        } while(input < min || input > max);

        return input;
    }
    static {
        scanner = new Scanner(System.in);
    }

    public static String validarCategoria(String prompt) {
        System.out.print(prompt);

        String result;
        for(result = scanner.next(); !result.equals("true") && !result.equals("false"); result = scanner.next()) {
            System.out.print(prompt);
        }

        return result;
    }
    public static String validarFechaAlta(String prompt) {
        String result = null;
        boolean isValid = false;

        while(!isValid) {
            try {
                System.out.print(prompt);
                result = scanner.next();
                LocalDate valDate = LocalDate.parse(result);
                if (valDate.isBefore(LocalDate.now())) {
                    isValid = true;
                } else {
                    System.out.println("Fecha posterior a HOY! Ingrese Fecha nuevamente : ");
                }
            } catch (DateTimeParseException var5) {
                System.out.println("Formato erróneo!(yyyy-mm-dd)");
                isValid = false;
            }
        }

        return result;
    }


}

