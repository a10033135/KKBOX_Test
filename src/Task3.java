public class Task3 {

    public static int count = 0;

    public static void main(String[] args) {
        int answer1 = task3(12345);   // answer : 120
        System.out.println("answer: " + answer1);

        int answer2 = task3(12045);   // answer : 96
        System.out.println("answer: " + answer2);

        int answer3 = task3(1234567); // answer : 5040
        System.out.println("answer: " + answer3);

        int answer4 = task3(1200567); // answer : 3600
        System.out.println("answer: " + answer4);

    }

    public static int task3(int N) {
        count = 0;
        String[] str = String.valueOf(N).split("");
        method(str, 0, str.length);
        return count;
    }

    public static void method(String[] str, int k, int length) {
        if (k == length - 1) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < length; i++) {
                builder.append(str[i]);
            }
            if (String.valueOf(Integer.parseInt(builder.toString())).length()
                    == builder.toString().length()) {
                count++;
            }
        } else {
            for (int i = k; i < length; i++) {
                swap(str, k, i);
                method(str, k + 1, length);
            }
        }
    }

    public static void swap(String[] str, int i, int j) {
        String temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

}
