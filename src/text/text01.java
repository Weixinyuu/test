package text;
import java.awt.color.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Window;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class text01 {
    public static void main(String[] args) {
    	
    	JFrame frame = new JFrame("���´���");
    	frame.setLocation(200,200);
    	frame.setSize(600,500);
    	
    	frame.setLayout(new FlowLayout());
    	//frame.setBackground(Color.blue);
    	
    	//����������
        Container con = frame.getContentPane();
        
        //�����������������
        
		//����ı�
		JLabel label_username = new JLabel("�û���:");
		//JLabel label_image = new JLabel(new ImageIcon("./src/images/3.jpg"));  //���ñ�ǩͼƬ
		//label_username.setText("�û�����");
		con.add(label_username);
		
		//����ı���
		//JTextField userName = new JTextField(5);    //ָ������Ϊ5
		//JTextField userName = new JTextField("Susan");    //�ı����г�ʼ���ֶ�ΪSusan
		JTextField userName = new JTextField();
		userName.setText("wxy");
		System.out.println(userName.getText());    //�õ��ı����е�ֵ
		con.add(userName);
		
		//�����ı���
		JTextArea textArea = new JTextArea(10,10); 
		textArea.setText("���Ķ���");
		textArea.append("�ú�ѧϰ");  //׷���ı�
		con.add(textArea);
		
		//���ð�ť
		JButton button = new JButton("���");
		//JButton btn_image = new JButton(new ImageIcon("./src/image/1.png"));
		con.add(button);
		
		//���ø�ѡ��
		JCheckBox checkbox = new JCheckBox("����",true);
		System.out.println(checkbox.getText());
		con.add(checkbox);
		
		//���õ�ѡ��ť
		JRadioButton radio1 = new JRadioButton("��",true);
		con.add(radio1);
		JRadioButton radio2 = new JRadioButton("Ů",false);
		con.add(radio2);
		
		//���õ�ѡ��ť��
		ButtonGroup bg = new ButtonGroup();
		bg.add(radio1);
		bg.add(radio2);
		
		//���������б�
		String [] items = {"ѡ��һ","ѡ���","ѡ����"};
		JComboBox<String> sel = new JComboBox<String>(items);
		sel.addItem("ѡ����");
		sel.setSelectedIndex(2);  //����������Ĭ����
		System.out.println(sel.getSelectedItem());
		con.add(sel);
		
		//���ñ��
		//û����ʾ����
		/*String [] colName = {"����","�Ա�","����","����"};  //����
		String [][]  rowData = {{"����","��","15","96"},{"����","��","15","96"},{"����","��","15","96"}};  //����
		JTable table = new JTable(rowData,colName);
		con.add(table);*/
		
		String [] colName = {"����","�Ա�","����","����"}; 
		DefaultTableModel dt = new DefaultTableModel(colName,0);
		
		dt.addRow(new String[]{"����","��","15","96"});
		dt.addRow(new String[]{"����","��","15","96"});
		dt.addRow(new String[]{"����","��","15","96"});
		dt.addRow(new String[]{"����","��","15","96"});
		dt.addRow(new String[]{"����","��","15","96"});
		dt.addRow(new String[]{"����","��","15","96"});
		dt.addRow(new String[]{"����","��","15","96"});
		dt.addRow(new String[]{"����","��","15","96"});
		
		JTable table = new JTable(dt);
		table.setRowHeight(60);
		
		JScrollPane jp = new JScrollPane(table);   //���ù������
		jp.setPreferredSize(new Dimension(400, 200));  //���ù�������С
		frame.add(jp);  //�ڴ�������ӹ������
		
		//���ò˵�
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menu1 = new JMenu("�ļ�");  //һ���˵�
		JMenu menu2 = new JMenu("����");
		
		menuBar.add(menu1);
		menuBar.add(menu2);
		
		menu1.add(new JMenuItem("��")); //��Ӷ����˵�
		menu1.add(new JMenuItem("����")); //��Ӷ����˵�
		
		//jf.pack();//�Զ�ƥ�䴰���С ,setSize()������ʧЧ
//jf.setLocationRelativeTo(null);  //���ô��������ָ�������λ�á���������ǰδ��ʾ���� c Ϊ null����˴��ڽ�������Ļ�����롣
		frame.setVisible(true);  //���ô���ɼ�
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //�������Ͻǹرհ�ť �رմ���
		
	}
} 	