/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_prog;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;
/**
 *
 * @author Ms D
 */
public class Happy extends JFrame
{

    JFrame fra=new JFrame();
    JButton Back=new JButton("Back");
    JLabel titl=new JLabel("");
    JLabel mes=new JLabel();
    
    private ImageIcon xx;
    private JLabel x;
     private ImageIcon img;
    private JLabel lab;
    
    public Happy()
    {
        fra.setSize(600, 500);
        fra.setLayout(null);
        fra.setLocationRelativeTo(null);
        Font f=new Font("Neoteric",Font.BOLD,25);       
        
        fra.setUndecorated(true);
        
        
        titl.setBounds(240,-80,200,200);
        
        titl.setFont(f);
        fra.add(titl);
        
        
        JButton exit= new JButton();
        xx=new ImageIcon(getClass().getResource("x.gif"));
        exit.setIcon(xx);
        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
        
        exit.setBounds(535,-1,65,55);
        
        fra.add(exit);
        
         Random rand=new Random();
        int i= rand.nextInt(15);
       
        
        
        
        if(i==0)
        {
        mes.setText("<html>1 Thessalonians 5:16 <br>Rejoice in the Lord<html>");
        }
        else if(i==1)
        {
        mes.setText("<html>Psalm 37:4 <br>Take delight in the Lord, and He will give you the desires of your heart.<html>");
        }
        else if(i==2)
        {
        mes.setText("<html>Philippians 4:4 <br> Rejoice in the Lord always. I will say it again: Rejoice!<html>");
        }
         else if(i==3)
        {
        mes.setText("<html>Ecclesiastes 3:12 <br> I know that there is nothing better for people <br> than to be happy and to do good while they live.<html>");
        }
        else if(i==4)
        {
        mes.setText("<html>1 Peter 4:13 <br> But rejoice in as much as you participate in the sufferings of Christ,<br> so that you may be overjoyed when his glory is revealed.<html>");
        }
         else if(i==5)
        {
        mes.setText("<html>1 Peter 1:6 <br>In all this you greatly rejoice, though now for a little <br> while you may have had to suffer grief in all kinds of trials.<html>");
        }
        else if(i==6)
        {
        mes.setText("<html>James 5:13 <br> Is anyone among you in trouble? Let them pray. <br> Is anyone happy? Let them sing songs of praise.<html>");
        }
         else if(i==7)
        {
        mes.setText("<html>Luke 10:20 <br> However, do not rejoice that the spirits submit to you, <br> but rejoice that your names are written in heaven.<html>");
        }
        else if(i==8)
        {
        mes.setText("<html>Psalm 126:5 <br> Those who sow with tears will reap with songs of joy.<html>");
        }
        else if(i==9)
        {
        mes.setText("<html>Nehemiah 8:10 <br>Nehemiah said, “Go and enjoy choice food and sweet drinks,<br> and send some to those who have nothing prepared. This day is holy to our Lord.<br>Do not grieve, for the joy of the Lord is your strength.<html>");
        }
        else if(i==10)
        {
        mes.setText("<html>Proverbs 15:13 <br> A happy heart makes the face cheerful, but heartache crushes the spirit.<html>");
        }
        else if(i==11)
        {
        mes.setText("<html>Psalm 94:19 <br>When anxiety was great within me,<br>your consolation brought me joy.<html>");
        }
        else if(i==12)
        {
        mes.setText("<html>Psalm 34:8 <br>Taste and see that the Lord is good;<br>blessed is the one who takes refuge in him.<hmtl>");
        }
        else if(i==13)
        {
        mes.setText("<html>James 1:2-3 <br>2 Consider it pure joy, my brothers and sisters,[a] <br>whenever you face trials of many kinds, <br>because you know that the testing of your faith produces perseverance.<html>");
        }
        else if(i==14)
        {
        mes.setText("<html>Psalm 16:11 <br>You make known to me the path of life;<br>you will fill me with joy in your presence,<br>with eternal pleasures at your right hand.<html>");
        }
        else if(i==15)
        {
        mes.setText("<html>Psalm 34:5 <br> Those who look to him are radiant;<br> their faces are never covered with shame.<html>");
        }
       
        mes.setPreferredSize(new Dimension(650,250));
        mes.setFont(f);
        mes.setBounds(50,100,500,260);
         fra.add(mes);
        
         ImageIcon back=new ImageIcon();
       back=new  ImageIcon(getClass().getResource("BAC.gif"));
        Back.setIcon(back);
        Back.setForeground(new Color(0,0,0));
        Back.setBounds(180,350,210,55);
        Back.setBorderPainted(false);
        fra.add(Back);
         
        
        
        Back.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent arg0){
            
              NEW first=new NEW();
              
              first.setVisible(true);
              fra.setVisible(false);             
            }
        
        });
        
        
        fra.setVisible(true);
        fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        JPanel pane =new JPanel();
        pane.setBounds(20,80,550,300);
        pane.setBackground(new Color(255,217,84,100));
        fra.add(pane);
        
        
            exit.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent arg0)
    {
      
         System.exit(0);
         fra.setVisible(false); 
    }
    });
        
        
        img=new ImageIcon(getClass().getResource("hhapy.png"));
        lab=new JLabel(img);
        lab.setBounds(-10,-20,600,550);
        fra.add(lab);
        
        
        JPanel pane2 =new JPanel();
        pane2.setSize(600,550);
        pane2.setBackground(new Color(29,31,63));
        fra.add(pane2);
    }
    
    
    
    public static void main(String[] args) {
        new Happy();
    }
}