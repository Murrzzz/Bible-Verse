/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_prog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Administrator
 */
public class roger extends JFrame
{
    JPanel pane;
    ImageIcon nex =new ImageIcon("bak.jpg");
    JFrame fra=new JFrame();
    ImageIcon img,img1,img2;
    JLabel lab,lab1,lab2;
    ImageIcon roger;
    
    JButton next=new JButton();
   public roger()
   {
       
       
   fra.setSize(600,300);
   fra.setLocationRelativeTo(null);
   fra.setLayout(null);
   
   fra.setUndecorated(true);
   
   fra.setVisible(true);
      
       
   
        
   
        
        
      
        
        nex=new  ImageIcon(getClass().getResource("next.gif"));
        next.setIcon(nex);
        next.setBounds(540,100,50,50);
        next.setBorderPainted(false);
        fra.add(next);
        
        next.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent arg0){
            
             kent Kent = new kent();
             Kent.setVisible(true);
              fra.setVisible(false);             
            }
        
        });
        
        img1=new ImageIcon(getClass().getResource("prof.jpg"));
        lab1=new JLabel(img1);
        lab1.setBounds(50,30,200,250);
        fra.add(lab1); 
        
         
        img2=new ImageIcon(getClass().getResource("roger.gif"));
        lab2=new JLabel(img2);
        lab2.setBounds(300,100,220,55);
        fra.add(lab2); 
          
        img=new ImageIcon(getClass().getResource("gif.gif"));
        lab=new JLabel(img);
        lab.setSize(600,300);
        fra.add(lab);
       
   
   }
    
    
    public static void main(String[] args) {
     new roger();
    }
    
}
