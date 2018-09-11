package Demo1;

public class Test2 {
	public static void main(String[] args) {
		new Test2().printNumber();
	}
	private void printNumber() {
		int[] arr = new int[100];
		String[] strArr = new String[100];
		//创建100的数组
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		for (int i : arr) {
			if(i%3==0&&i%5!=0) {
				strArr[i-1] = "Fizz";
			}else if(i%3!=0&&i%5==0) {
				strArr[i-1] = "Buzz";
			}else if(i%3==0&&i%5==0) {
				strArr[i-1] = "FizzBuzz";
			}else{
				String istr = String.valueOf(i);
				if(istr.contains("3")&&!istr.contains("5")) {
					strArr[i-1] = "Fizz";
				}else if(istr.contains("5")&&!istr.contains("3")) {
					strArr[i-1] = "Buzz";
				}else if(istr.contains("3")&&istr.contains("5")) {
					strArr[i-1] = "FizzBuzz";
				}else {
					strArr[i-1] = String.valueOf(i);					
				}
			}
		}
		for (String str : strArr) {
			System.out.println(str);			
		}
	}
}
