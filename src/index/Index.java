package index;

import java.util.Scanner;

public class Index {

    private static void printMain() {
        System.out.println("Index");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opcion: ");
    }

    public static void indexMenu() {
        int op;
        Scanner sc = new Scanner(System.in);

        do {
            printMain();
            op = sc.nextInt();
            switch (op) {
                case 1:
                    makeOp("SUMA");
                    break;
                case 2:
                    makeOp("RESTA");
                    break;
                case 3:
                    makeOp("MULTIPLICACION");
                    break;
                case 4:
                    makeOp("DIVISION");
                    break;
                case 0:
                    System.out.println("alaos");
                    break;
                default:
                    System.out.println("Mal alli");
                    break;
            }
        } while (op != 0);
    }

    private static void makeOp(String t) {
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.println(t);
        System.out.println("Ingresar primer valor: ");
        int a = sc.nextInt();
        System.out.println("Ingresar segundo valor: ");
        int b = sc.nextInt();

        switch (t) {
            case "SUMA":
                r = a + b;
                break;
            case "RESTA":
                r = a - b;
                break;
            case "MULTIPLICACION":
                r = a * b;
                break;
            case "DIVISION":
                r = a / b;
                break;
            default:
                r = Integer.valueOf(null);
                break;
        }
        System.out.println("RESULTADO: " + r);
    }
}
