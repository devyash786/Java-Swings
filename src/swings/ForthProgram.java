package swings;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;

public class ForthProgram extends JFrame implements ActionListener {
  JButton b1;
 
  public ForthProgram() {
	  FrameProperties.setProperty(this,800, 300, true);
	  b1=new JButton("Show Dialog");
	  b1.setToolTipText("Click to show dialogs");
	  add(b1);
	  b1.addActionListener(this);
	
		   }
    @Override
    public void actionPerformed(ActionEvent e)
    {
    	 JOptionPane.showMessageDialog(this,"Demo of Option Pane", "Title Bar", JOptionPane.ERROR_MESSAGE);
    	 JOptionPane.showMessageDialog(this,"Demo of Option Pane", "Title Bar", JOptionPane.WARNING_MESSAGE);
    	 JOptionPane.showMessageDialog(this,"Demo of Option Pane", "Title Bar", JOptionPane.QUESTION_MESSAGE);
    	 JOptionPane.showMessageDialog(this,"Demo of Option Pane", "Title Bar", JOptionPane.PLAIN_MESSAGE);
    	 JOptionPane.showMessageDialog(this,"Demo of Option Pane", "Title Bar", JOptionPane.INFORMATION_MESSAGE);
    }

  public static void main(String args[])
  {
	   new ForthProgram().setVisible(true);;
  }
}


