import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Test 
{
	public static void main(String args[])
	{
		JFrame frame=new JFrame();
		frame.setSize(350,150);
		frame.setLocation(400, 200);
		frame.setTitle("JAVA Certification Quiz");
		
		JPanel panel=new JPanel();
		frame.add(panel);
		
		JLabel label1=new JLabel("Enter Pin: ");
		panel.add(label1);
		
		JTextField field1=new JTextField(10);
		panel.add(field1);
		
		JButton button1=new JButton(" Enter ");
		panel.add(button1);
			
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}