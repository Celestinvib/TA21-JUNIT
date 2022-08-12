package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import calculadora.Calculadora;
import graphicApp.GraphicApp;


public class Controller {
	
	// Attributs
	private GraphicApp app;
	private Calculadora calc;
	private boolean newOperation = false;

	/** Constructor */
	public Controller() {
		
		this.app = new GraphicApp();
		this.calc = new Calculadora();
	
		
		// Apply actions to the buttons
		buttonCalcActions();
	}
	
	/**
	 * Method that adds listeners to the buttons in the graphic part and the actions that they do
	 */
	public void buttonCalcActions() {
		
		
		// Listeners Jbuttons (Nums)
		
		// Button Number 0
		app.getBtnNum0().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// If you just did an operation and you click another number this will reset the calculator and write on the screen the number you just pressed
				if(newOperation) { 
					newOperation = false;
					app.screen.setText("");
					app.screenHistory.setText("");
					calc = new Calculadora();
				}
				
				// Writes the number of the button on the screen and if there is already a number, adds it after
				app.screen.setText(app.screen.getText()+app.btnNum0.getText());
				
				// If there is no 'op' attribut on the calc yet, means that you are writing the 1st number, and will save it on the calc object like that
				// otherwise, will save it on the 2nd number
				if(calc.getOp() == null) {
					calc.setNum1(Double.parseDouble(app.screen.getText()));
				}else {
					calc.setNum2(Double.parseDouble(app.screen.getText()));
				}
			}
		});
		
		// Button Number 1
		app.getBtnNum1().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation) {
					newOperation = false;
					app.screen.setText("");
					app.screenHistory.setText("");
					calc = new Calculadora();
				}
				app.screen.setText(app.screen.getText()+app.btnNum1.getText());
				if(calc.getOp() == null) {
					calc.setNum1(Double.parseDouble(app.screen.getText()));
				}else {
					calc.setNum2(Double.parseDouble(app.screen.getText()));
				}
			}
		});
		
		// Button Number 2
		app.getBtnNum2().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation) {
					newOperation = false;
					app.screen.setText("");
					app.screenHistory.setText("");
					calc = new Calculadora();
				}
				app.screen.setText(app.screen.getText()+app.btnNum2.getText());
				if(calc.getOp() == null) {
					calc.setNum1(Double.parseDouble(app.screen.getText()));
				}else {
					calc.setNum2(Double.parseDouble(app.screen.getText()));
				}
			}
		});
		
		// Button Number 3
		app.getBtnNum3().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation) {
					newOperation = false;
					app.screen.setText("");
					app.screenHistory.setText("");
					calc = new Calculadora();
				}
				app.screen.setText(app.screen.getText()+app.btnNum3.getText());
				if(calc.getOp() == null) {
					calc.setNum1(Double.parseDouble(app.screen.getText()));
				}else {
					calc.setNum2(Double.parseDouble(app.screen.getText()));
				}
			}
		});
		
		// Button Number 4
		app.getBtnNum4().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation) {
					newOperation = false;
					app.screen.setText("");
					app.screenHistory.setText("");
					calc = new Calculadora();
				}
				app.screen.setText(app.screen.getText()+app.btnNum4.getText());
				if(calc.getOp() == null) {
					calc.setNum1(Double.parseDouble(app.screen.getText()));
				}else {
					calc.setNum2(Double.parseDouble(app.screen.getText()));
				}
			}
		});
		
		// Button Number 5
		app.getBtnNum5().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation) {
					newOperation = false;
					app.screen.setText("");
					app.screenHistory.setText("");
					calc = new Calculadora();
				}
				app.screen.setText(app.screen.getText()+app.btnNum5.getText());
				if(calc.getOp() == null) {
					calc.setNum1(Double.parseDouble(app.screen.getText()));
				}else {
					calc.setNum2(Double.parseDouble(app.screen.getText()));
				}
			}
		});
		
		// Button Number 6
		app.getBtnNum6().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation) {
					newOperation = false;
					app.screen.setText("");
					app.screenHistory.setText("");
					calc = new Calculadora();
				}
				app.screen.setText(app.screen.getText()+app.btnNum6.getText());
				if(calc.getOp() == null) {
					calc.setNum1(Double.parseDouble(app.screen.getText()));
				}else {
					calc.setNum2(Double.parseDouble(app.screen.getText()));
				}
			}
		});
		
		// Button Number 7
		app.getBtnNum7().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation) {
					newOperation = false;
					app.screen.setText("");
					app.screenHistory.setText("");
					calc = new Calculadora();
				}
				app.screen.setText(app.screen.getText()+app.btnNum7.getText());
				if(calc.getOp() == null) {
					calc.setNum1(Double.parseDouble(app.screen.getText()));
				}else {
					calc.setNum2(Double.parseDouble(app.screen.getText()));
				}
			}
		});		
		
		// Button Number 8
		app.getBtnNum8().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation) {
					newOperation = false;
					app.screen.setText("");
					app.screenHistory.setText("");
					calc = new Calculadora();
				}
				app.screen.setText(app.screen.getText()+app.btnNum8.getText());
				if(calc.getOp() == null) {
					calc.setNum1(Double.parseDouble(app.screen.getText()));
				}else {
					calc.setNum2(Double.parseDouble(app.screen.getText()));
				}
			}
		});	
		
		// Button Number 9
		app.getBtnNum9().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation) {
					newOperation = false;
					app.screen.setText("");
					app.screenHistory.setText("");
					calc = new Calculadora();
				}
				app.screen.setText(app.screen.getText()+app.btnNum9.getText());
				if(calc.getOp() == null) {
					calc.setNum1(Double.parseDouble(app.screen.getText()));
				}else {
					calc.setNum2(Double.parseDouble(app.screen.getText()));
				}
			}
		});	
		
		//Listeners Jbuttons (Operations)
		
		// Button Add operation
		app.getBtnOpAdd().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Adds the symbol of the operation pressed, and puts the chain on the top label, which is the history
				app.screen.setText(app.screen.getText()+" "+app.btnOpAdd.getText()+" ");
				app.screenHistory.setText(app.screen.getText());
				
				// Clears the main label where the new number will be writed
				app.screen.setText("");
				
				// Updates the attribut on the calc object
				calc.setOp(app.btnOpAdd.getText());
			}
		});
		
		// Button Substract operation
		app.getBtnOpSubstract().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.screen.setText(app.screen.getText()+" "+app.getBtnOpSubstract().getText()+" ");
				app.screenHistory.setText(app.screen.getText());
				app.screen.setText("");
				calc.setOp(app.getBtnOpSubstract().getText());
			}
		});

		// Button Multiply operation
		app.getBtnOpMultiply().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.screen.setText(app.screen.getText()+" "+app.getBtnOpMultiply().getText()+" ");
				app.screenHistory.setText(app.screen.getText());
				app.screen.setText("");
				calc.setOp(app.getBtnOpMultiply().getText());
			}
		});
		
		// Button Divide operation
		app.getBtnOpDevide().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.screen.setText(app.screen.getText()+" "+app.getBtnOpDevide().getText()+" ");
				app.screenHistory.setText(app.screen.getText());
				app.screen.setText("");
				calc.setOp(app.getBtnOpDevide().getText());
			}
		});
		
		// Button % operation
		app.getBtnOpMod().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(calc.getOp() != null) { //If the user is setting the 2º operator we proceed to do the calculator mod function
					calc.setNum2(calc.split(calc.getNum2(), 100)); 
					app.screen.setText(String.valueOf(calc.getNum2()));
					app.screenHistory.setText(app.screenHistory.getText() +" "+app.screen.getText());
					app.screen.setText("");
				}
			}
		});
		
		// Button 1/X operation
		app.getBtnOp1SubstractX().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Gets the number introduced, adds the symbol, writes it on the history label, calcs the result and shows it on the main label
				calc.setR(calc.oneSplitNum(Double.parseDouble(app.screen.getText())));
				app.screen.setText("1/"+app.screen.getText());
				app.screenHistory.setText(app.screen.getText());
				app.screen.setText("");
				calc.setOp(app.getBtnOp1SubstractX().getText());
				if(!newOperation) {
					app.screenHistory.setText(app.screenHistory.getText());
				}
				newOperation = true;
				app.screen.setText(String.valueOf(calc.getR()));
			}
		});
		
		// Button ^2 operation
		app.getBtnOpRaisedTo().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Gets the number introduced, adds the symbol, writes it on the history label, calcs the result and shows it on the main label
				calc.setR(calc.raisedTo(Double.parseDouble(app.screen.getText())));
				app.screen.setText(app.screen.getText()+" "+app.getBtnOpRaisedTo().getText()+" ");
				app.screenHistory.setText(app.screen.getText());
				app.screen.setText("");
				calc.setOp(app.getBtnOpRaisedTo().getText());
				if(!newOperation) {
					app.screenHistory.setText(app.screenHistory.getText());
				}
				newOperation = true;
				app.screen.setText(String.valueOf(calc.getR()));
			}
		});
		
		// Button √ operation
		app.getBtnSquareRoot().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Gets the number introduced, adds the symbol, writes it on the history label, calcs the result and shows it on the main label
				calc.setR(calc.squareRoot(Double.parseDouble(app.screen.getText())));
				app.screen.setText(app.screen.getText()+" "+app.getBtnSquareRoot().getText()+" ");
				app.screenHistory.setText(app.screen.getText());
				app.screen.setText("");
				calc.setOp(app.getBtnSquareRoot().getText());
				if(!newOperation) {
					app.screenHistory.setText(app.screenHistory.getText());
				}
				newOperation = true;
				app.screen.setText(String.valueOf(calc.getR()));
			}
		});
		
		// Button converts negative and positive numbers to their opposites -/+
		app.getBtnOpChangeSign().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curentNum = app.screen.getText();
				
				if(curentNum.charAt(0) != '-') { //If the current num is not negative we convert it
					curentNum = "-"+curentNum;
				}else { //if it is we convert it to positive
					curentNum = curentNum.substring(1);
				}
				
				app.screen.setText(curentNum);

				if(calc.getOp() == null) {
					calc.setNum1(Integer.parseInt(curentNum));
				}else {
					calc.setNum2(Integer.parseInt(curentNum));
				}
				
			}
		});
		
		// Button Supr
		app.getBtnOpSupp().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Deletes the last number introduced
				if(!app.screen.getText().equals("")) {
					app.screen.setText(app.screen.getText().substring(0, app.screen.getText().length() - 1));
					
					if(calc.getOp() == null) {
						if(!app.screen.getText().equals("")) { //If exists a current num , set the value to op1  
							calc.setNum1(Integer.parseInt(app.screen.getText()));
						}
					}else {
						if(!app.screen.getText().equals("")) {
						calc.setNum2(Integer.parseInt(app.screen.getText()));
						}
					}
				}
			}
		});
		
		// Button to add the '.' for decimal numbers
		app.getBtnOpAddDecimal().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean alreadyDecimal = false;
				String currentNum = app.screen.getText();
				
				//Check if the current num is already a decimal in case it is this function won't transform it to decimal
				for (int i = 0; i < currentNum.length(); i++) {
					if(currentNum.charAt(i) == '.') {
						alreadyDecimal = true;
						break;
					}
				}
				
				if(!alreadyDecimal) { //If the current is not a decimal we add . to the last digit of the currenNum
					app.screen.setText(app.screen.getText()+".");
				}
			}
		});
		
		// Button 'CE'
		app.getBtnOpClearCurrentNum().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Clear the current number showed in the screen
				app.screen.setText("");
				if(calc.getOp() == null) {
					calc.setNum1(Double.NaN); 
				}else {
					calc.setNum2(Double.NaN);
				}
			}
		});
		
		// Button 'C'
		app.getBtnOpClear().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Clears everything, its a reset
				app.screen.setText("");
				app.screenHistory.setText("");
				calc = new Calculadora();
			}
		});
		
		// Button '='
		app.getBtnOpCalcResult().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Updates the history label with the '=' symbol
				if(!newOperation) {
					app.screenHistory.setText(app.screenHistory.getText() + app.screen.getText() + " " + app.getBtnOpCalcResult().getText());
				}
				newOperation = true;
				
//				if(String.valueOf(calc.getNum2()) != null) {
					
				// 'Switch' to calc the operations that requires of 2 numbers and update the result attribut for calc object
					String operation = calc.getOp();
					switch (operation) {
					case "+":
						calc.setR(calc.add(calc.getNum1(), calc.getNum2()));
						break;
					case "-":
						calc.setR(calc.susbtract(calc.getNum1(), calc.getNum2()));
						break;
					case "÷":
						calc.setR(calc.split(calc.getNum1(), calc.getNum2()));
						break;
					case "X":
						calc.setR(calc.multiply(calc.getNum1(), calc.getNum2()));
						break;
	
					default:
						break;
					}
					
//				}else {
//					
//					app.screenHistory.setText(String.valueOf(calc.getNum1())+"=");
//					calc.setR(calc.getNum1());
//				}
				
				// Shows in the screen the result
				app.screen.setText(String.valueOf(calc.getR()));
			}
		});
	}
}
