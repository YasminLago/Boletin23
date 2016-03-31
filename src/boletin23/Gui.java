package boletin23;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author ylagorebollar
 */
public class Gui {
    public void ventana(){
        JFrame marco = new JFrame("Boletin 23");
            marco.setLayout(null);
            marco.setSize(800,800);
            
        //Panel1
        JPanel panel1 = new JPanel();
            panel1.setBounds(0, 0, 320, 320);
            
        //Elementos panel1
        JLabel etiquetaNome = new JLabel("Nome");
            etiquetaNome.setSize(50,50);
        JLabel etiquetaPass = new JLabel("Password");
            etiquetaPass.setSize(50,50);
        JTextField casillaNome = new JTextField(10);
            casillaNome.setSize(50,50);
        JPasswordField contrasinal = new JPasswordField(10);
            contrasinal.setSize(50,50);
        JButton premer = new JButton("Premer");
            premer.setSize(50,50);
        JButton limpar = new JButton("Limpar");
            limpar.setSize(50,50);
            
        //Panel2    
        JPanel panel2 = new JPanel();
            panel2.setBounds(0, 40, 100, 100);
        //Elementos panel2    
        JButton boton = new JButton("Boton");
            boton.setSize(10,10);
        String [] lista ={"ElementoLista1","ElementoLista2","ElementoLista3","ElementoLista4"};
        JList l = new JList(lista);
        JTextArea area = new JTextArea("Area texto",5,15);
        
        //Layout panel1
        panel1.setLayout(new GridLayout(3,2));
        //FlowLayout dis = new FlowLayout(FlowLayout.RIGHT,3,2);
            //panel1.setLayout(dis);
            panel1.add(etiquetaNome);
            panel1.add(casillaNome);
            panel1.add(etiquetaPass);
            panel1.add(contrasinal);
            panel1.add(premer);
            panel1.add(limpar);
            
        
        //Layout panel2
        //FlowLayout dis2 = new FlowLayout(FlowLayout.RIGHT,4,5);
          //  panel2.setLayout(dis2);    
            panel2.setLayout(new GridLayout(1,3));
            
            panel2.add(area);
            panel2.add(boton);
            panel2.add(l);
            
            
            
            marco.add(panel1);
            marco.add(panel2);
            marco.setLocationRelativeTo(null);           
            marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            marco.setVisible(true);
    }
}
