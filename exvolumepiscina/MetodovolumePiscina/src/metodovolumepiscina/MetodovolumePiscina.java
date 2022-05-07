/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodovolumepiscina;

import javax.swing.JOptionPane;

/* Faça um programa que calcule e mostre o volume de uma piscina. Fórmula:
comprimento * largura * profudidade
dados em metros cúbicos
obs 1: não exixtem números negativos
obs 2: o main terá apenas 1 linha de código
 */
public class MetodovolumePiscina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        mostrar(multiplicar( comprimento , largura , profundidade));
        
        
    }
    
    public static int multiplicar( int comprimento , int largura , int profundidade)
    {
       int VolumePiscina;
       
       VolumePiscina = comprimento * largura * profundidade;
       
       return(VolumePiscina);
    }
     public static void mostrar( int VolumePiscina )
    {
        JOptionPane.showMessageDialog(null, "O volume da piscina : " + VolumePiscina );  
    }
     public static void entrada(String largura,String comprimento, String profundidade)
     {
        largura =JOptionPane.showInputDialog("Entre com a largura: ");
        comprimento =JOptionPane.showInputDialog("Entre com o comprimento: ");
        profundidade = JOptionPane.showInputDialog("Entre com a profundidade: ");
     }
     public static int verificacao(int largura, int comprimento, int profundidade, int VolumePiscina)
     {
         if( VolumePiscina< 0)
         {
             JOptionPane.showMessageDialog(null, "Entrada inválida");
         }
         if( largura < 0)
         {
             JOptionPane.showMessageDialog(null, "Entrada inválida");
         }
         if( comprimento < 0)
         {
             JOptionPane.showMessageDialog(null, "Entrada inválida");
         }
         if( profundidade < 0)
         {
             JOptionPane.showMessageDialog(null, "Entrada inválida");
         }
     }
    
}
