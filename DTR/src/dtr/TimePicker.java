package dtr;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

public class TimePicker {

	private JFrame frame;

	List<String> minList = new ArrayList<>();
	List<String> hrList = new ArrayList<>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimePicker window = new TimePicker();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void alist() {
		
		for(int i = 0 ; i<60 ; i++) {
			minList.add(i + "");
		}
		
		for(int i1=0;i1<24;i1++) {
			hrList.add(i1+"");
		}
		
		
		
	}
	
	/**
	 * Create the application.
	 */
	
	
	public TimePicker() {
		alist();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 412, 238);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setModel(new DefaultComboBoxModel<String>(minList.toArray(new String[0])));
		comboBox.setBounds(230, 123, 59, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox<String> comboBox_1 = new JComboBox<>();
		comboBox_1.setModel(new DefaultComboBoxModel<String>(minList.toArray(new String[0])));
		comboBox_1.setBounds(161, 123, 59, 22);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox<String> comboBox_2 = new JComboBox<>();
		comboBox_2.setModel(new DefaultComboBoxModel<String>(hrList.toArray(new String[0])));
		comboBox_2.setBounds(94, 123, 59, 22);
		frame.getContentPane().add(comboBox_2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(136, 156, 111, 32);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Update Time");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(94, 11, 188, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name : ");
		lblNewLabel_1.setBounds(31, 43, 59, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Time Id : ");
		lblNewLabel_2.setBounds(31, 68, 62, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Date : ");
		lblNewLabel_3.setBounds(31, 93, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
