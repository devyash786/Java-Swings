package swings;
import java.awt.BorderLayout;
import javax.swing.*;
public class DemoSplitPane extends JFrame{
	JSplitPane pane;
	public DemoSplitPane()
	{
		FrameProperties.setProperty(this, 800, 600, true);
		setLayout(new BorderLayout());
		pane=new JSplitPane();
		//pane.setEnabled(false);
		
		pane.setLeftComponent(new DemoJToolBar());
		pane.setRightComponent(new DemoTabbedPane());
		add(pane);
		
	}

	public static void main(String args[])
	{
		new DemoSplitPane().setVisible(true);
	}
}
