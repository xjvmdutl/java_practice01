package practice01.prob4;
import java.util.Scanner;
public class Prob4 {
	public static void main (String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String s= sc.nextLine();
		for(int i =0;i<s.length();++i) {
			for(int j=0;j<=i;++j) {
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
	}
}
