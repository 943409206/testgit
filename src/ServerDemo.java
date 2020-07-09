import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerDemo {

	public static void main(String[] args) {
		System.out.println("############server######");
		ServerSocket ss=null;
		BufferedReader in=null;
		PrintWriter out=null;
     try {
		 ss =new ServerSocket(7777);
		Socket s =ss.accept();
		System.out.println("�пͻ�������IP��ַ"+s.getInetAddress().getHostAddress());
		System.out.println("�пͻ������� �˿ں�"+s.getPort());
	   //s.getInputStream();
	  in =new BufferedReader(
			   new InputStreamReader(s.getInputStream()));
	   out =new PrintWriter(
				new OutputStreamWriter(s.getOutputStream()));
	  while(true) {
	  String clentStr=in.readLine();
	   System.out.println("���鷢��������Ϣ�ǣ�"+clentStr);

	   //�������˽��������ݺ�����ͻ��˷���
	   System.out.println("�����������Ϣ�������鷢��:");
	   Scanner sc= new Scanner(System.in);
		String serverStr = sc.nextLine();
		//s.getOutputStream()���socket�������
		 
		out.write(serverStr+"\r\n");
		out.flush();
	  }
	   
	   
	   
	   
	   
	   
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		if(in!=null) {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(ss!=null) {
			try {
				ss.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	}

}
