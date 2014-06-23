package interfase;

import calendar.Info_everyday;
import calendar.Info_month;
import calendar.MyCalendar;
import java.util.ArrayList;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import file.ReadFile;

public class MainWindow extends JFrame implements ActionListener, MouseListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;  //1-я панель для отображения календаря
	private JButton button_1,button_2,button_3,button_4,button_5,button_6,button_7,button_8,
	button_14,button_13,button_12,button_11,button_10,button_9,button_15,button_21,button_20,button_19,
	button_18,button_17,button_16,button_22,button_28,button_27,button_26,button_25,button_24,button_23,
	button_29,button_35,button_34,button_33,button_32,button_31,button_30,button_36,button_37;
	
	private JLabel label,label_1,label_2,label_3,label_4,label_5,label_6;
	
	//создание массива кнопок
	ArrayList<JButton> mas_button = new ArrayList<JButton>();
	
	private JLabel fildDate;
	private JLabel label_8;
	private JButton button_arrow_left_for_statistics;
	private JButton button_arrow_right_for_statistics;
	private JButton button_arrow_left;
	private JButton button_arrow_right;
	private JButton button_month_for_statistics;
	private JButton button_sleep_for_statistics;
	private JButton button_sport_for_statistics;
	private JButton	button_education_for_statistics;
	private JButton button_net_for_statistics;
	private JButton button_month;
	private JLabel info_sleep;
	private JLabel info_sport;
	private JLabel info_education;
	private JLabel info_net;
	
	//создание картинок
	ImageIcon icon_sleep = new ImageIcon("pictures\\sleep.png");
	ImageIcon icon_sport = new ImageIcon("pictures\\sport.png");
	ImageIcon icon_education = new ImageIcon("pictures\\education.png");
	ImageIcon icon_net = new ImageIcon("pictures\\net.png");
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("pictures\\clock.png"));
		new ReadFile(MyCalendar.getFakeYear(), MyCalendar.getFakeMonth());
		inicializ();
	 }
	
	public void inicializ() {
		
		setTitle("Контроль времени                                                                            Курсовая работа                                                                                  KC-22 Белоус Александр\r\n"); // Надпись на окне
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setBounds(0, 0, 1024, 600); // размер окна
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(255,255,0)); // Цвет фона желтый
		
		//создаем кучу,кучу кнопок
		label = new JLabel("\u041F\u043D"); // "ПН"
		label.setFont(new Font("Ubuntu", Font.PLAIN, 22));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(250, 138, 40, 47);
		contentPane.add(label);
		
		label_1 = new JLabel("\u0412\u0442"); // "ВТ"
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Ubuntu", Font.PLAIN, 22));
		label_1.setBounds(300, 138, 40, 47);
		contentPane.add(label_1);
		
		label_2 = new JLabel("\u0421\u0440"); // "СР"
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Ubuntu", Font.PLAIN, 22));
		label_2.setBounds(350, 138, 40, 47);
		contentPane.add(label_2);
		
		label_3 = new JLabel("\u0427\u0442"); // "ЧТ"
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Ubuntu", Font.PLAIN, 22));
		label_3.setBounds(400, 138, 40, 47);
		contentPane.add(label_3);
		
		label_4 = new JLabel("\u041F\u0442"); // "ПТ"
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Ubuntu", Font.PLAIN, 22));
		label_4.setBounds(450, 138, 40, 47);
		contentPane.add(label_4);
		
		label_5 = new JLabel("\u0421\u0431"); // "СБ"
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Ubuntu", Font.PLAIN, 22));
		label_5.setBounds(500, 138, 40, 47);
		contentPane.add(label_5);
		
		label_6 = new JLabel("\u0412\u0441"); // "ВС"
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Ubuntu", Font.PLAIN, 22));
		label_6.setBounds(550, 138, 40, 47);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("\u041A\u0430\u043B\u0435\u043D\u0434\u0430\u0440\u044C"); // "Календарь"
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Ubuntu", Font.PLAIN, 30));
		label_7.setBounds(250, 27, 340, 54);
		contentPane.add(label_7);
		
		label_8 = new JLabel("\u0421\u0442\u0430\u0442\u0438\u0441\u0442\u0438\u043A\u0430 \u0437\u0430 \u043C\u0435\u0441\u044F\u0446"); // "Статистика за месяц"
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Ubuntu", Font.PLAIN, 22));
		label_8.setBounds(250, 138, 340, 47);
		label_8.setVisible(false);
		contentPane.add(label_8);
		
		button_1 = new JButton("New button");
		button_1.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_1.setBounds(250, 196, 40, 40);
		button_1.setVisible(false);
		button_1.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_1);
		mas_button.add(button_1);
		
		button_2 = new JButton("New button");
		button_2.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_2.setBounds(300, 196, 40, 40);
		button_2.setVisible(false);
		button_2.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_2);
		mas_button.add(button_2);
		
		button_3 = new JButton("New button");
		button_3.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_3.setBounds(350, 196, 40, 40);
		button_3.setVisible(false);
		button_3.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_3);
		mas_button.add(button_3);
		
		button_4 = new JButton("New button");
		button_4.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_4.setBounds(400, 196, 40, 40);
		button_4.setVisible(false);
		button_4.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_4);
		mas_button.add(button_4);
		
		button_5 = new JButton("New button");
		button_5.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_5.setBounds(450, 196, 40, 40);
		button_5.setVisible(false);
		button_5.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_5);
		mas_button.add(button_5);
		
		button_6 = new JButton("New button");
		button_6.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_6.setBounds(500, 196, 40, 40);
		button_6.setVisible(false);
		button_6.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_6);
		mas_button.add(button_6);
		
		button_7 = new JButton("New button");
		button_7.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_7.setBounds(550, 196, 40, 40);
		button_7.setVisible(false);
		button_7.setMargin(new Insets(0, 0, 0, 0));
		contentPane.add(button_7);
		mas_button.add(button_7);
		
		button_8 = new JButton("New button");
		button_8.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_8.setBounds(250, 247, 40, 40);
		button_8.setVisible(false);
		button_8.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_8);
		mas_button.add(button_8);
		
		button_9 = new JButton("New button");
		button_9.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_9.setBounds(300, 247, 40, 40);
		button_9.setVisible(false);
		button_9.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_9);
		mas_button.add(button_9);
		
		button_10 = new JButton("New button");
		button_10.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_10.setBounds(350, 247, 40, 40);
		button_10.setVisible(false);
		button_10.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_10);
		mas_button.add(button_10);
		
		button_11 = new JButton("New button");
		button_11.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_11.setBounds(400, 247, 40, 40);
		button_11.setVisible(false);
		button_11.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_11);
		mas_button.add(button_11);
		
		button_12 = new JButton("New button");
		button_12.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_12.setBounds(450, 247, 40, 40);
		button_12.setVisible(false);
		button_12.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_12);
		mas_button.add(button_12);
		
		button_13 = new JButton("New button");
		button_13.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_13.setBounds(500, 247, 40, 40);
		button_13.setVisible(false);
		button_13.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_13);
		mas_button.add(button_13);
				
		button_14 = new JButton("New button");
		button_14.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_14.setBounds(550, 247, 40, 40);
		button_14.setVisible(false);
		button_14.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_14);
		mas_button.add(button_14);

		button_15 = new JButton("New button"); // 14
		button_15.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_15.setBounds(250, 298, 40, 40);
		button_15.setVisible(false);
		button_15.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_15);
		mas_button.add(button_15);
		
		button_16 = new JButton("New button");
		button_16.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_16.setBounds(300, 298, 40, 40);
		button_16.setVisible(false);
		button_16.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_16);
		mas_button.add(button_16);
		
		button_17 = new JButton("New button");
		button_17.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_17.setBounds(350, 298, 40, 40);
		button_17.setVisible(false);
		button_17.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_17);
		mas_button.add(button_17);
		
		button_18 = new JButton("New button");
		button_18.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_18.setBounds(400, 298, 40, 40);
		button_18.setVisible(false);
		button_18.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_18);
		mas_button.add(button_18);
		
		button_19 = new JButton("New button");
		button_19.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_19.setBounds(450, 298, 40, 40);
		button_19.setVisible(false);
		button_19.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_19);
		mas_button.add(button_19);
		
		button_20 = new JButton("New button");
		button_20.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_20.setBounds(500, 298, 40, 40);
		button_20.setVisible(false);
		button_20.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_20);
		mas_button.add(button_20);
		
		button_21 = new JButton("New button");
		button_21.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_21.setBounds(550, 298, 40, 40);
		button_21.setVisible(false);
		button_21.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_21);
		mas_button.add(button_21);
		
		button_22 = new JButton("New button");
		button_22.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_22.setBounds(250, 349, 40, 40);
		button_22.setVisible(false);
		button_22.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_22);
		mas_button.add(button_22);
		
		button_23 = new JButton("New button");
		button_23.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_23.setBounds(300, 349, 40, 40);
		button_23.setVisible(false);
		button_23.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_23);
		mas_button.add(button_23);
		
		button_24 = new JButton("New button");
		button_24.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_24.setBounds(350, 349, 40, 40);
		button_24.setVisible(false);
		button_24.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_24);
		mas_button.add(button_24);
		
		button_25 = new JButton("New button");
		button_25.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_25.setBounds(400, 349, 40, 40);
		button_25.setVisible(false);
		button_25.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_25);
		mas_button.add(button_25);
		
		button_26 = new JButton("New button");
		button_26.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_26.setBounds(450, 349, 40, 40);
		button_26.setVisible(false);
		button_26.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_26);
		mas_button.add(button_26);
		
		button_27 = new JButton("New button");
		button_27.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_27.setBounds(500, 349, 40, 40);
		button_27.setVisible(false);
		button_27.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_27);
		mas_button.add(button_27);
		
		button_28 = new JButton("New button");
		button_28.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_28.setBounds(550, 349, 40, 40);
		button_28.setVisible(false);
		button_28.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_28);
		mas_button.add(button_28);
				
		button_29 = new JButton("New button");
		button_29.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_29.setBounds(250, 400, 40, 40);
		button_29.setVisible(false);
		button_29.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_29);
		mas_button.add(button_29);
		
		button_30 = new JButton("New button");
		button_30.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_30.setBounds(300, 400, 40, 40);
		button_30.setVisible(false);
		button_30.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_30);
		mas_button.add(button_30);
		
		button_31 = new JButton("New button");
		button_31.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_31.setBounds(350, 400, 40, 40);
		button_31.setVisible(false);
		button_31.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_31);
		mas_button.add(button_31);
		
		button_32 = new JButton("New button");
		button_32.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_32.setBounds(400, 400, 40, 40);
		button_32.setVisible(false);
		button_32.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_32);
		mas_button.add(button_32);
		
		button_33 = new JButton("New button");
		button_33.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_33.setBounds(450, 400, 40, 40);
		button_33.setVisible(false);
		button_33.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_33);
		mas_button.add(button_33);
		
		button_34 = new JButton("New button");
		button_34.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_34.setBounds(500, 400, 40, 40);
		button_34.setVisible(false);
		button_34.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_34);
		mas_button.add(button_34);
		
		button_35 = new JButton("New button");
		button_35.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_35.setBounds(550, 400, 40, 40);
		button_35.setVisible(false);
		button_35.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_35);
		mas_button.add(button_35);
		
		button_36 = new JButton("New button");
		button_36.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_36.setBounds(250, 451, 40, 40);
		button_36.setVisible(false);
		button_36.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_36);
		mas_button.add(button_36);
		
		button_37 = new JButton("New button");
		button_37.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		button_37.setBounds(300, 451, 40, 40);
		button_37.setVisible(false);
		button_37.setMargin(new Insets(0,0,0,0));
		contentPane.add(button_37);
		mas_button.add(button_37);
		
		final JLabel year = new JLabel("New label");
		year.setFont(new Font("Ubuntu", Font.PLAIN, 15));
		year.setBounds(261, 47, 48, 25);
		contentPane.add(year);
		
		//кнопка с отображением текущего месяца
		button_month = new JButton("New button");
		button_month.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				show_statistics();
				button_month.setText(MyCalendar.getFakeMonth());
				button_month_for_statistics.setText(MyCalendar.getFakeMonth());
				info_sleep.setText(Info_month.getSum_sleep()+" дней");
				info_sport.setText(Info_month.getSum_sport()+" дней");
				info_education.setText(Info_month.getSum_education()+" дней");
				info_net.setText(Info_month.getSum_net()+" дней");
			}
		});
		button_month.setBounds(350, 92, 142, 35);
		contentPane.add(button_month);
		
		//стрелка влево
		button_arrow_left = new JButton("<------");
		button_arrow_left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				buttonVisibleFalse();
				MyCalendar.setFakeDataLeft();
				generatingDaysInMonth();
				Info_month.array_month.clear();
				new ReadFile(MyCalendar.getFakeYear(), MyCalendar.getFakeMonth());
				button_month.setText(MyCalendar.getFakeMonth());
				button_month_for_statistics.setText(MyCalendar.getFakeMonth());	
				year.setText(MyCalendar.getFakeYear()+"");	
			}	
		});
		button_arrow_left.setBounds(251, 92, 89, 35);
		contentPane.add(button_arrow_left);

		//стрелка вправо
		button_arrow_right = new JButton("-------->");
		button_arrow_right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				buttonVisibleFalse();
				MyCalendar.setFakeDataRight();
				generatingDaysInMonth();
				Info_month.array_month.clear();
				new ReadFile(MyCalendar.getFakeYear(), MyCalendar.getFakeMonth());
				button_month.setText(MyCalendar.getFakeMonth());
				button_month_for_statistics.setText(MyCalendar.getFakeMonth());
				year.setText(MyCalendar.getFakeYear()+"");
				}
		});
		button_arrow_right.setBounds(501, 92, 89, 35);
		contentPane.add(button_arrow_right);

		//стрелка влево для статистики
		button_arrow_left_for_statistics = new JButton("<------");
		button_arrow_left_for_statistics.setBounds(251, 92, 89, 35);
		button_arrow_left_for_statistics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MyCalendar.setFakeDataLeft();
				button_month.setText(MyCalendar.getFakeMonth());
				button_month_for_statistics.setText(MyCalendar.getFakeMonth());
				Info_month.array_month.clear();
				new ReadFile(MyCalendar.getFakeYear(), MyCalendar.getFakeMonth());
				year.setText(MyCalendar.getFakeYear()+"");
				info_sleep.setText(Info_month.getSum_sleep()+" дней");
				info_sport.setText(Info_month.getSum_sport()+" дней");
				info_education.setText(Info_month.getSum_education()+" дней");
				info_net.setText(Info_month.getSum_net()+" дней");
			}	
		});
		contentPane.setLayout(null);
		button_arrow_left_for_statistics.setVisible(false);
		contentPane.add(button_arrow_left_for_statistics);
		
		//стрелка вправо для статистики
		button_arrow_right_for_statistics = new JButton("-------->");
		button_arrow_right_for_statistics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MyCalendar.setFakeDataRight();
				button_month.setText(MyCalendar.getFakeMonth());
				button_month_for_statistics.setText(MyCalendar.getFakeMonth());
				Info_month.array_month.clear();
				new ReadFile(MyCalendar.getFakeYear(), MyCalendar.getFakeMonth());
				year.setText(MyCalendar.getFakeYear()+"");
				info_sleep.setText(Info_month.getSum_sleep()+" дней");
				info_sport.setText(Info_month.getSum_sport()+" дней");
				info_education.setText(Info_month.getSum_education()+" дней");
				info_net.setText(Info_month.getSum_net()+" дней");
			}
		});
		button_arrow_right_for_statistics.setBounds(501, 92, 89, 35);
		button_arrow_right_for_statistics.setVisible(false);
		contentPane.add(button_arrow_right_for_statistics);
		
		//создание кнопок для отображения статистики
		button_month_for_statistics = new JButton("New button");
		button_month_for_statistics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				show_calendar();
				info_sleep.setText(Info_month.getSum_sleep()+" дней");
				info_sport.setText(Info_month.getSum_sport()+" дней");
				info_education.setText(Info_month.getSum_education()+" дней");
				info_net.setText(Info_month.getSum_net()+" дней");
				button_month.setText(MyCalendar.getFakeMonth());
				button_month_for_statistics.setText(MyCalendar.getFakeMonth());
			}
		});
		button_month_for_statistics.setBounds(350, 92, 142, 35);
		button_month_for_statistics.setVisible(false);
		contentPane.add(button_month_for_statistics);
		
		button_sleep_for_statistics = new JButton("\u0421\u043E\u043D"); // "Сон"
		button_sleep_for_statistics.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_sleep_for_statistics.setBackground(new Color(176,182,216));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_sleep_for_statistics.setBackground(null);
			}
		});
		button_sleep_for_statistics.setIcon(icon_sleep);
		button_sleep_for_statistics.setBackground(null);
		button_sleep_for_statistics.setBorderPainted(false);
		button_sleep_for_statistics.setPreferredSize(new Dimension(icon_sleep.getIconWidth(),icon_sleep.getIconHeight()));
		button_sleep_for_statistics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InformationWindow dialog = new InformationWindow(button_sleep_for_statistics.getActionCommand()+", мин.","sleep");
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			}
		});
		button_sleep_for_statistics.setBounds(250, 216, 241, 35);
		button_sleep_for_statistics.setVisible(false);
		contentPane.add(button_sleep_for_statistics);
		
		button_sport_for_statistics = new JButton("\u0421\u043F\u043E\u0440\u0442"); // спорт
		button_sport_for_statistics.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_sport_for_statistics.setBackground(new Color(176,182,216));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_sport_for_statistics.setBackground(null);
			}
		});
		button_sport_for_statistics.setIcon(icon_sport);
		button_sport_for_statistics.setBackground(null);
		button_sport_for_statistics.setBorderPainted(false);
		button_sport_for_statistics.setPreferredSize(new Dimension(icon_sport.getIconWidth(),icon_sport.getIconHeight()));
		button_sport_for_statistics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InformationWindow dialog = new InformationWindow(button_sport_for_statistics.getActionCommand()+", мин.","sport");
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			}
		});
		button_sport_for_statistics.setBounds(250, 262, 241, 35);
		button_sport_for_statistics.setVisible(false);
		contentPane.add(button_sport_for_statistics);
		
		button_education_for_statistics = new JButton("\u041E\u0431\u0440\u0430\u0437\u043E\u0432\u0430\u043D\u0438\u0435"); // "Образование"
		button_education_for_statistics.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_education_for_statistics.setBackground(new Color(176,182,216));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_education_for_statistics.setBackground(null);
			}
		});
		button_education_for_statistics.setIcon(icon_education);
		button_education_for_statistics.setBackground(null);
		button_education_for_statistics.setBorderPainted(false);
		button_education_for_statistics.setPreferredSize(new Dimension(icon_education.getIconWidth(),icon_education.getIconHeight()));
		
		button_education_for_statistics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InformationWindow dialog = new InformationWindow(button_education_for_statistics.getActionCommand()+", мин.","education");
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			}
		});
		button_education_for_statistics.setBounds(250, 308, 241, 35);
		button_education_for_statistics.setVisible(false);
		contentPane.add(button_education_for_statistics);
		
		button_net_for_statistics = new JButton("\u0421\u043E\u0446\u0441\u0435\u0442\u0438"); // "Соцсети"
		button_net_for_statistics.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_net_for_statistics.setBackground(new Color(176,182,216));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_net_for_statistics.setBackground(null);
			}
		});
		button_net_for_statistics.setIcon(icon_net);
		button_net_for_statistics.setBackground(null);
		button_net_for_statistics.setBorderPainted(false);
		button_net_for_statistics.setPreferredSize(new Dimension(icon_net.getIconWidth(),icon_net.getIconHeight()));
		
		button_net_for_statistics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InformationWindow dialog = new InformationWindow(button_net_for_statistics.getActionCommand()+", час.","net");
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			}
		});
		button_net_for_statistics.setBounds(250, 354, 241, 35);
		button_net_for_statistics.setVisible(false);
		contentPane.add(button_net_for_statistics);
		
		info_sleep = new JLabel("New label");
		info_sleep.setHorizontalAlignment(SwingConstants.CENTER);
		info_sleep.setBounds(500, 216, 89, 35);
		info_sleep.setVisible(false);
		contentPane.add(info_sleep);
		
		info_sport = new JLabel("New label");
		info_sport.setHorizontalAlignment(SwingConstants.CENTER);
		info_sport.setBounds(500, 262, 89, 35);
		info_sport.setVisible(false);
		contentPane.add(info_sport);
		
		info_education = new JLabel("New label");
		info_education.setHorizontalAlignment(SwingConstants.CENTER);
		info_education.setBounds(500, 308, 89, 35);
		info_education.setVisible(false);
		contentPane.add(info_education);
		
		info_net = new JLabel("New label");
		info_net.setHorizontalAlignment(SwingConstants.CENTER);
		info_net.setBounds(500, 354, 89, 35);
		info_net.setVisible(false);
		contentPane.add(info_net);
		
		fildDate = new JLabel("New label");
		fildDate.setHorizontalAlignment(SwingConstants.CENTER);
		fildDate.setFont(new Font("Ubuntu", Font.PLAIN, 18));
		fildDate.setBounds(756, 442, 242, 92);
		contentPane.add(fildDate);

		//генерация  кнопок на экране в первый раз		
		MyCalendar.setFakeFirstValue();
		generatingDaysInMonth();
		button_month.setText(MyCalendar.getFakeMonth());
		year.setText(MyCalendar.getFakeYear()+"");
		button_month_for_statistics.setText(MyCalendar.getFakeMonth());
		info_sleep.setText(Info_month.getSum_sleep()+" часов");
		info_sport.setText(Info_month.getSum_sport()+" часов");
		info_education.setText(Info_month.getSum_education()+" часов");
		info_net.setText(Info_month.getSum_net()+" часов");
		// Вывод текущего числа, месяца, дня
		fildDate.setText("Сегодня  "+MyCalendar.getDay()+" "+MyCalendar.getMonth()+" "+MyCalendar.getYear()+"г.");
	}
	
	//функция генерирования кнопок на каждый месяц
	void generatingDaysInMonth() {
		buttonVisibleFalse();
		int  dayInMonth = MyCalendar.getFakeNumberDaysInMonth();
		int firstDay = MyCalendar.getFakeFirstDayOfWeekInMonthINT();
		int count = 1;
		for(int i = firstDay; i<(dayInMonth+firstDay);i++) {
			mas_button.get(i-1).setText(count+"");
			mas_button.get(i-1).setVisible(true);
			
			//добавляем действия при нажатии кнопки на числа месяца
			//если сегодня первый день месяца
			if(MyCalendar.getFakeYear()==MyCalendar.getYear()&&MyCalendar.getFakeMonth()==MyCalendar.getMonth()
					&&MyCalendar.getDay()==1&&count==1)
			{										// цвет кнопок
				mas_button.get(i-1).setBackground(new Color(46,154,255));
				mas_button.get(i-1).addActionListener(this);	
			}
			//добавляем действия при нажатии кнопки на числа месяца
			if(MyCalendar.getFakeVeriable().before(MyCalendar.getCalendar())) {
				if(MyCalendar.getFakeMonth()==MyCalendar.getMonth()&&MyCalendar.getFakeYear()==MyCalendar.getYear()) {
					if(count<=MyCalendar.getDay()) {			// цвет кнопок
						mas_button.get(i-1).setBackground(new Color(46,154,255));
						mas_button.get(i-1).addActionListener(this);
						//выделяем текущий день
						if(count==MyCalendar.getDay()) {	
							mas_button.get(i-1).setBorder(new LineBorder(Color.black)); // цвет вокруг нынешнего дня
						}
					}
				} else {								// цвет кнопок
					mas_button.get(i-1).setBackground(new Color(46,154,255));
					mas_button.get(i-1).addActionListener(this);
				}
			}
			count++;
		}			
	}
	
	public void actionPerformed(ActionEvent e) {
		boolean flag = true;
		int count = 1;
		while(count<=MyCalendar.getFakeNumberDaysInMonth() && flag != false) {
			if(e.getActionCommand().equals(count+"")) {
				if(Info_month.array_month.containsKey(count)==true) {
					Input_Data dialog = new Input_Data(count,MyCalendar.getFakeYear(),MyCalendar.getFakeMonth(),
					Info_month.array_month.get(count));
						dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
						dialog.setVisible(true);
			} else {
				Input_Data dialog = new Input_Data(count,MyCalendar.getFakeYear(),MyCalendar.getFakeMonth(),
						new Info_everyday(0,0,0,0));
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
				}
			flag = false;
		}
		count++;
		System.out.println();
		}
	}
	//сбрасывание настроек кнопок
	void buttonVisibleFalse() {
		for(int i = 0;i<mas_button.size();i++) {
			mas_button.get(i).removeActionListener(this);	
			mas_button.get(i).setVisible(false);
			mas_button.get(i).setBackground(null);
			mas_button.get(i).setBorder(null);
		}
	}
	
	void show_statistics() {
		buttonVisibleFalse();
		label.setVisible(false);
		label_1.setVisible(false);
		label_2.setVisible(false);
		label_3.setVisible(false);
		label_4.setVisible(false);
		label_5.setVisible(false);
		label_6.setVisible(false);
		label_8.setVisible(true);
		button_arrow_left.setVisible(false);
		button_arrow_left_for_statistics.setVisible(true);
		button_arrow_right.setVisible(false);
		button_arrow_right_for_statistics.setVisible(true);
		button_month.setVisible(false);
		button_month_for_statistics.setVisible(true);
		button_sleep_for_statistics.setVisible(true);
		button_sport_for_statistics.setVisible(true);
		button_education_for_statistics.setVisible(true);
		button_net_for_statistics.setVisible(true);
		info_sleep.setVisible(true);
		info_sport.setVisible(true);
		info_education.setVisible(true);
		info_net.setVisible(true);	
	}
	
	void show_calendar() {
		generatingDaysInMonth();
		label.setVisible(true);
		label_1.setVisible(true);
		label_2.setVisible(true);
		label_3.setVisible(true);
		label_4.setVisible(true);
		label_5.setVisible(true);
		label_6.setVisible(true);
		label_8.setVisible(false);
		button_arrow_left.setVisible(true);
		button_arrow_left_for_statistics.setVisible(false);
		button_arrow_right.setVisible(true);
		button_arrow_right_for_statistics.setVisible(false);
		button_month.setVisible(true);
		button_month_for_statistics.setVisible(false);
		button_sleep_for_statistics.setVisible(false);
		button_sport_for_statistics.setVisible(false);
		button_education_for_statistics.setVisible(false);
		button_net_for_statistics.setVisible(false);
		info_sleep.setVisible(false);
		info_sport.setVisible(false);
		info_education.setVisible(false);
		info_net.setVisible(false);
	}

	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
};
