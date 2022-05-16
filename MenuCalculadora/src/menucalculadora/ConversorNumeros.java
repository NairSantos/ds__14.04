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
//ele converte o valor string para int 
public class ConversorNumeros {
       public Integer StringToInt(String num){
            int conversor = Integer.parseInt(num);
            return (conversor);
        }
       //converte o valor string para double
        public Double stringToDouble(String num){
            double conversor = Double.parseDouble(num);
            return (conversor);
        }
}//fim da classe conversornumeros
