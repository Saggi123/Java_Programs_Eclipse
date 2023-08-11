package Swing_package;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class table {

	private JFrame frame;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					table window = new table();
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
	public table() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 692, 412);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 102, 0));
		panel.setBounds(0, 0, 678, 60);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Users ");
		lblNewLabel.setBounds(259, 10, 107, 38);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setForeground(new Color(255, 204, 0));
		panel.add(lblNewLabel);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 204, 0));
		panel_1.setBounds(0, 57, 678, 318);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		String [] columns= {"Name","Email","Address","Gender"};
		
		DefaultTableModel model=new DefaultTableModel(columns,0);
		JTable table_1 = new JTable(model);
		table_1.setBounds(0, 20, 668, 500);
		panel_1.add(table_1);
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_practice", "root", "sagnik");
					PreparedStatement st=(PreparedStatement)con.prepareStatement("Select * from register");
				     ResultSet rs=st.executeQuery();
				     while(rs.next())
				     {
				    	 String name=rs.getString("name");
				    	 String email=rs.getString("emailid");
				    	 String address=rs.getString("address");
				    	 String gender=rs.getString("gender");
				    	 Object[] row= {name,email,address,gender};
				    	 model.addRow(row);
				     }
				}
				catch(Exception e1)
				{
					System.out.println(e1.toString());
				}
			}
		});
		btnNewButton.setBounds(10, 10, 85, 21);
		panel.add(btnNewButton);
		
	}
}
