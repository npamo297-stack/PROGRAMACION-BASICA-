import java.util.Scanner;
public class Nombreporconsola {

    public static void main(String[] args) {
        // LA VARIABLE SCANNNER PERMITE INTERPRETAR LO QUE EL USUARIO INGRESA
        var scanner = new Scanner (System.in);
        //permite mostrar informacion en la consola
        System.out.println("Dame tu nombre: ");
        // la variable nombre guarda la informacion que el usuario ingreso y escanner.nextLine pasa esa informacion a string
        var nombre = scanner.nextLine();
        System.out.println("Elnombre del jugador es: +nombre");
    }

}
