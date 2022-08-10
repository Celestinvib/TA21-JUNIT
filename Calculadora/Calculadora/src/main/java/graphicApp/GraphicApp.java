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
	
	
	/**Attributes */
	
	//Jbuttons (Nums)
	public JButton btnNum0;
	public JButton btnNum1;
	public JButton btnNum2;
	public JButton btnNum3;
	public JButton btnNum4;
	public JButton btnNum5;
	public JButton btnNum6;
	public JButton btnNum7;	
	public JButton btnNum8;
	public JButton btnNum9;

	//Jbuttons (Basic Operations)
	public JButton btnOpAdd;
	public JButton btnOpSubstract;
	public JButton btnOpMultiply;
	public JButton btnOpDevide;

	public JButton btnOpMod;	
	public JButton btnOp1SubstractX;
	public JButton btnOpRaisedTo;
	public JButton btnSquareRoot;
	
	public JButton btnOpCalcResult;

	//Jbuttons (Calc Operations)
	public JButton btnOpAddDecimal;
	public JButton btnOpChangeSign;	

	public JButton btnOpClearCurrentNum;
	public JButton btnOpClear;
	public JButton btnOpSupp;
	
	public GraphicApp() {
		
		/* Definition of the window */
		setTitle("Calculadora"); // PopUp window title
		setBounds(700, 200, 400, 600); // X Y coordinates of the application and its height and length
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Panel panel = new Panel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		btnOpChangeSign = new JButton("+/-");
		btnOpChangeSign.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnOpChangeSign.setBounds(10, 490, 90, 60);
		panel.add(btnOpChangeSign);
		
		btnNum0 = new JButton("0");
		btnNum0.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNum0.setBounds(103, 490, 90, 60);
		panel.add(btnNum0);
		
		btnOpAddDecimal = new JButton(",");
		btnOpAddDecimal.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnOpAddDecimal.setBounds(195, 490, 90, 60);
		panel.add(btnOpAddDecimal);
		
		btnOpCalcResult = new JButton("=");
		btnOpCalcResult.setBorder(null);
		btnOpCalcResult.setBackground(new Color(102, 153, 204));
		btnOpCalcResult.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnOpCalcResult.setBounds(288, 490, 90, 60);
		panel.add(btnOpCalcResult);
		
		btnNum1 = new JButton("1");
		btnNum1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNum1.setBounds(10, 419, 90, 60);
		panel.add(btnNum1);
		
		btnNum2 = new JButton("2");
		btnNum2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNum2.setBounds(103, 419, 90, 60);
		panel.add(btnNum2);
		
		btnNum3 = new JButton("3");
		btnNum3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNum3.setBounds(195, 419, 90, 60);
		panel.add(btnNum3);
		
		btnOpAdd = new JButton("+");
		btnOpAdd.setBorder(null);
		btnOpAdd.setBackground(new Color(230, 230, 250));
		btnOpAdd.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnOpAdd.setBounds(288, 419, 90, 60);
		panel.add(btnOpAdd);
		
		btnNum4 = new JButton("4");
		btnNum4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNum4.setBounds(10, 348, 90, 60);
		panel.add(btnNum4);
		
		btnNum5 = new JButton("5");
		btnNum5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNum5.setBounds(103, 348, 90, 60);
		panel.add(btnNum5);
		
		btnNum6 = new JButton("6");
		btnNum6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNum6.setBounds(195, 348, 90, 60);
		panel.add(btnNum6);
		
		btnOpSubstract = new JButton("-");
		btnOpSubstract.setBorder(null);
		btnOpSubstract.setBackground(new Color(230, 230, 250));
		btnOpSubstract.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnOpSubstract.setBounds(288, 348, 90, 60);
		panel.add(btnOpSubstract);
		
		btnNum7 = new JButton("7");
		btnNum7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNum7.setBounds(10, 277, 90, 60);
		panel.add(btnNum7);
		
		btnNum8 = new JButton("8");
		btnNum8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNum8.setBounds(103, 277, 90, 60);
		panel.add(btnNum8);
		
		btnNum9 = new JButton("9");
		btnNum9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNum9.setBounds(195, 277, 90, 60);
		panel.add(btnNum9);
		
		btnOpMultiply = new JButton("X");
		btnOpMultiply.setBorder(null);
		btnOpMultiply.setBackground(new Color(230, 230, 250));
		btnOpMultiply.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnOpMultiply.setBounds(288, 277, 90, 60);
		panel.add(btnOpMultiply);
		
		btnOp1SubstractX = new JButton("1/X");
		btnOp1SubstractX.setBorder(null);
		btnOp1SubstractX.setBackground(new Color(230, 230, 250));
		btnOp1SubstractX.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnOp1SubstractX.setBounds(10, 209, 90, 60);
		panel.add(btnOp1SubstractX);
		
		btnOpRaisedTo = new JButton("x²");
		btnOpRaisedTo.setBorder(null);
		btnOpRaisedTo.setBackground(new Color(230, 230, 250));
		btnOpRaisedTo.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnOpRaisedTo.setBounds(103, 209, 90, 60);
		panel.add(btnOpRaisedTo);
		
		btnSquareRoot = new JButton("√");
		btnSquareRoot.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSquareRoot.setBorder(null);
		btnSquareRoot.setBackground(new Color(230, 230, 250));
		btnSquareRoot.setBounds(195, 209, 90, 60);
		panel.add(btnSquareRoot);
		
		btnOpDevide = new JButton("÷");
		btnOpDevide.setBorder(null);
		btnOpDevide.setBackground(new Color(230, 230, 250));
		btnOpDevide.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnOpDevide.setBounds(288, 209, 90, 60);
		panel.add(btnOpDevide);
		
		btnOpMod = new JButton("%");
		btnOpMod.setBorder(null);
		btnOpMod.setBackground(new Color(230, 230, 250));
		btnOpMod.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnOpMod.setBounds(10, 138, 90, 60);
		panel.add(btnOpMod);
		
		btnOpClearCurrentNum = new JButton("CE");
		btnOpClearCurrentNum.setBorder(null);
		btnOpClearCurrentNum.setBackground(new Color(230, 230, 250));
		btnOpClearCurrentNum.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnOpClearCurrentNum.setBounds(103, 138, 90, 60);
		panel.add(btnOpClearCurrentNum);
		
		btnOpClear = new JButton("C");
		btnOpClear.setBorder(null);
		btnOpClear.setBackground(new Color(230, 230, 250));
		btnOpClear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnOpClear.setBounds(195, 138, 90, 60);
		panel.add(btnOpClear);
		
		btnOpSupp = new JButton("SUPR");
		btnOpSupp.setBorder(null);
		btnOpSupp.setBackground(new Color(230, 230, 250));
		btnOpSupp.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnOpSupp.setBounds(288, 138, 90, 60);
		panel.add(btnOpSupp);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(UIManager.getColor("CheckBox.light"));
		panel_1.setBounds(10, 11, 368, 116);
		panel.add(panel_1);
	}

	/** Getters and Setters */

	/**
	 * @return the btnNum0
	 */
	public JButton getBtnNum0() {
		return btnNum0;
	}

	/**
	 * @param btnNum0 the btnNum0 to set
	 */
	public void setBtnNum0(JButton btnNum0) {
		this.btnNum0 = btnNum0;
	}

	/**
	 * @return the btnNum1
	 */
	public JButton getBtnNum1() {
		return btnNum1;
	}

	/**
	 * @param btnNum1 the btnNum1 to set
	 */
	public void setBtnNum1(JButton btnNum1) {
		this.btnNum1 = btnNum1;
	}

	/**
	 * @return the btnNum2
	 */
	public JButton getBtnNum2() {
		return btnNum2;
	}

	/**
	 * @param btnNum2 the btnNum2 to set
	 */
	public void setBtnNum2(JButton btnNum2) {
		this.btnNum2 = btnNum2;
	}

	/**
	 * @return the btnNum3
	 */
	public JButton getBtnNum3() {
		return btnNum3;
	}

	/**
	 * @param btnNum3 the btnNum3 to set
	 */
	public void setBtnNum3(JButton btnNum3) {
		this.btnNum3 = btnNum3;
	}

	/**
	 * @return the btnNum4
	 */
	public JButton getBtnNum4() {
		return btnNum4;
	}

	/**
	 * @param btnNum4 the btnNum4 to set
	 */
	public void setBtnNum4(JButton btnNum4) {
		this.btnNum4 = btnNum4;
	}

	/**
	 * @return the btnNum5
	 */
	public JButton getBtnNum5() {
		return btnNum5;
	}

	/**
	 * @param btnNum5 the btnNum5 to set
	 */
	public void setBtnNum5(JButton btnNum5) {
		this.btnNum5 = btnNum5;
	}

	/**
	 * @return the btnNum6
	 */
	public JButton getBtnNum6() {
		return btnNum6;
	}

	/**
	 * @param btnNum6 the btnNum6 to set
	 */
	public void setBtnNum6(JButton btnNum6) {
		this.btnNum6 = btnNum6;
	}

	/**
	 * @return the btnNum7
	 */
	public JButton getBtnNum7() {
		return btnNum7;
	}

	/**
	 * @param btnNum7 the btnNum7 to set
	 */
	public void setBtnNum7(JButton btnNum7) {
		this.btnNum7 = btnNum7;
	}

	/**
	 * @return the btnNum8
	 */
	public JButton getBtnNum8() {
		return btnNum8;
	}

	/**
	 * @param btnNum8 the btnNum8 to set
	 */
	public void setBtnNum8(JButton btnNum8) {
		this.btnNum8 = btnNum8;
	}

	/**
	 * @return the btnNum9
	 */
	public JButton getBtnNum9() {
		return btnNum9;
	}

	/**
	 * @param btnNum9 the btnNum9 to set
	 */
	public void setBtnNum9(JButton btnNum9) {
		this.btnNum9 = btnNum9;
	}

	/**
	 * @return the btnOpAdd
	 */
	public JButton getBtnOpAdd() {
		return btnOpAdd;
	}

	/**
	 * @param btnOpAdd the btnOpAdd to set
	 */
	public void setBtnOpAdd(JButton btnOpAdd) {
		this.btnOpAdd = btnOpAdd;
	}

	/**
	 * @return the btnOpSubstract
	 */
	public JButton getBtnOpSubstract() {
		return btnOpSubstract;
	}

	/**
	 * @param btnOpSubstract the btnOpSubstract to set
	 */
	public void setBtnOpSubstract(JButton btnOpSubstract) {
		this.btnOpSubstract = btnOpSubstract;
	}

	/**
	 * @return the btnOpMultiply
	 */
	public JButton getBtnOpMultiply() {
		return btnOpMultiply;
	}

	/**
	 * @param btnOpMultiply the btnOpMultiply to set
	 */
	public void setBtnOpMultiply(JButton btnOpMultiply) {
		this.btnOpMultiply = btnOpMultiply;
	}

	/**
	 * @return the btnOpDevide
	 */
	public JButton getBtnOpDevide() {
		return btnOpDevide;
	}

	/**
	 * @param btnOpDevide the btnOpDevide to set
	 */
	public void setBtnOpDevide(JButton btnOpDevide) {
		this.btnOpDevide = btnOpDevide;
	}

	/**
	 * @return the btnOpMod
	 */
	public JButton getBtnOpMod() {
		return btnOpMod;
	}

	/**
	 * @param btnOpMod the btnOpMod to set
	 */
	public void setBtnOpMod(JButton btnOpMod) {
		this.btnOpMod = btnOpMod;
	}

	/**
	 * @return the btnOp1SubstractX
	 */
	public JButton getBtnOp1SubstractX() {
		return btnOp1SubstractX;
	}

	/**
	 * @param btnOp1SubstractX the btnOp1SubstractX to set
	 */
	public void setBtnOp1SubstractX(JButton btnOp1SubstractX) {
		this.btnOp1SubstractX = btnOp1SubstractX;
	}

	/**
	 * @return the btnOpRaisedTo
	 */
	public JButton getBtnOpRaisedTo() {
		return btnOpRaisedTo;
	}

	/**
	 * @param btnOpRaisedTo the btnOpRaisedTo to set
	 */
	public void setBtnOpRaisedTo(JButton btnOpRaisedTo) {
		this.btnOpRaisedTo = btnOpRaisedTo;
	}

	/**
	 * @return the btnSquareRoot
	 */
	public JButton getBtnSquareRoot() {
		return btnSquareRoot;
	}

	/**
	 * @param btnSquareRoot the btnSquareRoot to set
	 */
	public void setBtnSquareRoot(JButton btnSquareRoot) {
		this.btnSquareRoot = btnSquareRoot;
	}

	/**
	 * @return the btnOpCalcResult
	 */
	public JButton getBtnOpCalcResult() {
		return btnOpCalcResult;
	}

	/**
	 * @param btnOpCalcResult the btnOpCalcResult to set
	 */
	public void setBtnOpCalcResult(JButton btnOpCalcResult) {
		this.btnOpCalcResult = btnOpCalcResult;
	}

	/**
	 * @return the btnOpAddDecimal
	 */
	public JButton getBtnOpAddDecimal() {
		return btnOpAddDecimal;
	}

	/**
	 * @param btnOpAddDecimal the btnOpAddDecimal to set
	 */
	public void setBtnOpAddDecimal(JButton btnOpAddDecimal) {
		this.btnOpAddDecimal = btnOpAddDecimal;
	}

	/**
	 * @return the btnOpChangeSign
	 */
	public JButton getBtnOpChangeSign() {
		return btnOpChangeSign;
	}

	/**
	 * @param btnOpChangeSign the btnOpChangeSign to set
	 */
	public void setBtnOpChangeSign(JButton btnOpChangeSign) {
		this.btnOpChangeSign = btnOpChangeSign;
	}

	/**
	 * @return the btnOpClearCurrentNum
	 */
	public JButton getBtnOpClearCurrentNum() {
		return btnOpClearCurrentNum;
	}

	/**
	 * @param btnOpClearCurrentNum the btnOpClearCurrentNum to set
	 */
	public void setBtnOpClearCurrentNum(JButton btnOpClearCurrentNum) {
		this.btnOpClearCurrentNum = btnOpClearCurrentNum;
	}

	/**
	 * @return the btnOpClear
	 */
	public JButton getBtnOpClear() {
		return btnOpClear;
	}

	/**
	 * @param btnOpClear the btnOpClear to set
	 */
	public void setBtnOpClear(JButton btnOpClear) {
		this.btnOpClear = btnOpClear;
	}

	/**
	 * @return the btnOpSupp
	 */
	public JButton getBtnOpSupp() {
		return btnOpSupp;
	}

	/**
	 * @param btnOpSupp the btnOpSupp to set
	 */
	public void setBtnOpSupp(JButton btnOpSupp) {
		this.btnOpSupp = btnOpSupp;
	}
	
	
}

 
