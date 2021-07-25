import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Main {
    public static String pluralize(String name, int num){
        if ((num == 0) || (num > 1)) {
            return name + "s";
        } else {
            return name;
        }
    }// end function pluralize
    public  static void flipNHeads(int num) {
        int countFilp=0;
        int countHead=1;
        double random = 0.0;

            while (!(countHead>num)){
            random = Math.random();
            if (random >= 0.5) {
                System.out.println("heads");
                countHead++;
                countFilp++;
            } else if (random < 0.5) {
                System.out.println("tails");
                countHead=1;
                countFilp++;
            }

            }//End While
        System.out.println("It took "+ countFilp+" flips to flip " + num+" head in a row.");
    } //End flip

    public static void clock(){
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
// or, if you're feeling fancy
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(time);
       
     while (true){
         now = LocalDateTime.now();
         if (second != now.getSecond()){
             clock();
         }

     }




   }




    public static void main(String args[]) {
        System.out.println("Hello ALL");



        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(4);
          clock();
  }
}