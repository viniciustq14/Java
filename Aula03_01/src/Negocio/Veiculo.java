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
public class Veiculo {
    protected String nome,fabricante;
    protected int velocidade,ano;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getAno() {
        return ano;
    }

    public Veiculo(String nome, String fabricante, int velocidade, int ano) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.velocidade = velocidade;
        this.ano = ano;
    }
    
    public void Acelerar(){
        if(velocidade<220){
             this.velocidade+=5;
        }
       
    }
     public void Desacelerar(){
         if(velocidade>4){
             this.velocidade-=5;
         }
    }
      public void Parar(){
        this.velocidade=0;
    }
}
