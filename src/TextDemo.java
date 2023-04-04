import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TextDemo extends Applet{
	TextField text1,text2;
	Label l1,l2,l3;
	Button button;
	private int sum;
	public void init(){
		setLayout(null);
		l1=new Label("First Number");
		l1.setBounds(10,10,150,25);
		add(l1);
		
		l2=new Label("Second Number");
		l2.setBounds(10,60,150,25);
		add(l2);
		
		button=new Button("Compute Sum");
		button.setBounds(50,110,100,25);
		add(button);
		
		l3=new Label();
		l3.setBounds(50,160,100,25);
		add(l3);
		
		text1=new TextField();
		text1.setBounds(250,10,120,25);
		add(text1);
		
		text2=new TextField();
		text2.setBounds(250,60,120,25);
		add(text2);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String t1=text1.getText();
				String t2=text2.getText();
				int num1=Integer.parseInt(t1);
				int num2=Integer.parseInt(t2);
				sum=num1+num2;
				l3.setText("Sum="+sum);
			}
		});
	}
	public void paint(Graphics g) {
		String t1=text1.getText();
		String t2=text2.getText();
		int num1=Integer.parseInt(t1);
		int num2=Integer.parseInt(t2);
		sum=num1+num2;
		g.drawString("sum="+sum, 20, 250);
		//l3.setText("Sum="+sum);
	}
}
//<applet  code="TextDemo.class" width=800 height=800></applet>
