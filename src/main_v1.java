public class main_v1 {

  public static void main(String[] args) {
    System.out.println("Hello World!");

//    Primitive Type
//
//    Boolean a;
//    int i;
//    Double d;
//    char  ch;
//    String s1;
//
//    a = true;
//    i = 10;
//    d = 10.4;
//    ch = 'C';
//    s1 = "I am groot";
//    String s2 = "Me too";
//
//    String s3 = s1 + "! " + s2;
//
//    System.out.println(a);
//    System.out.println(i);
//    System.out.println(d);
//    System.out.println(ch);
//    System.out.println(s1);
//    System.out.println(s1.charAt(s1.length()-1));
//    System.out.println(s3);
//
//    System.out.print("What is your name ? ");
//
//    Scanner input = new Scanner(System.in);
//
//    String in = input.next();
//
//    System.out.println("Hello " + in);
//
//
//    System.out.print("How old are you ? ");
//
//    Scanner ageInput = new Scanner(System.in);
//
//    int age = ageInput.nextInt();
//
//    System.out.println("You are " + age + " years old.");
//
//    if (age < 18) {
//      System.out.println("You are still a child");
//    } else {
//      System.out.println("You are an adult.");
//    }
//
//    for (i=0; i < 10; i++) {
//      System.out.println("The value of i is " + i);
//    }

//    int j = 0;
//
//    while (j < 10) {
//      System.out.println("The value of j is " + j);
//      j++;
//    }
//
//    int k = 0;
//
//    do {
//      System.out.println("The value of k is " + k);
//      k++;
//    } while (k < 10);
//
//     for (int k = 0; k < 10; k++) {
//
//       switch (k) {
//         case 0:
//           System.out.println("Value of k is " + k + " and I am case 0");
//           break;
//         case 1:
//           System.out.println("Value of k is " + k + " and I am case 1");
//           break;
//         case 2:
//           System.out.println("Value of k is " + k + " and I am case 2");
//           break;
//
//         default:
//           System.out.println("Value of k is " + k);
//           break;
//       }
//     }
//
//    Comparing string
//    String a = "TruE";
//
//    if (a.toLowerCase().equals("true")) {
//      System.out.println("A is true");
//    }

    int i = 3;
    int j = 10;

    int k = sum(i, j);

    System.out.println("Sum of " + i + " + " + j + " = " + k);
  }

  private static int sum(int no1, int no2) {
    int s = no1 + no2;
    return s;
  }
}
