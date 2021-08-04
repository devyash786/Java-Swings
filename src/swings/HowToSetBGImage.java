import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class HowToSetBGImage extends JFrame
{
	public HowToSetBGImage()
	{
		setLayout(null);
		setResizable(false);
		setSize(400,200);
		setLocationRelativeTo(this);
		
		JLabel lbl=new JLabel(new ImageIcon("bg.jpg"));
		lbl.setBounds(0,0,400,200);
		add(lbl);
		
		JLabel l1=new JLabel("Enter username");
				
		JLabel l2=new JLabel("Enter password");
	    JTextField t1=new JTextField(10);
	    JPasswordField p1=new JPasswordField(10);
	    p1.setEchoChar('*');
	    JButton b1=new JButton("SAVE");
	    JButton b2=new JButton("RESET");
	    
	    l1.setBounds(100, 30, 100, 20);  //x,y,w,h
		t1.setBounds(210, 30, 100, 20);  //x,y,w,h
		
		l2.setBounds(100, 60, 100, 20);  //x,y,w,h
		p1.setBounds(210, 60, 100, 20);  //x,y,w,h
		
		b1.setBounds(100, 90, 100, 20);  //x,y,w,h
		b2.setBounds(210, 90, 100, 20);  //x,y,w,h
	    lbl.add(l1);lbl.add(t1);lbl.add(l2);lbl.add(p1);lbl.add(b1);lbl.add(b2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HowToSetBGImage().setVisible(true);

	}

}
