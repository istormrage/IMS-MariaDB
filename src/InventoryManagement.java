
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import org.mariadb.jdbc.*;

public class InventoryManagement extends javax.swing.JFrame {

	public InventoryManagement() {
		initComponents();
	}

	@SuppressWarnings("unchecked")

	private void initComponents() {

		jFrame1 = new javax.swing.JFrame();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();
		jTextField5 = new javax.swing.JTextField();
		jTextField6 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton46 = new javax.swing.JButton();
		jFrame2 = new javax.swing.JFrame();
		jTextField7 = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		jTextField8 = new javax.swing.JTextField();
		jLabel9 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jTextField9 = new javax.swing.JTextField();
		jTextField10 = new javax.swing.JTextField();
		jButton47 = new javax.swing.JButton();
		jFrame3 = new javax.swing.JFrame();
		jLabel11 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton48 = new javax.swing.JButton();
		jFrame4 = new javax.swing.JFrame();
		jLabel15 = new javax.swing.JLabel();
		jButton7 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		ups = new javax.swing.JTable();
		jButton49 = new javax.swing.JButton();
		jFrame5 = new javax.swing.JFrame();
		jLabel16 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		jLabel17 = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		jTextField11 = new javax.swing.JTextField();
		jTextField12 = new javax.swing.JTextField();
		jScrollPane3 = new javax.swing.JScrollPane();
		ups1 = new javax.swing.JTable();
		jButton8 = new javax.swing.JButton();
		jButton50 = new javax.swing.JButton();
		jFrame6 = new javax.swing.JFrame();
		jScrollPane4 = new javax.swing.JScrollPane();
		ups2 = new javax.swing.JTable();
		jLabel21 = new javax.swing.JLabel();
		jButton9 = new javax.swing.JButton();
		jLabel19 = new javax.swing.JLabel();
		jTextField13 = new javax.swing.JTextField();
		jButton51 = new javax.swing.JButton();
		jFrame7 = new javax.swing.JFrame();
		jLabel20 = new javax.swing.JLabel();
		jTextField14 = new javax.swing.JTextField();
		jButton10 = new javax.swing.JButton();
		jLabel22 = new javax.swing.JLabel();
		jScrollPane5 = new javax.swing.JScrollPane();
		ups3 = new javax.swing.JTable();
		jButton52 = new javax.swing.JButton();
		jFrame8 = new javax.swing.JFrame();
		jLabel23 = new javax.swing.JLabel();
		jLabel24 = new javax.swing.JLabel();
		jLabel25 = new javax.swing.JLabel();
		jLabel26 = new javax.swing.JLabel();
		jLabel27 = new javax.swing.JLabel();
		jLabel28 = new javax.swing.JLabel();
		jLabel29 = new javax.swing.JLabel();
		jLabel30 = new javax.swing.JLabel();
		jTextField15 = new javax.swing.JTextField();
		jTextField16 = new javax.swing.JTextField();
		jTextField17 = new javax.swing.JTextField();
		jTextField18 = new javax.swing.JTextField();
		jTextField19 = new javax.swing.JTextField();
		jTextField20 = new javax.swing.JTextField();
		jTextField21 = new javax.swing.JTextField();
		jButton11 = new javax.swing.JButton();
		jButton12 = new javax.swing.JButton();
		jButton53 = new javax.swing.JButton();
		jFrame9 = new javax.swing.JFrame();
		jPanel4 = new javax.swing.JPanel();
		jLabel36 = new javax.swing.JLabel();
		jTextField26 = new javax.swing.JTextField();
		jLabel38 = new javax.swing.JLabel();
		jTextField27 = new javax.swing.JTextField();
		jLabel35 = new javax.swing.JLabel();
		jLabel34 = new javax.swing.JLabel();
		jTextField25 = new javax.swing.JTextField();
		jTextField24 = new javax.swing.JTextField();
		jLabel37 = new javax.swing.JLabel();
		jLabel33 = new javax.swing.JLabel();
		jTextField28 = new javax.swing.JTextField();
		jTextField23 = new javax.swing.JTextField();
		jLabel31 = new javax.swing.JLabel();
		jLabel32 = new javax.swing.JLabel();
		jTextField22 = new javax.swing.JTextField();
		jButton13 = new javax.swing.JButton();
		jButton14 = new javax.swing.JButton();
		jButton54 = new javax.swing.JButton();
		jFrame10 = new javax.swing.JFrame();
		jLabel39 = new javax.swing.JLabel();
		jLabel40 = new javax.swing.JLabel();
		jTextField29 = new javax.swing.JTextField();
		jButton15 = new javax.swing.JButton();
		jButton16 = new javax.swing.JButton();
		jButton17 = new javax.swing.JButton();
		jFrame11 = new javax.swing.JFrame();
		jLabel41 = new javax.swing.JLabel();
		jButton18 = new javax.swing.JButton();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jButton19 = new javax.swing.JButton();
		jFrame12 = new javax.swing.JFrame();
		jLabel42 = new javax.swing.JLabel();
		jButton20 = new javax.swing.JButton();
		jScrollPane6 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jButton21 = new javax.swing.JButton();
		jLabel43 = new javax.swing.JLabel();
		jTextField30 = new javax.swing.JTextField();
		jFrame13 = new javax.swing.JFrame();
		jLabel44 = new javax.swing.JLabel();
		jLabel45 = new javax.swing.JLabel();
		jTextField31 = new javax.swing.JTextField();
		jLabel46 = new javax.swing.JLabel();
		jRadioButton1 = new javax.swing.JRadioButton();
		jLabel47 = new javax.swing.JLabel();
		jRadioButton2 = new javax.swing.JRadioButton();
		jComboBox1 = new javax.swing.JComboBox();
		jComboBox2 = new javax.swing.JComboBox();
		jComboBox3 = new javax.swing.JComboBox();
		jLabel48 = new javax.swing.JLabel();
		jTextField32 = new javax.swing.JTextField();
		jLabel49 = new javax.swing.JLabel();
		jLabel50 = new javax.swing.JLabel();
		jTextField34 = new javax.swing.JTextField();
		jButton22 = new javax.swing.JButton();
		jButton23 = new javax.swing.JButton();
		jTextField35 = new javax.swing.JTextField();
		jPanel5 = new javax.swing.JPanel();
		jLabel51 = new javax.swing.JLabel();
		jTextField33 = new javax.swing.JTextField();
		jLabel52 = new javax.swing.JLabel();
		jTextField36 = new javax.swing.JTextField();
		jLabel53 = new javax.swing.JLabel();
		jTextField37 = new javax.swing.JTextField();
		jButton24 = new javax.swing.JButton();
		jButton25 = new javax.swing.JButton();
		jLabel54 = new javax.swing.JLabel();
		jTextField38 = new javax.swing.JTextField();
		buttonGroup1 = new javax.swing.ButtonGroup();
		jScrollPane7 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jFrame14 = new javax.swing.JFrame();
		jLabel55 = new javax.swing.JLabel();
		jButton26 = new javax.swing.JButton();
		jScrollPane8 = new javax.swing.JScrollPane();
		jTable3 = new javax.swing.JTable();
		jButton27 = new javax.swing.JButton();
		jFrame15 = new javax.swing.JFrame();
		jLabel56 = new javax.swing.JLabel();
		jLabel57 = new javax.swing.JLabel();
		jScrollPane9 = new javax.swing.JScrollPane();
		jTable4 = new javax.swing.JTable();
		jButton28 = new javax.swing.JButton();
		jButton29 = new javax.swing.JButton();
		jTextField39 = new javax.swing.JTextField();
		jFrame16 = new javax.swing.JFrame();
		jButton30 = new javax.swing.JButton();
		jButton31 = new javax.swing.JButton();
		jTextField40 = new javax.swing.JTextField();
		jScrollPane10 = new javax.swing.JScrollPane();
		jTable5 = new javax.swing.JTable();
		jLabel58 = new javax.swing.JLabel();
		jLabel59 = new javax.swing.JLabel();
		jFrame17 = new javax.swing.JFrame();
		jLabel60 = new javax.swing.JLabel();
		jTextField41 = new javax.swing.JTextField();
		jTextField42 = new javax.swing.JTextField();
		jLabel61 = new javax.swing.JLabel();
		jTextField43 = new javax.swing.JTextField();
		jLabel62 = new javax.swing.JLabel();
		jButton32 = new javax.swing.JButton();
		jButton33 = new javax.swing.JButton();
		jLabel63 = new javax.swing.JLabel();
		jTextField44 = new javax.swing.JTextField();
		jLabel64 = new javax.swing.JLabel();
		jTextField45 = new javax.swing.JTextField();
		jLabel65 = new javax.swing.JLabel();
		jLabel66 = new javax.swing.JLabel();
		jLabel67 = new javax.swing.JLabel();
		jTextField47 = new javax.swing.JTextField();
		jButton34 = new javax.swing.JButton();
		jTextField48 = new javax.swing.JTextField();
		jFrame18 = new javax.swing.JFrame();
		jButton35 = new javax.swing.JButton();
		jButton36 = new javax.swing.JButton();
		jButton37 = new javax.swing.JButton();
		jTextField46 = new javax.swing.JTextField();
		jLabel68 = new javax.swing.JLabel();
		jLabel69 = new javax.swing.JLabel();
		jFrame19 = new javax.swing.JFrame();
		jButton38 = new javax.swing.JButton();
		jButton39 = new javax.swing.JButton();
		jScrollPane11 = new javax.swing.JScrollPane();
		jTable6 = new javax.swing.JTable();
		jLabel70 = new javax.swing.JLabel();
		jFrame20 = new javax.swing.JFrame();
		jLabel71 = new javax.swing.JLabel();
		jButton40 = new javax.swing.JButton();
		jLabel72 = new javax.swing.JLabel();
		jTextField49 = new javax.swing.JTextField();
		jButton41 = new javax.swing.JButton();
		jScrollPane12 = new javax.swing.JScrollPane();
		jTable7 = new javax.swing.JTable();
		jFrame21 = new javax.swing.JFrame();
		jLabel73 = new javax.swing.JLabel();
		jScrollPane13 = new javax.swing.JScrollPane();
		jTable8 = new javax.swing.JTable();
		jLabel74 = new javax.swing.JLabel();
		jButton42 = new javax.swing.JButton();
		jButton43 = new javax.swing.JButton();
		jTextField50 = new javax.swing.JTextField();
		jFrame22 = new javax.swing.JFrame();
		jLabel75 = new javax.swing.JLabel();
		jLabel76 = new javax.swing.JLabel();
		jScrollPane14 = new javax.swing.JScrollPane();
		jTable9 = new javax.swing.JTable();
		jTextField51 = new javax.swing.JTextField();
		jButton44 = new javax.swing.JButton();
		jButton45 = new javax.swing.JButton();
		jLabel14 = new javax.swing.JLabel();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenuItem3 = new javax.swing.JMenuItem();
		jMenu2 = new javax.swing.JMenu();
		jMenuItem5 = new javax.swing.JMenuItem();
		jMenu8 = new javax.swing.JMenu();
		jMenuItem4 = new javax.swing.JMenuItem();
		jMenuItem6 = new javax.swing.JMenuItem();
		jMenuItem7 = new javax.swing.JMenuItem();
		jMenu3 = new javax.swing.JMenu();
		jMenuItem8 = new javax.swing.JMenuItem();
		jMenuItem9 = new javax.swing.JMenuItem();
		jMenuItem10 = new javax.swing.JMenuItem();
		jMenuItem11 = new javax.swing.JMenuItem();
		jMenu7 = new javax.swing.JMenu();
		jMenuItem12 = new javax.swing.JMenuItem();
		jMenuItem13 = new javax.swing.JMenuItem();
		jMenu4 = new javax.swing.JMenu();
		jMenuItem19 = new javax.swing.JMenuItem();
		jMenuItem21 = new javax.swing.JMenuItem();
		jMenuItem22 = new javax.swing.JMenuItem();
		jMenu11 = new javax.swing.JMenu();
		jMenuItem20 = new javax.swing.JMenuItem();
		jMenuItem23 = new javax.swing.JMenuItem();
		jMenu5 = new javax.swing.JMenu();
		jMenuItem15 = new javax.swing.JMenuItem();
		jMenu9 = new javax.swing.JMenu();
		jMenuItem16 = new javax.swing.JMenuItem();
		jMenu10 = new javax.swing.JMenu();
		jMenuItem17 = new javax.swing.JMenuItem();
		jMenuItem18 = new javax.swing.JMenuItem();
		jMenu6 = new javax.swing.JMenu();
		jMenuItem14 = new javax.swing.JMenuItem();

		jFrame1.setTitle("Item Data");
		jFrame1.setLocationByPlatform(true);
		jFrame1.setMinimumSize(new java.awt.Dimension(400, 267));
		jFrame1.setResizable(false);

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
		jLabel1.setText("Item Data");

		jLabel2.setText("Item Code :");

		jLabel3.setText("Item Name :");

		jLabel4.setText("Stock - in - Hand :");

		jLabel8.setText("Rate :");

		jButton1.setText("Insert ");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("Reset");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton46.setText("Back");
		jButton46.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton46ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
		jFrame1.getContentPane().setLayout(jFrame1Layout);
		jFrame1Layout.setHorizontalGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jFrame1Layout.createSequentialGroup().addContainerGap(146, Short.MAX_VALUE)
								.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(96, 96, 96))
				.addGroup(jFrame1Layout.createSequentialGroup().addGap(23, 23, 23)
						.addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jFrame1Layout.createSequentialGroup()
										.addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 158,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jFrame1Layout.createSequentialGroup()
										.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 158,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jFrame1Layout.createSequentialGroup()
										.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jFrame1Layout.createSequentialGroup()
										.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 158,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(74, Short.MAX_VALUE))
				.addGroup(jFrame1Layout.createSequentialGroup().addGap(51, 51, 51).addComponent(jButton1)
						.addGap(55, 55, 55).addComponent(jButton2).addGap(43, 43, 43).addComponent(jButton46)
						.addContainerGap(70, Short.MAX_VALUE)));
		jFrame1Layout.setVerticalGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame1Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
						.addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton1).addComponent(jButton2).addComponent(jButton46))
						.addGap(21, 21, 21)));

		jFrame2.setTitle("Item Data");
		jFrame2.setLocationByPlatform(true);
		jFrame2.setMinimumSize(new java.awt.Dimension(426, 400));
		jFrame2.setResizable(false);

		jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
		jLabel5.setText("Item Data");

		jLabel6.setText("Enter Code of item to be updated :");

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter Data :"));

		jLabel9.setText("Rate :");

		jLabel7.setText("Stock - in - Hand :");

		jLabel10.setText("Item Name :");

		jButton3.setText("Update");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setText("Reset");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton47.setText("Back");
		jButton47.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton47ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(34, 34, 34).addComponent(jButton3)
						.addGap(50, 50, 50).addComponent(jButton4).addGap(41, 41, 41).addComponent(jButton47)
						.addContainerGap(52, Short.MAX_VALUE))
				.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(27, 27, 27)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 158,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6,
														Short.MAX_VALUE)
												.addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 158,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6,
														Short.MAX_VALUE)
												.addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 158,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6,
														Short.MAX_VALUE)
												.addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(28, 28, 28))));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addContainerGap(141, Short.MAX_VALUE)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jButton3).addComponent(jButton47).addComponent(jButton4))
								.addContainerGap())
				.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(80, Short.MAX_VALUE))));

		javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
		jFrame2.getContentPane().setLayout(jFrame2Layout);
		jFrame2Layout.setHorizontalGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame2Layout.createSequentialGroup().addGap(28, 28, 28)
						.addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 167,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(53, 53, 53))
				.addGroup(jFrame2Layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame2Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel5,
								javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(128, 128, 128)));
		jFrame2Layout.setVerticalGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame2Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(39, 39, 39)
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jFrame3.setTitle("Item Data");
		jFrame3.setLocationByPlatform(true);
		jFrame3.setMinimumSize(new java.awt.Dimension(400, 320));
		jFrame3.setResizable(false);

		jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14));
		jLabel11.setText("Item Data");

		jPanel2.setBorder(
				javax.swing.BorderFactory.createTitledBorder("Enter any one of the following to delete data :"));

		jLabel12.setText("Enter Item Code :");

		jLabel13.setText("Enter Item Name :");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 170,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 152,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 170,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 152,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(20, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(25, Short.MAX_VALUE)));

		jButton5.setText("Delete");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setText("Reset");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton48.setText("Back");
		jButton48.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton48ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
		jFrame3.getContentPane().setLayout(jFrame3Layout);
		jFrame3Layout.setHorizontalGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jFrame3Layout.createSequentialGroup().addContainerGap(130, Short.MAX_VALUE)
								.addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 152,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(118, 118, 118))
				.addGroup(jFrame3Layout.createSequentialGroup().addGap(18, 18, 18)
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(jFrame3Layout.createSequentialGroup().addGap(48, 48, 48).addComponent(jButton5)
						.addGap(50, 50, 50).addComponent(jButton6).addGap(46, 46, 46).addComponent(jButton48)
						.addContainerGap(77, Short.MAX_VALUE)));
		jFrame3Layout.setVerticalGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame3Layout.createSequentialGroup().addGap(22, 22, 22)
						.addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(45, 45, 45)
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
						.addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton5).addComponent(jButton6).addComponent(jButton48))
						.addGap(26, 26, 26)));

		jFrame4.setTitle("Item Data");
		jFrame4.setLocationByPlatform(true);
		jFrame4.setMinimumSize(new java.awt.Dimension(451, 430));
		jFrame4.setResizable(false);

		jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14));
		jLabel15.setText("Item Data");

		jButton7.setText("Show Data in Table");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		ups.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Item Code", "Item Name", "Rate", "Stock in hand" }) {
			Class[] types = new Class[] { java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class,
					java.lang.Integer.class };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}
		});
		jScrollPane1.setViewportView(ups);

		jButton49.setText("Back");
		jButton49.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton49ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
		jFrame4.getContentPane().setLayout(jFrame4Layout);
		jFrame4Layout.setHorizontalGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame4Layout.createSequentialGroup().addGap(183, 183, 183).addComponent(jButton49)
						.addContainerGap(213, Short.MAX_VALUE))
				.addGroup(jFrame4Layout.createSequentialGroup().addGroup(jFrame4Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jFrame4Layout.createSequentialGroup()
								.addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jFrame4Layout.createSequentialGroup().addGap(102, 102, 102)
												.addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 247,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jFrame4Layout.createSequentialGroup().addGap(174, 174, 174)
												.addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(0, 92, Short.MAX_VALUE))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								jFrame4Layout.createSequentialGroup().addContainerGap(15, Short.MAX_VALUE).addComponent(
										jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap()));
		jFrame4Layout.setVerticalGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame4Layout.createSequentialGroup().addGap(22, 22, 22)
						.addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18).addComponent(jButton7).addGap(18, 18, 18)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18).addComponent(jButton49)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jFrame5.setTitle("Item Data");
		jFrame5.setLocationByPlatform(true);
		jFrame5.setMinimumSize(new java.awt.Dimension(446, 479));
		jFrame5.setResizable(false);

		jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14));
		jLabel16.setText("Query By Rate");

		jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Select Range of Rate :"));

		jLabel17.setText("Upper Limit :");

		jLabel18.setText("Lower Limit :");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addGap(21, 21, 21)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 163,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 163,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 151,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 151,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(65, Short.MAX_VALUE)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel17).addComponent(jTextField11,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel18).addComponent(jTextField12,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))));

		ups1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Item Code", "Item Name", "Rate", "Stock in hand" }) {
			Class[] types = new Class[] { java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class,
					java.lang.Integer.class };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}
		});
		jScrollPane3.setViewportView(ups1);

		jButton8.setText("Show");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		jButton50.setText("Back");
		jButton50.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton50ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jFrame5Layout = new javax.swing.GroupLayout(jFrame5.getContentPane());
		jFrame5.getContentPane().setLayout(jFrame5Layout);
		jFrame5Layout.setHorizontalGroup(jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame5Layout.createSequentialGroup().addGroup(jFrame5Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jFrame5Layout.createSequentialGroup().addContainerGap().addComponent(jPanel3,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE))
						.addGroup(jFrame5Layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane3,
								javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jFrame5Layout.createSequentialGroup().addGap(141, 141, 141).addComponent(jLabel16,
								javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jFrame5Layout.createSequentialGroup().addGap(123, 123, 123)
								.addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(59, 59, 59).addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 68,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap()));
		jFrame5Layout.setVerticalGroup(jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame5Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton8).addComponent(jButton50))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
						.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(29, 29, 29)));

		jFrame6.setTitle("Item data");
		jFrame6.setLocationByPlatform(true);
		jFrame6.setMinimumSize(new java.awt.Dimension(446, 380));
		jFrame6.setResizable(false);

		ups2.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Item Code", "Item Name", "Rate", "Stock in hand" }) {
			Class[] types = new Class[] { java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class,
					java.lang.Integer.class };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}
		});
		jScrollPane4.setViewportView(ups2);

		jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14));
		jLabel21.setText("Query By Name");

		jButton9.setText("Show");
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

		jLabel19.setText("Enter name of Item :");

		jButton51.setText("Back");
		jButton51.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton51ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jFrame6Layout = new javax.swing.GroupLayout(jFrame6.getContentPane());
		jFrame6.getContentPane().setLayout(jFrame6Layout);
		jFrame6Layout.setHorizontalGroup(jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame6Layout.createSequentialGroup().addGroup(jFrame6Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jFrame6Layout.createSequentialGroup().addGap(141, 141, 141).addComponent(jLabel21,
								javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jFrame6Layout.createSequentialGroup().addGap(32, 32, 32)
								.addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 163,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(45, 45, 45).addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE,
										151, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jFrame6Layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane4,
								javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jFrame6Layout.createSequentialGroup().addGap(174, 174, 174).addComponent(jButton9,
								javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jFrame6Layout.createSequentialGroup().addGap(183, 183, 183).addComponent(jButton51)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jFrame6Layout.setVerticalGroup(jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame6Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(29, 29, 29)
						.addGroup(jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel19))
						.addGap(18, 18, 18).addComponent(jButton9).addGap(32, 32, 32)
						.addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 151,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
						.addComponent(jButton51).addContainerGap()));

		jFrame7.setTitle("Item Data");
		jFrame7.setLocationByPlatform(true);
		jFrame7.setMinimumSize(new java.awt.Dimension(446, 359));
		jFrame7.setResizable(false);

		jLabel20.setText("Enter Code of Item :");

		jButton10.setText("Show");
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton10ActionPerformed(evt);
			}
		});

		jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14));
		jLabel22.setText("Query By Code");

		ups3.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Item Code", "Item Name", "Rate", "Stock in hand" }) {
			Class[] types = new Class[] { java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class,
					java.lang.Integer.class };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}
		});
		jScrollPane5.setViewportView(ups3);

		jButton52.setText("Back");
		jButton52.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton52ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jFrame7Layout = new javax.swing.GroupLayout(jFrame7.getContentPane());
		jFrame7.getContentPane().setLayout(jFrame7Layout);
		jFrame7Layout.setHorizontalGroup(jFrame7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 446, Short.MAX_VALUE)
				.addGroup(jFrame7Layout.createSequentialGroup().addGroup(jFrame7Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jFrame7Layout.createSequentialGroup().addGap(141, 141, 141).addComponent(jLabel22,
								javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jFrame7Layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane5,
								javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jFrame7Layout.createSequentialGroup().addGap(32, 32, 32)
								.addGroup(jFrame7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(
												jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 163,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jFrame7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jFrame7Layout.createSequentialGroup().addGap(45, 45, 45).addComponent(
												jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 151,
												javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jFrame7Layout.createSequentialGroup().addGap(72, 72, 72)
												.addComponent(jButton52)))))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jFrame7Layout.setVerticalGroup(jFrame7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame7Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(29, 29, 29)
						.addGroup(jFrame7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel20))
						.addGap(18, 18, 18)
						.addGroup(jFrame7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton10).addComponent(jButton52))
						.addGap(32, 32, 32)
						.addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 151,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jFrame8.setTitle("Customer Data");
		jFrame8.setLocationByPlatform(true);
		jFrame8.setMinimumSize(new java.awt.Dimension(400, 426));
		jFrame8.setResizable(false);

		jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14));
		jLabel23.setText("Customer Data");

		jLabel24.setText("Customer Code :");

		jLabel25.setText("Customer Name :");

		jLabel26.setText("Address            :");

		jLabel27.setText("State               :");

		jLabel28.setText("Pin Number     :");

		jLabel29.setText("City                  :  ");

		jLabel30.setText("Phone Number :");

		jButton11.setText("Insert");
		jButton11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton11ActionPerformed(evt);
			}
		});

		jButton12.setText("Reset");
		jButton12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton12ActionPerformed(evt);
			}
		});

		jButton53.setText("Back");
		jButton53.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton53ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jFrame8Layout = new javax.swing.GroupLayout(jFrame8.getContentPane());
		jFrame8.getContentPane().setLayout(jFrame8Layout);
		jFrame8Layout.setHorizontalGroup(jFrame8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame8Layout.createSequentialGroup().addGroup(jFrame8Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jFrame8Layout.createSequentialGroup().addGap(131, 131, 131).addComponent(jLabel23))
						.addGroup(jFrame8Layout.createSequentialGroup().addGap(37, 37, 37)
								.addGroup(jFrame8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jFrame8Layout.createSequentialGroup()
												.addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 146,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(32, 32, 32).addComponent(jTextField21,
														javax.swing.GroupLayout.PREFERRED_SIZE, 135,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jFrame8Layout.createSequentialGroup()
												.addGroup(jFrame8Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE,
																146, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE,
																146, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE,
																146, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 146,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE,
																146, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE,
																146, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(32, 32, 32)
												.addGroup(jFrame8Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(jTextField18,
																javax.swing.GroupLayout.DEFAULT_SIZE, 135,
																Short.MAX_VALUE)
														.addComponent(jTextField17).addComponent(jTextField16)
														.addComponent(jTextField15,
																javax.swing.GroupLayout.DEFAULT_SIZE, 135,
																Short.MAX_VALUE)
														.addComponent(jTextField19).addComponent(jTextField20)))))
						.addGroup(jFrame8Layout.createSequentialGroup().addGap(58, 58, 58).addComponent(jButton11)
								.addGap(47, 47, 47).addComponent(jButton12).addGap(44, 44, 44).addComponent(jButton53)))
						.addContainerGap(50, Short.MAX_VALUE)));
		jFrame8Layout.setVerticalGroup(jFrame8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame8Layout.createSequentialGroup().addContainerGap().addComponent(jLabel23)
						.addGap(41, 41, 41)
						.addGroup(jFrame8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(11, 11, 11)
						.addGroup(jFrame8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jFrame8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jFrame8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jFrame8Layout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(48, 48, 48)
										.addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jFrame8Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(jFrame8Layout.createSequentialGroup().addGap(13, 13, 13)
										.addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addGroup(jFrame8Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
						.addGroup(jFrame8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton11).addComponent(jButton53).addComponent(jButton12))
						.addGap(25, 25, 25)));

		jFrame9.setTitle("Customer Data");
		jFrame9.setLocationByPlatform(true);
		jFrame9.setMinimumSize(new java.awt.Dimension(440, 540));
		jFrame9.setResizable(false);

		jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter Data to be updated"));

		jLabel36.setText("Pin Number     :");

		jLabel38.setText("Phone Number :");

		jLabel35.setText("State               :");

		jLabel34.setText("Address            :");

		jLabel37.setText("City                  :  ");

		jLabel33.setText("Customer Name :");

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addGap(28, 28, 28).addGroup(jPanel4Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addGroup(jPanel4Layout.createSequentialGroup()
								.addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 146,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(32, 32, 32).addComponent(jTextField27))
						.addGroup(jPanel4Layout.createSequentialGroup()
								.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 146,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 146,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 146,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 146,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 146,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(32, 32, 32)
								.addGroup(jPanel4Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jTextField24, javax.swing.GroupLayout.DEFAULT_SIZE, 135,
												Short.MAX_VALUE)
										.addComponent(jTextField25).addComponent(jTextField23)
										.addComponent(jTextField26).addComponent(jTextField28,
												javax.swing.GroupLayout.PREFERRED_SIZE, 165,
												javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(18, Short.MAX_VALUE)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addGap(23, 23, 23)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel4Layout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(48, 48, 48).addComponent(jLabel36,
												javax.swing.GroupLayout.PREFERRED_SIZE, 26,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel4Layout.createSequentialGroup().addGap(13, 13, 13)
										.addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addGroup(jPanel4Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(40, Short.MAX_VALUE)));

		jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14));
		jLabel31.setText("Update Customer Data");

		jLabel32.setText("Give Customer Code  whose data you want to update :");

		jButton13.setText("Update");
		jButton13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton13ActionPerformed(evt);
			}
		});

		jButton14.setText("Reset");
		jButton14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton14ActionPerformed(evt);
			}
		});

		jButton54.setText("Back");
		jButton54.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton54ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jFrame9Layout = new javax.swing.GroupLayout(jFrame9.getContentPane());
		jFrame9.getContentPane().setLayout(jFrame9Layout);
		jFrame9Layout
				.setHorizontalGroup(jFrame9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								jFrame9Layout.createSequentialGroup().addContainerGap(149, Short.MAX_VALUE)
										.addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 201,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(90, 90, 90))
						.addGroup(
								jFrame9Layout.createSequentialGroup().addGap(39, 39, 39).addComponent(jLabel32)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jTextField22, javax.swing.GroupLayout.DEFAULT_SIZE, 116,
												Short.MAX_VALUE)
										.addContainerGap())
						.addGroup(jFrame9Layout.createSequentialGroup().addGap(25, 25, 25)
								.addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addContainerGap())
						.addGroup(jFrame9Layout.createSequentialGroup().addGap(96, 96, 96).addComponent(jButton13)
								.addGap(38, 38, 38).addComponent(jButton14).addGap(38, 38, 38).addComponent(jButton54)
								.addContainerGap(85, Short.MAX_VALUE)));
		jFrame9Layout.setVerticalGroup(jFrame9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame9Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(32, 32, 32)
						.addGroup(jFrame9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(45, 45, 45)
						.addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(jFrame9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton13).addComponent(jButton14).addComponent(jButton54))
						.addContainerGap(38, Short.MAX_VALUE)));

		jFrame10.setTitle("Customer Data");
		jFrame10.setLocationByPlatform(true);
		jFrame10.setMinimumSize(new java.awt.Dimension(489, 200));
		jFrame10.setResizable(false);

		jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14));
		jLabel39.setText("Delete Customer Data");

		jLabel40.setText("Enter Customer Code Whose Data You Want To Delete :");

		jButton15.setText("Delete Data");
		jButton15.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton15ActionPerformed(evt);
			}
		});

		jButton16.setText("Reset");
		jButton16.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton16ActionPerformed(evt);
			}
		});

		jButton17.setText("Back");
		jButton17.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton17ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jFrame10Layout = new javax.swing.GroupLayout(jFrame10.getContentPane());
		jFrame10.getContentPane().setLayout(jFrame10Layout);
		jFrame10Layout.setHorizontalGroup(jFrame10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame10Layout.createSequentialGroup().addGroup(jFrame10Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jFrame10Layout.createSequentialGroup().addGap(54, 54, 54).addComponent(jButton15)
								.addGap(59, 59, 59).addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 79,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jFrame10Layout.createSequentialGroup().addContainerGap().addComponent(jLabel40,
								javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jFrame10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jFrame10Layout.createSequentialGroup()
												.addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 79,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(52, 52, 52))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jFrame10Layout.createSequentialGroup()
												.addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 133,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addContainerGap())))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame10Layout.createSequentialGroup()
						.addContainerGap(162, Short.MAX_VALUE).addComponent(jLabel39,
								javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(104, 104, 104)));
		jFrame10Layout.setVerticalGroup(jFrame10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame10Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(27, 27, 27)
						.addGroup(jFrame10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(32, 32, 32)
						.addGroup(jFrame10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton15).addComponent(jButton16).addComponent(jButton17))
						.addContainerGap(33, Short.MAX_VALUE)));

		jFrame11.setTitle("Customer Data");
		jFrame11.setLocationByPlatform(true);
		jFrame11.setMinimumSize(new java.awt.Dimension(594, 519));
		jFrame11.setResizable(false);

		jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14));
		jLabel41.setText("Customer Data");

		jButton18.setText("Show Customer Data In Table");
		jButton18.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton18ActionPerformed(evt);
			}
		});

		jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Code", "Name", "Address", "City", "State", "Pin_No.", "Phone_No." }) {
			Class[] types = new Class[] { java.lang.Integer.class, java.lang.String.class, java.lang.String.class,
					java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}
		});
		jScrollPane2.setViewportView(jTable1);

		jButton19.setText("Back");
		jButton19.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton19ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jFrame11Layout = new javax.swing.GroupLayout(jFrame11.getContentPane());
		jFrame11.getContentPane().setLayout(jFrame11Layout);
		jFrame11Layout.setHorizontalGroup(jFrame11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jFrame11Layout.createSequentialGroup().addContainerGap(239, Short.MAX_VALUE)
								.addComponent(jLabel41).addGap(242, 242, 242))
				.addGroup(jFrame11Layout.createSequentialGroup().addGroup(jFrame11Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
								jFrame11Layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane2,
										javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE))
						.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
								jFrame11Layout.createSequentialGroup().addGap(26, 26, 26).addComponent(jButton18,
										javax.swing.GroupLayout.PREFERRED_SIZE, 549,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(jFrame11Layout
						.createSequentialGroup().addGap(212, 212, 212).addComponent(jButton19,
								javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(205, Short.MAX_VALUE)));
		jFrame11Layout
				.setVerticalGroup(
						jFrame11Layout
								.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jFrame11Layout.createSequentialGroup().addContainerGap()
										.addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(35, 35, 35)
										.addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(jButton19)
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jFrame12.setTitle("Customer Data");
		jFrame12.setLocationByPlatform(true);
		jFrame12.setMinimumSize(new java.awt.Dimension(585, 486));
		jFrame12.setResizable(false);

		jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14));
		jLabel42.setText("Customer Data :Query By City");

		jButton20.setText("Show Customer Data In Table");
		jButton20.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton20ActionPerformed(evt);
			}
		});

		jTable2.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Code", "Name", "Address", "City", "Pin_No.", "Phone_No." }) {
			Class[] types = new Class[] { java.lang.Integer.class, java.lang.String.class, java.lang.String.class,
					java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}
		});
		jScrollPane6.setViewportView(jTable2);

		jButton21.setText("Back");
		jButton21.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton21ActionPerformed(evt);
			}
		});

		jLabel43.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLabel43.setText("Enter Name Of City :");

		javax.swing.GroupLayout jFrame12Layout = new javax.swing.GroupLayout(jFrame12.getContentPane());
		jFrame12.getContentPane().setLayout(jFrame12Layout);
		jFrame12Layout.setHorizontalGroup(jFrame12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame12Layout.createSequentialGroup().addGroup(jFrame12Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jFrame12Layout.createSequentialGroup().addGap(216, 216, 216)
								.addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 168,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(181, 181, 181))
						.addGroup(jFrame12Layout.createSequentialGroup().addGap(20, 20, 20).addComponent(jButton20,
								javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jFrame12Layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane6,
								javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)))
						.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jFrame12Layout.createSequentialGroup().addContainerGap(188, Short.MAX_VALUE)
								.addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 222,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(175, 175, 175))
				.addGroup(jFrame12Layout.createSequentialGroup().addGap(33, 33, 33)
						.addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 222,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(55, 55, 55).addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 244,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(31, Short.MAX_VALUE)));
		jFrame12Layout.setVerticalGroup(jFrame12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame12Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(40, 40, 40)
						.addGroup(jFrame12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(29, 29, 29)
						.addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 203,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(37, 37, 37).addComponent(jButton21)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jFrame13.setTitle("Bill");
		jFrame13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		jFrame13.setFocusCycleRoot(false);
		jFrame13.setLocationByPlatform(true);
		jFrame13.setMinimumSize(new java.awt.Dimension(453, 653));
		jFrame13.setResizable(false);

		jLabel44.setFont(new java.awt.Font("Tahoma", 1, 18));
		jLabel44.setText("Bill");

		jLabel45.setText("Bill Number :");

		jTextField31.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField31ActionPerformed(evt);
			}
		});

		jLabel46.setText("Buyer : ");

		buttonGroup1.add(jRadioButton1);
		jRadioButton1.setText("Customer");
		jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton1ActionPerformed(evt);
			}
		});

		jLabel47.setText("Select Date Of Bill :");

		buttonGroup1.add(jRadioButton2);
		jRadioButton2.setText("Supplier");

		jComboBox1.setEditable(true);
		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
						"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
		jComboBox1.setToolTipText("Date");
		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox1ActionPerformed(evt);
			}
		});

		jComboBox2.setEditable(true);
		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		jComboBox2.setToolTipText("Month");

		jComboBox3.setEditable(true);
		jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1990", "1991", "1992", "1993", "1994",
				"1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007",
				"2008", "2009", "2010", "2011", "2012" }));
		jComboBox3.setToolTipText("Year");
		jComboBox3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

		jLabel48.setText("Item Name :");

		jTextField32.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField32ActionPerformed(evt);
			}
		});

		jLabel49.setText("Item Code :");

		jLabel50.setText("Quantity :");

		jTextField34.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField34ActionPerformed(evt);
			}
		});

		jButton22.setText("Create Bill");
		jButton22.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton22ActionPerformed(evt);
			}
		});

		jButton23.setText("Buy item");
		jButton23.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton23ActionPerformed(evt);
			}
		});

		jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Bill :"));

		jLabel51.setText("Amount       :");

		jTextField33.setRequestFocusEnabled(false);

		jLabel52.setText("Discount      :");

		jTextField36.setRequestFocusEnabled(false);

		jLabel53.setText("Net Amount :");

		jTextField37.setRequestFocusEnabled(false);

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addGap(28, 28, 28)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel5Layout.createSequentialGroup()
										.addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 138,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(28, 28, 28).addComponent(jTextField37,
												javax.swing.GroupLayout.PREFERRED_SIZE, 151,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(jPanel5Layout.createSequentialGroup()
												.addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 138,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(28, 28, 28).addComponent(jTextField36,
														javax.swing.GroupLayout.PREFERRED_SIZE, 151,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel5Layout.createSequentialGroup()
												.addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 138,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(28, 28, 28).addComponent(jTextField33,
														javax.swing.GroupLayout.PREFERRED_SIZE, 151,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(56, Short.MAX_VALUE)));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addGap(19, 19, 19)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 22,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 22,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 22,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(35, Short.MAX_VALUE)));

		jButton24.setText("Print Bill");
		jButton24.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton24ActionPerformed(evt);
			}
		});

		jButton25.setText("Back");
		jButton25.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton25ActionPerformed(evt);
			}
		});

		jLabel54.setText("Buyer's Name :");

		jTextField38.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField38ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jFrame13Layout = new javax.swing.GroupLayout(jFrame13.getContentPane());
		jFrame13.getContentPane().setLayout(jFrame13Layout);
		jFrame13Layout.setHorizontalGroup(jFrame13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame13Layout.createSequentialGroup().addGap(194, 194, 194).addComponent(jLabel44))
				.addGroup(jFrame13Layout.createSequentialGroup().addGap(18, 18, 18).addGroup(jFrame13Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(jFrame13Layout.createSequentialGroup().addGroup(jFrame13Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jFrame13Layout.createSequentialGroup().addGap(8, 8, 8)
										.addGroup(jFrame13Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel47)
												.addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 81,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(jFrame13Layout
										.createSequentialGroup().addGap(54, 54, 54).addComponent(jButton22)))
								.addGap(44, 44, 44)
								.addGroup(jFrame13Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addGroup(jFrame13Layout.createSequentialGroup().addComponent(jButton23)
												.addGap(40, 40, 40).addComponent(jButton25,
														javax.swing.GroupLayout.PREFERRED_SIZE, 71,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jFrame13Layout.createSequentialGroup()
												.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 54,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(18, 18, 18).addComponent(jComboBox3, 0, 1, Short.MAX_VALUE))
										.addComponent(jTextField35).addComponent(jTextField34)
										.addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 207,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(49, javax.swing.GroupLayout.PREFERRED_SIZE))))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jFrame13Layout.createSequentialGroup().addContainerGap(186, Short.MAX_VALUE)
								.addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(178, 178, 178))
				.addGroup(jFrame13Layout.createSequentialGroup().addGap(27, 27, 27)
						.addGroup(jFrame13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 143,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 143,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 143,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(27, 27, 27)
						.addGroup(jFrame13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jFrame13Layout.createSequentialGroup().addComponent(jRadioButton1)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73,
												Short.MAX_VALUE)
										.addComponent(jRadioButton2))
								.addComponent(jTextField31, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
								.addComponent(jTextField38, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
						.addGap(49, 49, 49)));
		jFrame13Layout.setVerticalGroup(jFrame13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame13Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 27,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(27, 27, 27)
						.addGroup(jFrame13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel45)
								.addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jFrame13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel46).addComponent(jRadioButton1).addComponent(jRadioButton2))
						.addGap(18, 18, 18)
						.addGroup(jFrame13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel54).addComponent(jTextField38,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
						.addGroup(jFrame13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel47)
								.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jFrame13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jFrame13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jFrame13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel50)
								.addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(35, 35, 35)
						.addGroup(jFrame13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton22).addComponent(jButton23).addComponent(jButton25))
						.addGap(18, 18, 18)
						.addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(17, 17, 17).addComponent(jButton24).addContainerGap()));

		jComboBox1.getAccessibleContext().setAccessibleName("date");
		jComboBox2.getAccessibleContext().setAccessibleName("Month");
		jComboBox3.getAccessibleContext().setAccessibleName("Year");

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jTextArea1.setBorder(new javax.swing.border.MatteBorder(null));
		jScrollPane7.setViewportView(jTextArea1);

		jFrame14.setTitle("Bill History");
		jFrame14.setMinimumSize(new java.awt.Dimension(676, 440));
		jFrame14.setResizable(false);

		jLabel55.setFont(new java.awt.Font("Tahoma", 1, 14));
		jLabel55.setText("Bill History");

		jButton26.setText("Show Bill History");
		jButton26.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton26ActionPerformed(evt);
			}
		});

		jTable3.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Billno", "Customer_type", "Name", "Date of purchase", "Item_Name", "Quantity", "Amount",
				"Discount", "Netamount" }) {
			Class[] types = new Class[] { java.lang.Integer.class, java.lang.String.class, java.lang.String.class,
					java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class,
					java.lang.Integer.class, java.lang.Integer.class };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}
		});
		jScrollPane8.setViewportView(jTable3);

		jButton27.setText("Back");
		jButton27.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton27ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jFrame14Layout = new javax.swing.GroupLayout(jFrame14.getContentPane());
		jFrame14.getContentPane().setLayout(jFrame14Layout);
		jFrame14Layout.setHorizontalGroup(jFrame14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame14Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jFrame14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING,
										javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
								.addGroup(jFrame14Layout.createSequentialGroup()
										.addGroup(jFrame14Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel55).addComponent(jButton26,
														javax.swing.GroupLayout.PREFERRED_SIZE, 386,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144,
												Short.MAX_VALUE)
										.addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 126,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap()));
		jFrame14Layout.setVerticalGroup(jFrame14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame14Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(30, 30, 30)
						.addGroup(jFrame14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton26).addComponent(jButton27))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 265,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jFrame15.setTitle("Bill History");
		jFrame15.setMinimumSize(new java.awt.Dimension(708, 390));
		jFrame15.setResizable(false);

		jLabel56.setFont(new java.awt.Font("Tahoma", 1, 14));
		jLabel56.setText("Bill History");

		jLabel57.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLabel57.setText("Enter Bill Code :");

		jTable4.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Billno", "Customer_type", "Name", "Date of purchase", "Item_Name", "Quantity", "Amount",
				"Discount", "Netamount" }) {
			Class[] types = new Class[] { java.lang.Integer.class, java.lang.String.class, java.lang.String.class,
					java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class,
					java.lang.Integer.class, java.lang.Integer.class };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}
		});
		jTable4.getTableHeader().setReorderingAllowed(false);
		jScrollPane9.setViewportView(jTable4);

		jButton28.setText("Show Bill History");
		jButton28.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton28ActionPerformed(evt);
			}
		});

		jButton29.setText("Back");
		jButton29.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton29ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jFrame15Layout = new javax.swing.GroupLayout(jFrame15.getContentPane());
		jFrame15.getContentPane().setLayout(jFrame15Layout);
		jFrame15Layout.setHorizontalGroup(jFrame15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame15Layout.createSequentialGroup().addGap(33, 33, 33)
						.addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 222,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(120, 120, 120)
						.addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 315,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(18, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jFrame15Layout.createSequentialGroup().addContainerGap(291, Short.MAX_VALUE)
								.addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 222,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(195, 195, 195))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jFrame15Layout.createSequentialGroup().addContainerGap()
								.addGroup(jFrame15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
										.addGroup(jFrame15Layout.createSequentialGroup()
												.addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 463,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99,
														Short.MAX_VALUE)
												.addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 126,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap()));
		jFrame15Layout.setVerticalGroup(jFrame15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame15Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(40, 40, 40)
						.addGroup(jFrame15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jFrame15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton28).addComponent(jButton29))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 176,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(37, Short.MAX_VALUE)));

		jFrame16.setTitle("Bill History");
		jFrame16.setMinimumSize(new java.awt.Dimension(700, 386));
		jFrame16.setResizable(false);

		jButton30.setText("Show Bill History");
		jButton30.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton30ActionPerformed(evt);
			}
		});

		jButton31.setText("Back");
		jButton31.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton31ActionPerformed(evt);
			}
		});

		jTable5.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Billno", "Customer_type", "Name", "Date of purchase", "Item_Name", "Quantity", "Amount",
				"Discount", "Netamount" }) {
			Class[] types = new Class[] { java.lang.Integer.class, java.lang.String.class, java.lang.String.class,
					java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class,
					java.lang.Integer.class, java.lang.Integer.class };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}
		});
		jTable5.getTableHeader().setReorderingAllowed(false);
		jScrollPane10.setViewportView(jTable5);

		jLabel58.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLabel58.setText("Enter item Code :");

		jLabel59.setFont(new java.awt.Font("Tahoma", 1, 14));
		jLabel59.setText("Bill History");

		javax.swing.GroupLayout jFrame16Layout = new javax.swing.GroupLayout(jFrame16.getContentPane());
		jFrame16.getContentPane().setLayout(jFrame16Layout);
		jFrame16Layout.setHorizontalGroup(jFrame16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 700, Short.MAX_VALUE)
				.addGroup(jFrame16Layout.createSequentialGroup().addGap(33, 33, 33)
						.addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 222,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(120, 120, 120)
						.addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 315,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jFrame16Layout.createSequentialGroup().addContainerGap(283, Short.MAX_VALUE)
								.addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 222,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(195, 195, 195))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jFrame16Layout.createSequentialGroup().addContainerGap()
								.addGroup(jFrame16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
										.addGroup(jFrame16Layout.createSequentialGroup()
												.addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 463,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91,
														Short.MAX_VALUE)
												.addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 126,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap()));
		jFrame16Layout.setVerticalGroup(jFrame16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame16Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(40, 40, 40)
						.addGroup(jFrame16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jFrame16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton30).addComponent(jButton31))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 190,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(25, Short.MAX_VALUE)));

		jFrame17.setTitle("Supplier Data");
		jFrame17.setMinimumSize(new java.awt.Dimension(400, 450));
		jFrame17.setResizable(false);

		jLabel60.setFont(new java.awt.Font("Tahoma", 1, 14));
		jLabel60.setText("Supplier Data");

		jLabel61.setText("Supplier Name   :");

		jLabel62.setText("Supplier Code    :");

		jButton32.setText("Insert");
		jButton32.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton32ActionPerformed(evt);
			}
		});

		jButton33.setText("Reset");
		jButton33.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton33ActionPerformed(evt);
			}
		});

		jLabel63.setText("Address            :");

		jLabel64.setText("State               :");

		jLabel65.setText("Pin Number      :");

		jLabel66.setText("City                  :  ");

		jLabel67.setText("Phone Number :");

		jButton34.setText("Back");
		jButton34.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton34ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jFrame17Layout = new javax.swing.GroupLayout(jFrame17.getContentPane());
		jFrame17.getContentPane().setLayout(jFrame17Layout);
		jFrame17Layout.setHorizontalGroup(jFrame17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame17Layout.createSequentialGroup().addGap(37, 37, 37).addGroup(jFrame17Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jFrame17Layout.createSequentialGroup()
								.addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 146,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(32, 32, 32).addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE,
										135, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jFrame17Layout.createSequentialGroup()
								.addGroup(jFrame17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 146,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 146,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 146,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 146,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 146,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 146,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(32, 32, 32)
								.addGroup(jFrame17Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
										.addComponent(jTextField48)
										.addComponent(jTextField47, javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jTextField42, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
										.addComponent(jTextField43, javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jTextField41, javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jTextField44, javax.swing.GroupLayout.Alignment.LEADING))))
						.addContainerGap(50, Short.MAX_VALUE))
				.addGroup(jFrame17Layout.createSequentialGroup().addGap(55, 55, 55).addComponent(jButton32)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
						.addComponent(jButton33).addGap(88, 88, 88))
				.addGroup(jFrame17Layout.createSequentialGroup().addGap(136, 136, 136)
						.addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 101,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(163, Short.MAX_VALUE))
				.addGroup(jFrame17Layout.createSequentialGroup().addGap(133, 133, 133).addComponent(jLabel60)
						.addContainerGap(175, Short.MAX_VALUE)));
		jFrame17Layout.setVerticalGroup(jFrame17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame17Layout.createSequentialGroup().addContainerGap().addComponent(jLabel60)
						.addGap(41, 41, 41)
						.addGroup(jFrame17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(11, 11, 11)
						.addGroup(jFrame17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jFrame17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jFrame17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jFrame17Layout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(48, 48, 48)
										.addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jFrame17Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(jFrame17Layout.createSequentialGroup().addGap(13, 13, 13)
										.addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addGroup(jFrame17Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(18, 18, 18)
						.addGroup(jFrame17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jButton33).addComponent(jButton32))
						.addGap(17, 17, 17).addComponent(jButton34).addContainerGap()));

		jFrame18.setTitle("Supplier Data");
		jFrame18.setMinimumSize(new java.awt.Dimension(490, 200));

		jButton35.setText("Back");
		jButton35.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton35ActionPerformed(evt);
			}
		});

		jButton36.setText("Reset");
		jButton36.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton36ActionPerformed(evt);
			}
		});

		jButton37.setText("Delete Data");
		jButton37.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton37ActionPerformed(evt);
			}
		});

		jLabel68.setText("Enter Supplier Code Whose Data You Want To Delete :");

		jLabel69.setFont(new java.awt.Font("Tahoma", 1, 14));
		jLabel69.setText("Delete Supplier Data");

		javax.swing.GroupLayout jFrame18Layout = new javax.swing.GroupLayout(jFrame18.getContentPane());
		jFrame18.getContentPane().setLayout(jFrame18Layout);
		jFrame18Layout.setHorizontalGroup(jFrame18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 434, Short.MAX_VALUE)
				.addGroup(jFrame18Layout.createSequentialGroup().addGroup(jFrame18Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jFrame18Layout.createSequentialGroup().addGap(54, 54, 54).addComponent(jButton37)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48,
										Short.MAX_VALUE)
								.addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 79,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(11, 11, 11))
						.addGroup(jFrame18Layout.createSequentialGroup().addContainerGap().addComponent(jLabel68,
								javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)))
						.addGroup(jFrame18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jFrame18Layout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 133,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jFrame18Layout.createSequentialGroup().addGap(36, 36, 36).addComponent(
										jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 79,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame18Layout.createSequentialGroup()
						.addContainerGap(127, Short.MAX_VALUE).addComponent(jLabel69,
								javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(104, 104, 104)));
		jFrame18Layout.setVerticalGroup(jFrame18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 158, Short.MAX_VALUE)
				.addGroup(jFrame18Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(27, 27, 27)
						.addGroup(jFrame18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(32, 32, 32)
						.addGroup(jFrame18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton37).addComponent(jButton35).addComponent(jButton36))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jFrame19.setTitle("Supplier Data");
		jFrame19.setMinimumSize(new java.awt.Dimension(585, 445));
		jFrame19.setResizable(false);

		jButton38.setText("Back");
		jButton38.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton38ActionPerformed(evt);
			}
		});

		jButton39.setText("Show Supplier Data In Table");
		jButton39.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton39ActionPerformed(evt);
			}
		});

		jTable6.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Code", "Name", "Address", "City", "Pin_No.", "Phone_No." }) {
			Class[] types = new Class[] { java.lang.Integer.class, java.lang.String.class, java.lang.String.class,
					java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}
		});
		jScrollPane11.setViewportView(jTable6);

		jLabel70.setFont(new java.awt.Font("Tahoma", 1, 14));
		jLabel70.setText("Supplier Data");

		javax.swing.GroupLayout jFrame19Layout = new javax.swing.GroupLayout(jFrame19.getContentPane());
		jFrame19.getContentPane().setLayout(jFrame19Layout);
		jFrame19Layout.setHorizontalGroup(jFrame19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jFrame19Layout.createSequentialGroup().addContainerGap(251, Short.MAX_VALUE)
								.addComponent(jLabel70).addGap(242, 242, 242))
				.addGroup(jFrame19Layout.createSequentialGroup().addGroup(jFrame19Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
								jFrame19Layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane11,
										javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE))
						.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
								jFrame19Layout.createSequentialGroup().addGap(26, 26, 26).addComponent(jButton39,
										javax.swing.GroupLayout.PREFERRED_SIZE, 549,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame19Layout.createSequentialGroup()
						.addContainerGap(218, Short.MAX_VALUE).addComponent(jButton38,
								javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(199, 199, 199)));
		jFrame19Layout
				.setVerticalGroup(
						jFrame19Layout
								.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jFrame19Layout.createSequentialGroup().addContainerGap()
										.addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(35, 35, 35)
										.addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 241,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(jButton38)
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jFrame20.setTitle("Supplier Data");
		jFrame20.setMinimumSize(new java.awt.Dimension(649, 550));
		jFrame20.setResizable(false);

		jLabel71.setFont(new java.awt.Font("Tahoma", 1, 14));
		jLabel71.setText("Supplier Data :Query By City");

		jButton40.setText("Back");
		jButton40.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton40ActionPerformed(evt);
			}
		});

		jLabel72.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLabel72.setText("Enter Name Of City :");

		jButton41.setText("Show Supplier Data In Table");
		jButton41.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton41ActionPerformed(evt);
			}
		});

		jTable7.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Code", "Name", "Address", "City", "Pin_No.", "Phone_No." }) {
			Class[] types = new Class[] { java.lang.Integer.class, java.lang.String.class, java.lang.String.class,
					java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}
		});
		jScrollPane12.setViewportView(jTable7);

		javax.swing.GroupLayout jFrame20Layout = new javax.swing.GroupLayout(jFrame20.getContentPane());
		jFrame20.getContentPane().setLayout(jFrame20Layout);
		jFrame20Layout.setHorizontalGroup(jFrame20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame20Layout.createSequentialGroup().addGroup(jFrame20Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jFrame20Layout.createSequentialGroup().addGap(216, 216, 216)
								.addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 168,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(181, 181, 181))
						.addGroup(jFrame20Layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane12,
								javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE))
						.addGroup(jFrame20Layout.createSequentialGroup().addGap(33, 33, 33)
								.addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 222,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(55, 55, 55).addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE,
										244, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jFrame20Layout.createSequentialGroup().addGap(20, 20, 20).addComponent(jButton41,
								javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame20Layout.createSequentialGroup()
						.addContainerGap(225, Short.MAX_VALUE).addComponent(jLabel71,
								javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(202, 202, 202)));
		jFrame20Layout.setVerticalGroup(jFrame20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame20Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(40, 40, 40)
						.addGroup(jFrame20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(29, 29, 29)
						.addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 203,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(37, 37, 37).addComponent(jButton40).addContainerGap(19, Short.MAX_VALUE)));

		jFrame21.setTitle("Supplier Data");
		jFrame21.setMinimumSize(new java.awt.Dimension(641, 510));
		jFrame21.setResizable(false);

		jLabel73.setFont(new java.awt.Font("Tahoma", 1, 14));
		jLabel73.setText("Supplier Data :Query By State");

		jTable8.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Code", "Name", "Address", "City", "Pin_No.", "Phone_No." }) {
			Class[] types = new Class[] { java.lang.Integer.class, java.lang.String.class, java.lang.String.class,
					java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}
		});
		jScrollPane13.setViewportView(jTable8);

		jLabel74.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLabel74.setText("Enter Name Of State :");

		jButton42.setText("Back");
		jButton42.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton42ActionPerformed(evt);
			}
		});

		jButton43.setText("Show Supplier Data In Table");
		jButton43.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton43ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jFrame21Layout = new javax.swing.GroupLayout(jFrame21.getContentPane());
		jFrame21.getContentPane().setLayout(jFrame21Layout);
		jFrame21Layout.setHorizontalGroup(jFrame21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 641, Short.MAX_VALUE)
				.addGroup(jFrame21Layout.createSequentialGroup().addGroup(jFrame21Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jFrame21Layout.createSequentialGroup().addGap(216, 216, 216)
								.addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 168,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(181, 181, 181))
						.addGroup(jFrame21Layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane13,
								javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE))
						.addGroup(jFrame21Layout.createSequentialGroup().addGap(33, 33, 33)
								.addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 222,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(55, 55, 55).addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE,
										244, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jFrame21Layout.createSequentialGroup().addGap(20, 20, 20).addComponent(jButton43,
								javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame21Layout.createSequentialGroup()
						.addContainerGap(217, Short.MAX_VALUE).addComponent(jLabel73,
								javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(202, 202, 202)));
		jFrame21Layout.setVerticalGroup(jFrame21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 456, Short.MAX_VALUE)
				.addGroup(jFrame21Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(40, 40, 40)
						.addGroup(jFrame21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(29, 29, 29)
						.addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 203,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(37, 37, 37).addComponent(jButton42)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jFrame22.setTitle("Customer Data");
		jFrame22.setMinimumSize(new java.awt.Dimension(660, 460));
		jFrame22.setResizable(false);

		jLabel75.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLabel75.setText("Enter Customer Of State :");

		jLabel76.setFont(new java.awt.Font("Tahoma", 1, 14));
		jLabel76.setText("Customer Data :Query By State");

		jTable9.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Code", "Name", "Address", "City", "Pin_No.", "Phone_No." }) {
			Class[] types = new Class[] { java.lang.Integer.class, java.lang.String.class, java.lang.String.class,
					java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}
		});
		jScrollPane14.setViewportView(jTable9);

		jButton44.setText("Show Customer Data In Table");
		jButton44.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton44ActionPerformed(evt);
			}
		});

		jButton45.setText("Back");
		jButton45.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton45ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jFrame22Layout = new javax.swing.GroupLayout(jFrame22.getContentPane());
		jFrame22.getContentPane().setLayout(jFrame22Layout);
		jFrame22Layout.setHorizontalGroup(jFrame22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame22Layout.createSequentialGroup().addGap(234, 234, 234)
						.addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 168,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(258, Short.MAX_VALUE))
				.addGroup(jFrame22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jFrame22Layout.createSequentialGroup().addGap(19, 19, 19).addGroup(jFrame22Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jScrollPane14, javax.swing.GroupLayout.Alignment.LEADING,
										javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jFrame22Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jFrame22Layout.createSequentialGroup().addGap(23, 23, 23)
												.addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 222,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(55, 55, 55).addComponent(jTextField51,
														javax.swing.GroupLayout.PREFERRED_SIZE, 244,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jFrame22Layout.createSequentialGroup().addGap(10, 10, 10)
												.addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 611,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame22Layout
												.createSequentialGroup()
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														197, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 222,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(192, 192, 192))))
								.addGap(20, 20, 20))));
		jFrame22Layout.setVerticalGroup(jFrame22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jFrame22Layout.createSequentialGroup().addContainerGap(420, Short.MAX_VALUE)
								.addComponent(jButton45).addContainerGap())
				.addGroup(jFrame22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jFrame22Layout.createSequentialGroup().addGap(26, 26, 26)
								.addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(40, 40, 40)
								.addGroup(jFrame22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(29, 29, 29)
								.addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE,
										208, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(49, Short.MAX_VALUE))));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Inventory Management System - MariaDB");
		setFont(new java.awt.Font("Arial", 1, 18));
		setLocationByPlatform(true);
		setResizable(false);

		//jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("./Intro.jpg")));

		jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jMenu1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jMenu1.setText("change Item");
		jMenu1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenu1ActionPerformed(evt);
			}
		});

		jMenuItem1.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem1.setText("Insert");
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem1);

		jMenuItem2.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem2.setText("Update");
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem2);

		jMenuItem3.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem3.setText("Delete");
		jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem3ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem3);

		jMenuBar1.add(jMenu1);

		jMenu2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jMenu2.setText("Item");

		jMenuItem5.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem5.setText("Show");
		jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem5ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem5);

		jMenu8.setText("Find Item By :");

		jMenuItem4.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem4.setText("Name");
		jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem4ActionPerformed(evt);
			}
		});
		jMenu8.add(jMenuItem4);

		jMenuItem6.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem6.setText("Rate");
		jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem6ActionPerformed(evt);
			}
		});
		jMenu8.add(jMenuItem6);

		jMenuItem7.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem7.setText("Code");
		jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem7ActionPerformed(evt);
			}
		});
		jMenu8.add(jMenuItem7);

		jMenu2.add(jMenu8);

		jMenuBar1.add(jMenu2);

		jMenu3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jMenu3.setText("Customer");
		jMenu3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenu3ActionPerformed(evt);
			}
		});

		jMenuItem8.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
		jMenuItem8.setText("Insert");
		jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem8ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem8);

		jMenuItem9.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
		jMenuItem9.setText("Update");
		jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem9ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem9);

		jMenuItem10.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
		jMenuItem10.setText("Delete");
		jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem10ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem10);

		jMenuItem11.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK));
		jMenuItem11.setText("Show Detail");
		jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem11ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem11);

		jMenu7.setText("Find Detail By :");

		jMenuItem12.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
		jMenuItem12.setText("City");
		jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem12ActionPerformed(evt);
			}
		});
		jMenu7.add(jMenuItem12);

		jMenuItem13.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
		jMenuItem13.setText("State");
		jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem13ActionPerformed(evt);
			}
		});
		jMenu7.add(jMenuItem13);

		jMenu3.add(jMenu7);

		jMenuBar1.add(jMenu3);

		jMenu4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jMenu4.setText("Supplier");

		jMenuItem19.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_MASK));
		jMenuItem19.setText("Insert");
		jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem19ActionPerformed(evt);
			}
		});
		jMenu4.add(jMenuItem19);

		jMenuItem21.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK));
		jMenuItem21.setText("Delete");
		jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem21ActionPerformed(evt);
			}
		});
		jMenu4.add(jMenuItem21);

		jMenuItem22.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_MASK));
		jMenuItem22.setText("Show Details");
		jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem22ActionPerformed(evt);
			}
		});
		jMenu4.add(jMenuItem22);

		jMenu11.setText("Find Details by :");

		jMenuItem20.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
		jMenuItem20.setText("City");
		jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem20ActionPerformed(evt);
			}
		});
		jMenu11.add(jMenuItem20);

		jMenuItem23.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
		jMenuItem23.setText("State");
		jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem23ActionPerformed(evt);
			}
		});
		jMenu11.add(jMenuItem23);

		jMenu4.add(jMenu11);

		jMenuBar1.add(jMenu4);

		jMenu5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jMenu5.setText("Purchase");

		jMenuItem15.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem15.setText("Selling");
		jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem15ActionPerformed(evt);
			}
		});
		jMenu5.add(jMenuItem15);

		jMenu9.setText("Bill");

		jMenuItem16.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem16.setText("Show Bill History");
		jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem16ActionPerformed(evt);
			}
		});
		jMenu9.add(jMenuItem16);

		jMenu10.setText("Search By");

		jMenuItem17.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem17.setText("Bill Code");
		jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem17ActionPerformed(evt);
			}
		});
		jMenu10.add(jMenuItem17);

		jMenuItem18.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem18.setText("Item Code");
		jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem18ActionPerformed(evt);
			}
		});
		jMenu10.add(jMenuItem18);

		jMenu9.add(jMenu10);

		jMenu5.add(jMenu9);

		jMenuBar1.add(jMenu5);

		jMenu6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jMenu6.setText("Exit");

		jMenuItem14.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem14.setText("Exit Window");
		jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem14ActionPerformed(evt);
			}
		});
		jMenu6.add(jMenuItem14);

		jMenuBar1.add(jMenu6);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel14)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel14)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame1.dispose();
		jFrame1.setVisible(true);
	}

	@SuppressWarnings("UseSpecificCatch")
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			String mk = jTextField6.getText();
			int mo = Integer.parseInt(mk);
			String ml = jTextField4.getText();
			String mj = jTextField5.getText();
			String md = jTextField3.getText();
			try {

				Class.forName("org.mariadb.jdbc.Driver");

				Connection con = (Connection) DriverManager
						.getConnection("jdbc:mariadb://localhost:3306/db?user=root&password=root");
				Statement stmt = con.createStatement();
				String query = "Insert into item1 values('" + ml + "','" + mj + "','" + mk + "','" + md + "');";
				stmt.executeUpdate(query);
				JOptionPane.showMessageDialog(this, "Record has been inserted");
				stmt.close();
				con.close();

			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, "Error in connectivity");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Invalid Entry", "message", 2);
		}

	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		jTextField3.setText(null);
		jTextField4.setText(null);
		jTextField5.setText(null);
		jTextField6.setText(null);
	}

	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame2.dispose();
		jFrame2.setVisible(true);
	}

	private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			String mk = jTextField7.getText();
			String ml = jTextField9.getText();
			String mj = jTextField10.getText();
			String md = jTextField8.getText();
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				Connection con = (Connection) DriverManager
						.getConnection("jdbc:mariadb://localhost:3306/db?user=root&password=root");
				Statement stmt = con.createStatement();
				int bp = JOptionPane.showConfirmDialog(this, "Do you want to update the record ?");
				if (bp == JOptionPane.YES_OPTION) {
					String query = "update item1 set item_name = '" + ml + "'and Rate = '" + mj
							+ "'and Stock_in_hand = '" + md + "'where item_code = '" + mk + "';";
					stmt.execute(query);
					JOptionPane.showMessageDialog(this, "Record has been updated");
				}
				if (bp == JOptionPane.CANCEL_OPTION) {
					jFrame2.dispose();
					jFrame2.setVisible(true);
				}
				if (bp == JOptionPane.NO_OPTION) {
					jFrame2.dispose();
					jFrame2.setVisible(true);
				}
				stmt.close();
				con.close();

			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, "Error in connectivity");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Invalid Entry", "message", 2);
		}
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		jTextField8.setText(null);
		jTextField7.setText(null);
		jTextField10.setText(null);
		jTextField9.setText(null);
	}

	private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame3.dispose();
		jFrame3.setVisible(true);
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con = (Connection) DriverManager
					.getConnection("jdbc:mariadb://localhost:3306/db?user=root&password=root");
			Statement stmt = con.createStatement();
			try {
				String mk = jTextField1.getText();
				int lk = Integer.parseInt(mk);
				int bp = JOptionPane.showConfirmDialog(this, "Do you want to delete the record ?");
				if (bp == JOptionPane.YES_OPTION) {

					String query = "Delete from item1 where item_code = '" + mk + "';";
					stmt.executeUpdate(query);
					JOptionPane.showMessageDialog(this, "Record has been deleted");
				}
				if (bp == JOptionPane.CANCEL_OPTION) {
					jFrame3.dispose();
					jFrame3.setVisible(true);
				}
				if (bp == JOptionPane.NO_OPTION) {
					jFrame3.dispose();
					jFrame3.setVisible(true);
				}
			} catch (Exception l) {
				try {
					int bp = JOptionPane.showConfirmDialog(this, "Do you want to delete the record ?");
					String ml = jTextField2.getText();
					if (bp == JOptionPane.YES_OPTION) {

						String query = "Delete from item1 where item_name = '" + ml + "';";
						stmt.executeUpdate(query);
						JOptionPane.showMessageDialog(this, "Record has been deleted");
					}
					if (bp == JOptionPane.CANCEL_OPTION) {
						jFrame3.dispose();
						jFrame3.setVisible(true);
					}
					if (bp == JOptionPane.NO_OPTION) {
						jFrame3.dispose();
						jFrame3.setVisible(true);
					}
				} catch (Exception k) {
					JOptionPane.showMessageDialog(this, "You must enter atleast one data", "Message", 2);
				}
			}

			stmt.close();
			con.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Error in connectivity");
		}
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		jTextField2.setText(null);
		jTextField1.setText(null);
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		DefaultTableModel model = (DefaultTableModel) ups.getModel();
		try {

			try {
				int ml = model.getRowCount();
				for (int mh = 0; mh <= ml; ++mh) {
					model.removeRow(0);
				}
			} catch (Exception e) {
			}
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con = (Connection) DriverManager
					.getConnection("jdbc:mariadb://localhost:3306/db?user=root&password=root");
			Statement stmt = con.createStatement();
			String query = "SELECT * FROM item1 ;";
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				model.addRow(new Object[] { rs.getString("item_code"), rs.getString("item_name"), rs.getString("Rate"),
						rs.getString("Stock_in_hand") });
			}

			rs.close();
			stmt.close();
			con.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Error in connectivity");
		}
	}

	private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame4.dispose();
		jFrame4.setVisible(true);
	}

	private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame5.dispose();
		jFrame5.setVisible(true);
	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			DefaultTableModel model = (DefaultTableModel) ups1.getModel();

			try {
				int ll = model.getRowCount();
				for (int lu = 0; lu <= ll; ++lu) {
					model.removeRow(0);
				}
			} catch (Exception e) {
			}

			String mh = jTextField11.getText();
			String mm = jTextField12.getText();
			try {

				Class.forName("org.mariadb.jdbc.Driver");
				Connection con = (Connection) DriverManager
						.getConnection("jdbc:mariadb://localhost:3306/db?user=root&password=root");
				Statement stmt = con.createStatement();
				String query = "SELECT * FROM item1 where Rate between '" + mm + "'and'" + mh + "';";
				ResultSet rs = stmt.executeQuery(query);

				while (rs.next()) {
					model.addRow(new Object[] { rs.getString("item_code"), rs.getString("item_name"),
							rs.getString("Rate"), rs.getString("Stock_in_hand") });
				}

				rs.close();
				stmt.close();
				con.close();

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "You must Enter both upper and lower limit !", "Message", 2);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Invalid Entry", "message", 2);
		}
	}

	private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame6.dispose();
		jFrame6.setVisible(true);
	}

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			DefaultTableModel model = (DefaultTableModel) ups2.getModel();
			String me = jTextField13.getText();
			try {
				int ml = model.getRowCount();
				for (int mh = 0; mh <= ml; ++mh) {
					model.removeRow(0);
				}
			} catch (Exception e) {
			}
			try {

				Class.forName("org.mariadb.jdbc.Driver");
				Connection con = (Connection) DriverManager
						.getConnection("jdbc:mariadb://localhost:3306/db?user=root&password=root");
				Statement stmt = con.createStatement();
				String query = "SELECT * FROM item1 where item_name = '" + me + "';";
				ResultSet rs = stmt.executeQuery(query);

				while (rs.next()) {
					model.addRow(new Object[] { rs.getString("item_code"), rs.getString("item_name"),
							rs.getString("Rate"), rs.getString("Stock_in_hand") });
				}

				rs.close();
				stmt.close();
				con.close();

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "You must Enter the name of item !", "Message", 2);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Invalid Entry", "message", 2);
		}
	}

	private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame7.dispose();
		jFrame7.setVisible(true);
	}

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			DefaultTableModel model = (DefaultTableModel) ups3.getModel();
			String me = jTextField14.getText();
			try {

				Class.forName("org.mariadb.jdbc.Driver");
				Connection con = (Connection) DriverManager
						.getConnection("jdbc:mariadb://localhost:3306/db?user=root&password=root");
				Statement stmt = con.createStatement();
				String query = "SELECT * FROM item1 where item_code = '" + me + "';";
				ResultSet rs = stmt.executeQuery(query);

				while (rs.next()) {
					model.addRow(new Object[] { rs.getString("item_code"), rs.getString("item_name"),
							rs.getString("Rate"), rs.getString("Stock_in_hand") });
				}

				rs.close();
				stmt.close();
				con.close();

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "You must Enter the code of item !", "Message", 2);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Invalid Entry", "message", 2);
		}
	}

	private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame8.dispose();
		jFrame8.setVisible(true);
	}

	private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			String mk = jTextField15.getText();
			String ml = jTextField16.getText();
			String mj = jTextField17.getText();
			String md = jTextField18.getText();
			String mt = jTextField19.getText();
			String mm = jTextField20.getText();
			String mn = jTextField21.getText();
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				Connection con = (Connection) DriverManager
						.getConnection("jdbc:mariadb://localhost:3306/db?user=root&password=root");
				Statement stmt = con.createStatement();
				String query = "Insert into item2 values('" + mk + "','" + ml + "','" + mj + "','" + md + "','" + mt
						+ "','" + mm + "','" + mn + "');";
				stmt.executeUpdate(query);
				JOptionPane.showMessageDialog(this, "Record has been inserted");
				stmt.close();
				con.close();

			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, "Invalid Entry or data is too long in any field");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Invalid Entry or field must be completely filled", "message", 2);
		}
	}

	private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
		jTextField21.setText(null);
		jTextField15.setText(null);
		jTextField16.setText(null);
		jTextField17.setText(null);
		jTextField18.setText(null);
		jTextField19.setText(null);
		jTextField20.setText(null);

	}

	private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame9.dispose();
		jFrame9.setVisible(true);
	}

	private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			String mk = jTextField22.getText();
			String ml = jTextField28.getText();
			String mj = jTextField25.getText();
			String md = jTextField24.getText();
			String mt = jTextField23.getText();
			String mm = jTextField26.getText();
			String mn = jTextField27.getText();
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				Connection con = (Connection) DriverManager
						.getConnection("jdbc:mariadb://localhost:3306/db?user=root&password=root");
				Statement stmt = con.createStatement();
				int bp = JOptionPane.showConfirmDialog(this, "Do you want to update the record ?");
				if (bp == JOptionPane.YES_OPTION) {
					String query = "update item2 set customer_name = '" + ml + "', address = '" + mj + "', city = '"
							+ md + "', state = '" + mt + "', pin_no = '" + mm + "', phone_no = '" + mn
							+ "'where customer_code = '" + mk + "';";
					stmt.execute(query);
					JOptionPane.showMessageDialog(this, "Record has been updated");

				}
				if (bp == JOptionPane.CANCEL_OPTION) {
					jFrame2.dispose();
					jFrame2.setVisible(true);
				}
				if (bp == JOptionPane.NO_OPTION) {
					jFrame2.dispose();
					jFrame2.setVisible(true);
				}

				stmt.close();
				con.close();

			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, "Error in connectivity");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Invalid Entry or field must be completely filled", "message", 2);
		}

	}

	private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
		jTextField27.setText(null);
		jTextField22.setText(null);
		jTextField23.setText(null);
		jTextField24.setText(null);
		jTextField25.setText(null);
		jTextField26.setText(null);
		jTextField28.setText(null);
	}

	private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame10.dispose();
		jFrame10.setVisible(true);
	}

	private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame10.setVisible(false);
	}

	private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {
		jTextField29.setText(null);
	}

	private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con = (Connection) DriverManager
					.getConnection("jdbc:mariadb://localhost:3306/db?user=root&password=root");
			Statement stmt = con.createStatement();

			int bp = JOptionPane.showConfirmDialog(this, "Do you want to delete the record ?");
			if (bp == JOptionPane.YES_OPTION) {
				String ml = jTextField29.getText();
				String query = "Delete from item2 where customer_code = '" + ml + "';";
				stmt.executeUpdate(query);
				JOptionPane.showMessageDialog(this, "Record has been deleted");
			}
			if (bp == JOptionPane.CANCEL_OPTION) {
				jFrame3.dispose();
				jFrame3.setVisible(true);
			}
			if (bp == JOptionPane.NO_OPTION) {
				jFrame3.dispose();
				jFrame3.setVisible(true);
			}

			stmt.close();
			con.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Error in connectivity");
		}
	}

	private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame11.dispose();
		jFrame11.setVisible(true);
	}

	private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {
		DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
		try {
			try {
				int ml = model.getRowCount();
				for (int mh = 0; mh <= ml; ++mh) {
					model.removeRow(0);
				}
			} catch (Exception e) {
			}
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con = (Connection) DriverManager
					.getConnection("jdbc:mariadb://localhost:3306/db?user=root&password=root");
			Statement stmt = con.createStatement();
			String query = "SELECT * FROM item2 ;";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				model.addRow(new Object[] { rs.getString("customer_code"), rs.getString("customer_name"),
						rs.getString("address"), rs.getString("city"), rs.getString("state"), rs.getString("pin_no"),
						rs.getString("phone_no") });
			}

			rs.close();
			stmt.close();
			con.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Error in connectivity");
		}
	}

	private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame11.setVisible(false);
	}

	private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame12.dispose();
		jFrame12.setVisible(true);
	}

	private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
			try {
				int ml = model.getRowCount();
				for (int mh = 0; mh <= ml; ++mh) {
					model.removeRow(0);
				}
			} catch (Exception e) {
			}
			try {

				Class.forName("org.mariadb.jdbc.Driver");
				Connection con = (Connection) DriverManager
						.getConnection("jdbc:mariadb://localhost:3306/db?user=root&password=root");
				Statement stmt = con.createStatement();
				String query = "SELECT * FROM item2 where city = '" + jTextField30.getText() + "';";
				ResultSet rs = stmt.executeQuery(query);

				while (rs.next()) {
					model.addRow(new Object[] { rs.getString("customer_code"), rs.getString("customer_name"),
							rs.getString("address"), rs.getString("city"), rs.getString("state"),
							rs.getString("pin_no"), rs.getString("phone_no") });
				}

				rs.close();
				stmt.close();
				con.close();

			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, "Error in connectivity");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Invalid Entry ", "message", 2);
		}
	}

	private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame12.setVisible(false);
	}

	private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
	}

	private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame14.dispose();
		jFrame14.setVisible(true);
	}

	private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame13.dispose();
		jFrame13.setVisible(true);
	}

	private void jTextField34ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {
		try {

			jTextArea1.append("                      YOUR BILL                   " + '\n');
			jTextArea1.append('\n' + "                              " + '\n');
			jTextArea1.append('\n' + "                                    " + '\n');

			jTextArea1.append('\n' + "           Bill No.   :       " + jTextField31.getText() + '\n');
			jTextArea1.append('\n' + "           Item Name  :       " + jTextField32.getText() + '\n');
			jTextArea1.append('\n' + "           Item Code  :       " + jTextField34.getText() + '\n');
			jTextArea1.append('\n' + "           Buyer Name :       " + jTextField38.getText() + '\n');
			jTextArea1.append('\n' + "           Quantity   :       " + jTextField35.getText() + '\n');
			jTextArea1.append('\n' + "           Amount     :       " + jTextField33.getText() + '\n');
			jTextArea1.append('\n' + "           Discount   :       " + jTextField36.getText() + '\n');
			jTextArea1.append('\n' + "           Net Amount :         " + jTextField37.getText() + '\n');
			jTextArea1.append('\n' + "           THANKYOU FOR PURCHASING        " + '\n');
			jTextArea1.append('\n' + "                                          " + '\n');
			jTextArea1.append('\n' + "                                          " + '\n');
			jTextArea1.append('\n' + "                                          " + '\n');
			jTextArea1.append('\n' + "                                          " + '\n');
			jTextArea1.append('\n' + "                                          " + '\n');

			jTextArea1.append('\n' + "                                     Birla Group And Sons" + '\n');
			jTextArea1.append('\n' + "                                    ISO 9001:2001 Certified   " + '\n');
			jTextArea1.print();

		} catch (Exception ex) {

			JOptionPane.showMessageDialog(this, "Please First Create Bill");
		}
	}

	private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame13.setVisible(false);
	}

	private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			int mg = Integer.parseInt(jTextField32.getText());
			int mh = Integer.parseInt(jTextField35.getText());
			Double ml = 0.05;
			int mj = 0;
			try {

				Class.forName("org.mariadb.jdbc.Driver");
				Connection con = (Connection) DriverManager
						.getConnection("jdbc:mariadb://localhost:3306/db?user=root&password=root");
				Statement stmt = con.createStatement();
				String query = "SELECT * FROM item1 where item_code = '" + mg + "';";
				ResultSet rs = stmt.executeQuery(query);
				while (rs.next()) {
					mj = rs.getInt("Rate");
				}
				int mm = mh * mj;
				if (jRadioButton1.isSelected() == true) {
					ml = 0.05;
				} else if (jRadioButton2.isSelected() == true) {
					ml = 0.10;
				} else {
					jRadioButton1.setSelected(true);
				}
				Double mw = ml * mm * 1.00;
				Double mo = mm - mw;
				jTextField33.setText("" + mm);
				jTextField36.setText("" + mw);
				jTextField37.setText("" + mo);
				rs.close();
				stmt.close();
				con.close();

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Invalid Entry", "message", 2);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Invalid Entry", "message", 2);
		}
	}

	private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			int mg = Integer.parseInt(jTextField32.getText());
			int mh = Integer.parseInt(jTextField35.getText());
			Double ml = 0.05;
			String mq = jTextField32.getText();
			String jh = (String) jComboBox1.getSelectedItem();
			String jj = (String) jComboBox2.getSelectedItem();
			String ju = (String) jComboBox3.getSelectedItem();
			String mp = "";
			if (jRadioButton1.isSelected() == true) {
				mp = "Customer";

			} else if (jRadioButton2.isSelected() == true) {
				mp = "Supplier";

			} else {
				jRadioButton1.setSelected(true);
				mp = "Customer";
			}
			int mv = 0;
			try {
				int mj = 0;
				Class.forName("org.mariadb.jdbc.Driver");
				Connection con = (Connection) DriverManager
						.getConnection("jdbc:mariadb://localhost:3306/db?user=root&password=root");
				Statement stmt = con.createStatement();
				String query = "SELECT * FROM item1 where item_code = '" + mq + "';";
				ResultSet rs = stmt.executeQuery(query);
				while (rs.next()) {
					mj = rs.getInt("Rate");
					mv = rs.getInt("Stock_in_hand");
				}
				mv = mv - mh;
				int mm = mh * mj;
				if (jRadioButton1.isSelected() == true) {

					ml = 0.05;
				} else if (jRadioButton2.isSelected() == true) {

					ml = 0.10;
				} else {
					jRadioButton1.setSelected(true);
				}
				Double mw = ml * mm * 1.00;
				Double mo = mm - mw;
				jTextField33.setText("" + mm);
				jTextField36.setText("" + mw);
				jTextField37.setText("" + mo);
				rs.close();
				stmt.close();
				con.close();

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Invalid Entry", "message", 2);
			}
			int mk = 0;
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				Connection con = (Connection) DriverManager
						.getConnection("jdbc:mariadb://localhost:3306/db?user=root&password=root");
				Statement stmt = con.createStatement();
				String quer = "SELECT * FROM item1 where item_code = '" + mq + "';";
				ResultSet rs = stmt.executeQuery(quer);
				while (rs.next()) {
					mk = rs.getInt("Stock_in_hand");
				}
				mk = mk - mh;
				String my = "" + mk;
				String query = "update item1 set Stock_in_hand = '" + my + "'where item_code = '" + mq + "';";
				Statement stm = con.createStatement();
				int rv = stm.executeUpdate(query);
				rs.close();

				stmt.close();
				stm.close();
				con.close();
			} catch (Exception b) {
				JOptionPane.showMessageDialog(this, "Enter Data Correctly");
			}
			try {

				Class.forName("org.mariadb.jdbc.Driver");
				Connection con = (Connection) DriverManager
						.getConnection("jdbc:mariadb://localhost:3306/db?user=root&password=root");
				Statement stmt = con.createStatement();
				String query = "Insert into item3 values('" + jTextField31.getText() + "','" + mp + "','"
						+ jTextField38.getText() + "','" + ju + "-" + jj + "-" + jh + "','" + jTextField32.getText()
						+ "','" + jTextField34.getText() + "','" + jTextField35.getText() + "','"
						+ jTextField33.getText() + "','" + jTextField36.getText() + "','" + jTextField37.getText()
						+ "');";
				int quer = stmt.executeUpdate(query);
				JOptionPane.showMessageDialog(this, "Thankyou for purchasing");
				stmt.close();
				con.close();
			} catch (Exception b) {
				JOptionPane.showMessageDialog(this, "Enter Data Correctly");
			}
		} catch (Exception mj) {
			JOptionPane.showMessageDialog(this, "Please Enter Data Correctly");
		}
	}

	private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jTextField32ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jTextField31ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jTextField38ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {
		DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
		try {

			try {
				int ll = model.getRowCount();
				for (int lu = 0; lu <= ll; ++lu) {
					model.removeRow(0);
				}
			} catch (Exception e) {
			}
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con = (Connection) DriverManager
					.getConnection("jdbc:mariadb://localhost:3306/db?user=root&password=root");
			Statement stmt = con.createStatement();
			String query = "SELECT * FROM item3;";
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				model.addRow(new Object[] { rs.getString("Billno"), rs.getString("customer_type"), rs.getString("name"),
						rs.getString("date"), rs.getString("item_name"), rs.getString("quantity"),
						rs.getString("amount"), rs.getString("discount"), rs.getString("netamount") });
			}

			rs.close();
			stmt.close();
			con.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Error in connectivity");
		}
	}

	private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame14.setVisible(false);
	}

	private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame15.dispose();
		jFrame15.setVisible(true);
	}

	private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
			int mg = Integer.parseInt(jTextField39.getText());

			try {
				int ll = model.getRowCount();
				for (int lu = 0; lu <= ll; ++lu) {
					model.removeRow(0);
				}
			} catch (Exception e) {
			}
			try {

				Class.forName("org.mariadb.jdbc.Driver");
				Connection con = (Connection) DriverManager
						.getConnection("jdbc:mariadb://localhost:3306/db?user=root&password=root");
				Statement stmt = con.createStatement();
				String query = "SELECT * FROM item3 where Billno = '" + mg + "';";
				ResultSet rs = stmt.executeQuery(query);

				while (rs.next()) {
					model.addRow(
							new Object[] { rs.getString("Billno"), rs.getString("customer_type"), rs.getString("name"),
									rs.getString("date"), rs.getString("item_name"), rs.getString("quantity"),
									rs.getString("amount"), rs.getString("discount"), rs.getString("netamount") });
				}

				rs.close();
				stmt.close();
				con.close();

			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, "Error in connectivity");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Invalid Entry or field must be completely filled", "message", 2);
		}
	}

	private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame15.setVisible(false);
	}

	private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame16.dispose();
		jFrame16.setVisible(true);
	}

	private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			DefaultTableModel model = (DefaultTableModel) jTable5.getModel();
			int mg = Integer.parseInt(jTextField40.getText());

			try {
				int ll = model.getRowCount();
				for (int lu = 0; lu <= ll; ++lu) {
					model.removeRow(0);
				}
			} catch (Exception e) {
			}
			try {

				Class.forName("org.mariadb.jdbc.Driver");
				Connection con = (Connection) DriverManager
						.getConnection("jdbc:mariadb://localhost:3306/db?user=root&password=root");
				Statement stmt = con.createStatement();
				String query = "SELECT * FROM item3 where item_code = '" + mg + "';";
				ResultSet rs = stmt.executeQuery(query);

				while (rs.next()) {
					model.addRow(
							new Object[] { rs.getString("Billno"), rs.getString("customer_type"), rs.getString("name"),
									rs.getString("date"), rs.getString("item_name"), rs.getString("quantity"),
									rs.getString("amount"), rs.getString("discount"), rs.getString("netamount") });
				}

				rs.close();
				stmt.close();
				con.close();

			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, "Error in connectivity");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Invalid Entry or field must be completely filled", "message", 2);
		}
	}

	private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame16.setVisible(false);

	}

	private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame17.dispose();
		jFrame17.setVisible(true);
	}

	private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			String mk = jTextField47.getText();
			String ml = jTextField48.getText();
			String mj = jTextField43.getText();
			String md = jTextField42.getText();
			String mt = jTextField41.getText();
			String mm = jTextField44.getText();
			String mn = jTextField45.getText();
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				Connection con = (Connection) DriverManager
						.getConnection("jdbc:mariadb://localhost:3306/db?user=root&password=root");
				Statement stmt = con.createStatement();
				String query = "Insert into item4 values('" + mk + "','" + ml + "','" + mj + "','" + md + "','" + mt
						+ "','" + mm + "','" + mn + "');";
				stmt.executeUpdate(query);
				JOptionPane.showMessageDialog(this, "Record has been inserted");
				stmt.close();
				con.close();

			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, "Error in connectivity");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Invalid entry or field is not filled properly");
		}
	}

	private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {
		jTextField41.setText(null);
		jTextField42.setText(null);
		jTextField43.setText(null);
		jTextField44.setText(null);
		jTextField45.setText(null);

		jTextField47.setText(null);
		jTextField48.setText(null);
	}

	private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame18.dispose();
		jFrame18.setVisible(true);
	}

	private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame18.setVisible(false);
	}

	private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {
		jTextField46.setText(null);
	}

	private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con = (Connection) DriverManager
					.getConnection("jdbc:mariadb://localhost:3306/db?user=root&password=root");
			Statement stmt = con.createStatement();

			int bp = JOptionPane.showConfirmDialog(this, "Do you want to delete the record ?");
			if (bp == JOptionPane.YES_OPTION) {
				String ml = jTextField46.getText();
				String query = "Delete from item4 where Supplier_code = '" + ml + "';";
				stmt.executeUpdate(query);
				JOptionPane.showMessageDialog(this, "Record has been deleted");
			}
			if (bp == JOptionPane.CANCEL_OPTION) {
				jFrame18.dispose();
				jFrame18.setVisible(true);
			}
			if (bp == JOptionPane.NO_OPTION) {
				jFrame18.dispose();
				jFrame18.setVisible(true);
			}

			stmt.close();
			con.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Error in connectivity");
		}
	}

	private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame19.dispose();
		jFrame19.setVisible(true);
	}

	private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame19.setVisible(false);
	}

	private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {
		DefaultTableModel model = (DefaultTableModel) jTable6.getModel();
		try {

			try {
				int ll = model.getRowCount();
				for (int lu = 0; lu <= ll; ++lu) {
					model.removeRow(0);
				}
			} catch (Exception e) {
			}
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con = (Connection) DriverManager
					.getConnection("jdbc:mariadb://localhost:3306/db?user=root&password=root");
			Statement stmt = con.createStatement();
			String query = "SELECT * FROM item4 ;";
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				model.addRow(new Object[] { rs.getString("Supplier_code"), rs.getString("Supplier_name"),
						rs.getString("address"), rs.getString("city"), rs.getString("state"), rs.getString("pin_no"),
						rs.getString("phone_no") });
			}

			rs.close();
			stmt.close();
			con.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Error in connectivity");
		}
	}

	private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame20.dispose();
		jFrame20.setVisible(true);
	}

	private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame20.setVisible(false);
	}

	private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {
		DefaultTableModel model = (DefaultTableModel) jTable7.getModel();
		try {

			try {
				int ll = model.getRowCount();
				for (int lu = 0; lu <= ll; ++lu) {
					model.removeRow(0);
				}
			} catch (Exception e) {
			}

			try {

				Class.forName("org.mariadb.jdbc.Driver");
				Connection con = (Connection) DriverManager
						.getConnection("jdbc:mariadb://localhost:3306/db?user=root&password=root");
				Statement stmt = con.createStatement();
				String query = "SELECT * FROM item4 where city = '" + jTextField49.getText() + "';";
				ResultSet rs = stmt.executeQuery(query);

				while (rs.next()) {
					model.addRow(new Object[] { rs.getString("Supplier_code"), rs.getString("Supplier_name"),
							rs.getString("address"), rs.getString("city"), rs.getString("state"),
							rs.getString("pin_no"), rs.getString("phone_no") });
				}

				rs.close();
				stmt.close();
				con.close();

			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, "Error in connectivity");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Invalid Entry or field must be completely filled", "message", 2);
		}
	}

	private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame21.dispose();
		jFrame21.setVisible(true);
	}

	private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame21.setVisible(false);
	}

	private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			DefaultTableModel model = (DefaultTableModel) jTable8.getModel();
			try {
				int ll = model.getRowCount();
				for (int lu = 0; lu <= ll; ++lu) {
					model.removeRow(0);
				}
			} catch (Exception e) {
			}
			try {

				Class.forName("org.mariadb.jdbc.Driver");
//				Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/practise", "root",
//						"netbean");
				Connection con = (Connection) DriverManager
						.getConnection("jdbc:mariadb://localhost:3306/db?user=root&password=root");
				Statement stmt = con.createStatement();
				String query = "SELECT * FROM item4 where state = '" + jTextField50.getText() + "';";
				ResultSet rs = stmt.executeQuery(query);

				while (rs.next()) {
					model.addRow(new Object[] { rs.getString("Supplier_code"), rs.getString("Supplier_name"),
							rs.getString("address"), rs.getString("city"), rs.getString("state"),
							rs.getString("pin_no"), rs.getString("phone_no") });
				}

				rs.close();
				stmt.close();
				con.close();

			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, "Error in connectivity");
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Invalid Entry or field must be completely filled", "message", 2);
		}
	}

	private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame22.dispose();
		jFrame22.setVisible(true);
	}

	private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			DefaultTableModel model = (DefaultTableModel) jTable9.getModel();

			try {
				int ll = model.getRowCount();
				for (int lu = 0; lu <= ll; ++lu) {
					model.removeRow(0);
				}
			} catch (Exception e) {
			}
			try {

				Class.forName("org.mariadb.jdbc.Driver");
				Connection con = (Connection) DriverManager
						.getConnection("jdbc:mariadb://localhost:3306/db?user=root&password=root");
				Statement stmt = con.createStatement();
				String query = "SELECT * FROM item2 where state = '" + jTextField51.getText() + "';";
				ResultSet rs = stmt.executeQuery(query);

				while (rs.next()) {
					model.addRow(new Object[] { rs.getString("customer_code"), rs.getString("customer_name"),
							rs.getString("address"), rs.getString("city"), rs.getString("state"),
							rs.getString("pin_no"), rs.getString("phone_no") });
				}

				rs.close();
				stmt.close();
				con.close();

			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, "Error in connectivity");
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Invalid Entry or field must be completely filled", "message", 2);
		}

	}

	private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame22.setVisible(false);
	}

	private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame1.setVisible(false);
	}

	private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame2.setVisible(false);
	}

	private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame3.setVisible(false);
	}

	private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame4.setVisible(false);
	}

	private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame5.setVisible(false);
	}

	private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame6.setVisible(false);
	}

	private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame8.setVisible(false);
	}

	private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame7.setVisible(false);
	}

	private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame9.setVisible(false);
	}

	private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {
		jFrame17.setVisible(false);
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new InventoryManagement().setVisible(true);
			}
		});
	}

	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton11;
	private javax.swing.JButton jButton12;
	private javax.swing.JButton jButton13;
	private javax.swing.JButton jButton14;
	private javax.swing.JButton jButton15;
	private javax.swing.JButton jButton16;
	private javax.swing.JButton jButton17;
	private javax.swing.JButton jButton18;
	private javax.swing.JButton jButton19;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton20;
	private javax.swing.JButton jButton21;
	private javax.swing.JButton jButton22;
	private javax.swing.JButton jButton23;
	private javax.swing.JButton jButton24;
	private javax.swing.JButton jButton25;
	private javax.swing.JButton jButton26;
	private javax.swing.JButton jButton27;
	private javax.swing.JButton jButton28;
	private javax.swing.JButton jButton29;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton30;
	private javax.swing.JButton jButton31;
	private javax.swing.JButton jButton32;
	private javax.swing.JButton jButton33;
	private javax.swing.JButton jButton34;
	private javax.swing.JButton jButton35;
	private javax.swing.JButton jButton36;
	private javax.swing.JButton jButton37;
	private javax.swing.JButton jButton38;
	private javax.swing.JButton jButton39;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton40;
	private javax.swing.JButton jButton41;
	private javax.swing.JButton jButton42;
	private javax.swing.JButton jButton43;
	private javax.swing.JButton jButton44;
	private javax.swing.JButton jButton45;
	private javax.swing.JButton jButton46;
	private javax.swing.JButton jButton47;
	private javax.swing.JButton jButton48;
	private javax.swing.JButton jButton49;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton50;
	private javax.swing.JButton jButton51;
	private javax.swing.JButton jButton52;
	private javax.swing.JButton jButton53;
	private javax.swing.JButton jButton54;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JComboBox jComboBox2;
	private javax.swing.JComboBox jComboBox3;
	private javax.swing.JFrame jFrame1;
	private javax.swing.JFrame jFrame10;
	private javax.swing.JFrame jFrame11;
	private javax.swing.JFrame jFrame12;
	private javax.swing.JFrame jFrame13;
	private javax.swing.JFrame jFrame14;
	private javax.swing.JFrame jFrame15;
	private javax.swing.JFrame jFrame16;
	private javax.swing.JFrame jFrame17;
	private javax.swing.JFrame jFrame18;
	private javax.swing.JFrame jFrame19;
	private javax.swing.JFrame jFrame2;
	private javax.swing.JFrame jFrame20;
	private javax.swing.JFrame jFrame21;
	private javax.swing.JFrame jFrame22;
	private javax.swing.JFrame jFrame3;
	private javax.swing.JFrame jFrame4;
	private javax.swing.JFrame jFrame5;
	private javax.swing.JFrame jFrame6;
	private javax.swing.JFrame jFrame7;
	private javax.swing.JFrame jFrame8;
	private javax.swing.JFrame jFrame9;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel23;
	private javax.swing.JLabel jLabel24;
	private javax.swing.JLabel jLabel25;
	private javax.swing.JLabel jLabel26;
	private javax.swing.JLabel jLabel27;
	private javax.swing.JLabel jLabel28;
	private javax.swing.JLabel jLabel29;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel30;
	private javax.swing.JLabel jLabel31;
	private javax.swing.JLabel jLabel32;
	private javax.swing.JLabel jLabel33;
	private javax.swing.JLabel jLabel34;
	private javax.swing.JLabel jLabel35;
	private javax.swing.JLabel jLabel36;
	private javax.swing.JLabel jLabel37;
	private javax.swing.JLabel jLabel38;
	private javax.swing.JLabel jLabel39;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel40;
	private javax.swing.JLabel jLabel41;
	private javax.swing.JLabel jLabel42;
	private javax.swing.JLabel jLabel43;
	private javax.swing.JLabel jLabel44;
	private javax.swing.JLabel jLabel45;
	private javax.swing.JLabel jLabel46;
	private javax.swing.JLabel jLabel47;
	private javax.swing.JLabel jLabel48;
	private javax.swing.JLabel jLabel49;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel50;
	private javax.swing.JLabel jLabel51;
	private javax.swing.JLabel jLabel52;
	private javax.swing.JLabel jLabel53;
	private javax.swing.JLabel jLabel54;
	private javax.swing.JLabel jLabel55;
	private javax.swing.JLabel jLabel56;
	private javax.swing.JLabel jLabel57;
	private javax.swing.JLabel jLabel58;
	private javax.swing.JLabel jLabel59;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel60;
	private javax.swing.JLabel jLabel61;
	private javax.swing.JLabel jLabel62;
	private javax.swing.JLabel jLabel63;
	private javax.swing.JLabel jLabel64;
	private javax.swing.JLabel jLabel65;
	private javax.swing.JLabel jLabel66;
	private javax.swing.JLabel jLabel67;
	private javax.swing.JLabel jLabel68;
	private javax.swing.JLabel jLabel69;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel70;
	private javax.swing.JLabel jLabel71;
	private javax.swing.JLabel jLabel72;
	private javax.swing.JLabel jLabel73;
	private javax.swing.JLabel jLabel74;
	private javax.swing.JLabel jLabel75;
	private javax.swing.JLabel jLabel76;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu10;
	private javax.swing.JMenu jMenu11;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenu jMenu5;
	private javax.swing.JMenu jMenu6;
	private javax.swing.JMenu jMenu7;
	private javax.swing.JMenu jMenu8;
	private javax.swing.JMenu jMenu9;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem10;
	private javax.swing.JMenuItem jMenuItem11;
	private javax.swing.JMenuItem jMenuItem12;
	private javax.swing.JMenuItem jMenuItem13;
	private javax.swing.JMenuItem jMenuItem14;
	private javax.swing.JMenuItem jMenuItem15;
	private javax.swing.JMenuItem jMenuItem16;
	private javax.swing.JMenuItem jMenuItem17;
	private javax.swing.JMenuItem jMenuItem18;
	private javax.swing.JMenuItem jMenuItem19;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem20;
	private javax.swing.JMenuItem jMenuItem21;
	private javax.swing.JMenuItem jMenuItem22;
	private javax.swing.JMenuItem jMenuItem23;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JMenuItem jMenuItem4;
	private javax.swing.JMenuItem jMenuItem5;
	private javax.swing.JMenuItem jMenuItem6;
	private javax.swing.JMenuItem jMenuItem7;
	private javax.swing.JMenuItem jMenuItem8;
	private javax.swing.JMenuItem jMenuItem9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JRadioButton jRadioButton1;
	private javax.swing.JRadioButton jRadioButton2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane10;
	private javax.swing.JScrollPane jScrollPane11;
	private javax.swing.JScrollPane jScrollPane12;
	private javax.swing.JScrollPane jScrollPane13;
	private javax.swing.JScrollPane jScrollPane14;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JScrollPane jScrollPane5;
	private javax.swing.JScrollPane jScrollPane6;
	private javax.swing.JScrollPane jScrollPane7;
	private javax.swing.JScrollPane jScrollPane8;
	private javax.swing.JScrollPane jScrollPane9;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable2;
	private javax.swing.JTable jTable3;
	private javax.swing.JTable jTable4;
	private javax.swing.JTable jTable5;
	private javax.swing.JTable jTable6;
	private javax.swing.JTable jTable7;
	private javax.swing.JTable jTable8;
	private javax.swing.JTable jTable9;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField10;
	private javax.swing.JTextField jTextField11;
	private javax.swing.JTextField jTextField12;
	private javax.swing.JTextField jTextField13;
	private javax.swing.JTextField jTextField14;
	private javax.swing.JTextField jTextField15;
	private javax.swing.JTextField jTextField16;
	private javax.swing.JTextField jTextField17;
	private javax.swing.JTextField jTextField18;
	private javax.swing.JTextField jTextField19;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField20;
	private javax.swing.JTextField jTextField21;
	private javax.swing.JTextField jTextField22;
	private javax.swing.JTextField jTextField23;
	private javax.swing.JTextField jTextField24;
	private javax.swing.JTextField jTextField25;
	private javax.swing.JTextField jTextField26;
	private javax.swing.JTextField jTextField27;
	private javax.swing.JTextField jTextField28;
	private javax.swing.JTextField jTextField29;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField30;
	private javax.swing.JTextField jTextField31;
	private javax.swing.JTextField jTextField32;
	private javax.swing.JTextField jTextField33;
	private javax.swing.JTextField jTextField34;
	private javax.swing.JTextField jTextField35;
	private javax.swing.JTextField jTextField36;
	private javax.swing.JTextField jTextField37;
	private javax.swing.JTextField jTextField38;
	private javax.swing.JTextField jTextField39;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField40;
	private javax.swing.JTextField jTextField41;
	private javax.swing.JTextField jTextField42;
	private javax.swing.JTextField jTextField43;
	private javax.swing.JTextField jTextField44;
	private javax.swing.JTextField jTextField45;
	private javax.swing.JTextField jTextField46;
	private javax.swing.JTextField jTextField47;
	private javax.swing.JTextField jTextField48;
	private javax.swing.JTextField jTextField49;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField50;
	private javax.swing.JTextField jTextField51;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	private javax.swing.JTextField jTextField8;
	private javax.swing.JTextField jTextField9;
	private javax.swing.JTable ups;
	private javax.swing.JTable ups1;
	private javax.swing.JTable ups2;
	private javax.swing.JTable ups3;

}
