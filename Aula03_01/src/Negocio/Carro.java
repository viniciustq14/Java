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
public class Carro extends Veiculo{
    private int qt_portas;
    public Carro(String nome, String fabricante, int velocidade, int ano,int qt_portas) {
        super(nome, fabricante, velocidade, ano);
        this.qt_portas=qt_portas;
    }
    @Override
    public void Acelerar(){
        if(velocidade<220){
             this.velocidade+=10;
        }
       
    }

    public int getQt_portas() {
        return qt_portas;
    }
}
