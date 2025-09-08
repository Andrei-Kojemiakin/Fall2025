public class asx {
    public static void main(String[] args) {
//       Напишите программу для проверки, является ли год високосным.

        int year = 1300;
        {
if (year % 4 == 0) {
    System.out.println(year + " високосный");
}
else if (year % 4 != 0) {
    System.out.println(year + " НЕ високосный");
}
        }
    }
}
