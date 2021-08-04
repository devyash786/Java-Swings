package swings;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;

public class Panel3 extends Panel {
 JList<String> list;
 JComboBox<String> cb;
 
  public Panel3() {
	
	  
	  String value[]= {"Select","item1","Item2","Item3","Item4","Item5","Item6","Item7"};
	  list=new JList<>(value);
	  list.setVisibleRowCount(4);
	  JScrollPane pane=new JScrollPane(list);
	  add(pane);
	  
	  cb=new JComboBox<>(value);
	  add(cb);
	  
	  JToggleButton tb=new JToggleButton("Red");
	  add(tb);
	  tb.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		   if(tb.isSelected())
		   {
			    setBackground(Color.red);
			    tb.setText("White");
		   }
		   else
		   {
			   setBackground(Color.white);
			    tb.setText("red");  
		   }
			
		}
	});
  }
  
}


