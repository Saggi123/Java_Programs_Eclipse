package Swing_package;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;

class invalidnumber extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage()
	{
		return "Not a valid number";
	}
	
}

public class lh {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
    String gender=" ";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)  {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lh window = new lh();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application. 
	 */
	public lh() throws invalidnumber {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize ()throws invalidnumber {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 102, 0));
		frame.setBounds(100, 100, 754, 663);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 0));
		panel.setBounds(0, 0, 730, 64);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register Here");
		lblNewLabel.setForeground(new Color(204, 102, 0));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(235, 10, 270, 33);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(lh.class.getResource("/Swing_package/5920 (2).jpg")));
		lblNewLabel_5.setBounds(0, 0, 64, 54);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(new Color(255, 204, 0));
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_1.setBounds(39, 73, 100, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(218, 69, 394, 53);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setForeground(new Color(255, 204, 0));
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_2.setBounds(39, 160, 100, 39);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(218, 159, 394, 53);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel(" Number");
		lblNewLabel_3.setForeground(new Color(255, 204, 0));
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_3.setBounds(39, 228, 128, 64);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(218, 240, 394, 53);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Address");
		lblNewLabel_4.setForeground(new Color(255, 204, 0));
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_4.setBounds(39, 350, 128, 44);
		frame.getContentPane().add(lblNewLabel_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(218, 336, 394, 99);
		frame.getContentPane().add(textArea);
		
		ButtonGroup bg=new ButtonGroup();
		
		JRadioButton rdbtnmale = new JRadioButton("Male");
		rdbtnmale.setForeground(new Color(204, 102, 0));
		rdbtnmale.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20));
		rdbtnmale.setBackground(new Color(255, 204, 0));
		rdbtnmale.setBounds(47, 470, 120, 39);
		frame.getContentPane().add(rdbtnmale);
		bg.add(rdbtnmale);
		JRadioButton rdbtnfemale = new JRadioButton("Female");
		rdbtnfemale.setForeground(new Color(204, 102, 0));
		rdbtnfemale.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 24));
		rdbtnfemale.setBackground(new Color(255, 204, 0));
		rdbtnfemale.setBounds(218, 470, 161, 39);
		frame.getContentPane().add(rdbtnfemale);
		bg.add(rdbtnfemale);
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    String name=textField.getText();
			    String email=textField_1.getText();
			    int number=Integer.valueOf(textField_2.getText());
				   try
				   {
					   if(number<10)
					   throw new invalidnumber();
			   
			    String address=textArea.getText();
			    if(rdbtnmale.isSelected())
			    {
			    	gender="male";
			    }
			    else
			    {
			    	gender="female";
			    }
			    try
			    {
			    	Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_practice", "root", "sagnik");
			    	PreparedStatement st=(PreparedStatement)con.prepareStatement("Insert into register values(?,?,?,?,?)");
			    	st.setString(1, name);
			    	st.setString(2, email);
			    	st.setInt(3, number);
			    	st.setString(4, address);
			    	st.setString(5, gender);
			    	st.executeUpdate();
			    }
			    catch(Exception e1)
			    {
			    	System.out.println(e1.toString());
			    }
			    JOptionPane.showMessageDialog(btnNewButton, "You are Registered!");
			}
			   catch(invalidnumber e2)
			   {
				   System.out.println(e2.getMessage());
			   }
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 24));
		btnNewButton.setForeground(new Color(204, 102, 0));
		btnNewButton.setBackground(new Color(255, 204, 0));
		btnNewButton.setBounds(301, 565, 169, 51);
		frame.getContentPane().add(btnNewButton);
		
	}
	
	
}

