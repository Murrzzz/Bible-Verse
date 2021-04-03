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
import javax.swing.JPanel;
/**
 *
 * @author Ms D
 */
public class Angry extends JFrame
{

    JFrame fra=new JFrame();
    JLabel titl=new JLabel("");
    JButton Back=new JButton("Back");
     JLabel mes=new JLabel();
     
    private ImageIcon xx;
    private JLabel x;
      private ImageIcon img;
    private JLabel lab;
     
    public Angry()
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
        mes.setText("<html> Ecclesiastes 7:9 <br> - Do not be quickly provoked in your spirit, for anger resides in the lap of fools.<html>");
        }
        else if(i==1)
        {
        mes.setText("<html> Proverbs 29:22 <br> - An angry person stirs up conflict, and a hot-tempered person commits many sins <html>");
        }
        else if(i==2)
        {
        mes.setText("<html> Ephesians 4:26-27 <br> - In your anger do not sin”[a]: Do not let the sun go down while you are still angry, and do not give the devil a foothold. <html>");
        }
         else if(i==3)
        {
        mes.setText("<html> Psalm 37:8 <br> - Refrain from anger and turn from wrath; do not fret—it leads only to evil.<html>");
        }
        else if(i==4)
        {
        mes.setText("<html> Proverbs 29:11 <br> - Fools give full vent to their rage,<br> but the wise bring calm in the end.<html>");
        }
         else if(i==5)
        {
        mes.setText("<html> Luke 6:28 <br> - bless those who curse you, pray for those who mistreat you <html>");
        }
        else if(i==6)
        {
        mes.setText("<html> Luke 6:27 <br> - But to you who are listening I say:<br> Love your enemies, do good to those who hate you <html>");
        }
         else if(i==7)
        {
        mes.setText("<html> Proverbs 14:17 <br> - A quick-tempered person does foolish things,<br>and the one who devises evil schemes is hated. <html>");
        }
        else if(i==8)
        {
        mes.setText("<html> Proverbs 15:18 <br> - A hot-tempered person stirs up conflict,<br> but the one who is patient calms a quarrel. <html>");
        }
        else if(i==9)
        {
        mes.setText("<html> 1 Timothy 2:8 <br>- Therefore I want the men everywhere to pray,<br> lifting up holy hands without anger or disputing. <html>");
        }
        else if(i==10)
        {
        mes.setText("<html> Colossians 3:8 <br> - But now you must also rid yourselves of all such things as these:<br> anger, rage, malice, slander, and filthy language from your lips. <html>");
        }
        else if(i==11)
        {
        mes.setText("<html> James 1:20 <br> - because human anger does not produce the righteousness that God desires <html>");
        }
        else if(i==12)
        {
        mes.setText("<html> Jonah 4:4 <br> - But the Lord replied, <br>“Is it right for you to be angry? <html>");
        }
        else if(i==13)
        {
        mes.setText("<html> James 1:19 <br> - My dear brothers and sisters, take note of this:<br> Everyone should be quick to listen, slow to speak and slow to become angry, <html>");
        }
        else if(i==14)
        {
        mes.setText("<html> Proverbs 15:1 <br> - A gentle answer turns away wrath, <vr>but a harsh word stirs up anger. <html>");
        }
        else if(i==15)
        {
        mes.setText("<html> James 4:2 <br>- You desire but do not have, so you kill.<br> You covet but you cannot get what you want, so you quarrel and fight. You do not have because you do not ask God. <html>");
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
        
        
        
        
        img=new ImageIcon(getClass().getResource("aangry.png"));
        lab=new JLabel(img);
        lab.setBounds(-10,-20,600,550);
        fra.add(lab);
        
        
        JPanel pane2 =new JPanel();
        pane2.setSize(600,550);
        pane2.setBackground(new Color(29,31,63));
        fra.add(pane2);
    }
    
    public static void main(String[] args) {
        new Angry();
    }
    
}
