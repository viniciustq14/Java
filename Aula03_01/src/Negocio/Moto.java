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
public class Moto extends Veiculo{
    private boolean apoioAdicionado;
    public Moto(String nome, String fabricante, int velocidade, int ano) {
        super(nome, fabricante, velocidade, ano);
    }
    public void Apoio(){
        if(velocidade>0){
            apoioAdicionado=false;
        }
        else{
            apoioAdicionado=true;
        }
    }

    public boolean isApoioAdicionado() {
        return apoioAdicionado;
    }
    
}
