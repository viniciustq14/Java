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
public class Tempo {
    protected int qt;

    public Tempo(int qt) {
        this.qt = qt;
    }
    public void incrementar(){
        qt++;
    }
     public void decrementar(){
        qt--;
    }
    public void setQt(int qt) {
        this.qt = qt;
    }

    public int getQt() {
        return qt;
    }
}
