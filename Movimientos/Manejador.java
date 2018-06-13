package Movimientos;
 import java.awt.Color;
 import java.awt.Graphics;
 import java.awt.event.*;
 import java.awt.KeyEventDispatcher;
 import javax.swing.JPanel;
 
 public class Manejador extends JPanel implements KeyListener,ActionListener
 {  private Robot robo;
    public Manejador(Robot cop)
    {   robo = cop;
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }
     public void actionPerformed(ActionEvent e)
    {      
    }

    public void keyPressed(KeyEvent e)
    {  
        if(e.getKeyCode() == KeyEvent.VK_UP)
        {   robo.arriba();
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN)
        {   robo.abajo();
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT)
        {   robo.derecha();
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT)
        {   robo.izquierda();
        }
              
    }

    public void keyReleased(KeyEvent e)
    {
    }

    public void keyTyped(KeyEvent e) 
    {  
    }
    
    public void paintComponent(Graphics g)
    {   super.paintComponent(g);
        g.setColor(Color.white);
        g.fillRect(0,0,600,600);
        robo.paint(g);
        repaint();
    }
     
 }