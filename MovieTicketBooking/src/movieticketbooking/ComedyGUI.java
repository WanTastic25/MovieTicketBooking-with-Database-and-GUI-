package movieticketbooking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComedyGUI
{
    public void comedyGUI()
    {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        
        panel.setLayout(null);
        
        JLabel choice = new JLabel("Choice");
        JLabel title = new JLabel("Title");
        JLabel duration = new JLabel("Duration");
        JLabel price = new JLabel("Price");
        
        choice.setBounds(10,20,80,25);
        panel.add(choice);
        title.setBounds(100,20,80,25);
        panel.add(title);
        duration.setBounds(200,20,80,25);
        panel.add(duration);
        price.setBounds(300,20,80,25);
        panel.add(price);
        
        frame.setVisible(true); //at the end of the code
    }
}
