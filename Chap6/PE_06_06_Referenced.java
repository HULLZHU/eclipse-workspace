public class PE_06_06_Referenced {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter line number: ");
    int lineNumber = input.nextInt();

    displayPattern(lineNumber);
  }

  public static void displayPattern(int n) {
    for (int row = 1; row <= n; row++) {
      // Print spaces
      for (int i = row; i < n; i++)//��ӡ�ո�
        System.out.print("  ");

      // Print numbers
      for (int i = row; i >= 1; i--)//��ӡ����
        System.out.print(" " + i);

      System.out.println();
    }
  }
}