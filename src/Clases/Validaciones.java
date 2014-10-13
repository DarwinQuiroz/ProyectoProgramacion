package Clases;

import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
/**
 *
 * @author Darwin
 */
public class Validaciones extends PlainDocument
{
    @Override
    public void insertString(int Offset, String Str, AttributeSet Atrr) throws BadLocationException
    {
        super.insertString(Offset, Str.toUpperCase(), Atrr);
    }
    
    public static void SoloNumeros(JTextField CajaTexto)
    {
        CajaTexto.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyTyped(KeyEvent e)
            {
                char c = e.getKeyChar();
                if(!Character.isDigit(c))
                {
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        });
    }
    
    public static void SoloLetras(JTextField CajaTexto)
    {
        CajaTexto.addKeyListener(new KeyAdapter() 
        {
            @Override
            public void keyTyped(KeyEvent e)
            {
                char c = e.getKeyChar();
                if(Character.isDigit(c))
                {
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();;
                }
            }
        });
    }
    
    public static void CantidadCaracteres(final JTextField CajaTexto, final int Limite)
    {
        CajaTexto.addKeyListener(new KeyAdapter() 
        {
            @Override
            public void keyTyped(KeyEvent e)
            {
                if(CajaTexto.getText().length() == Limite)
                {
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                }
            }
            @Override
            public void keyPressed(KeyEvent arg0) 
            {
            }
            @Override
            public void keyReleased(KeyEvent arg0) 
            {
            }
        });
    }
}
