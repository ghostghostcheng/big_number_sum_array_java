package big_number_sum;

public class BigNumberSum {
	public static void main(String args[]) {
		String num1 = "12345";
		String num2 = "234567";
		
		//let num1 be longer one
		if (num1.length() < num2.length()) {
			String k = num2;
			num2 = num1;
			num1 = k;
		}
		
		int[] nums1 = new int[1000000];
		int[] nums2 = new int[1000000];
		
		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = 0;
			nums2[i] = 0;
		}
		
		int j = 0;
		for (int i = num1.length() - 1; i > -1; i--) {
			nums1[j] = num1.charAt(i) - 48;
			j++;			
		}
		
		j = 0;
		for (int i = num2.length() - 1; i > -1; i--) {
			nums2[j] = num2.charAt(i) - 48;
			j++;
		}
		
		int carry = 0;
		for (int i = 0; i < num1.length(); i++) {
			int tmp = (nums1[i] + nums2[i] + carry);
			carry = tmp / 10;
			nums1[i] = tmp % 10;
			//System.out.println(nums1[i]);
		}
		
		for (int i = num1.length() - 1; i > -1; i--) {
			System.out.print(nums1[i]);
		}
	}
}
