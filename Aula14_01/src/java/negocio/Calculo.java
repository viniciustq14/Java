/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author lab1
 */
public class Calculo implements ICalculo{

    public Calculo(float n1, float n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    private float n1,n2;
    private float res;
    @Override
    public void somar() {
       res=n1+n2;
    }

    @Override
    public void subtrair() {
        res=n1-n2;
    }

    @Override
    public void multiplicar() {
        res=n1*n2;
    }

    @Override
    public void dividir() {
        res=n1/n2;
    }

    public float getRes() {
        return res;
    }
    
}
