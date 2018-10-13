import java.util.Scanner;

public class SortingDriver {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        // int n = scan.nextInt();
        System.out.println("Enter your elements for sorting:");
        String[] strArr = scan.nextLine().split(" ");
        int[] intArr = new int[strArr.length];
        int i = 0;
        for (String str : strArr) {
            intArr[i] = Integer.parseInt(str);
            i++;
        }

        System.out.println("Enter\n1: Insertion Sort\n2: Selection sort.");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                InsertionSort ins = new InsertionSort(intArr);

                break;
            case 2:
                SelectionSort sels = new SelectionSort(intArr);
                break;
            default:
                System.out.println("Invalid choice");
                break;

        }

    }
}
