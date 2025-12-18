package assignments;

public class Assignment9_ArraysAndLoops {

	public static void main(String[] args) {
		
        int[] arr = {12, 34, 11, 36, 87, 98, 93};

        int first = arr[0];
        int second = arr[0];
        int third = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num < first) {
                third = second;
                second = num;
            } else if (num > third && num < second) {
                third = num;
            }
        }

        System.out.println("Second largest number: " + second);
        System.out.println("Third largest number: " + third);

	}

}
