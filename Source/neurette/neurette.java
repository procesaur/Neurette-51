package neurette;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.neuroph.core.NeuralNetwork;


public class neurette
{
	private JFrame frmNeurette;
	private static NeuralNetwork nnet;
  
	public static void main(String[] args)
	{
		setNnet(new NeuralNetwork());
		setNnet(NeuralNetwork.createFromFile("nnet.nnet"));


		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					neurette window = new neurette();
					window.frmNeurette.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
  

	public neurette(){}
  
	private void initialize()
	{
	
		this.frmNeurette = new JFrame();
		this.frmNeurette.setTitle("Neurette");
		this.frmNeurette.setBounds(100, 100, 486, 507);
		this.frmNeurette.setDefaultCloseOperation(3);
		this.frmNeurette.getContentPane().setLayout(null);

		JComboBox comboBox_0 = new JComboBox();
		comboBox_0.setToolTipText("First Drawn number");
		comboBox_0.setBounds(21, 30, 97, 27);
		this.frmNeurette.getContentPane().add(comboBox_0);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(21, 72, 97, 27);
		this.frmNeurette.getContentPane().add(comboBox_1);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(21, 114, 97, 27);
		this.frmNeurette.getContentPane().add(comboBox_2);

		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(21, 156, 97, 27);
		this.frmNeurette.getContentPane().add(comboBox_3);

		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(21, 198, 97, 27);
		this.frmNeurette.getContentPane().add(comboBox_4);

		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(21, 240, 97, 27);
		this.frmNeurette.getContentPane().add(comboBox_5);

		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(21, 282, 97, 27);
		this.frmNeurette.getContentPane().add(comboBox_6);

		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBounds(21, 324, 97, 27);
		this.frmNeurette.getContentPane().add(comboBox_7);

		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setBounds(21, 366, 97, 27);
		this.frmNeurette.getContentPane().add(comboBox_8);

		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setBounds(21, 408, 97, 27);
		this.frmNeurette.getContentPane().add(comboBox_9);

		JComboBox comboBox = new JComboBox();
		comboBox.setEnabled(false);
		comboBox.setBounds(187, 58, 128, 54);
		this.frmNeurette.getContentPane().add(comboBox);

		JButton btnNewButton_1 = new JButton("Add new draw");
		btnNewButton_1.addActionListener(new ActionListener() 
		{
			private final JComboBox val$comboBox_9;
			private final JComboBox val$comboBox_8;

			public void actionPerformed(ActionEvent arg0) 
			{ 
				this.val$comboBox_9.setSelectedIndex(this.val$comboBox_8.getSelectedIndex());
				this.val$comboBox_8.setSelectedIndex(this.val$comboBox_7.getSelectedIndex());
				this.val$comboBox_7.setSelectedIndex(this.val$comboBox_6.getSelectedIndex());
				this.val$comboBox_6.setSelectedIndex(this.val$comboBox_5.getSelectedIndex());
				this.val$comboBox_5.setSelectedIndex(this.val$comboBox_4.getSelectedIndex());
				this.val$comboBox_4.setSelectedIndex(this.val$comboBox_3.getSelectedIndex());
				this.val$comboBox_3.setSelectedIndex(this.val$comboBox_2.getSelectedIndex());
				this.val$comboBox_2.setSelectedIndex(this.val$comboBox_1.getSelectedIndex());
				this.val$comboBox_1.setSelectedIndex(this.val$comboBox_0.getSelectedIndex());
				this.val$comboBox_0.setSelectedIndex(this.val$comboBox.getSelectedIndex());
			}

		});
		
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBounds(324, 58, 117, 54);
		this.frmNeurette.getContentPane().add(btnNewButton_1);

		JLabel lblInputLast = new JLabel("Input last 10 draws (top is last)");
		lblInputLast.setFont(new Font("Tahoma", 0, 13));
		lblInputLast.setBounds(10, 0, 198, 25);
		this.frmNeurette.getContentPane().add(lblInputLast);

		JLabel label = new JLabel("");
		label.setHorizontalAlignment(0);
		label.setBounds(187, 11, 254, 36);
		this.frmNeurette.getContentPane().add(label);

		JLabel lblOutput = new JLabel("");
		lblOutput.setHorizontalAlignment(0);
		lblOutput.setBounds(187, 314, 254, 46);
		this.frmNeurette.getContentPane().add(lblOutput);

		JButton btnNewButton = new JButton("Predict");
		btnNewButton.addActionListener(new ActionListener() 
		{
			private final JComboBox val$comboBox_7;

			public void actionPerformed(ActionEvent arg0) 
			{ 
			
				double[] input = { this.val$a[this.val$comboBox_9.getSelectedIndex()], this.val$a[this.val$comboBox_8.getSelectedIndex()], this.val$a[this.val$comboBox_7.getSelectedIndex()], this.val$a[this.val$comboBox_6.getSelectedIndex()], this.val$a[this.val$comboBox_5.getSelectedIndex()], this.val$a[this.val$comboBox_4.getSelectedIndex()], this.val$a[this.val$comboBox_3.getSelectedIndex()], this.val$a[this.val$comboBox_2.getSelectedIndex()], this.val$a[this.val$comboBox_1.getSelectedIndex()], this.val$a[this.val$comboBox_0.getSelectedIndex()] };

				this.val$lblInputLast.setText("");
				this.val$label.setText("Input newest draw");

				this.val$comboBox.setEnabled(true);
				this.val$btnNewButton_1.setEnabled(true);
				neurette.nnet.setInput(input);
				neurette.nnet.calculate();
				double[] output = neurette.nnet.getOutput();

				if (output[0] > 0.5D)
				{
					this.val$lblOutput.setText("play zero half (22-17)");
				} 
				else 
				{
					this.val$lblOutput.setText("play opposite half (34-9)");
				}
			}

		});
		
		btnNewButton.setBounds(187, 179, 254, 88);
		this.frmNeurette.getContentPane().add(btnNewButton);

		int max = 36;
		for (int i = 0; i <= max; i++) 
		{
			comboBox_0.addItem(new Integer(i));
			comboBox_1.addItem(new Integer(i));
			comboBox_2.addItem(new Integer(i));
			comboBox_3.addItem(new Integer(i));
			comboBox_4.addItem(new Integer(i));
			comboBox_5.addItem(new Integer(i));
			comboBox_6.addItem(new Integer(i));
			comboBox_7.addItem(new Integer(i));
			comboBox_8.addItem(new Integer(i));
			comboBox_9.addItem(new Integer(i));
			comboBox.addItem(new Integer(i));
		} 
	}
  
	private final JComboBox val$comboBox_6;
	private final JComboBox val$comboBox_5;  
	public static NeuralNetwork getNnet() { return nnet; } 
	private final JComboBox val$comboBox_4; 
	public static void setNnet(NeuralNetwork nnet) { nnet = nnet; }
	private final JComboBox val$comboBox_3;
	private final JComboBox val$comboBox_2;
	private final JComboBox val$comboBox_1;
	private final JComboBox val$comboBox_0;
	private final JComboBox val$comboBox;
	private final double[] val$a;
	private final JComboBox val$comboBox_9;
	private final JComboBox val$comboBox_8;
	private final JComboBox val$comboBox_7;
	private final JComboBox val$comboBox_6;
	private final JComboBox val$comboBox_5;
	private final JComboBox val$comboBox_4;
	private final JComboBox val$comboBox_3;
	private final JComboBox val$comboBox_2;
	private final JComboBox val$comboBox_1;
	private final JComboBox val$comboBox_0;
	private final JLabel val$lblInputLast;
	private final JLabel val$label;
	private final JComboBox val$comboBox;
	private final JButton val$btnNewButton_1;
	private final JLabel val$lblOutput;
}
