/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

/**
 *
 * @author lab1
 */
public class Calculo implements ICalculo{

    @Override
    public float somar(int a, int b) {
        return a+b;
    }

    @Override
    public float subtrair(int a, int b) {
        return a-b;
    }

    @Override
    public float multiplicar(int a, int b) {
        return a*b;
    }

    public float dividir(int a, int b) {
       return a/b; 
    }
    
}
