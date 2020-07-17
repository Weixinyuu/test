//3.1 BorderLayout－边界布局
//package text;
//import java.awt.BorderLayout;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//
//public class text03 {
//       public static void main(String[] args){
//    	   JFrame jframe = new JFrame();
//    	   jframe.setSize(600,600);
//    	   jframe.setLocation(200,200);
//   	   
//   	   jframe.setLayout(new BorderLayout()); //设置边框布局
//    	   jframe.add(new JButton("按钮1"),BorderLayout.SOUTH);
//    	   jframe.add(new JButton("按钮2"),BorderLayout.WEST);
//    	   jframe.add(new JButton("按钮3"),BorderLayout.NORTH);
//   	   jframe.add(new JButton("按钮4"),BorderLayout.EAST);
 //   	   jframe.add(new JButton("按钮5"),BorderLayout.CENTER);
 //   	   
 //   	   jframe.setVisible(true);
 //   	   jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    	   
//       }
//}

//		3.2 FlowLayout－流式布局
//					FlowLayout 把容器中的组件从左到右，从上到下依次排列。
//					如果某容器采用 FlowLayout 布局，那么其add方法中指定的位置参数将被忽略。
//					当容器窗口大小改变时，组件的位置可能会发生变化，但组件尺寸不变。
//					FlowLayout 是面板（JPanel）的默认布局
package text;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class text03 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setLayout(new FlowLayout());
		frame.add(new JButton("按钮1"),BorderLayout.SOUTH);   //此布局失效
		frame.add(new JButton("按钮2"));
		frame.add(new JButton("按钮3"));
		frame.add(new JButton("按钮4"));
		frame.add(new JButton("按钮5"));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}



//自定义布局
//package text;
//import java.awt.BorderLayout;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//
//public class text03 {
//       public static void main(String[] args){
//    	    JFrame frame = new JFrame();
//			frame.setSize(500, 500);
//			frame.setLayout(null);  //取消默认布局
//			
//			JButton btn = new JButton("自定义按钮");
//			btn.setBounds(20, 60, 200, 40); //（x,y,width,height）
//			frame.add(btn);
//			frame.setVisible(true);
//			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		}		
//       }
