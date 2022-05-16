/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menucalculadora;

/**
 *
 * @author Bruno
 */
//declarando classe principal
public class Principal {
    //pacote de nucleo de java
    public static void main(String[] args){
        //instancia e chama o metodo menu calculadora
        MenuCalculadora menu = new MenuCalculadora();
        menu.executarCalculadora();
    }
}//fim da classe principal
