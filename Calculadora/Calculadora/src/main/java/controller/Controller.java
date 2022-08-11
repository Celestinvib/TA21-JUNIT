package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import calculadora.Calculadora;
import graphicApp.GraphicApp;


public class Controller {
	
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
	 * 
	 */
	public void buttonCalcActions() {
		
		
		//Listeners Jbuttons (Nums)
		app.getBtnNum0().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation) {
					newOperation = false;
					app.screen.setText("");
					app.screenHistory.setText("");
					calc = new Calculadora();
				}
				app.screen.setText(app.screen.getText()+app.btnNum0.getText());
				if(calc.getOp() == null) {
					calc.setNum1(Double.parseDouble(app.screen.getText()));
				}else {
					calc.setNum2(Double.parseDouble(app.screen.getText()));
				}
			}
		});
		
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
		app.getBtnOpAdd().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.screen.setText(app.screen.getText()+" "+app.btnOpAdd.getText()+" ");
				app.screenHistory.setText(app.screen.getText());
				app.screen.setText("");
				calc.setOp(app.btnOpAdd.getText());
			}
		});
		
		app.getBtnOpSubstract().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.screen.setText(app.screen.getText()+" "+app.getBtnOpSubstract().getText()+" ");
				app.screenHistory.setText(app.screen.getText());
				app.screen.setText("");
				calc.setOp(app.getBtnOpSubstract().getText());
			}
		});

		app.getBtnOpMultiply().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.screen.setText(app.screen.getText()+" "+app.getBtnOpMultiply().getText()+" ");
				app.screenHistory.setText(app.screen.getText());
				app.screen.setText("");
				calc.setOp(app.getBtnOpMultiply().getText());
			}
		});
		
		app.getBtnOpDevide().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.screen.setText(app.screen.getText()+" "+app.getBtnOpDevide().getText()+" ");
				app.screenHistory.setText(app.screen.getText());
				app.screen.setText("");
				calc.setOp(app.getBtnOpDevide().getText());
			}
		});
		
		app.getBtnOpMod().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.screen.setText(app.screen.getText()+" "+app.getBtnOpMod().getText()+" ");
				app.screenHistory.setText(app.screen.getText());
				app.screen.setText("");
				calc.setOp(app.getBtnOpMod().getText());
			}
		});
		
		app.getBtnOp1SubstractX().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setR(calc.oneSplitNum(Double.parseDouble(app.screen.getText())));
				app.screen.setText(app.screen.getText()+" "+app.getBtnOp1SubstractX().getText()+" ");
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
		
		app.getBtnOpRaisedTo().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		
		app.getBtnSquareRoot().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		
		app.getBtnOpChangeSign().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.screen.setText("-"+app.screen.getText());
				if(calc.getOp() == null) {
					calc.setNum1(Integer.parseInt(app.screen.getText()));
				}else {
					calc.setNum2(Integer.parseInt(app.screen.getText()));
				}
			}
		});
		
		app.getBtnOpSupp().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!app.screen.getText().equals("")) {
					app.screen.setText(app.screen.getText().substring(0, app.screen.getText().length() - 1));
					if(calc.getOp() == null) {
						calc.setNum1(Integer.parseInt(app.screen.getText()));
					}else {
						calc.setNum2(Integer.parseInt(app.screen.getText()));
					}
				}
			}
		});
		
		app.getBtnOpAddDecimal().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.screen.setText(app.screen.getText()+".");
			}
		});
		
		app.getBtnOpClearCurrentNum().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.screen.setText("");
				if(calc.getOp() == null) {
					calc.setNum1(Double.parseDouble(null));
				}else {
					calc.setNum2(Double.parseDouble(null));
				}
			}
		});
		
		app.getBtnOpClear().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.screen.setText("");
				app.screenHistory.setText("");
				calc = new Calculadora();
			}
		});
		
		app.getBtnOpCalcResult().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!newOperation) {
					app.screenHistory.setText(app.screenHistory.getText() + app.screen.getText() + " " + app.getBtnOpCalcResult().getText());
				}
				newOperation = true;
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
				app.screen.setText(String.valueOf(calc.getR()));
			}
		});
	}
}
