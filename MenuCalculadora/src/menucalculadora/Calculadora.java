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
public class Calculadora {
    private double numero01;
    private double numero02;
    private double resultado;
    
    //passagem de referencia
    public Calculadora(){
        this(0,0,0);
    }
    
    
    public Calculadora(double numero01,double numero02,double resultado){
        this.numero01 = numero01;
        this.numero02 = numero02;
        this.resultado = resultado;
    }
    
    //encapsulamento get e set
    public double getNumero01() {
        return numero01;
    }
    public void setNumero01(double numero01){
        this.numero01 = numero01;
    }
    
    
    public double getNumero02() {
        return numero02;
    }
    public void setNumero02(double numero02){
        this.numero02 = numero02;
    }
    
    
    public double getResultado() {
        return resultado;
    }
    public void setResultado(double resultado){
        this.resultado = resultado;
    }
    
    //recebe como passagem de parametro e recebe o calculo dos metodos
    public void somar(double numero01, double numero02){
        setResultado(this.getNumero01()+ this.getNumero02());
    }
    
     public void subtrair(double numero01, double numero02){
        setResultado(this.getNumero01()- this.getNumero02());
    }
     
      public void multiplicar(double numero01, double numero02){
        setResultado(this.getNumero01()* this.getNumero02());
    }
      
       public void dividir(double numero01, double numero02){
        setResultado(this.getNumero01()/ this.getNumero02());
    }
       
       public void sair(){
           System.exit(0);
       }
}//fim da classe calculadora
