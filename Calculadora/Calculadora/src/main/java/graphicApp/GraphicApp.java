package graphicApp;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Panel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;



public class GraphicApp extends JFrame{
	public GraphicApp() {
		
		/* Definition of the window */
		setTitle("Calculadora"); // PopUp window title
		setBounds(700, 200, 400, 600); // X Y coordinates of the application and its height and length
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Panel panel = new Panel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("+/-");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(10, 490, 90, 60);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("0");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(103, 490, 90, 60);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton(",");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1.setBounds(195, 490, 90, 60);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("=");
		btnNewButton_1_1_1.setBorder(null);
		btnNewButton_1_1_1.setBackground(new Color(102, 153, 204));
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1_1.setBounds(288, 490, 90, 60);
		panel.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2 = new JButton("1");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(10, 419, 90, 60);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1_2 = new JButton("2");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2.setBounds(103, 419, 90, 60);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_1_2 = new JButton("3");
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1_2.setBounds(195, 419, 90, 60);
		panel.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_1_1 = new JButton("+");
		btnNewButton_1_1_1_1.setBorder(null);
		btnNewButton_1_1_1_1.setBackground(new Color(230, 230, 250));
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1_1_1.setBounds(288, 419, 90, 60);
		panel.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setBounds(10, 348, 90, 60);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_1_3 = new JButton("5");
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_3.setBounds(103, 348, 90, 60);
		panel.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_1_3 = new JButton("6");
		btnNewButton_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1_3.setBounds(195, 348, 90, 60);
		panel.add(btnNewButton_1_1_3);
		
		JButton btnNewButton_1_1_1_2 = new JButton("-");
		btnNewButton_1_1_1_2.setBorder(null);
		btnNewButton_1_1_1_2.setBackground(new Color(230, 230, 250));
		btnNewButton_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1_1_2.setBounds(288, 348, 90, 60);
		panel.add(btnNewButton_1_1_1_2);
		
		JButton btnNewButton_4 = new JButton("7");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4.setBounds(10, 277, 90, 60);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_1_4 = new JButton("8");
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_4.setBounds(103, 277, 90, 60);
		panel.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_1_4 = new JButton("9");
		btnNewButton_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1_4.setBounds(195, 277, 90, 60);
		panel.add(btnNewButton_1_1_4);
		
		JButton btnNewButton_1_1_1_3 = new JButton("X");
		btnNewButton_1_1_1_3.setBorder(null);
		btnNewButton_1_1_1_3.setBackground(new Color(230, 230, 250));
		btnNewButton_1_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1_1_3.setBounds(288, 277, 90, 60);
		panel.add(btnNewButton_1_1_1_3);
		
		JButton btnNewButton_5 = new JButton("1/X");
		btnNewButton_5.setBorder(null);
		btnNewButton_5.setBackground(new Color(230, 230, 250));
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setBounds(10, 209, 90, 60);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_1_5 = new JButton("x²");
		btnNewButton_1_5.setBorder(null);
		btnNewButton_1_5.setBackground(new Color(230, 230, 250));
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_5.setBounds(103, 209, 90, 60);
		panel.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_1_5 = new JButton("√");
		btnNewButton_1_1_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1_5.setBorder(null);
		btnNewButton_1_1_5.setBackground(new Color(230, 230, 250));
		btnNewButton_1_1_5.setBounds(195, 209, 90, 60);
		panel.add(btnNewButton_1_1_5);
		
		JButton btnNewButton_1_1_1_4 = new JButton("÷");
		btnNewButton_1_1_1_4.setBorder(null);
		btnNewButton_1_1_1_4.setBackground(new Color(230, 230, 250));
		btnNewButton_1_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1_1_4.setBounds(288, 209, 90, 60);
		panel.add(btnNewButton_1_1_1_4);
		
		JButton btnNewButton_6 = new JButton("%");
		btnNewButton_6.setBorder(null);
		btnNewButton_6.setBackground(new Color(230, 230, 250));
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_6.setBounds(10, 138, 90, 60);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_1_6 = new JButton("CE");
		btnNewButton_1_6.setBorder(null);
		btnNewButton_1_6.setBackground(new Color(230, 230, 250));
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_6.setBounds(103, 138, 90, 60);
		panel.add(btnNewButton_1_6);
		
		JButton btnNewButton_1_1_6 = new JButton("C");
		btnNewButton_1_1_6.setBorder(null);
		btnNewButton_1_1_6.setBackground(new Color(230, 230, 250));
		btnNewButton_1_1_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1_6.setBounds(195, 138, 90, 60);
		panel.add(btnNewButton_1_1_6);
		
		JButton btnNewButton_1_1_1_5 = new JButton("SUPR");
		btnNewButton_1_1_1_5.setBorder(null);
		btnNewButton_1_1_1_5.setBackground(new Color(230, 230, 250));
		btnNewButton_1_1_1_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_1_1_5.setBounds(288, 138, 90, 60);
		panel.add(btnNewButton_1_1_1_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(UIManager.getColor("CheckBox.light"));
		panel_1.setBounds(10, 11, 368, 116);
		panel.add(panel_1);
	}
}

 
