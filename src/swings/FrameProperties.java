package swings;

import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;

public class FrameProperties {
	public  static void setProperty(JFrame frm,int w,int h,LayoutManager layout,boolean resizable,int closeOperation)
	{
		frm.setSize(w,h);
		frm.setLayout(layout);
		frm.setLocationRelativeTo(frm);
		frm.setResizable(resizable);
		frm.setDefaultCloseOperation(closeOperation);
		
	}
	public  static void setProperty(JFrame frm,int w,int h,boolean resizable)
	{
		frm.setSize(w,h);
		frm.setLayout(new FlowLayout());
		frm.setLocationRelativeTo(frm);
		frm.setResizable(resizable);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
