package class1.ex1;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReviw mickey = new MovieReviw();
        MovieReviw darkNuns = new MovieReviw();

        mickey.title = "미키";
        mickey.review = "재밌었음";

        darkNuns.title = "검은 수녀들";
        darkNuns.review = "흠";

        System.out.println(mickey.title);
        System.out.println(mickey.review);

        // 배열 쓴 풀이
        MovieReviw[] movieReviews = new MovieReviw[2];

        movieReviews[0] = mickey;
        movieReviews[1] = darkNuns;

        for (int i = 0; i < movieReviews.length; i++) {
            System.out.println(movieReviews[i].title);
            System.out.println(movieReviews[i].review);
        }



    }
}
