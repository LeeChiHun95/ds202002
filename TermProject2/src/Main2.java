
import java.util.Random;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("insert N > ");
		int n = scan.nextInt();
		System.out.print("insert K > ");
		int k = scan.nextInt();
		
		int r[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			r[i] = rand.nextInt();
		}
		
		int a[] = new int[k];
		int b[] = new int[k];
		for(int i = 0; i < k; i++) {
			while(true) {
				a[i] = rand.nextInt(n);
				b[i] = rand.nextInt(n);
				if(a[i] != b[i] && a[i] < b[i]) break;
			}
		}

		int min[] = new int[k];
		int max[] = new int[k];
		long arr_sum[] = new long[k];
		int init[] = new int[n];

		long t = System.currentTimeMillis();
		for(int x = 0; x < k; x++) {
			long sum = 0;
			for(int i = 0; i < n; i++) {
				init[i] = r[i];
			}
			for(int i = a[x]; i <= b[x]; i++) {
				sum += r[i];
			}
			for(int i = a[x]; i < b[x]; i++) {
				for(int j = i + 1; j < b[x] + 1; j++) {
					if(r[i] < r[j]) {
						int imsi = init[j];
						init[j] = init[i];
						init[i] = imsi;
					}
				}	
			}			
			max[x] = init[a[x]];
			min[x] = init[b[x]];
			arr_sum[x] = sum;
		}
		t = System.currentTimeMillis() - t;
		System.out.println(t + "ms.");
	}
}
