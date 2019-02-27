import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
@SuppressWarnings("serial")
public class MyWindow extends JFrame {
	public static void main(String[] args) {
		new MyWindow();
	}
	public MyWindow() {
		setSize(500,500);
		setVisible(true);
		setTitle("My Window");
	}
	@Override
	public void paint(Graphics g) { //function overriding
		g.drawRect(50, 50, 100, 25);
		g.setColor(new Color(0,0,255));
		g.drawOval(200,50,50,50);
		g.setColor(Color.GREEN);
		g.fillRect(50, 200, 100, 30);
		g.setColor(Color.BLACK);
		g.drawString("My String", 200, 200);
	}
}
