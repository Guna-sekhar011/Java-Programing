

class Demo extends Thread{
	@Override
	public void run() {
		Thread t = currentThread();
		if(t.getName().equals("prime")) {
			primeNumbers();
		}
		else {
			subArray();
		}
	}
	
	public void primeNumbers() {
		System.out.println("Prime numbers");
		for(int i=1;i<=10;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i);
				try {
					Thread.sleep(3000);
				}
				catch(Exception e) {
					
				}
			}
		}
		System.out.println("Prime numbers end");
	}
	public void subArray() {
	
		
		int arr[]= {1,2,3,4,5,6,7,4,1,56,};
		
		int k=10;
		System.out.println("Subarrays");
		
		for(int size=1;size<=arr.length;size++) {
			for(int i=0;i<=arr.length-size;i++) {
				int sum=0;
				for(int j=i;j<i+size;j++) {
					sum=sum+arr[j];
				}
				if(sum==k) {
					for(int j=i;j<i+size;j++) {
						System.out.print(arr[j]+" ");
					}
					System.out.println();
				}
			}
		}
		System.out.println("Sub Arrays end");
	}
}



public class Thread1 {

	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		
		d1.setName("prime");
		d2.setName("subarray");
		d1.start();
		d2.start();
	}

}
