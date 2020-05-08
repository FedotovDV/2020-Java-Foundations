package recursion;
import lombok.extern.log4j.Log4j;


@Log4j
public class TriangleApp {

    public static int triangle(int n) {
        log.info("Entering: n=" + n);
        if (n == 1) {
            log.info("Returning 1");
            return 1;
        }
        int temp = n + triangle(n - 1);
        log.info("Returning:" + temp);
        return temp;
    }


}