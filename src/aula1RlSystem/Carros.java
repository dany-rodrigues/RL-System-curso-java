package aula1RlSystem;
 
import javax.swing.JOptionPane;
 
public class Carros {
   
    //Atributos da classe carro
   
    public String marca;
    public int ano;
    private int marcha = 0;
    public boolean ligado;
    public int velocidade;
    public boolean freio = true;
   
   
   
    //M�todos
   
    public void ligar() {
 
            if (this.ligado == false) {
               
            this.ligado = true;
            JOptionPane.showMessageDialog(null,"Carro ligado");//interface
        }else {
            System.out.println("Carro já está ligado.");//cai no console
        }
    }
   
   
    public void desligar() {
       
        if(this.ligado == true) {
            this.ligado = false;
        JOptionPane.showMessageDialog(null,"Carro desligado");
    }else {
       
        System.out.println("Carro já está desligado.");
    }
   
    }
   
    public void acelerar (int velocidade) {
       
       
        if(this.ligado == true) {
            if(this.freio == false) {
               
                if(this.marcha == 0) {
                    JOptionPane.showMessageDialog(null,"Carro est� em ponto morto!");
                } else if(this.marcha == 1) {
                    if (velocidade < 30) {
                    this.velocidade = velocidade;
                     System.out.println(this.velocidade);
                    }
                    else if(this.marcha == 2) {
                        if (velocidade < 50) {
                        this.velocidade = velocidade;
                         System.out.println(this.velocidade);
                        }
                        else if(this.marcha == 3) {
                            if (velocidade < 80) {
                            this.velocidade = velocidade;
                             System.out.println(this.velocidade);
                            }
                       
                    }              
               
                }              
            }
           
        }
        }
 
    }
   
    public void trocarMarcha() {
        this.marcha = this.marcha + 1; //encapsulamento
    }
}