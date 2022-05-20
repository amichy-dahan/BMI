
	import javax.swing.JFrame;
	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;


	public class ControllerBMI extends JFrame {
		public ControllerBMI() {
		}

		 public static void main (String[] args)
		   {
		      JFrame frame = new JFrame ("BMI");
		      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(100, 100, 519, 300);
		      ViewBMI view = new ViewBMI();
		      frame.getContentPane().add(view);
		      frame.setVisible(true);
		      
		   }
	}