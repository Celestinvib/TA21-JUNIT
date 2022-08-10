package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import graphicApp.GraphicApp;


public class Controller {
	
	private GraphicApp app;

	/** Constructor */
	public Controller() {
		
		this.app = new GraphicApp();
	
		
		// Apply actions to the buttons
		buttonCalcActions();
	}
	
	/**
	 * Method that adds listeners to the buttons in the graphic part and the actions that they do
	 * 
	 */
	public void buttonCalcActions() {
		
		//Listeners Jbuttons (Nums)
		app.getBtnNum0().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		app.getBtnNum1().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		app.getBtnNum2().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		app.getBtnNum3().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		app.getBtnNum4().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		app.getBtnNum5().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		app.getBtnNum6().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		app.getBtnNum7().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});		
		
		app.getBtnNum8().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});	
		
		app.getBtnNum9().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});	
		
		//Listeners Jbuttons (Operations)	
		app.getBtnOpAdd().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		app.getBtnOpSubstract().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		app.getBtnOpMultiply().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		app.getBtnOpDevide().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		app.getBtnOpMod().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		app.getBtnOp1SubstractX().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		app.getBtnOpRaisedTo().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		app.getBtnOpChangeSign().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		app.getBtnOpSupp().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		app.getBtnOpAddDecimal().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		app.getBtnOpClearCurrentNum().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		app.getBtnOpClear().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		app.getBtnOpCalcResult().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
