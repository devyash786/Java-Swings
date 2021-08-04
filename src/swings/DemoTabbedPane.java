package swings;
import javax.swing.*;


public class DemoTabbedPane extends JPanel {
	JTabbedPane pane;
	public DemoTabbedPane()
	{
		 //FrameProperties.setProperty(this,800, 600, true);
		 pane=new JTabbedPane();
		 pane.addTab("First Tab", new Panel1());
		 pane.addTab("Second Tab", new Panel2());
		 pane.addTab("Third Tab", new Panel3());
		 
		 
		 add(pane);
	}
	/*public static void main(String args[])
	{
		new DemoTabbedPane().setVisible(true);
	}*/

}
