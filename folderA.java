import java.util.Scanner;

public class folderA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Rakesh ");
        String name = sc.nextLine();
        System.out.print("100: ");
        int total_marks = sc.nextInt();
        System.out.print("English 46: ");
        int a = sc.nextInt();
        System.out.print("Physics 55: ");
        int b = sc.nextInt();
        System.out.print("Chemistry 78: ");
        int c = sc.nextInt();
        System.out.print("Biology 87: ");
        int d = sc.nextInt();
        System.out.print("Mathematics 89: ");
        int e = sc.nextInt();
        float sum = (a + b + c + d + e);
        float per = (sum / total_marks) * 100;
        System.out.println(name + " got " + per + " % in AISSCE.");
 }
}