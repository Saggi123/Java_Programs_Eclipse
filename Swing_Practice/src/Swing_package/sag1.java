package Swing_package;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class sag1 extends JFrame {
    
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sag1 frame = new sag1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public sag1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 711, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 102, 0));
		panel.setBounds(0, 0, 601, 318);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LogIn");
		lblNewLabel.setBounds(244, 10, 100, 38);
		lblNewLabel.setForeground(new Color(255, 204, 0));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 30));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_1.setForeground(new Color(255, 204, 0));
		lblNewLabel_1.setBounds(10, 78, 92, 38);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(134, 85, 245, 38);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Number");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_2.setForeground(new Color(255, 204, 0));
		lblNewLabel_2.setBounds(10, 177, 107, 30);
		panel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(134, 189, 245, 38);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("LogIn");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				int number=Integer.valueOf(textField_1.getText());
				try
				{
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_practice","root", "sagnik");
					PreparedStatement st=(PreparedStatement)con.prepareStatement("Select * from register where name=? and number=?");
					st.setString(1, name);
					st.setInt(2, number);
					ResultSet rs=st.executeQuery();
					if(rs.next())
					{
						lh obj1=new lh();
						obj1.frame.setVisible(true);
						setVisible(false);
						
					}
					else
					{
						JOptionPane.showMessageDialog(btnNewButton, "invalid User");
					}
					
				}
				catch(Exception e1)
				{
					System.out.println(e1.toString());
				}
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 24));
		btnNewButton.setBackground(new Color(255, 204, 0));
		btnNewButton.setBounds(216, 267, 138, 42);
		panel.add(btnNewButton);
	}

}
