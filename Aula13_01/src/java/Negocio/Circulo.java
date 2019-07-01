/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author lab1
 */
public class Circulo extends Figura{
    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }
   

    @Override
    public float calcularArea() {
       return  (float) (raio *(Math.pow(3.14,2)));
    }
    
}
