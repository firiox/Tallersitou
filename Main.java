import Movimientos.*;
import javax.swing.JFrame;

public class Main
{
    public static void main(String arg[]) throws InterruptedException
    {   JFrame marco = new JFrame("Monitor");
        Robot cop = new Robot(200,200,'R');
        Manejador control = new Manejador(cop);
        marco.add(control);
        marco.setSize(600, 600);
        marco.setResizable(false);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*int i;
        while(true)
        {   for(i=0;i<10;i++)
            {   cop.arriba();
                Thread.sleep(1000);
            }
            for(;i>0;i--)
            {   cop.abajo();
                Thread.sleep(1000);
            }
        }*/

    }

}