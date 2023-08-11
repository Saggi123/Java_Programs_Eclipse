package Swing_package;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class tablepractice {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tablepractice window = new tablepractice();
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
	public tablepractice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 907, 488);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 102, 0));
		panel.setBounds(0, 0, 893, 451);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 204, 0));
		panel_1.setBounds(0, 0, 893, 70);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		String [] columns= {"Name","Email","Address","Gender"};
		DefaultTableModel model=new DefaultTableModel(columns,0);
		JTable table = new JTable(model);
		table.setBounds(0, 70, 500, 500);
		panel.add(table);
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
		btnNewButton.setBounds(364, 23, 85, 21);
		panel_1.add(btnNewButton);
		
	}

}
