package Movimientos;


import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class Robot extends JPanel
{
    private int x;
    private int y;
    private int a,b,c,d,e,f,c1,d1,e1,f1;
    private char dir = 'R';
    
    public Robot()
    {   x=y=0;
    }

    public Robot(int x,int y,char d)
    {   this.x = x;
        this.y = y;
        dir = d;
    }

    public void derecha()
    {  dir='R';
        x+=10;
    }

    public void izquierda()
    {
        dir='L';
        x-=10;
    }

    public void arriba()
    {
        dir='U';
        y-=10;
    }

    public void abajo()
    {
        dir='D';
        y+=10;
    }
    
    public void paint(Graphics g)
    {   
        g.setColor(Color.BLUE);
        if(dir == 'U'||dir == 'D')
        {   b = 100;
            a=50;
            c=x+12;c1=x+38;
            e=e1=5;

            if(dir =='U')
            {  d=d1=y-25;f=f1=25;
            }
            else
            {  d=d1=y+100;f=f1=25;
            }
        }
        else if(dir == 'L'||dir == 'R')
        {   a = 100;
            b= 50;
            d=y+12;d1=y+38;
            f=f1=5;

            if(dir =='L')
            {  c=c1=x-25;e=e1=25;
            }
            else
            {  c=c1=x+100;e=e1=25;
            }   

        }
        g.fillRect(x,y,a,b);
        g.setColor(Color.RED);
        g.fillRect(c,d,e,f);
        g.fillRect(c1,d1,e1,f1);
        repaint();
    }

}