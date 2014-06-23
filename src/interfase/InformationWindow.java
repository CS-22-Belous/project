package interfase;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import calendar.Info_month;
import calendar.MyCalendar;

public class InformationWindow extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	ArrayList<JLabel> mas_label = new ArrayList<JLabel>();
	
	public InformationWindow(String field, String what) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("pictures\\clock.png"));
		initialize(field,what);
	}
	
	public void initialize(String field, String what) {
		
			setBounds(150, 100, 724, 400);
			setTitle(field);
			getContentPane().setLayout(new BorderLayout());
			contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
			getContentPane().add(contentPanel, BorderLayout.CENTER);
			contentPanel.setLayout(null);
			contentPanel.setVisible(true);
			
			JLabel label_1 = new JLabel("New label");
			label_1.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_1.setBounds(58, 22, 93, 33);
			contentPanel.add(label_1);
			mas_label.add(label_1);
			
			JLabel label_2 = new JLabel("New label");
			label_2.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_2.setBounds(58, 66, 93, 33);
			contentPanel.add(label_2);
			mas_label.add(label_2);
			
			JLabel label_3 = new JLabel("New label");
			label_3.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_3.setBounds(58, 110, 93, 33);
			contentPanel.add(label_3);
			mas_label.add(label_3);
			
			JLabel label_4 = new JLabel("New label");
			label_4.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_4.setBounds(58, 154, 93, 33);
			contentPanel.add(label_4);
			mas_label.add(label_4);
			
			JLabel label_5 = new JLabel("New label");
			label_5.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_5.setBounds(58, 198, 93, 33);
			contentPanel.add(label_5);
			mas_label.add(label_5);
			
			JLabel label_6 = new JLabel("New label");
			label_6.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_6.setBounds(58, 242, 93, 33);
			contentPanel.add(label_6);
			mas_label.add(label_6);
			
			JLabel label_7 = new JLabel("New label");
			label_7.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_7.setBounds(58, 285, 93, 33);
			contentPanel.add(label_7);
			mas_label.add(label_7);
			
			JLabel label_8 = new JLabel("New label");
			label_8.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_8.setBounds(171, 22, 93, 33);
			contentPanel.add(label_8);
			mas_label.add(label_8);
			
			JLabel label_9 = new JLabel("New label");
			label_9.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_9.setBounds(171, 66, 93, 33);
			contentPanel.add(label_9);
			mas_label.add(label_9);
			
			JLabel label_10 = new JLabel("New label");
			label_10.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_10.setBounds(171, 110, 93, 33);
			contentPanel.add(label_10);
			mas_label.add(label_10);
			
			JLabel label_11 = new JLabel("New label");
			label_11.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_11.setBounds(171, 154, 93, 33);
			contentPanel.add(label_11);
			mas_label.add(label_11);
			
			JLabel label_12 = new JLabel("New label");
			label_12.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_12.setBounds(171, 198, 93, 33);
			contentPanel.add(label_12);
			mas_label.add(label_12);
			
			JLabel label_13 = new JLabel("New label");
			label_13.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_13.setBounds(171, 242, 93, 33);
			contentPanel.add(label_13);
			mas_label.add(label_13);
			
			JLabel label_14 = new JLabel("New label");
			label_14.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_14.setBounds(171, 285, 93, 33);
			contentPanel.add(label_14);
			mas_label.add(label_14);
			
			JLabel label_15 = new JLabel("New label");
			label_15.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_15.setBounds(287, 22, 93, 33);
			contentPanel.add(label_15);
			mas_label.add(label_15);
			
			JLabel label_16 = new JLabel("New label");
			label_16.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_16.setBounds(287, 66, 93, 33);
			contentPanel.add(label_16);
			mas_label.add(label_16);
			
			JLabel label_17 = new JLabel("New label");
			label_17.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_17.setBounds(287, 110, 93, 33);
			contentPanel.add(label_17);
			mas_label.add(label_17);
			
			JLabel label_18 = new JLabel("New label");
			label_18.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_18.setBounds(287, 154, 93, 33);
			contentPanel.add(label_18);
			mas_label.add(label_18);
			
			JLabel label_19 = new JLabel("New label");
			label_19.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_19.setBounds(287, 198, 93, 33);
			contentPanel.add(label_19);
			mas_label.add(label_19);
			
			JLabel label_20 = new JLabel("New label");
			label_20.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_20.setBounds(287, 242, 93, 33);
			contentPanel.add(label_20);
			mas_label.add(label_20);
			
			JLabel label_21 = new JLabel("New label");
			label_21.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_21.setBounds(287, 285, 93, 33);
			contentPanel.add(label_21);
			mas_label.add(label_21);
			
			JLabel label_22 = new JLabel("New label");
			label_22.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_22.setBounds(397, 22, 93, 33);
			contentPanel.add(label_22);
			mas_label.add(label_22);
			
			JLabel label_23 = new JLabel("New label");
			label_23.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_23.setBounds(397, 66, 93, 33);
			contentPanel.add(label_23);
			mas_label.add(label_23);
			
			JLabel label_24 = new JLabel("New label");
			label_24.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_24.setBounds(397, 110, 93, 33);
			contentPanel.add(label_24);
			mas_label.add(label_24);
			
			JLabel label_25 = new JLabel("New label");
			label_25.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_25.setBounds(397, 154, 93, 33);
			contentPanel.add(label_25);
			mas_label.add(label_25);
			
			JLabel label_26 = new JLabel("New label");
			label_26.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_26.setBounds(397, 198, 93, 33);
			contentPanel.add(label_26);
			mas_label.add(label_26);
			
			JLabel label_27 = new JLabel("New label");
			label_27.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_27.setBounds(397, 242, 93, 33);
			contentPanel.add(label_27);
			mas_label.add(label_27);
			
			JLabel label_28 = new JLabel("New label");
			label_28.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_28.setBounds(397, 285, 93, 33);
			contentPanel.add(label_28);
			mas_label.add(label_28);
			
			JLabel label_29 = new JLabel("New label");
			label_29.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_29.setBounds(516, 22, 93, 33);
			contentPanel.add(label_29);
			mas_label.add(label_29);
			
			JLabel label_30 = new JLabel("New label");
			label_30.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_30.setBounds(516, 66, 93, 33);
			contentPanel.add(label_30);
			mas_label.add(label_30);
			
			JLabel label_31 = new JLabel("New label");
			label_31.setFont(new Font("Ubuntu", Font.PLAIN, 15));
			label_31.setBounds(516, 110, 93, 33);
			contentPanel.add(label_31);
			mas_label.add(label_31);
			{
				JPanel buttonPane = new JPanel();
				buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
				getContentPane().add(buttonPane, BorderLayout.SOUTH);
				{
					JButton cancelButton = new JButton("¬ыход");
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
			
			labelVisibleFalse();
			if(what=="sleep") generatingLabels_for_sleep();
			if(what=="sport") generatingLabels_for_sport();
			if(what=="education") generatingLabels_for_education(); 
			if(what=="net") generatingLabels_for_net(); 
		}
	
	
	void labelVisibleFalse() {
		for(int i = 0;i<mas_label.size();i++){
		mas_label.get(i).setVisible(false);
		}
	}
	
	void generatingLabels_for_sleep() {
		for(int i = 1;i<=MyCalendar.getFakeNumberDaysInMonth();i++) {
			if(Info_month.array_month.containsKey(i)==true) 
			{
				mas_label.get(i-1).setText(i+".  "+Info_month.array_month.get(i).getSleep());
				mas_label.get(i-1).setVisible(true);
			}
			else 
			{
				mas_label.get(i-1).setText(i+".  Ч");
				mas_label.get(i-1).setVisible(true);
			}
		}
	}
	
	void generatingLabels_for_sport() {
		for(int i = 1;i<=MyCalendar.getFakeNumberDaysInMonth();i++) {
			if(Info_month.array_month.containsKey(i)==true)
			{
				mas_label.get(i-1).setText(i+".  "+Info_month.array_month.get(i).getSport());
				mas_label.get(i-1).setVisible(true);
			}
			else 
			{
				mas_label.get(i-1).setText(i+".  Ч");
				mas_label.get(i-1).setVisible(true);
			}
		}
	}
	
	void generatingLabels_for_education() {
		for(int i = 1;i<=MyCalendar.getFakeNumberDaysInMonth();i++) {
			if(Info_month.array_month.containsKey(i)==true)
			{
				mas_label.get(i-1).setText(i+".  "+Info_month.array_month.get(i).getEducation());
				mas_label.get(i-1).setVisible(true);
			}
			else 
			{
				mas_label.get(i-1).setText(i+".  Ч");
				mas_label.get(i-1).setVisible(true);
			}
		}
	}
	
	void generatingLabels_for_net() {
		for(int i = 1;i<=MyCalendar.getFakeNumberDaysInMonth();i++) {
			if(Info_month.array_month.containsKey(i)==true)
			{
				mas_label.get(i-1).setText(i+".  "+Info_month.array_month.get(i).getNet());
				mas_label.get(i-1).setVisible(true);
			}
			else 
			{
				mas_label.get(i-1).setText(i+".  Ч");
				mas_label.get(i-1).setVisible(true);
			}
		}
	}
};
