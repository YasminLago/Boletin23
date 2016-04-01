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
            marco.setSize(340, 500);
            
        //Panel1
        JPanel panel1 = new JPanel();
            panel1.setSize(340, 250);
            panel1.setLayout(null);
            
        //Elementos panel1
        JLabel etiquetaNome = new JLabel("Nome");
            etiquetaNome.setBounds(50, 10, 150, 100);
        JLabel etiquetaPass = new JLabel("Password");
            etiquetaPass.setBounds(50, 85, 150, 100);
        JTextField casillaNome = new JTextField(10);
            casillaNome.setBounds(150, 50, 100, 30);
        JPasswordField contrasinal = new JPasswordField(10);
            contrasinal.setBounds(150, 125, 100, 30);
        JButton premer = new JButton("Premer");
            premer.setBounds(50, 210, 85, 30);
        JButton limpar = new JButton("Limpar");
            limpar.setBounds(150, 210, 85, 30);
            
        //Panel2    
        JPanel panel2 = new JPanel();
            panel2.setSize(340,250);
            panel2.setLayout(null);
            
        //Elementos panel2    
        JButton boton = new JButton("Boton");
            boton.setBounds(150, 340, 85, 35);
        String [] lista ={
            "ElementoLista1",
            "ElementoLista2",
            "ElementoLista3",
            "ElementoLista4"
        };
        JList l = new JList(lista);
            l.setBounds(30, 340, 110, 50);
        JTextArea area = new JTextArea("Area texto",5,15);
            area.setBounds(250, 340, 80, 40);
            
        
        
            panel1.add(etiquetaNome);
            panel1.add(casillaNome);
            panel1.add(etiquetaPass);
            panel1.add(contrasinal);
            panel1.add(premer);
            panel1.add(limpar);
            
        
        
           
         
            
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
