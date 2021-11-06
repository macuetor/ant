package com.ieseljust.edd.calc;

public class Calculadora{
    private float lastResult; // ultimo resultado
    private String lastOp;  // ultima operacion realizada
    
    public float getLastResult(){
        return this.lastResult;
    }

    public String getLastOp(){
        return this.lastOp;
    }

    public float suma(float a, float b){
        this.lastResult = a + b;
        this.lastOp = "Suma";
        return this.lastResult;
    }

    public float resta(float a, float b){
        this.lastResult = a - b;
        this.lastOp = "Resta";
        return this.lastResult;
    }

    public float multiplicacion(float a, float b){
        this.lastResult = a * b;
        this.lastOp = "Multiplicacion";
        return this.lastResult;
    }

    public float division(float a, float b){
        this.lastResult = a / b;
        this.lastOp = "Division";
        return this.lastResult;
    }
}
