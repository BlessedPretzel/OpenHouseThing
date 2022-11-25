package Q4;

// WAP to find the result of 2 to the power of 10
class Iteration2 {
    public static void main(String[] args) {
        int a = 2;
        for (int i = 1; i <= 9; i+=1) {
            a = a * 2;
        }
        System.out.println(a);
    }
}