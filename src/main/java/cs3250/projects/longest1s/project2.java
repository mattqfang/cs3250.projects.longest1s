package cs3250.projects.longest1s;

public class project2 {

	public static void p2(int args) {
		// TODO Auto-generated method stub
		String x = Integer.toBinaryString(args);
		int count = 0;
		int max = 0;
		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) == '1') {
				count = count + 1;
			}
			else if (x.charAt(i) == '0') {
				if (count != 0 && max < count) {
					max = count;
				}
				count = 0;
			}
		}
		System.out.println(args + " is " + x);
		System.out.println("the longest consecutive set bits is");
		for (int i = 0; i < max; i++) {
			System.out.print("1");
		}
		System.out.println();
		System.out.println("the length is " + max);
	}

}
