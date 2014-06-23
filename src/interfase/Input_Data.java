package interfase;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import calendar.*;
import file.WriteFile;

public class Input_Data extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField inputSleep;
	private JTextField inputSport;
	private JTextField inputEducation;
	private JTextField inputNet;
	private WriteFile write = new WriteFile();
	private WarningWindow dialog;

	public Input_Data() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("pictures\\clock.png"));
		initialization(MyCalendar.getDay(),MyCalendar.getYear(), MyCalendar.getMonth(),
				new Info_everyday(0,0,0,0));
	}
	
	public Input_Data(int remove_day, int year, String month, Info_everyday day){
		setIconImage(Toolkit.getDefaultToolkit().getImage("pictures\\clock.png"));
		initialization(remove_day, year, month, day);
	}
	
	//инициализация окна
	
	void initialization(final int remove_day, final int year, final String month, final Info_everyday day) {
		setBounds(300, 150, 450, 300);
		setTitle("Просмотр и ввод информации");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			inputSleep = new JTextField();
			inputSleep.setBounds(224, 34, 103, 32);
			//запрет ввода символов в поле
			inputSleep.addKeyListener(new java.awt.event.KeyAdapter() {
		        public void keyTyped(java.awt.event.KeyEvent e) {
		          char a = e.getKeyChar();
		          if (!Character.isDigit(a)
		             && (a != '\b')) {
		            e.consume();
		          }
		        }
		      });
			if(day.getNet()!=0 || day.getSleep()!=0 || day.getEducation()!=0 || day.getSport()!=0) 
				inputSleep.setText(day.getSleep()+"");
			contentPanel.add(inputSleep);
			inputSleep.setColumns(10);
		}
		
		JLabel label = new JLabel("\u0421\u043E\u043D"); // "Сон"
		label.setFont(new Font("Ubuntu", Font.PLAIN, 19));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(10, 37, 193, 27);
		contentPanel.add(label);
		
		JLabel label_1 = new JLabel("\u0421\u043F\u043E\u0440\u0442"); // "Спорт"
		label_1.setFont(new Font("Ubuntu", Font.PLAIN, 19));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(10, 80, 193, 27);
		contentPanel.add(label_1);
		
		inputSport = new JTextField();
		inputSport.setColumns(10);
		inputSport.setBounds(224, 77, 103, 32);
		if(day.getNet()!=0 || day.getSleep()!=0 || day.getEducation()!=0 || day.getSport()!=0) 
			inputSport.setText(day.getSport()+"");
		//запрет ввода символов в поле
		inputSport.addKeyListener(new java.awt.event.KeyAdapter() {
	        public void keyTyped(java.awt.event.KeyEvent e) {
	          char a = e.getKeyChar();
	          if (!Character.isDigit(a)
	              && (a != '\b')) {
	            e.consume(); }}} );
		contentPanel.add(inputSport);
		
		JLabel label_2 = new JLabel("\u041E\u0431\u0440\u0430\u0437\u043E\u0432\u0430\u043D\u0438\u0435"); // "Образование"
		label_2.setFont(new Font("Ubuntu", Font.PLAIN, 19));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(10, 123, 193, 27);
		contentPanel.add(label_2);
		
		inputEducation = new JTextField();
		inputEducation.setColumns(10);
		inputEducation.setBounds(224, 120, 103, 32);
		if(day.getNet()!=0 || day.getSleep()!=0 || day.getEducation()!=0 || day.getSport()!=0) 
			inputEducation.setText(day.getEducation()+"");
		//запрет ввода символов в поле
				inputEducation.addKeyListener(new java.awt.event.KeyAdapter() {
			        public void keyTyped(java.awt.event.KeyEvent e) {
			          char a = e.getKeyChar();
			          if (!Character.isDigit(a)
			              && (a != '\b')) {
			            e.consume();
			          }
			        }
			      });
		contentPanel.add(inputEducation);
		
		JLabel label_3 = new JLabel("\u0421\u043E\u0446\u0441\u0435\u0442\u0438"); // "Соцсети"
		label_3.setFont(new Font("Ubuntu", Font.PLAIN, 19));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(10, 164, 193, 27);
		contentPanel.add(label_3);
		
		inputNet = new JTextField();
		inputNet.setColumns(10);
		inputNet.setBounds(224, 161, 103, 32);
		if(day.getNet()!=0 || day.getSleep()!=0 || day.getEducation()!=0 || day.getSport()!=0) 
			inputNet.setText(day.getNet()+"");
		//запрет ввода символов в поле
				inputNet.addKeyListener(new java.awt.event.KeyAdapter() {
			        public void keyTyped(java.awt.event.KeyEvent e) {
			          char a = e.getKeyChar();
			          if (!Character.isDigit(a)
			              && (a != '\b')) {
			            e.consume();
			          }
			        }
			      });
		contentPanel.add(inputNet);
		
		JLabel label_4 = new JLabel("\u0447\u0430\u0441"); // "час"
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Ubuntu", Font.PLAIN, 19));
		label_4.setBounds(337, 37, 87, 27);
		contentPanel.add(label_4);
		
		JLabel label_5 = new JLabel("\u0447\u0430\u0441"); // "час"
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Ubuntu", Font.PLAIN, 19));
		label_5.setBounds(337, 80, 87, 27);
		contentPanel.add(label_5);
		
		JLabel label_6 = new JLabel("\u0447\u0430\u0441"); // "час"
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Ubuntu", Font.PLAIN, 19));
		label_6.setBounds(337, 123, 87, 27);
		contentPanel.add(label_6);
		
		JLabel label_7 = new JLabel("\u0447\u0430\u0441"); // "час"
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Ubuntu", Font.PLAIN, 19));
		label_7.setBounds(337, 164, 87, 27);
		contentPanel.add(label_7);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			// "Заполните все поля"
			final JLabel label_8 = new JLabel("\u0417\u0430\u043F\u043E\u043B\u043D\u0438\u0442\u0435 \u0432\u0441\u0435 \u043F\u043E\u043B\u044F!");
			label_8.setHorizontalAlignment(SwingConstants.CENTER);
			label_8.setFont(new Font("Ubuntu", Font.PLAIN, 16));
			label_8.setVisible(false);
			buttonPane.add(label_8); 
			{
				JButton okButton = new JButton("Сохранить");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						if(inputSleep.getText().equals("")||inputSport.getText().equals("")||
							inputEducation.getText().equals("")||inputNet.getText().equals("")) {label_8.setVisible(true);} 
						//считывание  и запись в массив  и в файл инфоормации
						else {
							if(inputSleep.getText().length()>3||inputSport.getText().length()>3||inputEducation.getText().length()>3||
									inputNet.getText().length()>=3) {
								dialog = new WarningWindow("Число не должно превышать двух символов");
								dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
								dialog.setVisible(true);
							} else {
							int ch1 =Integer.parseInt(inputSleep.getText());
							int ch2 = Integer.parseInt(inputSport.getText());
							int ch3 = Integer.parseInt(inputEducation.getText());
							int ch4 = Integer.parseInt(inputNet.getText());
							
							Info_month.array_month.remove(remove_day);
							Info_month.array_month.put(remove_day, new Info_everyday(ch1,ch2,ch3,ch4));
							write.new_write_everyday(remove_day, new Info_everyday(ch1,ch2,ch3,ch4));
							setVisible(false);
							dispose();
							}
						}	
					if(inputSleep.getText().equals("")==false) {
						int ch1 =Integer.parseInt(inputSleep.getText());
						int ch2 = Integer.parseInt(inputSport.getText());
						int ch3 = Integer.parseInt(inputEducation.getText());
						int ch4 = Integer.parseInt(inputNet.getText());
 
						write.rewrite(remove_day, year, month, new Info_everyday(ch1,ch2,ch3,ch4));
						setVisible(false);
						dispose();
					}}} );
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Выход");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
