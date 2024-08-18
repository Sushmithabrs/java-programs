package Arrays;

public class Test2 {

	public static void main(String[] args) {
	int[] arr={3,7,2,9,4};
        int sum=0;
for(int i=0;i<arr.length;i++) {
	if(arr[i]%2==0) {
		sum=sum+arr[i];
	}
}
System.out.println(sum);
	}

}
