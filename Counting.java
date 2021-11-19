public class Counting {
	public static void main(String[] args) {
		int num = 0;
		countingObjs(num);
	}

	public static void countingObjs(int limite) {
		int num = 0;
		System.out.print("[");
		while(num < limite) {
			num++;
			System.out.print("\"" + num + "\", ");
		}
		System.out.println("],");
	}
}