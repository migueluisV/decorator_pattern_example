import java.util.Scanner;

public class App {

    public static Scanner var = new Scanner(System.in);

    public static void seleccionarCafe() {
        char op;
        Beverage bebida = null;

        System.out.println("\nSelecciona un café");
        System.out.println("1) Café Expresso.\n2) Café Americano.\n3) Café Capuccino\n4) Salir.");
        System.out.print("Opción: ");
        op = var.next().charAt(0);

        switch(op) {
            case '1':
                bebida = new Expresso();
                agregarCondimento(bebida);
                break;
            case '2':
                bebida = new Americano();
                agregarCondimento(bebida);
                break;
            case '3':
                bebida = new Capuccino();
                agregarCondimento(bebida);
                break;
            case '4':
                System.exit(0);
                break;
            default:
                System.out.println("Esa opción no está disponible.");
                seleccionarCafe();
        }
    }

    public static void agregarCondimento(Beverage bebida) {
        char op;

        System.out.println("\n¿Desea agregar un condimento?");
        System.out.println("1) Mocha.\n2) Crema batida.\n3) Soya\n4) Regresar.\n5) Continuar a pago.");
        System.out.print("Opción: ");
        op = var.next().charAt(0);

        switch(op) {
            case '1':
                bebida = new Mocha(bebida);
                var.nextLine();
                agregarOtroCondimento(bebida);
                break;
            case '2':
                bebida = new CremaBatida(bebida);
                var.nextLine();
                agregarOtroCondimento(bebida);
                break;
            case '3':
                bebida = new Soya(bebida);
                var.nextLine();
                agregarOtroCondimento(bebida);
                break;
            case '4':
                seleccionarCafe();
                break;
            case '5':
                cuentaCafe(bebida);
                break;
            default:
                System.out.println("Esa opción no está disponible.");
                agregarCondimento(bebida);
        }
    }

    public static void cuentaCafe(Beverage bebida) {
        System.out.println("\nCafé seleccionado: " + bebida.getDescripcion() + ".");
        System.out.println("Total a pagar: $" + bebida.costo() + ".");

        seleccionarCafe();
    }

    public static void agregarOtroCondimento(Beverage bebida) {
        char op;

        System.out.print("\n¿Desea agregar otro? [S / s] [N / n]: ");
        op = var.nextLine().charAt(0);
        if (op == 'S' || op == 's') { 
            agregarCondimento(bebida);
        }
        else {
            cuentaCafe(bebida);
        }
    }

    public static void main(String[] args) throws Exception {
        seleccionarCafe();
    }
}
