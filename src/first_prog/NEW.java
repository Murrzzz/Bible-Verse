/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_prog;
import first_prog.Love;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.*;
import javax.swing.JLabel;

/**
 *
 * @author Ms D
 */


public class NEW extends JFrame{

    JFrame fra=new JFrame();
    JLabel titl=new JLabel();
    JButton happy=new JButton();
    JButton sad=new JButton();
    JButton angry=new JButton();
    JButton alone=new JButton();
    JButton love=new JButton();
    
    private ImageIcon lov;
    private ImageIcon ang;
    private ImageIcon al;
    private ImageIcon sa;
    private ImageIcon hap;
    private ImageIcon img;
    private JLabel lab;
    private ImageIcon img1;
    private JLabel lab1;
    private ImageIcon xx;
    private JLabel x;
    
    
    
    public NEW()
    {
        fra.setSize(1000,500);
        fra.setLayout(null);
        fra.setLocationRelativeTo(null);
        Font f=new Font("Arial",Font.PLAIN,20);       
        
        titl.setBounds(240,-80,200,200);
        titl.setFont(f);
        fra.add(titl);
        fra.setUndecorated(true);
        fra.setVisible(true);
        fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        
        
        JButton exit= new JButton();
        xx=new ImageIcon(getClass().getResource("x.gif"));
        exit.setIcon(xx);
        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
        
        exit.setBounds(915,-1,65,55);
        
        fra.add(exit);
        
        hap=new ImageIcon(getClass().getResource("happy.png"));
        happy.setIcon(hap);
        
        happy.setBorderPainted(false);
        
        happy.setContentAreaFilled(false);
        
        happy.setBounds(140,330,130,128);
        fra.add(happy);
        
        
        
        
         happy.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent arg0)
    {
      Happy hAppy =new Happy();
      hAppy.setVisible(true);
      fra.setVisible(false);   
         
    }
    });
        sa=new ImageIcon(getClass().getResource("sad.png"));
        sad.setIcon(sa);
        sad.setBorderPainted(false);
        sad.setBounds(280,330,130,128);
        sad.setContentAreaFilled(false);
        fra.add(sad);
        
        sad.addActionListener(new ActionListener(){
        
        @Override
        public void actionPerformed(ActionEvent arg0)
        {
        Sad sAd=new Sad();
        sAd.setVisible(true);
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
        
        
        al=new ImageIcon(getClass().getResource("alone.png"));
        alone.setIcon(al);
        alone.setBorderPainted(false);
        alone.setBounds(420,330,130,128);
        alone.setContentAreaFilled(false);
        fra.add(alone);
        
        alone.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
            Alone aLone =new Alone();
            aLone.setVisible(true);
            fra.setVisible(false);
            }
        });
        
        ang=new ImageIcon(getClass().getResource("angry.png"));
        angry.setIcon(ang);
        angry.setBounds(560,330,130,128);
        angry.setContentAreaFilled(false);
        angry.setBorderPainted(false);
        fra.add(angry);
        
        angry.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
            Angry aNgry =new Angry();
            
            aNgry.setVisible(true);
            fra.setVisible(false);
            
            }
        });
        
        lov=new ImageIcon(getClass().getResource("love.png"));
        love.setIcon(lov);
        
        love.setBounds(700,330,130,128);
        love.setBorderPainted(false);
        love.setContentAreaFilled(false);
        
        fra.add(love);
        
        love.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
            Love lOve =new Love();
            
            lOve.setVisible(true);
            fra.setVisible(false);
            }
        });
        
        JPanel Panel =new JPanel();
        
        Panel.setBounds(100,300,780,300);
        
        Panel.setBackground(new Color(29,31,63,200));
        
        fra.add(Panel);
        
        img1=new ImageIcon(getClass().getResource("HOW.gif"));
        lab1=new JLabel(img1);
        lab1.setBounds(100,0,846,118);
        fra.add(lab1);
        
        JButton Back= new JButton();
        ImageIcon back=new ImageIcon();
       back=new  ImageIcon(getClass().getResource("BAC.gif"));
        Back.setIcon(back);
        Back.setForeground(new Color(0,0,0));
        Back.setBounds(10,25,210,55);
        Back.setBorderPainted(false);
        fra.add(Back);
        
        Back.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent arg0){
            
              NewMain main=new NewMain();
              
              main.setVisible(true);
             fra.setVisible(false);
             fra.dispose();
            //fra.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
             //fra.dispatchEvent(new WindowEvent(fra, WindowEvent.WINDOW_CLOSING));
            }
        
        });
        
        img=new ImageIcon(getClass().getResource("main1.gif"));
        lab=new JLabel(img);
        lab.setSize(1000,500);
        fra.add(lab);
        
        
        
    }
    
    
    public static void main(String[] args) {
        new NEW();
    }
    
}
