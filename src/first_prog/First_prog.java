/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_prog;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;



public class First_prog extends JFrame
    {

    JFrame fr =new JFrame("INSPIRATIONAL PROGRAM");
    JButton start=new JButton("START");
    JLabel samp=new JLabel("roger moore sangol");
    
    private ImageIcon img;
    private JLabel lab;
    
    
    /**
     *
     */
    public First_prog()
    {
       
        
        fr.setSize(400, 300);
        fr.setLayout(null);
        fr.setLocationRelativeTo(null);
        Font f=new Font("Arial",Font.PLAIN,20);
        
        
        
        JLabel tit=new JLabel("WELCOME TO THE PROGARM");
        tit.setBounds(40,-80,300,200);
        
        fr.add(tit);
        tit.setFont(f);
        tit.setForeground(new Color(255,255,255));
        
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        start.setBounds(140,100,100,30);
        fr.add(start);

        
         setLayout(new FlowLayout());
        
        img=new ImageIcon(getClass().getResource("aa.jpg"));
        lab=new JLabel(img);
        fr.add(lab);
        lab.setSize(400,300);
        
        
        
          start.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent arg0)
    {
      
         JOptionPane.showMessageDialog(null,"WELCOME TO THE PROGRAM" ); 
         NEW Fram=new NEW();
         Fram.setVisible(true);
    }
    });
        
        
    }
    
    
  
    
    public void frame()
    {

      
        
    }
    
    
    public static void main(String[] args) {
     new First_prog();
        
 
    }
    
    
    
    
    
}
