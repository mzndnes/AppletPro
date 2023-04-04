import java.applet.*;
import java.awt.*;
public class ParaPassing extends Applet
{
	String str;
	public void init()
	{
		str=getParameter("name1");
		if(str==null) {
			str="Java";
			str="Hello "+str;
		}
	}
		public void paint(Graphics g)
		{
			g.drawString(str,50,50);
		}
	
}