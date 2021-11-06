package com.ieseljust.edd.calc;
import com.ieseljust.edd.calc.Calculadora;

public class Calcula {
    private static float operando1;
    private static float operando2;

    public static void main(String[] args){
        if (args.length != 2){
            System.out.println("Uso: java Calcula <operando1> <operando2>");
            System.exit(-1);
        }
        operando1 = Float.parseFloat(args[0]);
        operando2 = Float.parseFloat(args[1]);

        Calculadora myCalc = new Calculadora();
        System.out.println("Suma: " + myCalc.suma(operando1, operando2));
        System.out.println("Resta: " + myCalc.resta(operando1, operando2));
        System.out.println("Multiplicacion: " + myCalc.multiplicacion(operando1, operando2));
        System.out.println("Division: " + myCalc.division(operando1, operando2));
        System.out.println("Última operación realizada:" + myCalc.getLastOp());
        System.out.println("Último resultado: " + myCalc.getLastResult());

    }
}
