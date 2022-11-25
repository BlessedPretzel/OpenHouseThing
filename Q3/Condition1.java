package Q3;

/* WAP to display "You pass!!" when score is less than 49 
*  and "You fail" when score is more than 49
*  Given score = 60
*/
class Condition1 {
    public static void main(String[] args) {
        int score = 60;
        if (score > 49) {
            System.out.println("You pass!!");
        } 
        else {
            System.out.println("You fail ;-;");
        }
    }
}