import javax.swing.*;
import java.awt.*;
public class DialogDemo extends JApplet{
	private int sum;
	public void init() {
		String text1=JOptionPane.showInputDialog("Enter first number");
		String text2=JOptionPane.showInputDialog("Enter first number");
		int num1=Integer.parseInt(text1);
		int num2=Integer.parseInt(text2);
		sum=num1+num2;		
	}
	public void paint(Graphics g) {
		g.drawString("Sum ="+sum, 50, 25);
	}
}
/*
<applet  code="DialogDemo.class" width=300 height=300></applet>
*/