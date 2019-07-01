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
public class Horario {
    private Hora hr;
    private Minuto min;

    public Horario(int hr, int min) {
        this.hr = new Hora(hr);
        this.min = new Minuto(min);
    }

    public void Mostrar(){
        System.out.println(hr.getQt()+":"+min.getQt()); 
    }
     public void IncrementerMin(){
         min.incrementar();
         if(min.getQt()==60){
             hr.incrementar();
             min.setQt(00);
         }
     }
      public void IncrementerHH(){
         hr.incrementar();
         if(hr.getQt()==24){
            hr.setQt(00);
         }
     }
      public void DecrementerMin(){
         min.decrementar();
         if(min.getQt()==00){
             hr.decrementar();
             min.setQt(59);
         }
     }
      public void DecrementerHr(){
         hr.decrementar();
         if(hr.getQt()==00){
            hr.setQt(23);
         }
     }
    
     
}
