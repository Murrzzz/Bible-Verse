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
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.JPanel;
/**
 *
 * @author Ms D
 */
public class Love extends JFrame
{

    JFrame fra=new JFrame();
    JLabel titl=new JLabel("");
    JButton Back=new JButton("Back");
     JLabel mes=new JLabel();
    private ImageIcon xx;
    private JLabel x; 
      private ImageIcon img;
    private JLabel lab;
     
    public Love()
    {
        fra.setSize(600, 500);
        fra.setLayout(null);
        fra.setLocationRelativeTo(null);
        fra.setUndecorated(true);       
        Font f=new Font("Neoteric",Font.BOLD,25); 

        titl.setBounds(210,-80,400,200);
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
        mes.setText("<html> Psalms 37:4  <br>Take delight in the Lord, and he will give you the desires of your heart.<html> ");
        }
        else if(i==1)
        {
        mes.setText("<html>1 Ecclesiastes 9:9 <br>Enjoy life with the wife whom you love. ");
        }
        else if(i==2)
        {
        mes.setText("<html> Matthew 22:37-39 <br> Jesus replied:\"Love the Lord your God with all your heart<br> and with all your soul and with all your mind.\"<br>This is the first and greatest commandment.  <br>And the second is like it: \"Love your neighbor as yourself.<html> ");
        }
         else if(i==3)
        {
        mes.setText("<html> John 15:13 <br>Greater love has no one than this: to <br>lay down one's life for one's friends.<html> ");
        }
        else if(i==4)
        {
        mes.setText("<html> Genesis 29:20 <br> So Jacob served seven years to get Rachel, but they seemed like only a few days to him because of his love for her.<html> ");
        }
         else if(i==5)
        {
        mes.setText("<html>1 Song of Songs 1:2 <br> Let him kiss me with the kisses of his mouth<br> for your love is more delightful than wine.<html> ");
        }
        else if(i==6)
        {
        mes.setText("<html> 1 Corinthians 13:4-7 <br> Love is patient, love is kind. It does not envy, it does not boast, it is not proud. It does not dishonor others, it is not self-seeking, it is not easily angered, it keeps no record of wrongs. Love does not delight in evil but rejoices with the truth. It always protects, always trusts, always hopes, always perseveres.<html> ");
        }
         else if(i==7)
        {
        mes.setText("<html> Mark 12:33 <br> To love him with all your heart, with all your understanding and with all your strength, and to love your neighbor as yourself is more important than all burnt offerings and sacrifices.<html> ");
        }
        else if(i==8)
        {
        mes.setText("<html> Proverbs 10:12 <br> Hatred stirs up conflict, but love covers over <br>all wrongs.<html> ");
        }
        else if(i==9)
        {
        mes.setText("<html> 1 John 3:18 <br> Dear children, let us not love with words or<br> speech but with actions and in truth.<html> ");
        }
        else if(i==10)
        {
        mes.setText("<html> 1 John 4:12 <br> No one has ever seen God; but if we love one another,<br> God lives in us and his love is made complete in us.<html> ");
        }
        else if(i==11)
        {
        mes.setText("<html> Ephesians 5:1 <br> Follow God's example; therefore, as dearly loved<br> children and walk in the way of love, just as Christ<br> loved us and gave himself up for us as a fragrant <br>offering and sacrifice to God.<html> ");
        }
        else if(i==12)
        {
        mes.setText("<html> 1 John 4:16 <br> And so we know and rely on the love God has<br>for us. God is love. Whoever lives in love lives in God,<br> and God in them.<html> ");
        }
        else if(i==13)
        {
        mes.setText("<html> 1 John 4:19 <br> We love because he first loved us.");
        }
        else if(i==14)
        {
        mes.setText("<html> Genesis 2:18 <br> The Lord God said, “It is not good for the man <br> to be alone.I will make a helper suitable for him.”<html> ");
        }
        else if(i==15)
        {
        mes.setText("<html> 1 Corinthians 13:8 <br> Love never fails. But where there are prophecies,<br> they will cease; where there are tongues,they will<br> be stilled; where there is knowledge, <br>it will pass away.<html> ");
        }
       
         
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
        
            exit.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent arg0)
    {
      
         System.exit(0);
         fra.setVisible(false); 
    }
    });
        
        
         
        fra.setVisible(true);
        fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        JPanel pane =new JPanel();
        pane.setBounds(20,80,550,300);
        pane.setBackground(new Color(255,217,84,100));
        fra.add(pane);
        
        
        
        
        img=new ImageIcon(getClass().getResource("llove.png"));
        lab=new JLabel(img);
        lab.setBounds(-10,-20,600,550);
        fra.add(lab);
        
        
        JPanel pane2 =new JPanel();
        pane2.setSize(600,550);
        pane2.setBackground(new Color(29,31,63));
        fra.add(pane2);
    }
    
    public static void main(String[] args) {
        new Love();
    }
    
}
