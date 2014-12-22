import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class mframe {
JFrame f = new JFrame();
JLabel Überschrift = new JLabel();
JButton b=new JButton();
JTextField tf1=new JTextField();
JTextField tf2=new JTextField();
	public mframe (){
		f.setBounds(0,0,500,300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setVisible(true);
		Überschrift.setBounds(0, 0, 50, 15);
		Überschrift.setText("Rechner");
		b.setBounds(0, 20, 100, 20);
		b.setText("rechnen");
		b.addActionListener(new mylist());
		tf1.setBounds(0,40, 100, 20);
		tf2.setBounds(0,60, 100, 20);
		f.add(Überschrift);
		f.add(b);
		f.add(tf1);
		f.add(tf2);
	
}
	public class mylist implements ActionListener{

		
		public void actionPerformed(ActionEvent arg0) {
			
			int  tff1= Integer.parseInt(tf1.getText());
			int  tff2= Integer.parseInt(tf2.getText());
			int erg = tff1+tff2;
			String aus = Integer.toString(erg);
			Überschrift.setText(aus);
		}
		
	}
}
