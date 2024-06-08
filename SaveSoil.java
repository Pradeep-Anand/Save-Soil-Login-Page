import java.util.*;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.AttributeSet.FontAttribute;

import java.awt.event.*;
import java.awt.Desktop;
import java.net.URL;
public class SaveSoil extends JFrame {
    JLabel title,user,password, image, success, bgLabel, logo, sir;
    JTextField t1, t2;
    JPasswordField passText;
    JButton login;
    ImageIcon SaveSoilIcon, SaveSoil, nitp, shyam, Background;
    public void setComponents(){
        title = new JLabel("Save Soil Login Page");
        user = new JLabel("Username : ");
        t1 = new JTextField();
        password = new JLabel("Password : ");
        image = new JLabel();
        login = new JButton("Login");
        success = new JLabel();
        SaveSoilIcon = new ImageIcon("icon/SaveSoil.png");
        setIconImage(SaveSoilIcon.getImage());
        SaveSoil = new ImageIcon(getClass().getResource("SaveSoil.png"));
        nitp = new ImageIcon(getClass().getResource("/logo.png"));
        shyam = new ImageIcon(getClass().getResource("sirg.png"));
        Background = new ImageIcon (getClass().getResource("/GlobalMovement.png"));
        bgLabel = new JLabel(Background);
        image = new JLabel(SaveSoil);
        logo = new JLabel(nitp);
        sir = new JLabel(shyam);
        passText = new JPasswordField();
        setLayout(null);
        title.setBounds(900, 50, 500, 50);
        user.setBounds(870, 110, 300, 25);
        t1.setBounds(1000, 110, 150, 20);
        password.setBounds(870, 150, 300, 25);
        passText.setBounds(1000, 150, 150, 20);
        login.setBounds(950, 220, 150, 20);
        success.setBounds(880, 180, 300, 30);
        image.setBounds(880, 230, 300, 300);
        logo.setBounds(15, 15, 100, 100);
        sir.setBounds(50, 450, 250, 250);
        bgLabel.setSize(1550,768);
        title.setFont(new java.awt.Font("Segoe UI", 1, 25));
        title.setForeground(new java.awt.Color(255, 255, 255));
        user.setFont(new java.awt.Font("Segoe UI", 1, 15));
        user.setForeground(new java.awt.Color(255, 255, 255));
        password.setFont(new java.awt.Font("Segoe UI", 1, 15));
        password.setForeground(new java.awt.Color(255, 255, 255));
        login.setFont(new java.awt.Font("Segoe UI", 1, 15));
        login.setForeground(new java.awt.Color(0, 0, 0));
    
        success.setFont(new java.awt.Font("Segoe UI", 1, 15));
        success.setForeground(new java.awt.Color(255, 255, 255));
        //bgLabel.setBounds(0,0,13,768);
        login.addActionListener(new Handler());

        add(title);
        add(user);
        add(password);
        add(image);
        add(logo);
        add(sir);
        add(login);
        add(success);
        add(t1);
        add(passText);
        add(bgLabel);
        
    
    }
    SaveSoil(){
    }
    SaveSoil(String s){
        super(s);
    }
    class Handler implements ActionListener{ 
        public void actionPerformed(ActionEvent ae){
            String user = t1.getText();
            String password = passText.getText();
            if(user.equals("SaveSoil") && password.equals("ConsciousPlanet")){
                success.setText("Login Successful!");
                try{
                Desktop.getDesktop().browse(new URL("https://www.consciousplanet.org/").toURI());
                }
                catch(Exception e){}
            }
            else
            success.setText("Oops! Username or Password is Incorrect.");
        }
    }
    public static void main(String [] args){
        SaveSoil jf = new SaveSoil ("Save Soil - Action NOW");
        jf.setComponents();
        jf.setSize(1366,768);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
    }
}
