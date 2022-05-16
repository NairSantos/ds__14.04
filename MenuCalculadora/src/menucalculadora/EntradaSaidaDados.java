/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menucalculadora;
import javax.swing.JOptionPane;
/**
 *
 * @author Bruno
 */
public class EntradaSaidaDados {
    //pega a mensagem de entrada e retorna o valor digitado e atribui a variavel
      public String entradaDados (String mensagemEntrada){
        return JOptionPane.showInputDialog(mensagemEntrada);
    }
      //exibição da mensagem 
    public void saidaDados(String mensagemSaida){
        JOptionPane.showMessageDialog(null, mensagemSaida);
        
    }
}//fim da classe entradasaidadados
