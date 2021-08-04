package swings;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class DemoJToolBar extends JPanel {
   JButton b1,b2,b3,b4,b5,b6,b7,b8;
   public DemoJToolBar()
   {
	   JToolBar bar=new JToolBar();
	   bar.setOrientation(JToolBar.VERTICAL);
	   bar.setEnabled(false);
	   b1=new JButton("Button1");
	   b2=new JButton("Button2");
	   b3=new JButton("Button3");
	   b4=new JButton("Button4");
	   b5=new JButton("Button5");
	   b6=new JButton("Button6");
	   b7=new JButton("Button7");
	   b8=new JButton("Button8");
	   bar.add(b1);
	   bar.add(b2);
	   bar.add(b3);
	   bar.add(b4);
	   bar.add(b5);
	   bar.add(b6);
	   bar.add(b7);
	   bar.add(b8);
	   add(bar);
   }
}
