
public class TicketThread implements Runnable {
    
	// 假设50张票
	private int num =50;
	
	// 卖票方法
	public synchronized void saleTicket()  {
		if(num>0) {
			System.out.println(Thread.currentThread().getName()+":"+"No."+num);
			num--;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	
	public void run() {
		while(true) {
			if(num>0) {
			
				this.saleTicket();
			
			}
			else {
				break;
			}
		}
	}
	
	
	
}
