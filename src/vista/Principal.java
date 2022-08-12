package vista;

import java.util.Scanner;
import logica.OperacionesNumericas;
import logica.SistemaNumerico;

/**
 *
 * @author Vinni
 */
public class Principal {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sigue = 1;
        do {
            System.out.println("MI PROGRAMA SISTEMAS NUMERICOS");
            System.out.println("Convertir desde el sistemas de origen: ");
            imprimirOpciones(-1);
            System.out.print("Digite opcion -> ");
            int opcionO = sc.nextInt();

            System.out.println("Converir al sistema de destino: ");
            imprimirOpciones(opcionO);
            System.out.print("Digite opcion -> ");
            int opcionD = sc.nextInt();
            String numero;
            System.out.print("Digite el numero a convertir -> ");
            numero = sc.next();
            procesar(opcionO, opcionD, numero);
            System.out.print("Continuar: 1 -> SI      2 -> No ");
            sigue = sc.nextInt();
        } while (sigue == 1);
    }

    private static void imprimirOpciones(int opcExcluir) {
        String opciones[] = {"1. Binario", "2. Octal", "3. Decimal", "4. Hexadecimal"};

        for (int i = 0; i < opciones.length; i++) {
            if ((opcExcluir - 1) != i) {
                System.out.println(opciones[i]);
            }

        }
    }

    private static void procesar(int opcionO, int opcionD, String numero) {
        OperacionesNumericas oper = new OperacionesNumericas();
        String resultado = "";
        if (opcionO == SistemaNumerico.Binario.getCodigo()) {
            if (opcionD == SistemaNumerico.Octal.getCodigo()) {
                resultado = oper.convertirBinarioOctal(numero);
            }
            if (opcionD == SistemaNumerico.Decimal.getCodigo()) {
                resultado = oper.converirBinarioToDecimal(numero);
            }
            if (opcionD == SistemaNumerico.Hexadecimal.getCodigo()) {
                resultado = oper.convertirBinarioHexa(numero);
            }
        }
        if (opcionO == SistemaNumerico.Octal.getCodigo()) {
            if (opcionD == SistemaNumerico.Binario.getCodigo()) {

            }
            if (opcionD == SistemaNumerico.Decimal.getCodigo()) {
                resultado = oper.converirOctalToDecimal(numero);
            }
            if (opcionD == SistemaNumerico.Hexadecimal.getCodigo()) {

            }
        }
        if (opcionO == SistemaNumerico.Decimal.getCodigo()) {
            if (opcionD == SistemaNumerico.Binario.getCodigo()) {
                resultado = oper.convertirDecBinario(numero);
            }
            if (opcionD == SistemaNumerico.Octal.getCodigo()) {
                resultado = oper.convertirDecOctal(numero);
            }
            if (opcionD == SistemaNumerico.Hexadecimal.getCodigo()) {
                resultado = oper.convertirDecHexadecimal(numero);
            }
        }
        if (opcionO == SistemaNumerico.Hexadecimal.getCodigo()) {
            if (opcionD == SistemaNumerico.Binario.getCodigo()) {

            }
            if (opcionD == SistemaNumerico.Octal.getCodigo()) {

            }
            if (opcionD == SistemaNumerico.Decimal.getCodigo()) {
                resultado = oper.converirHexaToDecimal(numero);
            }
        }
        System.out.println("El resultado de convertir " + numero + " es : " + resultado);
    }

}
