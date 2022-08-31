package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField txtStudentgetid;
	private JTextField txtStudentgetlastname;
	private JTextField txtStudentgetfirstname;
	private JTextField txtStudentget;
	private JTextField txtStudentgetgithuburl;
	private JFrame frame;
	private JLabel iblClock;
	
	public void clock() {
		Calendar cal = new GregorianCalendar();
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH) + 1;
		int year = cal.get(Calendar.YEAR);
		
		int second = cal.get(Calendar.SECOND);
		int minute = cal.get(Calendar.MINUTE);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		
		iblClock.setText("Esta ventana fue generada el "+day+"/"+month+"/"+year+" a las: "+hour+":"+minute+":"+second);
	}
	
	public SimplePresentationScreen(Student studentData) {
		
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().add(contentPane);
		frame.setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(670, 294));
		frame.setResizable(false);
		
		frame.setVisible(true);
		
		
		init();
		clock();
	}
	
	private void init() {
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 430, 232);
		tabInformation = new JPanel();
		tabInformation.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		
		JLabel lblNewLabel = new JLabel("LU: ");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 11));
		
		JLabel lblNewLabel_1 = new JLabel("Apellido: ");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 11));
		
		JLabel lblNewLabel_2 = new JLabel("Nombre: ");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 11));
		
		JLabel lblNewLabel_3 = new JLabel("E-mail: ");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 11));
		
		JLabel lblNewLabel_4 = new JLabel("GitHub URL: ");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 11));
		
		txtStudentgetid = new JTextField();
		txtStudentgetid.setEditable(false);
		txtStudentgetid.setFont(new Font("Arial", Font.PLAIN, 11));
		txtStudentgetid.setText(""+studentData.getId());
		txtStudentgetid.setColumns(10);
		
		txtStudentgetlastname = new JTextField();
		txtStudentgetlastname.setEditable(false);
		txtStudentgetlastname.setFont(new Font("Arial", Font.PLAIN, 11));
		txtStudentgetlastname.setText(""+studentData.getLastName());
		txtStudentgetlastname.setColumns(10);
		
		txtStudentgetfirstname = new JTextField();
		txtStudentgetfirstname.setEditable(false);
		txtStudentgetfirstname.setFont(new Font("Arial", Font.PLAIN, 11));
		txtStudentgetfirstname.setText(""+studentData.getFirstName());
		txtStudentgetfirstname.setColumns(10);
		
		txtStudentget = new JTextField();
		txtStudentget.setEditable(false);
		txtStudentget.setFont(new Font("Arial", Font.PLAIN, 11));
		txtStudentget.setText(""+studentData.getMail());
		txtStudentget.setColumns(10);
		
		txtStudentgetgithuburl = new JTextField();
		txtStudentgetgithuburl.setEditable(false);
		txtStudentgetgithuburl.setFont(new Font("Arial", Font.PLAIN, 11));
		txtStudentgetgithuburl.setText(""+studentData.getGithubURL());
		txtStudentgetgithuburl.setColumns(10);
		GroupLayout gl_tabInformation = new GroupLayout(tabInformation);
		gl_tabInformation.setHorizontalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_4)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel))
					.addGap(14)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING, false)
						.addComponent(txtStudentgetfirstname)
						.addComponent(txtStudentgetlastname)
						.addComponent(txtStudentget, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
						.addComponent(txtStudentgetgithuburl)
						.addComponent(txtStudentgetid, GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
					.addContainerGap(22, Short.MAX_VALUE))
		);
		gl_tabInformation.setVerticalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtStudentgetid, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtStudentgetlastname, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtStudentgetfirstname, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtStudentget, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtStudentgetgithuburl, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4))
					.addContainerGap(52, Short.MAX_VALUE))
		);
		tabInformation.setLayout(gl_tabInformation);
		contentPane.add(tabbedPane);
		
		iblClock = new JLabel("Clock");
		iblClock.setBounds(5, 237, 644, 13);
		iblClock.setFont(new Font("Arial", Font.PLAIN, 11));
		contentPane.add(iblClock);
		
		JLabel lblNewLabel_5 = new JLabel();
		ImageIcon icon = new ImageIcon(SimplePresentationScreen.class.getResource("/images/profile.jpg"));
		ImageIcon imagen = new ImageIcon(icon.getImage().getScaledInstance(200, 250, DO_NOTHING_ON_CLOSE));
		lblNewLabel_5.setIcon(imagen);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(457, 27, 167, 210);
		Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 4);
		lblNewLabel_5.setBorder(border);
		contentPane.add(lblNewLabel_5);
	}
}
