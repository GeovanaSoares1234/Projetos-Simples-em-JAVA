package Excecoes;
import javax.swing.JOptionPane;

public class MyException extends Exception
{
    private String mensagem;

    public MyException() 
    {
        //Método Construtor Abstrato Vazio
    }
    
    public MyException(String mensagem)
    {
        this.mensagem = mensagem;
        JOptionPane.showMessageDialog(null, "Ocorreu um erro do tipo " + this.mensagem, "Erro", 0);
    }

    public String getMensagem() 
    {
        return mensagem;
    }

    public void setMensagem(String mensagem) 
    {
        this.mensagem = mensagem;
    }    
}
