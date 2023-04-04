import java.applet.*;
import java.awt.*;
public class AppDemo extends Applet{
	public void paint(Graphics g) {
		g.drawString("hello", 50, 25);
	}
}
/*
<applet  code="AppDemo.class" width=300 height=300></applet>
*/