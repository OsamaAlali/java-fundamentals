package inheritance;

import java.util.HashSet;
import java.util.Set;

public class Theater implements Zelp {
    String name;
    Set <String> moive;
   Set <Review> review;

    public Theater(String name) {
        this.name = name;
        review= new HashSet<Review>();
        moive=new HashSet<String>();
    }
 public void addMovie(String name){
        moive.add(name);
 }

    public void removeMovie(String name){
        moive.remove(name);
    }

    @Override
    public void addReview(Review review1) {
        review.add(review1);
    }
// TODO: 8/3/2021

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", moive=" + moive +
                ", review=" + review +
                '}';
    }
}
