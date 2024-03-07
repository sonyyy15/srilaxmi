package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

public class loggin {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loggin window = new loggin();
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
	public loggin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JLabel lb1 = new JLabel("Username");
		lb1.setForeground(new Color(0, 0, 0));
		lb1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lb1.setBounds(93, 47, 96, 23);
		frame.getContentPane().add(lb1);
		
		JLabel lb3 = new JLabel("password");
		lb3.setForeground(new Color(0, 0, 0));
		lb3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lb3.setBounds(93, 109, 96, 23);
		frame.getContentPane().add(lb3);
		
		
		ButtonGroup brg=new ButtonGroup();
		
		JButton btnNewButton = new JButton("LOGIN ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String source=(String) cb1.getSelectedItem();
				String destination=(String) cb2.getSelectedItem();
				String nt=(String) cb3.getSelectedItem();
				int numbertickets=Integer.parseInt(nt);
				int bill=0;
				if(source.equals(destination))
				{
					Component btnMenuButton;
					JOptionPane.showMessageDialog(btnMenuButton,"please check stations");
				}
				else {
					bill=bill+45*numbertickets;
					JOptionPane.showConfirmDialog(btnNewButton,"name"+name+"\nsource"+source+"\ndestination"+destination+"\n number tickets"+nt+"\n bill"+bill);
					
				}
	
		
			}
		});
		btnNewButton.setBounds(158, 173, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		tb1 = new JTextField();
		tb1.setText("deepu");
		tb1.setBounds(210, 50, 134, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("deepu@263");
		lblNewLabel.setBounds(210, 109, 134, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MOVIE BOOKING APP");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(93, 9, 190, 14);
	
	}
}
