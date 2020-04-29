package destroy;

import java.awt.event.*;

import javax.swing.*;

public class dstry implements ActionListener,Runnable{
	JFrame frame;
	JTextField tf;
	JLabel jl;
	JButton jb;
	boolean value=true;
	Thread t;
	public dstry()
	{
		t=new Thread(this,"destroy");
		t.start();
	}
	public void actionPerformed(ActionEvent ae) {
		if(tf.getText().equalsIgnoreCase("password"))
		{
			value=false;
			frame.dispose();
		}
		else
		{
			value=true;
			frame.dispose();
		}
	}
	public void run() {
		while(value)
		{
			frame = new JFrame();
			frame.setBounds(100, 100, 575, 443);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			tf = new JTextField();
			tf.setBounds(264, 126, 116, 22);
			frame.getContentPane().add(tf);
			tf.setColumns(10);
			
			jl = new JLabel("enter name");
			jl.setBounds(88, 129, 98, 19);
			frame.getContentPane().add(jl);
			
			jb = new JButton("done");
			jb.setBounds(196, 286, 97, 25);
			frame.getContentPane().add(jb);
			jb.addActionListener(this);
			frame.setVisible(true);
			new create();
			try {
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			frame.dispose();
		}
		
	}

}