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
//
public class MenuCalculadora {
     //privates ficam ocultos para outras classes
    //metodo chamando a class calculadora, conversornumeros e a entradasaidadados
     private Calculadora calculadora;
     private int opcao;
     private ConversorNumeros conversor;
     private EntradaSaidaDados io;
     
     //passagem de referencia por uma instancia
     public MenuCalculadora(){
         this.calculadora = new Calculadora();
         this.opcao = -1;
         this.conversor = new ConversorNumeros();
         this.io = new EntradaSaidaDados ();
     }
     
     //chama e executa o menu principal
     public void executarCalculadora(){
         do{
             this.executarMenuPrincipal();
             this.avaliarOpcaoEscolhida();
         }while(this.opcao!=0);
     }
     
     //escolha o tipo de opção a ser realizada
     private void executarMenuPrincipal(){
         String mensagemMenu = "Selecione uma opção"
                 +"\n 1 - Somar"
                 +"\n 2 - Subtrair"
                 +"\n 3 - Multiplicar"
                 +"\n 4 - Dividir"
                 +"\n 5 - Sair";
         String entradaDados = io.entradaDados(mensagemMenu);
         this.opcao = conversor.StringToInt(entradaDados);
     }
     
     //ele pega os dados e armazena na class entradasaidadados num1 e num2
     public void avaliarOpcaoEscolhida(){
         String saida;
         double num1=0, num2=0;
         if(this.opcao != 0 && this.opcao<=4){
           String mensagemEntrada = "Digite o 1º numero";
           num1 = conversor.stringToDouble(io.entradaDados(mensagemEntrada));
           calculadora.setNumero01(num1);
           mensagemEntrada = "Digite o 2º numero";
           num2 = conversor.stringToDouble(io.entradaDados(mensagemEntrada));
           calculadora.setNumero02(num2);
         }
     
        //ele analisa o objeto opção e executa
         switch(this.opcao){
             case 1:
                 calculadora.somar(num1,num2);
                 saida = "Resultado da soma: " + calculadora.getResultado();
                 io.saidaDados(saida);
             break;
             
             case 2:
                 calculadora.subtrair(num1,num2);
                 saida = "Resultado da subtração: " + calculadora.getResultado();
                 io.saidaDados(saida);
             break;
             
             case 3:
                 calculadora.multiplicar(num1,num2);
                 saida = "Resultado da multiplicação: " + calculadora.getResultado();
                 io.saidaDados(saida);
             break;
             
             case 4:
                 calculadora.dividir(num1,num2);
                 saida = "Resultado da divisão: " + calculadora.getResultado();
                 io.saidaDados(saida);
             break;
             
             case 5:
                 calculadora.sair();
             default:
                 io.saidaDados("Opção inválida");
                 break;
         }
}
}//fim da classe menucalculadora
