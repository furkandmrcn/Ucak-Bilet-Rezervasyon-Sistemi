package projeYapimi;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AnaMenu2  {

	
	
	public void ekle() {
		
		
		JFrame frame = new JFrame("ANA EKRAN");

		JLabel bilgi1, bilgi2, bilgi3, bilgi4;

		JTextField veri1, veri2, veri3, veri4;

		JButton btn;
		
		JPanel sayfa1;

		bilgi1 = new JLabel("Nereden");
		bilgi1.setFont(new Font("Yu Gothic UI Semibold", Font.ITALIC, 25));
		bilgi1.setForeground(Color.gray);
		bilgi1.setBounds(20, 10, 225, 30);
		

		veri1 = new JTextField();
		veri1.setBackground(new Color(238,232,170));
		veri1.getBackground();
		veri1.setBounds(20, 50, 225, 30);

		bilgi2 = new JLabel("Nereye");
		bilgi2.setFont(new Font("Yu Gothic UI Semibold", Font.ITALIC, 25));
		bilgi2.setForeground(Color.gray);
		bilgi2.setBounds(300, 10, 225, 30);

		veri2 = new JTextField();
		veri2.setBackground(new Color(238,232,170));
		veri2.setBounds(300, 50, 225, 30);

		bilgi3 = new JLabel("Tarih Giriniz ");
		bilgi3.setFont(new Font("Yu Gothic UI Semibold", Font.ITALIC, 25));
		bilgi3.setForeground(Color.gray);
		bilgi3.setBounds(20, 100, 150, 40);

		veri3 = new JTextField();
		veri3.setBackground(new Color(238,232,170));
		veri3.setBounds(20, 140, 225, 30);

		bilgi4 = new JLabel("Yolcu Sayısı ");
		bilgi4.setFont(new Font("Yu Gothic UI Semibold", Font.ITALIC, 25));
		bilgi4.setForeground(Color.gray);
		bilgi4.setBounds(300, 100, 150, 40);

		veri4 = new JTextField();
		veri4.setBackground(new Color(238,232,170));
		veri4.setBounds(300, 140, 225, 30);

		btn = new JButton("UÇUŞ ARA");
		btn.setBounds(220, 210, 100, 30);

		JLabel resim1 = new JLabel(new ImageIcon(UcusRezervasyonSistemi.class.getResource("/zyro-image (ucakresmi).png") ));
		resim1.setBounds(20, 225, 250, 250);
		
		JLabel logo1 = new JLabel(new ImageIcon(UcusRezervasyonSistemi.class.getResource("/zyro-image (6).png") ));
		logo1.setBounds(380, 190, 120, 120);

		JLabel marka1 = new JLabel("YBS");
		marka1.setFont(new Font("Segoe Print", Font.BOLD|Font.ITALIC, 30));
		marka1.setForeground(new Color(30,200,255));
		marka1.setBounds(385, 270, 120, 120);
		
		JLabel marka2 = new JLabel("HAVA");
		marka2.setFont(new Font("Segoe Print", Font.BOLD|Font.ITALIC, 30));
		marka2.setForeground(new Color(30,200,255));
		marka2.setBounds(368, 295, 120, 120);
		
		JLabel marka3 = new JLabel("YOLLARI");
		marka3.setFont(new Font("Segoe Print", Font.BOLD|Font.ITALIC, 30));
		marka3.setForeground(new Color(30,200,255));
		marka3.setBounds(340, 320, 150, 120);
		

		JPanel panel1 = new JPanel();
		panel1.setLayout(null);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Text alanlarının içeriğini kontrol et
				if (veri1.getText().isEmpty() || veri2.getText().isEmpty() || veri3.getText().isEmpty()
						|| veri4.getText().isEmpty()) {
					JOptionPane.showMessageDialog(frame, "Lütfen tüm alanları doldurun.", "Uyarı",
							JOptionPane.WARNING_MESSAGE);
				} else {

					// Yeni bir JFrame açmak yerine, mevcut JFrame içeriğini temizle
					frame.getContentPane().removeAll();
					frame.repaint();

					JLabel secim2 = new JLabel("BİLET TÜRÜNÜ SEÇİNİZ : ");
					secim2.setBounds(20, 20, 150, 30);

					JButton eko, busi;
					
					JPanel sayfa2;
					
					BiletFiyati ffiyat = new BiletFiyati(1200);
					// EKONOMİ BİLETİ
					ffiyat.ekonomi();

					// BUSİNESS BİLETİ
					ffiyat.business();

					String ekoFiyat = String.valueOf(ffiyat.ekonomi());
					String busiFiyat = String.valueOf(ffiyat.business());

					JTextField fiyatEko = new JTextField(ekoFiyat);
					JTextField fiyatBusi = new JTextField(busiFiyat);

					eko = new JButton("EKONOMİ BİLETİ  ");
					eko.setBackground(Color.white);
					eko.setBounds(20, 60, 495, 30);

					JPanel panel2 = new JPanel();
					panel2.setLayout(null);

					busi = new JButton("BUSİNESS BİLETİ  ");
					busi.setBackground(Color.white);
					busi.setBounds(20, 110, 495, 30);
					
					
					
					
					
					
					JLabel harita = new JLabel(new ImageIcon(UcusRezervasyonSistemi.class.getResource("/zyro-image (14).png") ));
					harita.setBounds(-135, 160, 800, 315);
					

					JPanel panel3 = new JPanel();
					panel3.setLayout(null);

					eko.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {

							// Yeni bir JFrame açmak yerine, mevcut JFrame içeriğini temizle
							frame.getContentPane().removeAll();
							frame.repaint();

							Bilgiler bilgiler = new Bilgiler();
							String adSoyad = bilgiler.isim("");
							
							  boolean tc = bilgiler.tcKontrol(""); 
							  boolean telefon =bilgiler.telefonKontrol("");
							  Boolean yil = bilgiler.yilKontrol("");
							 

							JLabel Jad, Jtc, Jtel,Jyil,kisiselBilgi;

							JTextField deger1, deger2, deger3,deger4;
							
							JPanel sayfa5;
							
							kisiselBilgi = new JLabel("Bilgilerinizi Giriniz : ");
							kisiselBilgi.setFont(new Font("SYu Gothic UI Semibold", Font.BOLD|Font.ITALIC, 18));
							kisiselBilgi.setBounds(25, 10, 250, 30);

							Jad = new JLabel("ADINIZI ve SOYADINIZI GİRİNİZ");
							Jad.setFont(new Font("Yu Gothic UI Semibold", Font.ITALIC, 18));
							Jad.setBounds(25, 45, 300, 30);

							deger1 = new JTextField(adSoyad);
							deger1.setBackground(new Color(238,232,170));
							deger1.setBounds(25, 85, 272, 30);
							deger1.setText(adSoyad);

							Jtc = new JLabel("TC KİMLİK NUMARANIZI GİRİNİZ");
							Jtc.setFont(new Font("Yu Gothic UI Semibold", Font.ITALIC, 18));
							Jtc.setBounds(25, 125, 300, 30);

							deger2 = new JTextField();
							deger2.setBackground(new Color(238,232,170));
							deger2.setBounds(25, 165, 272, 30);

							Jtel = new JLabel("TELEFON NUMARANIZI GİRİNİZ");
							Jtel.setFont(new Font("Yu Gothic UI Semibold", Font.ITALIC, 18));
							Jtel.setBounds(25, 205, 300, 30);

							deger3 = new JTextField();
							deger3.setBackground(new Color(238,232,170));
							deger3.setBounds(25, 245, 272, 30);
							
							
							Jyil = new JLabel("DOĞUM YILINIZI GİRİNİZ : ");
							Jyil.setFont(new Font("Yu Gothic UI Semibold", Font.ITALIC, 18));
							Jyil.setBounds(25, 285, 300, 30);
							
							deger4 = new JTextField();
							deger4.setBackground(new Color(238,232,170));
							deger4.setBounds(25, 325, 272, 30);
							

							JLabel resim4 = new JLabel(new ImageIcon(UcusRezervasyonSistemi.class.getResource("/oturum.png") ));
							resim4.setBounds(320, -25, 250, 250);
							
							JPanel panel4 = new JPanel();
							panel4.setLayout(null);
							
							
							

							JButton devam1 = new JButton("Devam Et");
							devam1.setBackground(Color.orange);
							devam1.setBounds(25, 375, 125, 30);

							devam1.addActionListener(new ActionListener() {

								public void actionPerformed(ActionEvent e) {
									
									JLabel koltukSec = new JLabel("Lütfen Koltuğunuzu Seçiniz!!! ");
									koltukSec.setBounds(20,720 , 150, 30);
									

									if (deger1.getText().isEmpty() || deger2.getText().isEmpty()
											|| deger3.getText().isEmpty() || deger4.getText().isEmpty()) {
										JOptionPane.showMessageDialog(frame, "Lütfen tüm alanları doldurun.",
												"Uyarı", JOptionPane.WARNING_MESSAGE);
									} else {

										String tc = deger2.getText();
										String telefonNo = deger3.getText();
										String yilString= deger4.getText();

										Bilgiler bilgiler = new Bilgiler();

										if (bilgiler.tcKontrol(tc) && bilgiler.telefonKontrol(telefonNo) && bilgiler.yilKontrol(yilString)) {

											frame.getContentPane().removeAll();
											frame.repaint();

											int[] dizi = new int[110];
											for (int i = 0; i < 110; i++) {
												dizi[i] = i + 1;
											}

											for (int k = 0; k < dizi.length; k++) {
												
												

												JButton numara1, numara2;

												numara1 = new JButton(String.valueOf(dizi[k]));
												numara2 = new JButton(String.valueOf(dizi[k]));

												KoltukSecimi koltuk = new KoltukSecimi();

												if (koltuk.koltukDoluMu(dizi[k])) {

													numara2.setBackground(Color.RED);
													numara2.setToolTipText("Koltuk dolu! Koltuk alamazsınız.");
													frame.add(numara2);

												} else {

													numara1.setBackground(Color.GREEN);
													numara1.setToolTipText("Koltuk boş! Koltuk alabilirsiniz.");
													frame.add(numara1);

												}

												int koltukNo = (dizi[k]);

												String koltuk1 = String.valueOf(koltukNo);

												numara1.addActionListener(new ActionListener() {

													@Override
													public void actionPerformed(ActionEvent e) {

														if (numara1.getToolTipText() != null) {

															frame.getContentPane().removeAll();
															frame.repaint();

															JLabel a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;

															JTextField bosluk1, bosluk2, bosluk3, bosluk4,
																	bosluk5, bosluk6, bosluk7, bosluk8, bosluk9,
																	bosluk10;

															JPanel sayfa6;
															
															
 															

															a1 = new JLabel("ADINIZ ve SOYADINIZ      : ");
															a1.setBounds(40, 20, 200, 30);

															bosluk1 = new JTextField();
															bosluk1.setBackground(new Color(238,232,170));
															bosluk1.setBounds(220, 20, 200, 30);

															a2 = new JLabel("TCKN NUMARANIZ           : ");
															a2.setBounds(40, 70, 200, 30);

															bosluk2 = new JTextField();
															bosluk2.setBackground(new Color(238,232,170));
															bosluk2.setBounds(220, 70, 200, 30);

															a3 = new JLabel("TELEFON NUMARANIZ    : ");
															a3.setBounds(40, 120, 200, 30);

															bosluk3 = new JTextField();
															bosluk3.setBackground(new Color(238,232,170));
															bosluk3.setBounds(220, 120, 200, 30);
															
															a7 = new JLabel("DOĞUM YILINIZ  : ");
															a7.setBounds(40, 170, 200, 30);
															
															bosluk7 = new JTextField();
															bosluk7.setBackground(new Color(238,232,170));
															bosluk7.setBounds(220, 170, 200, 30);

															a4 = new JLabel("UÇAĞIN KALKIŞ YERİ      : ");
															a4.setBounds(40, 220, 200, 30);

															bosluk4 = new JTextField();
															bosluk4.setBackground(new Color(238,232,170));
															bosluk4.setBounds(220, 220, 200, 30);

															a5 = new JLabel("UÇAĞIN İNİŞ YERİ         : ");
															a5.setBounds(40, 270, 200, 30);

															bosluk5 = new JTextField();
															bosluk5.setBackground(new Color(238,232,170));
															bosluk5.setBounds(220, 270, 200, 30);

															a6 = new JLabel("BİLET TARİHİ             : ");
															a6.setBounds(40, 320, 200, 30);

															bosluk6 = new JTextField();
															bosluk6.setBackground(new Color(238,232,170));
															bosluk6.setBounds(220, 320, 200, 30);
															
															

															
															a8 = new JLabel("BİLET TÜRÜ                : ");
															a8.setBounds(40, 370, 200, 30);

															bosluk8 = new JTextField();
															bosluk8.setBackground(new Color(238,232,170));
															bosluk8.setBounds(220, 370, 200, 30);

															a9 = new JLabel("BİLET FİYATI             : ");
															a9.setBounds(40, 420, 200, 30);

															bosluk9 = new JTextField();
															bosluk9.setBackground(new Color(238,232,170));
															bosluk9.setBounds(220, 420, 200, 30);

															a10 = new JLabel("KOLTUK NUMARASI              : ");
															a10.setBounds(40, 470, 200, 30);

															bosluk10 = new JTextField();
															bosluk10.setBackground(new Color(238,232,170));
															bosluk10.setBounds(220, 470, 200, 30);

															String atama1 = deger1.getText();
															bosluk1.setText(atama1);
															bosluk1.setEditable(false);

															String atama2 = deger2.getText();
															bosluk2.setText(atama2);
															bosluk2.setEditable(false);

															String atama3 = deger3.getText();
															bosluk3.setText(atama3);
															bosluk3.setEditable(false);
															
															String atama7 = deger4.getText();
															bosluk7.setText(atama7);
															bosluk7.setEditable(false);


															String atama4 = veri1.getText();
															bosluk4.setText(atama4);
															bosluk4.setEditable(false);

															String atama5 = veri2.getText();
															bosluk5.setText(atama5);
															bosluk5.setEditable(false);

															String atama6 = veri3.getText();
															bosluk6.setText(atama6);
															bosluk6.setEditable(false);

															
															String atama8 = eko.getText();
															bosluk8.setText(atama8);
															bosluk8.setEditable(false);

															String atama9 = fiyatEko.getText();
															bosluk9.setText(atama9);
															bosluk9.setEditable(false);

															JOptionPane.showMessageDialog(frame,
																	"Koltuk " + koltukNo + " seçildi.");

															bosluk10.setText(koltuk1);
															bosluk10.setEditable(false);
															
															
															JLabel logo2 = new JLabel(new ImageIcon(UcusRezervasyonSistemi.class.getResource("/zyro-image (6).png") ));
															logo2.setBounds(510, 190, 120, 120);
															
															
															JLabel marka4 = new JLabel("YBS");
															marka4.setFont(new Font("Segoe Print", Font.BOLD|Font.ITALIC, 30));
															marka4.setForeground(new Color(30,200,255));
															marka4.setBounds(515, 270, 120, 120);
															
															JLabel marka5 = new JLabel("HAVA");
															marka5.setFont(new Font("Segoe Print", Font.BOLD|Font.ITALIC, 30));
															marka5.setForeground(new Color(30,200,255));
															marka5.setBounds(498, 300, 120, 120);
															
															JLabel marka6 = new JLabel("YOLLARI");
															marka6.setFont(new Font("Segoe Print", Font.BOLD|Font.ITALIC, 30));
															marka6.setForeground(new Color(30,200,255));
															marka6.setBounds(470, 330, 150, 120);
															
															
															JButton onay = new JButton("ONAYLA");
															onay.setBackground(Color.orange);
															onay.setBounds(20, 550, 120, 30);
															
															onay.addActionListener(new ActionListener() {
																
																@Override
																public void actionPerformed(ActionEvent e) {
																	
																	JOptionPane.showMessageDialog(frame,"Biletiniz alınmıştır.Bizi tercih "
																			+ "ettiğiniz için teşekkür ederiz");
																	
																	System.exit(0);
																	
																}
																
																
																
															});
															
															JButton vazgec = new JButton("VAZGEÇ");
															vazgec.setBackground(Color.orange);
															vazgec.setBounds(320, 550, 120, 30);
														    
															
															vazgec.addActionListener(new ActionListener() {
																
																@Override
																public void actionPerformed(ActionEvent e) {
																	
																	AnaMenu2 anaMenu2 = new AnaMenu2();
																	anaMenu2.ekle();
																	frame.setVisible(false);
																	
																	
																	
																}
																
																
																
															});
															
															frame.add(a1);
															frame.add(bosluk1);
															frame.add(a2);
															frame.add(bosluk2);
															frame.add(a3);
															frame.add(bosluk3);
															frame.add(a7);
															frame.add(bosluk7);
															frame.add(a4);
															frame.add(bosluk4);
															frame.add(a5);
															frame.add(bosluk5);
															frame.add(a6);
															frame.add(bosluk6);
															
															frame.add(a8);
															frame.add(bosluk8);
															frame.add(a9);
															frame.add(bosluk9);
															frame.add(a10);
															frame.add(bosluk10);
															
															frame.add(logo2);
															frame.add(marka4);
															frame.add(marka5);
															frame.add(marka6);
															frame.add(onay);
															frame.add(vazgec);
															
															

															sayfa6=new JPanel();
															sayfa6.setSize(700,700);
															sayfa6.setBackground(Color.WHITE);
															sayfa6.setLayout(null);
															frame.add(sayfa6);
															
															frame.setLayout(null);
															frame.setDefaultCloseOperation(
																	JFrame.EXIT_ON_CLOSE);
															frame.setSize(700, 700);
															frame.setVisible(true);

														}

														
														
													}
												});

												numara2.addActionListener(new ActionListener() {

													@Override
													public void actionPerformed(ActionEvent e) {

														if (numara2.getToolTipText() != null) {

															JOptionPane.showMessageDialog(frame,
																	"Koltuk " + koltukNo
																			+ " dolu.Başka bir koltuk seçiniz");
															
														}

														
													
														
														
														
														
														
													}
												});
												frame.setLayout(new FlowLayout());
											}

										} else {
											JOptionPane.showMessageDialog(frame,
													"TC ve telefon numarası 11 haneli,yil 4 haneli olmalıdır.", "Uyarı",
													JOptionPane.WARNING_MESSAGE);
										}

									}

									frame.add(koltukSec);
									frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
									frame.setSize(550, 500);
									frame.setVisible(true);

								}

							});

							frame.add(Jad);
							frame.add(deger1);
							frame.add(Jtc);
							frame.add(deger2);
							frame.add(Jtel);
							frame.add(deger3);
							frame.add(Jyil);
							frame.add(deger4);
							frame.add(kisiselBilgi);

							frame.add(resim4);
							frame.add(panel2);
							frame.add(devam1);
							
							sayfa5=new JPanel();
							sayfa5.setSize(550,500);
							sayfa5.setBackground(Color.WHITE);
							sayfa5.setLayout(null);
							frame.add(sayfa5);
							
							
							frame.setSize(550, 500);
							frame.setLayout(null);
							frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							frame.setVisible(true);

						}
					});

					JPanel panel8 = new JPanel();
					panel8.setLayout(null);
					
					busi.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {

							frame.getContentPane().removeAll();
							frame.repaint();

							Bilgiler bilgiler = new Bilgiler();
							String adSoyad = bilgiler.isim("");
							

							
							
							  boolean tc = bilgiler.tcKontrol(""); 
							  boolean telefon =bilgiler.telefonKontrol("");
							  boolean yil = bilgiler.yilKontrol("");
							 

							JLabel Jad, Jtc, Jtel,Jyil,kisiselBilgi;

							JTextField deger1, deger2, deger3,deger4;
							
							JPanel sayfa6;
							
							kisiselBilgi = new JLabel("Bilgilerinizi Giriniz : ");
							kisiselBilgi.setFont(new Font("SYu Gothic UI Semibold", Font.BOLD|Font.ITALIC, 18));
							kisiselBilgi.setBounds(25, 10, 250, 30);

							Jad = new JLabel("ADINIZI ve SOYADINIZI GİRİNİZ");
							Jad.setFont(new Font("Yu Gothic UI Semibold", Font.ITALIC, 18));
							Jad.setBounds(25, 45, 300, 30);

							deger1 = new JTextField(adSoyad);
							deger1.setBackground(new Color(238,232,170));
							deger1.setBounds(25, 85, 272, 30);
							deger1.setText(adSoyad);

							Jtc = new JLabel("TC KİMLİK NUMARANIZI GİRİNİZ");
							Jtc.setFont(new Font("Yu Gothic UI Semibold", Font.ITALIC, 18));
							Jtc.setBounds(25, 125, 300, 30);

							deger2 = new JTextField();
							deger2.setBackground(new Color(238,232,170));
							deger2.setBounds(25, 165, 272, 30);

							Jtel = new JLabel("TELEFON NUMARANIZI GİRİNİZ");
							Jtel.setFont(new Font("Yu Gothic UI Semibold", Font.ITALIC, 18));
							Jtel.setBounds(25, 205, 300, 30);

							deger3 = new JTextField();
							deger3.setBackground(new Color(238,232,170));
							deger3.setBounds(25, 245, 272, 30);
							
							
							Jyil = new JLabel("DOĞUM YILINIZI GİRİNİZ : ");
							Jyil.setFont(new Font("Yu Gothic UI Semibold", Font.ITALIC, 18));
							Jyil.setBounds(25, 285, 300, 30);
							
							deger4 = new JTextField();
							deger4.setBackground(new Color(238,232,170));
							deger4.setBounds(25, 325, 272, 30);
							

							JLabel resim4 = new JLabel(new ImageIcon(UcusRezervasyonSistemi.class.getResource("/oturum.png") ));
							resim4.setBounds(320, -25, 250, 250);

							JPanel panel5 = new JPanel();
							panel5.setLayout(null);

							JButton devam2 = new JButton("DEVAM ET");
							devam2.setBackground(Color.orange);
							devam2.setBounds(25, 375, 125, 30);

							devam2.addActionListener(new ActionListener() {

								public void actionPerformed(ActionEvent e) {
									
									JLabel koltukSec = new JLabel("Lütfen Koltuğunuzu Seçiniz!!! ");
									koltukSec.setBounds(20,720 , 150, 30);
									

									if (deger1.getText().isEmpty() || deger2.getText().isEmpty()
											|| deger3.getText().isEmpty() || deger4.getText().isEmpty()) {
										JOptionPane.showMessageDialog(frame, "Lütfen tüm alanları doldurun.",
												"Uyarı", JOptionPane.WARNING_MESSAGE);
									} else {

										String tc = deger2.getText();
										String telefonNo = deger3.getText();
										String yilString = deger4.getText();

										Bilgiler bilgiler = new Bilgiler();

										if (bilgiler.tcKontrol(tc) && bilgiler.telefonKontrol(telefonNo)&& bilgiler.yilKontrol(yilString)) {

											frame.getContentPane().removeAll();
											frame.repaint();

											int[] dizi = new int[110];
											for (int i = 0; i < 110; i++) {
												dizi[i] = i + 1;
											}

											for (int k = 0; k < dizi.length; k++) {

												JButton numara1, numara2;

												numara1 = new JButton(String.valueOf(dizi[k]));
												numara2 = new JButton(String.valueOf(dizi[k]));

												KoltukSecimi koltuk = new KoltukSecimi();

												if (koltuk.koltukDoluMu(dizi[k])) {

													numara2.setBackground(Color.RED);
													numara2.setToolTipText("Koltuk dolu! Koltuk alamazsınız.");
													frame.add(numara2);

												} else {

													numara1.setBackground(Color.GREEN);
													numara1.setToolTipText("Koltuk boş! Koltuk alabilirsiniz.");
													frame.add(numara1);

												}

												int koltukNo = (dizi[k]);

												String koltuk1 = String.valueOf(koltukNo);

												numara1.addActionListener(new ActionListener() {

													@Override
													public void actionPerformed(ActionEvent e) {

														if (numara1.getToolTipText() != null) {

															frame.getContentPane().removeAll();
															frame.repaint();

															JLabel a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;

															JTextField bosluk1, bosluk2, bosluk3, bosluk4,
																	bosluk5, bosluk6, bosluk7, bosluk8, bosluk9,
																	bosluk10;

															a1 = new JLabel("ADINIZ ve SOYADINIZ      : ");
															a1.setBounds(40, 20, 200, 30);

															bosluk1 = new JTextField();
															bosluk1.setBackground(new Color(238,232,170));
															bosluk1.setBounds(220, 20, 200, 30);

															a2 = new JLabel("TCKN NUMARANIZ           : ");
															a2.setBounds(40, 70, 200, 30);

															bosluk2 = new JTextField();
															bosluk2.setBackground(new Color(238,232,170));
															bosluk2.setBounds(220, 70, 200, 30);

															a3 = new JLabel("TELEFON NUMARANIZ    : ");
															a3.setBounds(40, 120, 200, 30);
															
															bosluk3 = new JTextField();
															bosluk3.setBackground(new Color(238,232,170));
															bosluk3.setBounds(220, 120, 200, 30);
															
															a7 = new JLabel("DOĞUM YILINIZ     : ");
															a7.setBounds(40, 170, 200, 30);
															
															bosluk7 = new JTextField();
															bosluk7.setBackground(new Color(238,232,170));
															bosluk7.setBounds(220, 170, 200, 30);
															

															a4 = new JLabel("UÇAĞIN KALKIŞ YERİ      : ");
															a4.setBounds(40, 220, 200, 30);

															bosluk4 = new JTextField();
															bosluk4.setBackground(new Color(238,232,170));
															bosluk4.setBounds(220, 220, 200, 30);

															a5 = new JLabel("UÇAĞIN İNİŞ YERİ         : ");
															a5.setBounds(40, 270, 200, 30);

															bosluk5 = new JTextField();
															bosluk5.setBackground(new Color(238,232,170));
															bosluk5.setBounds(220, 270, 200, 30);

															a6 = new JLabel("BİLET TARİHİ             : ");
															a6.setBounds(40, 320, 200, 30);

															bosluk6 = new JTextField();
															bosluk6.setBackground(new Color(238,232,170));
															bosluk6.setBounds(220, 320, 200, 30);

															


															a8 = new JLabel("BİLET TÜRÜ                : ");
															a8.setBounds(40, 370, 200, 30);

															bosluk8 = new JTextField();
															bosluk8.setBackground(new Color(238,232,170));
															bosluk8.setBounds(220, 370, 200, 30);

															a9 = new JLabel("BİLET FİYATI             : ");
															a9.setBounds(40, 420, 200, 30);

															bosluk9 = new JTextField();
															bosluk9.setBackground(new Color(238,232,170));
															bosluk9.setBounds(220, 420, 200, 30);

															a10 = new JLabel("KOLTUK NUMARASI              : ");
															a10.setBounds(40, 470, 200, 30);

															bosluk10 = new JTextField();
															bosluk10.setBackground(new Color(238,232,170));
															bosluk10.setBounds(220, 470, 200, 30);

															String atama1 = deger1.getText();
															bosluk1.setText(atama1);
															bosluk1.setEditable(false);

															String atama2 = deger2.getText();
															bosluk2.setText(atama2);
															bosluk2.setEditable(false);

															String atama3 = deger3.getText();
															bosluk3.setText(atama3);
															bosluk3.setEditable(false);
															
															String atama7 = deger4.getText();
															bosluk7.setText(atama7);
															bosluk7.setEditable(false);

															String atama4 = veri1.getText();
															bosluk4.setText(atama4);
															bosluk4.setEditable(false);

															String atama5 = veri2.getText();
															bosluk5.setText(atama5);
															bosluk5.setEditable(false);

															String atama6 = veri3.getText();
															bosluk6.setText(atama6);
															bosluk6.setEditable(false);

															

															String atama8 = busi.getText();
															bosluk8.setText(atama8);
															bosluk8.setEditable(false);

															String atama9 = fiyatBusi.getText();
															bosluk9.setText(atama9);
															bosluk9.setEditable(false);

															JOptionPane.showMessageDialog(frame,
																	"Koltuk " + koltukNo + " seçildi.");

															bosluk10.setText(koltuk1);
															bosluk10.setEditable(false);
															
															
															JLabel logo2 = new JLabel(new ImageIcon(UcusRezervasyonSistemi.class.getResource("/zyro-image (6).png") ));
															logo2.setBounds(510, 190, 120, 120);
															
															
															JLabel marka4 = new JLabel("YBS");
															marka4.setFont(new Font("Segoa Print", Font.BOLD|Font.ITALIC,30));
															marka4.setForeground(new Color(30,200,255));
															marka4.setBounds(515, 270, 120, 120);
															
															JLabel marka5 = new JLabel("HAVA");
															marka5.setFont(new Font("Segoa Print", Font.BOLD|Font.ITALIC,30));
															marka5.setForeground(new Color(30,200,255));
															marka5.setBounds(498, 300, 120, 120);
															
															JLabel marka6 = new JLabel("YOLLARI");
															marka6.setFont(new Font("Segoa Print", Font.BOLD|Font.ITALIC,30));
															marka6.setForeground(new Color(30,200,255));
															marka6.setBounds(470, 330, 170, 120);
															
															
															JButton onay = new JButton("ONAYLA");
															onay.setBackground(Color.orange);
															onay.setBounds(20, 550, 120, 30);
															
															onay.addActionListener(new ActionListener() {
																
																@Override
																public void actionPerformed(ActionEvent e) {
																	
																	JOptionPane.showMessageDialog(frame,"Biletiniz alınmıştır.Bizi tercih "
																			+ "ettiğiniz için teşekkür ederiz");

																	System.exit(0);
																	
																	
																}
															});
															
															JButton vazgec = new JButton("VAZGEÇ");
															vazgec.setBackground(Color.orange);
															vazgec.setBounds(320, 550, 120, 30);
															
															vazgec.addActionListener(new ActionListener() {
																
																@Override
																public void actionPerformed(ActionEvent e) {
																	
																	
																	AnaMenu2 anaMenu2 = new AnaMenu2();
																	anaMenu2.ekle();
																	frame.setVisible(false);
																	
																	
																}
															});
															

															frame.add(a1);
															frame.add(bosluk1);
															frame.add(a2);
															frame.add(bosluk2);
															frame.add(a3);
															frame.add(bosluk3);
															frame.add(a7);
															frame.add(bosluk7);
															frame.add(a4);
															frame.add(bosluk4);
															frame.add(a5);
															frame.add(bosluk5);
															frame.add(a6);
															frame.add(bosluk6);
															
															frame.add(a8);
															frame.add(bosluk8);
															frame.add(a9);
															frame.add(bosluk9);
															frame.add(a10);
															frame.add(bosluk10);
															
															frame.add(logo2);
															frame.add(marka4);
															frame.add(marka5);
															frame.add(marka6);
															frame.add(onay);
															frame.add(vazgec);
															
															JPanel sayfa6 = new JPanel();
															sayfa6.setSize(700,700);
															sayfa6.setBackground(Color.WHITE);
															sayfa6.setLayout(null);
															frame.add(sayfa6);
															

															frame.setLayout(null);
															frame.setDefaultCloseOperation(
																	JFrame.EXIT_ON_CLOSE);
															frame.setSize(700, 700);
															frame.setVisible(true);

														}

													}
												});

												numara2.addActionListener(new ActionListener() {

													@Override
													public void actionPerformed(ActionEvent e) {

														if (numara2.getToolTipText() != null) {

															JOptionPane.showMessageDialog(frame,
																	"Koltuk " + koltukNo
																			+ " dolu.Başka bir koltuk seçiniz");

														}

													}
												});

												frame.setLayout(new FlowLayout());
											}

										} else {
											JOptionPane.showMessageDialog(frame,
													"TC ve telefon numarası 11 haneli, yil 4 haneli olmalıdır.", "Uyarı",
													JOptionPane.WARNING_MESSAGE);
										}

									}

									frame.add(koltukSec);
									frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
									frame.setSize(550, 500);
									frame.setVisible(true);

								}

							});

							frame.add(Jad);
							frame.add(deger1);
							frame.add(Jtc);
							frame.add(deger2);
							frame.add(Jtel);
							frame.add(deger3);
							frame.add(Jyil);
							frame.add(deger4);
							frame.add(kisiselBilgi);
							
							frame.add(resim4);
							frame.add(panel8);
							frame.add(devam2);

							
							frame.setSize(550, 500);
							frame.setLayout(null);
							frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							frame.setVisible(true);

						}
					});

					frame.add(secim2);
					frame.add(eko);
					frame.add(busi);
					
					
					frame.add(harita);
					
					frame.setSize(550, 500);
					
					sayfa2=new JPanel();
					sayfa2.setSize(550,500);
					sayfa2.setBackground(new Color(238,232,170));
					sayfa2.setLayout(null);
					frame.add(sayfa2);
					
					frame.setLayout(null);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);

				}
				}
			});

		
		frame.add(bilgi1);
		frame.add(veri1);
		frame.add(bilgi2);
		frame.add(veri2);
		frame.add(bilgi3);
		frame.add(veri3);
		frame.add(bilgi4);
		frame.add(veri4);
		frame.add(btn);

		frame.add(resim1);
		frame.add(logo1);
		frame.add(marka1);
		frame.add(marka2);
		frame.add(marka3);
		

		
		frame.setSize(550, 500);
		
		sayfa1=new JPanel();
		sayfa1.setSize(550,500);
		sayfa1.setBackground(Color.WHITE);
		sayfa1.setLayout(null);
		frame.add(sayfa1);
		
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	
		
				}
			
}
