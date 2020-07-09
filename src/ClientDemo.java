import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientDemo {

	public static void main(String[] args) {
		System.out.println("############client######");
		PrintWriter out=null;
		Socket s=null;
		BufferedReader in=null;
  try {
	//�ͻ���  �������ӵĹ���
	 s =new Socket("127.0.0.1",7777);
	System.out.println("�����������"+s.getInetAddress().getHostAddress());
	System.out.println("�пͻ������� �˿ں�"+s.getPort());
	in =new BufferedReader(
			   new InputStreamReader(s.getInputStream()));
	out =new PrintWriter(
			new OutputStreamWriter(s.getOutputStream()));
	//�ͻ�������������������˷���
	
	while(true) {
	System.out.println("��������������Ϣ�������淢��");
	Scanner sc= new Scanner(System.in);
	String clentStr = sc.nextLine();
	//s.getOutputStream()���socket�������
	
	out.write(clentStr+"\r\n");
	out.flush();

	   String serverStr=in.readLine();
	   System.out.println("���淢��������Ϣ�ǣ�"+serverStr);
  
	}
  
  
  
  
  
  
  
  } catch (UnknownHostException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}finally {
	if(s!=null) {
		try {
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	if(out!=null) {
		out.close();
	}
}
	}

}
