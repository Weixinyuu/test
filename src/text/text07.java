package text;
import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class text07 {
	public static void main(String[] args) {
		JFrame jf = new JFrame("ѧ�����Դ���");
        jf.setSize(700, 470);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // �����������
        JPanel panel = new JPanel(null);
        //����һ���˵�
        JMenuBar menuBar=new JMenuBar();
  		jf.setJMenuBar(menuBar);
        
  		//�˵�
  		JMenu menu1=new JMenu("�ļ�:");
  		JMenu menu2=new JMenu("�༭:");
  		JMenu menu3=new JMenu("��ͼ:");
  		JMenu menu4=new JMenu("����:");
  		
  		menuBar.add(menu1);
  		menuBar.add(menu2);
  		menuBar.add(menu3);
  		menuBar.add(menu4);
  		//ͼƬ
  		JLabel label_image = new JLabel(new ImageIcon("./src/images/88.jpg")); 
  		label_image.setLocation(5, 8);
  	 	label_image.setSize(150,250);
		 panel.add(label_image);
        
			//ѧ��ѧ��
			JLabel label_username=new JLabel("ѧ��:");
			jf.add(label_username);
			
			JTextField userName = new JTextField(25);
			jf.add(userName);
	        // ���ð�ť������
			label_username.setLocation(200, 5);
			userName.setLocation(240,15);
	        // ���ð�ť�Ŀ��
			label_username.setSize(300, 50);
			userName.setSize(305,30);
	        panel.add(label_username);
	        panel.add(userName);
	        
        // ѧ������
        JLabel name=new JLabel("����: ");
		jf.add(name);
		
		JTextField userName1 = new JTextField(30);
		jf.add(userName1);
        // ���ð�ť������
		name.setLocation(205, 55);
		userName1.setLocation(245,65);
        // ���ð�ť�Ŀ��
		name.setSize(300, 55);
		userName1.setSize(305,30);
        panel.add(name);
        panel.add(userName1);
        
        //�Ա�
        JLabel SSex=new JLabel("�Ա�: ");
		panel.add(SSex);
		JRadioButton radio1 = new JRadioButton("Ů",false);
		panel.add(radio1);
		JRadioButton radio2 = new JRadioButton("��",true);
		panel.add(radio2);
		
		ButtonGroup button1=new ButtonGroup();
		button1.add(radio1);
		button1.add(radio2);
		
		SSex.setLocation(205, 100);
		radio1.setLocation(275,100);
		radio2.setLocation(355,100);
		
        // ���ð�ť�Ŀ��
		SSex.setSize(105, 55);
		radio1.setSize(55,55);
		radio2.setSize(55,55);
        panel.add(SSex);
        panel.add(radio1);
        panel.add(radio2);
        
        // ����
        JLabel age=new JLabel("����: ");
		jf.add(age);
		
		JTextField userName2 = new JTextField(30);
		jf.add(userName2);
        // ���ð�ť������
		age.setLocation(205, 145);
		userName2.setLocation(245,155);
        // ���ð�ť�Ŀ��
		age.setSize(105, 55);
		userName2.setSize(305,30);
        panel.add(age);
        panel.add(userName2);
        
        // �ֻ�
        JLabel phone=new JLabel("�ֻ�: ");
		jf.add(phone);
		
		JTextField userName3 = new JTextField(30);
		jf.add(userName3);
        // ���ð�ť������
		phone.setLocation(205, 190);
		userName3.setLocation(245,200);
        // ���ð�ť�Ŀ��
		phone.setSize(105, 55);
		userName3.setSize(305,30);
        panel.add(phone);
        panel.add(userName3);
        
        // סַ
        JLabel address=new JLabel("סַ: ");
		jf.add(address);
		
		JTextField userName4 = new JTextField(25);
		
        // ���ð�ť������
		address.setLocation(200, 230);
		userName4.setLocation(240,240);
        // ���ð�ť�Ŀ��
		address.setSize(100, 50);
		userName4.setSize(300,25);
        panel.add(address);
        panel.add(userName4);
        
      //��Ӱ�ť
		JButton button11=new JButton("�����Ƭ.");
		panel.add(button11);
		JButton button2=new JButton("���Ӽ�¼.");
		panel.add(button2);
		JButton button3=new JButton("�޸ļ�¼.");
		panel.add(button3);
		JButton button4=new JButton("ɾ����¼.");
		panel.add(button4);
        
		button11.setLocation(200,280);
		button2.setLocation(300,280);
		button3.setLocation(400,280);
		button4.setLocation(500,280);
		
		button11.setSize(90, 30);
		button2.setSize(90, 30);
		button3.setSize(90, 30);
		button4.setSize(90, 30);
		
		panel.add(button11);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
        // ��ʾ����
        jf.setContentPane(panel);
        jf.setVisible(true);

	}
}