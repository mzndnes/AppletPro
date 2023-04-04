import java.applet.*;
import java.awt.*;
public class StatusDemo extends Applet{
	private int sum;
	public void init() {
		setBackground(Color.cyan);	
	}
	public void paint(Graphics g) {
		g.drawString("This is in the applet window", 10, 20);
		showStatus("This is shown in the status window");
	}
}
//<applet  code="StatusDemo.class" width=300 height=300></applet>	