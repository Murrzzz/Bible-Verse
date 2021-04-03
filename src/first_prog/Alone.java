/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_prog;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Random;
import javax.swing.*;
/**
 *
 * @author Ms D
 */
public class Alone extends JFrame
{

    JFrame fra=new JFrame();
    JLabel titl=new JLabel("");
    JButton Back=new JButton("Back");
     JLabel mes=new JLabel();
    private ImageIcon xx;
    private JLabel x; 
     
      private ImageIcon img;
    private JLabel lab;
     
     
    public Alone()
    {
        fra.setSize(600,500);
        fra.setLayout(null);
        fra.setLocationRelativeTo(null);
        Font f=new Font("Neoteric",Font.BOLD,25);      
        
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
        
        
        Random rand=new Random();
        int i= rand.nextInt(15);
        
        
        if(i==0)
        {
        mes.setText("<html>  Deuteronomy 31:6 <br> Be strong and courageous. Do not be afraid or terrified because of them, for the Lord your God goes with you; he will never leave you nor forsake you.”<html> ");
        }
        else if(i==1)
        {
        mes.setText("<html> Psalm 27:10 <br> Though my father and mother forsake me, the Lord will receive me.");
        }
        else if(i==2)
        {
        mes.setText("<html> 1 Samuel 12:22 <br> For the sake of his great name the Lord will not reject his people, because the Lord was pleased to make you his own.<html> ");
        }
         else if(i==3)
        {
        mes.setText("<html> Psalm 25:16 <br> Turn to me and be gracious to me, for I am lonely and afflicted.");
        }
        else if(i==4)
        {
        mes.setText("<html> Matthew 28:20 <br> and teaching them to obey everything I have commanded you. And surely I am with you always, to the very end of the age.");
        }
         else if(i==5)
        {
        mes.setText("<html> Isaiah 41:10 <br> So do not fear, for I am with you; do not be dismayed, for I am your God. I will strengthen you and help you; I will uphold you with my righteous right hand.<html> ");
        }
        else if(i==6)
        {
        mes.setText("<html> 1 Peter 5:7 <br> Cast all your anxiety on him because he cares for you.");
        }
         else if(i==7)
        {
        mes.setText("<html> Isaiah 68:6 <br> God sets the lonely in families,[a] he leads out the prisoners with singing; but the rebellious live in a sun-scorched land.<html> ");
        }
        else if(i==8)
        {
        mes.setText("<html> Proverbs 18:24 <br> One who has unreliable friends soon comes to ruin, but there is a friend who sticks closer than a brother.<html> ");
        }
        else if(i==9)
        {
        mes.setText("<html>l Corinthians 10:13 <br> No temptation[a] has overtaken you except what is common to mankind. And God is faithful; he will not let you be tempted[b] beyond what you can bear. But when you are tempted,[c] he will also provide a way out so that you can endure it.<html> ");
        }
        else if(i==10)
        {
        mes.setText("<html> Psalm 147:3 <br> He heals the brokenhearted and binds up their wounds.<html> ");
        }
        else if(i==11)
        {
        mes.setText("<html> Leviticus 26:11 <br> I will put my dwelling place[a] among you, and I will not abhor you.<html> ");
        }
        else if(i==12)
        {
        mes.setText("<html> Leviticus 26:12 <br>  I will walk among you and be your God, and you will be my people.<html> ");
        }
        else if(i==13)
        {
        mes.setText("<html> Psalm 17:15 <br> As for me, I will see Your face in righteousness; I shall be satisfied when I awake in Your likeness<html> ");
        }
        else if(i==14)
        {
        mes.setText("<html> James 4:8 <br> Draw near to God and He will draw near to you.<html> ");
        }
        else if(i==15)
        {
        mes.setText("<html> Matthew 11:28 <br> Come to Me, all you who labor and are heavy laden, and I will give you rest.<html> ");
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
        
        
        
        
        img=new ImageIcon(getClass().getResource("aalone.png"));
        lab=new JLabel(img);
        lab.setBounds(-10,-20,600,550);
        fra.add(lab);
        
        
        JPanel pane2 =new JPanel();
        pane2.setSize(600,550);
        pane2.setBackground(new Color(29,31,63));
        fra.add(pane2);
    }
   
    
    
    public static void main(String[] args) {
        new Alone();
    }
    
}
