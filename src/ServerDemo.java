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
		System.out.println("有客户端连接IP地址"+s.getInetAddress().getHostAddress());
		System.out.println("有客户端连接 端口号"+s.getPort());
	   //s.getInputStream();
	  in =new BufferedReader(
			   new InputStreamReader(s.getInputStream()));
	   out =new PrintWriter(
				new OutputStreamWriter(s.getOutputStream()));
	  while(true) {
	  String clentStr=in.readLine();
	   System.out.println("祥祥发送来的消息是："+clentStr);

	   //服务器端接受完数据后，再向客户端发送
	   System.out.println("萱萱接受完消息后，向祥祥发送:");
	   Scanner sc= new Scanner(System.in);
		String serverStr = sc.nextLine();
		//s.getOutputStream()获得socket的输出流
		 
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
