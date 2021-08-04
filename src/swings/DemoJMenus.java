package swings;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class DemoJMenus extends JFrame{
	JMenuBar bar;
	JMenu m1,m2;
	JMenuItem i1,i2,i3,i4,i5,i6;
	
	public DemoJMenus()
	{
		 setSize(500,300);
		 setLocationRelativeTo(this);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 //setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		 bar=new JMenuBar();
		 setJMenuBar(bar);
		 m1=new JMenu("File");
		 m2=new JMenu("Edit");
		 bar.add(m1);
		 bar.add(m2);
		 i1=new JMenuItem("New");
		 i2=new JMenuItem("Open");
		 i3=new JMenuItem("Save");
		 i4=new JMenuItem("Cut");
		 i5=new JMenuItem("Copy");
		 i6=new JMenuItem("Paste");
		 m1.add(i1);
		 m1.addSeparator();
		 m1.add(i2);
		 m1.addSeparator();
		 m1.add(i3);
		
		 m2.add(i4);
		 m2.addSeparator();
		 m2.add(i5);
		 m2.addSeparator();
		 m2.add(i6);
		
	}
	public static void main(String args[])
	{
		 DemoJMenus obj=new DemoJMenus();
		 obj.setVisible(true);
	}

}





