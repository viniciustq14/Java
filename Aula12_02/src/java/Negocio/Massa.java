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
public class Massa implements IMassa{
   
   
    @Override
    public float converterQuiloParaLibra(float massa) {
      return(float) (massa * 2.2046);
         
    }

    @Override
    public float converterLibraParaQuilo(float massa) {
        return (float) (massa / 2.2046);
    }
    
}
