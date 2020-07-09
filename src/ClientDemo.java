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
	//客户端  建立连接的过程
	 s =new Socket("127.0.0.1",7777);
	System.out.println("与服务器连接"+s.getInetAddress().getHostAddress());
	System.out.println("有客户端连接 端口号"+s.getPort());
	in =new BufferedReader(
			   new InputStreamReader(s.getInputStream()));
	out =new PrintWriter(
			new OutputStreamWriter(s.getOutputStream()));
	//客户端输入数据向服务器端发送
	
	while(true) {
	System.out.println("祥祥输入聊天信息，向萱萱发送");
	Scanner sc= new Scanner(System.in);
	String clentStr = sc.nextLine();
	//s.getOutputStream()获得socket的输出流
	
	out.write(clentStr+"\r\n");
	out.flush();

	   String serverStr=in.readLine();
	   System.out.println("萱萱发送来的消息是："+serverStr);
  
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
