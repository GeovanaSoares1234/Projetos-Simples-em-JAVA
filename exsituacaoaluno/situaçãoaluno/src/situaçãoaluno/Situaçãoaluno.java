/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package situaçãoaluno;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Situaçãoaluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaração de variavel
        
        String snomealuno;
        String ssituacaoaluno;
        
        Double dmediafinal;
        Double dfrequencia;
        
        snomealuno  = JOptionPane.showInputDialog("entre com o nome do aluno(a)");
        
        dmediafinal = Double.parseDouble(JOptionPane.showInputDialog(" entre com a média final do aluno(a) " ));
        
        dfrequencia = Double.parseDouble(JOptionPane.showInputDialog(" entre com a frequencia do aluno(a) " ));
        
        if (dmediafinal >= 5 && dfrequencia >=75 )
        {
            ssituacaoaluno = " APROVADO (A) ";
        }
            else if (dmediafinal >=5 && dfrequencia <75) 
            {
              ssituacaoaluno =  " RECUPERAÇÃO "; 
            }
                else if (dmediafinal <=5 && dfrequencia >=75)
                {
                ssituacaoaluno = " EXAME ";
                }
                 else
                {
                  ssituacaoaluno= " REPROVADO(A) ";  
                }
        JOptionPane.showMessageDialog(null, " \naluno(a): " + snomealuno + " \nMédia final: " + dmediafinal + " \nFrequência: " + dfrequencia + " \nSituação: " + ssituacaoaluno);
        
        System.exit(0);
    }
    
}
