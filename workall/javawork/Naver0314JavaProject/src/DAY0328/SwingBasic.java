package DAY0328;

import java.awt.Color;

import javax.swing.JFrame;

public class SwingBasic extends JFrame{
	
	public SwingBasic(String title) {
		super(title);
		this.setLocation(100, 100); //시작위치
		this.setSize(1000, 300); //창크기
		this.getContentPane().setBackground(new Color(34, 9, 44)); //배경색
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 종료
		this.initDesign(); //각종 컴포넌트 생성
		this.setVisible(true);
	}
	
	private void initDesign() {
	}

	public static void main(String[] args) {
		
		SwingBasic a = new SwingBasic("기본창");
		
	}

}
