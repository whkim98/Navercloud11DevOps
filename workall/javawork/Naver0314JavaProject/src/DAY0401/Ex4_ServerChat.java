package DAY0401;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Ex4_ServerChat extends JFrame{
	
	JTextArea area;
	Vector<ClientMember> list = new Vector<Ex4_ServerChat.ClientMember>();
	ServerSocket serverSocket;
	
	public Ex4_ServerChat(String title) {
		super(title);
		this.setLocation(100, 100); //시작위치
		this.setSize(500, 500); //창크기
		this.getContentPane().setBackground(new Color(34, 9, 44)); //배경색
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 종료
		this.initDesign(); //각종 컴포넌트 생성
		this.setVisible(true);
	}

	class ClientMember extends Thread{
		
		Socket mySocket;
		String nickName;
		BufferedReader br;
		PrintWriter pw;
		//생성자
		public ClientMember(Socket socket) {
			//외부의 run 메소드에서 생성시 소켓을 받아서 생성
			mySocket = socket;
			
			//네트워크를 통해서 메세지를 읽고 쓸 수 있도록 io클래스 생성
			try {
				br = new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
				pw = new PrintWriter(mySocket.getOutputStream());
			}catch(IOException e) {
				
			}
			run
		}
		
		
		@Override
		public void run() {
			super.run();
			try {
				serverSocket = new ServerSocket(6000);
				area.append("서버 소켓 생성 성공\n");
				
				while(true) {
					//접속한 클라이언트를 허용하고 소켓 생성
					Socket socket = serverSocket.accept();
					area.append("접속한 IP: " + socket.getInetAddress() + "\n");
				}
				
			} catch (IOException e) {
				area.append("서버 소켓 생성 오류: " + e.getMessage() + "\n");
			}
		}
		
		
		
		
	}
	public void initDesign() {
		area = new JTextArea();
		this.add(area);
	}
	public static void main(String[] args) {
		Ex4_ServerChat a = new Ex4_ServerChat("채팅서버");
		Thread th = new Thread(a);
		th.start();
	}

}
