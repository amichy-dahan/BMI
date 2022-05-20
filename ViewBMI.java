
import java.awt.Color;
	import java.awt.Font;
	import java.awt.TextField;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.text.DecimalFormat;

	import javax.swing.AbstractButton;
	import javax.swing.ButtonGroup;
	import javax.swing.JButton;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JRadioButton;
	import javax.swing.JSlider;
	import javax.swing.JTextField;
	import javax.swing.border.EmptyBorder;
	import javax.swing.event.ChangeEvent;
	import javax.swing.event.ChangeListener;


	public class ViewBMI extends JPanel { 
		private static final DecimalFormat df = new DecimalFormat("0.00");
		
		private JPanel contentPane;
		private JTextField firstName;
		private JTextField lastName;
		private JLabel i;
		private JTextField Weight;
		JLabel lblNewLabel_7;
		private double temp;
		JLabel BMI ;
		JLabel WeightStatus ;
		JRadioButton bnt2;
		JLabel Agel;
		TextField Age;
		JRadioButton bnt3;
		JRadioButton bnt4;
		JLabel idealWeight;
		JLabel idW;
		JLabel realWeight; 
		JLabel reW;
		JLabel hello;
		 

		
		public ViewBMI() {
		setBackground(new Color(152, 251, 152));
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		JPanel panel = new JPanel();
		panel.setBounds(10, 21, 291, 231);
		add(panel);
		panel.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("First name");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(0, 0, 109, 14);
		panel.add(lblNewLabel);
		
		firstName = new JTextField();
		firstName.setBounds(0, 12, 96, 20);
		panel.add(firstName);
		firstName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Last name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(0, 35, 96, 14);
		panel.add(lblNewLabel_1);
		
		lastName = new JTextField();
		lastName.setBounds(0, 49, 96, 20);
		panel.add(lastName);
		lastName.setColumns(10);
		
		
		
		Agel = new JLabel("Age");
		Agel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Agel.setBounds(0, 68, 49, 14);
		panel.add(Agel);
		
		Age = new TextField();
		Age.setBounds(0, 85, 24, 21);
		panel.add(Age);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(106, 11, 95, 113);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		
		JLabel lblNewLabel_3 = new JLabel("sex");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setBackground(Color.BLACK);
		lblNewLabel_3.setBounds(0, 0, 85, 14);
		panel_1.add(lblNewLabel_3);
		ButtonGroup group1 = new ButtonGroup();
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Female");
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		rdbtnNewRadioButton.setBounds(0, 15, 111, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Male");
		rdbtnNewRadioButton_1.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		rdbtnNewRadioButton_1.setBounds(0, 33, 95, 23);
		panel_1.add(rdbtnNewRadioButton_1);
		 ActionListener sliceActionListener1 = new ActionListener() {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton aButton = (AbstractButton) actionEvent.getSource();
		      }
		    };
		    group1.add(rdbtnNewRadioButton);
		    group1.add(rdbtnNewRadioButton_1);
		    

		
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(14, 135, 187, 65);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JSlider slider = new JSlider(140, 190);
		slider.setBackground(new Color(240, 255, 240));
		slider.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		slider.setBounds(0, 11, 187, 54);
		panel_2.add(slider);
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(2);
		slider.setPaintTrack(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
		slider.addChangeListener(new ChangeListener() {
			 
		      public void stateChanged(ChangeEvent event) {
		    	  int value = slider.getValue();
		    	  temp = slider.getValue();
		    	  String val = String.valueOf(value);
		    	  i.setText("your Height is: " + val);
		    
		      }
		});
		
		JLabel lblNewLabel_4 = new JLabel("height");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_4.setBounds(10, 112, 49, 21);
		panel.add(lblNewLabel_4);
		
		
		    i = new JLabel("");
		    i.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			i.setBounds(14, 205, 187, 25);
			panel.add(i);
			
			JLabel lblNewLabel_5 = new JLabel("body-frame");
			lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
			lblNewLabel_5.setBounds(207, 11, 85, 14);
			panel.add(lblNewLabel_5);
			ButtonGroup group = new ButtonGroup();
			
			 bnt2 = new JRadioButton("small");
			 bnt2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			 bnt2.setBounds(207, 33, 85, 18);
			panel.add(bnt2);
			
			
			bnt4 = new JRadioButton("large");
			bnt4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			bnt4.setBounds(207, 69, 85, 18);
			panel.add(bnt4);
			
			bnt3 = new JRadioButton("medium");
			bnt3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			bnt3.setBounds(207, 51, 85, 18);
			panel.add(bnt3);
			

		    ActionListener sliceActionListener = new ActionListener() {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton aButton = (AbstractButton) actionEvent.getSource();
		      }
		    };
		    group.add(bnt2);
		    group.add(bnt3);
		    group.add(bnt4);

		   
		
			
			JLabel lblNewLabel_6 = new JLabel("actual weight");
			lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
			lblNewLabel_6.setBounds(207, 115, 81, 14);
			panel.add(lblNewLabel_6);
			
			Weight = new JTextField();
			Weight.setBounds(217, 135, 42, 20);
			panel.add(Weight);
			Weight.setColumns(10);
			
			
			//BMI FUNC
			JButton btnNewButton_1 = new JButton("BMI");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					hello.setText("hello " + firstName.getText()+" "+lastName.getText()) ;
					
					double H = temp/100;
					double W = Integer.parseInt(Weight.getText());
					double resultH = H*H;
				    double BMIcal =W/resultH;
				    BMI.setText("Your BMI :");
					
					//Weight Status 
			        lblNewLabel_7.setText(df.format(BMIcal));
			         if (BMIcal <= 15) {
			        	 WeightStatus.setText("Anorexic");
			         }
			         if (BMIcal >= 15 && BMIcal <= 18.5) {
			        	 WeightStatus.setText("Underweight");
			         }
			         if (BMIcal >= 18.5 && BMIcal <= 24.9) {
			        	 WeightStatus.setText("Normal");
			         }
			         if (BMIcal >= 25.0 && BMIcal <= 29.9) {
			        	 WeightStatus.setText("Overweight");
			         }
			         if (BMIcal >= 30.0 && BMIcal <= 35) {
			        	 WeightStatus.setText("Obese");
			         }
			         if (BMIcal > 35 ) {
			        	 WeightStatus.setText("Extreme Obese");
			         }
			         
			         double ideal;
			         int age;
			          if ( bnt2.isSelected()) {
			        	  
			        	  age =Integer.parseInt(Age.getText());
			        	  ideal = (temp - ModelBMI.ONE_HUNDRED +(age/ModelBMI.TEN))*ModelBMI.ZERO_POINT_NINE*0.9; 
			        	  idealWeight.setText("ideal Weight :");
			        	  idW.setText(String.valueOf(ideal));
			        	  realWeight.setText("real Weight :");
			        	  reW.setText(Weight.getText());
			          }
			          if ( bnt3.isSelected()) {
			        	  
			        	  age =Integer.parseInt(Age.getText());
			        	  ideal = (temp - ModelBMI.ONE_HUNDRED +(age/ModelBMI.TEN))*ModelBMI.ZERO_POINT_NINE*1; 
			        	  idealWeight.setText("ideal Weight :");
			        	  idW.setText(String.valueOf(ideal));
			        	  realWeight.setText("real Weight :");
			        	  reW.setText(Weight.getText());
			        	  
			        	  
			          }
			          if ( bnt4.isSelected()) {
			        	  
			        	  age =Integer.parseInt(Age.getText());
			        	  ideal = (temp - ModelBMI.ONE_HUNDRED +(age/ModelBMI.TEN))*ModelBMI.ZERO_POINT_NINE*1.1; 
			        	  idealWeight.setText("ideal Weight :");
			        	  idW.setText(String.valueOf(ideal));
			        	  realWeight.setText("real Weight :");
			        	  reW.setText(Weight.getText());
			          }
			       
				}
			});
			btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
			btnNewButton_1.setBackground(new Color(0, 255, 255));
			
			btnNewButton_1.setBounds(211, 181, 70, 23);
			panel.add(btnNewButton_1);
			
			JPanel panel_3 = new JPanel();
			panel_3.setBackground(new Color(224, 255, 255));
			panel_3.setBounds(302, 21, 138, 231);
			add(panel_3);
			panel_3.setLayout(null);
			
		    lblNewLabel_7 = new JLabel("");
		    lblNewLabel_7.setBounds(0, 108, 49, 14);
		    panel_3.add(lblNewLabel_7);
		    
		    BMI = new JLabel("");
		    BMI.setBounds(0, 83, 84, 14);
		    panel_3.add(BMI);
		    BMI.setFont(new Font("Times New Roman", Font.BOLD, 14));
		    
		    WeightStatus = new JLabel("");
		    WeightStatus.setFont(new Font("Tahoma", Font.PLAIN, 11));
		    WeightStatus.setBounds(54, 108, 84, 14);
		    panel_3.add(WeightStatus);
		    
		    realWeight = new JLabel("");
		    realWeight.setFont(new Font("Times New Roman", Font.BOLD, 14));
		    realWeight.setBounds(0, 133, 94, 25);
		    panel_3.add(realWeight);
		    
		    idealWeight = new JLabel("");
		    idealWeight.setFont(new Font("Times New Roman", Font.BOLD, 14));
		    idealWeight.setBounds(0, 182, 94, 25);
		    panel_3.add(idealWeight);
		    
		    idW = new JLabel("");
		    idW.setFont(new Font("Tahoma", Font.BOLD, 11));
		    idW.setBounds(20, 206, 49, 25);
		    panel_3.add(idW);
		    
		    reW = new JLabel("");
		    reW.setFont(new Font("Tahoma", Font.BOLD, 11));
		    reW.setBounds(20, 158, 49, 25);
		    panel_3.add(reW);
		    
		    hello = new JLabel("");
		    hello.setFont(new Font("Rockwell Condensed", Font.BOLD, 13));
		    hello.setBounds(0, 11, 138, 14);
		    panel_3.add(hello);

	        
		
		
		}
	}
	
	