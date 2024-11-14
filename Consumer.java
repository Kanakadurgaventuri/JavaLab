package q28802;
			try{
				wait();
			}
			catch(Exception e){
				System.out.println(e);
			}
			this.val=val;
			value=true;
			System.out.println("Produced: "+val);
			notify();
	}
}
class Producer implements Runnable{
	Multithreading th;
	int n,i=1;
	Producer(Multithreading th,int n){
		this.th=th;
		this.n=n;
		new Thread(this,"Producer").start();
	}
	public void run(){
		while(i<=n){
			th.put(i++);
		}
	}
}
class Consumer implements Runnable{
	Multithreading th;
	int n,i=1;
	Consumer(Multithreading th,int n){
		this.th=th;
		this.n=n;
		new Thread(this,"Consumer").start();
	}
	public void run(){
		while(i<=n){
			th.get();
			i++;
		}
	}
}
public class ProducerConsumerDemo {
		public static void main(String args[]){
		Multithreading th=new Multithreading();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of items to produce: ");
		int n=sc.nextInt();
		new Producer(th,n);
		new Consumer(th,n);
		}
}
