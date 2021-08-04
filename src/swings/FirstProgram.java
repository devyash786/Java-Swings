package swings;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class FirstProgram extends JFrame {
	JLabel l1,l2;
	JTextField t1;
	JPasswordField p1;
	JButton b1,b2;
	public FirstProgram()
	{
		setSize(700,500);
		setLayout(new FlowLayout());
		setLocationRelativeTo(this);
		//setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		l1=new JLabel("Username");
		l2=new JLabel("Password");
		t1=new JTextField(10);
		p1=new JPasswordField(10);
		//p1.setEchoChar('*');
		b1=new JButton("Save");
		b2=new JButton("Reset");
		add(l1);add(t1);
		add(l2);add(p1);
		add(b1);add(b2);
		
	}
	public static void main(String []args)
	{
		new FirstProgram().setVisible(true);
	}

}
