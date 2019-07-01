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
public class Retangulo extends Figura{
private float Comprimento,largura;

    public Retangulo(float Comprimento, float largura) {
        this.Comprimento = Comprimento;
        this.largura = largura;
    }

    @Override
    public float calcularArea() {
        return Comprimento*largura;
    }
    
}
