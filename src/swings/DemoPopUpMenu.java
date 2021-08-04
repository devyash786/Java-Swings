package swings;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
public class DemoPopUpMenu extends JFrame {
	JPopupMenu pop;
	JMenuItem i1,i2,i3,i4;
	public DemoPopUpMenu()
	{
		setSize(700,400);
		setLayout(new FlowLayout());
		setLocationRelativeTo(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pop=new JPopupMenu();
		add(pop);
		i1=new JMenuItem("Item1");
		i2=new JMenuItem("Item2");
		i3=new JMenuItem("Item3");
		i4=new JMenuItem("Exit");
		pop.add(i1);
		pop.addSeparator();
		pop.add(i2);
		pop.addSeparator();
		pop.add(i3);
		pop.addSeparator();
		pop.add(i4);
		i4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e)
			{
				if(e.getButton()==MouseEvent.BUTTON3)
				{
					pop.show(DemoPopUpMenu.this,e.getX(),e.getY());
					
				}
			}
		});
	}
	
	public static void main(String args[])
	{
		
		DemoPopUpMenu obj =new DemoPopUpMenu();
		obj.setVisible(true);
		
	}
	

}
