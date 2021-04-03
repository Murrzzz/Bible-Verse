/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_prog;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.*;

/**
 *
 * @author Administrator
 */
public class NewMain extends JFrame
{
    ImageIcon star =new ImageIcon("play.png");
    ImageIcon nex =new ImageIcon("bak.jpg");
    ImageIcon ex;
    JFrame fra=new JFrame();
    ImageIcon img;
    JLabel lab;
    JButton start =new JButton(star);
    JButton next=new JButton();
    JButton ext=new JButton();
    JLabel lab1 =new JLabel("START");
   public NewMain()
   {
       
       
   fra.setSize(600,300);
   fra.setLocationRelativeTo(null);
   fra.setLayout(null);
   
   fra.setUndecorated(true);
   
   fra.setVisible(true);
      
        
   
   
        start.setBorderPainted(false);
        start.setBorder(null);
        
        
        star=new  ImageIcon(getClass().getResource("START.gif"));
        start.setIcon(star);
        start.setBounds(50,50,158,55);
        fra.add(start);
        
        nex=new  ImageIcon(getClass().getResource("CREDS.gif"));
        next.setIcon(nex);
        next.setForeground(new Color(0,0,0));
        next.setBounds(50,130,220,55);
        next.setBorderPainted(false);
        fra.add(next);
        
        
        ex=new  ImageIcon(getClass().getResource("exit.gif"));
        ext.setIcon(ex);
        ext.setForeground(new Color(0,0,0));
        ext.setBounds(50,210,158,55);
        ext.setBorderPainted(false);
        fra.add(ext);
        
        
         start.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent arg0)
    {
      
         JOptionPane.showMessageDialog(null,"WELCOME TO THE PROGRAM" ); 
         NEW Fram=new NEW();
         Fram.setVisible(true);
         fra.setVisible(false);
         
        // fra.dispatchEvent(new WindowEvent(fra, WindowEvent.WINDOW_CLOSING));
    }
    });
       
         
         next.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent arg0)
    {
      
         roger rOger=new roger();
         
         rOger.setVisible(true);
        fra.setVisible(false); 
       
    }
    });
         
       ext.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent arg0)
    {
      
         System.exit(0);
         fra.setVisible(false); 
    }
    });
          
          
        img=new ImageIcon(getClass().getResource("gif.gif"));
        lab=new JLabel(img);
        lab.setSize(600,300);
        fra.add(lab);
       
   
   }
    
    
    public static void main(String[] args) {
     new NewMain();
    }
    
}
