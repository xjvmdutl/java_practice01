package practice01.prob3;
import java.util.Scanner;
public class Prob3 {
	public static void main (String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.print("���ڸ� �Ԏ��ϼ��� : " );
		int num = sc.nextInt();
		int sum =0;
		if(num%2==1) { 
			for(int i=0;i<=num;++i) 
				if(i%2==1)
					sum+=i;
		}
		else {
			for(int i=0;i<=num;++i) 
				if(i%2==0)
					sum+=i;
		}
		System.out.println("��� �� : "+sum);
	}
}
