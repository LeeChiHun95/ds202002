import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		Random rand=new Random();
		System.out.println("생성할 데이터의 개수(N)를 입력하세요 : ");
		int n= scan.nextInt();
		System.out.println("랜덤 구간 개수(K)를 입력하세요 : ");
		int k= scan.nextInt();
		
		long t = System.currentTimeMillis(); 
		//알고리즘 효율 측정 시작		
		int start=0;
		int end=0;
		int change=0;
		
		int r[]=new int[n];
		for(int i=0;i<n;i++) r[i]=rand.nextInt();
		
		for(int i=0;i<k;i++) {
			start=rand.nextInt(n);
			end=rand.nextInt(n);
			if(start>end) {
				change=end;
				end=start;
				start=change;				
			}
			int min = r[start];
			int max = r[start];
			int sum=0;
			for(int j=start;j<=end;j++) {
				sum += r[j]; //구간합계
				if(min >= r[j]) min=r[j];
				if(max <= r[j]) max=r[j];
				}
			}		
		
		t = System.currentTimeMillis()-t;
		System.out.println("Elapsed time is "+t);
	}
}
