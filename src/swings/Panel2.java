package swings;

import java.awt.FlowLayout;
import java.awt.TextArea;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Panel2 extends JPanel {
	  JTextArea ta;
	  JCheckBox c1,c2,c3;
	  JRadioButton r1,r2,r3;
	  
	  public Panel2()
	  {
		 
		  ta=new JTextArea(5,25);
		  JScrollPane pane=new JScrollPane(ta);
		  add(pane);
		  c1=new JCheckBox("Java");
		  c2=new JCheckBox("Python");
		  c3=new JCheckBox("C");
		  add(c1);add(c2);add(c3);
		  r1=new JRadioButton("Red");
		  r2=new JRadioButton("Green");
		  r3=new JRadioButton("yellow");
		  ButtonGroup bg=new ButtonGroup();
		  bg.add(r1);bg.add(r2);bg.add(r3);
		  add(r1);add(r2);add(r3);
		  
				  
	  }
	 

	

}
