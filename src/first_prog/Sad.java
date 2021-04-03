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
public class Sad extends JFrame
    {

    JFrame fra=new JFrame();
    JLabel titl=new JLabel("");
    JButton Back=new JButton("Back");
    JLabel mes=new JLabel();
    private ImageIcon xx;
    private JLabel x;
    
     private ImageIcon img;
    private JLabel lab;
    
    public Sad()
    {
        
        fra.setSize(600, 500);
        fra.setLayout(null);
        fra.setLocationRelativeTo(null);
        Font f=new Font("Neoteric",Font.BOLD,25);       
        
        titl.setBounds(240,-80,200,200);
        
        titl.setFont(f);
        fra.add(titl);
        
        
        
        fra.setUndecorated(true);
        
        
        JButton exit= new JButton();
        xx=new ImageIcon(getClass().getResource("x.gif"));
        exit.setIcon(xx);
        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
        
        exit.setBounds(535,-1,65,55);
        
        fra.add(exit);
        
        int i;
        Random rand=new Random();
        i=rand.nextInt(15);
       
        
        
        
         if(i==0)
        {
        mes.setText("<html> Psalm 51:12 <br> Restore to me the joy of your salvation and grant me a willing spirit, to sustain me. <html>");
        
        }
        else if(i==1)
        {
        mes.setText(" <html> Psalm 126:5 <br> Those who sow with tears will reap with songs of joy. <html>");
        }
        else if(i==2)
        {
        mes.setText("<html> Psalm 126:6 <br> Those who go out weeping carrying seed to sow, <br> will return with songs of joy, carrying sheaves with them. <html>");
        }
         else if(i==3)
        {
        mes.setText("<html> Psalm 28:7 <br> The Lord is my strength and my shield; my heart trusts in him, and he helps me. <br> My heart leaps for joy,and with my song I praise him. <html>");
        }
        else if(i==4)
        {
        mes.setText("<html> Psalm 56:8 <br> Record my misery; list my tears on your scroll(Or misery; / put my tears in your wineskin)<br> — are they not in your record? <html>");
        }
         else if(i==5)
        {
        mes.setText("<html> Joshua 1:9 <br> Have I not commanded you? Be strong and courageous. <br> Do not be afraid; do not be discouraged, <br>  for the Lord your God will be with you wherever you go. <html>");
        }
        else if(i==6)
        {
        mes.setText("<html> Psalm 147:3 <br> He heals the brokenhearted <br> and binds up their wounds <html>");
        }
         else if(i==7)
        {
        mes.setText("<html> Deuterenomy 31:8 <br> The Lord himself goes before you and will be with you; <br> he will never leave you nor forsake you. <br> Do not be afraid; do not be discouraged <html>");
        }
        else if(i==8)
        {
        mes.setText("<html> Matthew 11:28 <br> Come to me, all you who are weary and burdened, and I will give you rest <html>");
        }
        else if(i==9)
        {
        mes.setText("<html>Psalm 23:4 <br>Even though I walk <br>through the darkest valley,[Or the valley of the shadow of death] <br>I will fear no evil, <br> for you are with me;<br>your rod and your staff,<br> they comfort me <html>");
        }
        else if(i==10)
        {
        mes.setText("<html> 2 Corinthians 3:17 <br> Now the Lord is the Spirit, and where the Spirit <br> of the Lord is, there is freedom. <html>");
        }
        else if(i==11)
        {
        mes.setText("<html> Psalm 34:18 <br>The Lord is close to the brokenhearted <br>and saves those who are crushed in spirit. <html>");
        }
        else if(i==12)
        {
        mes.setText("<html> Psalm 34:19 <br> The righteous person may have many troubles, <br>but the Lord delivers him from them all;<html>");
        }
        else if(i==13)
        {
        mes.setText("<html> 1 Thessalonians 4:13 <br>Brothers and sisters, we do not want you to be <br>uninformed about those who sleep in death, <br>so that you do not grieve like the rest of mankind, who have no hope <html>");
        }
        else if(i==14)
        {
        mes.setText("<html> Isaiah 51:12 <br>I, even I, am he who comforts you. <br> Who are you that you fear mere mortals, <br> human beings who are but grass, <html>");
        }
        else if(i==15)
        {
        mes.setText("<html> He gives strength to the weary <br> and increases the power of the weak. <html>");
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
        
        
        
        
        img=new ImageIcon(getClass().getResource("ssad.png"));
        lab=new JLabel(img);
        lab.setBounds(-10,-20,600,550);
        fra.add(lab);
        
        
        JPanel pane2 =new JPanel();
        pane2.setSize(600,550);
        pane2.setBackground(new Color(29,31,63));
        fra.add(pane2);
    }
    
    
    public static void main(String[] args) {
       new Sad();
    
}
}