package recursion;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class FactorialApp {
    public static int factorial(int n) {
        log.info("Entering: n=" + n);
        if (n == 0) {
            log.info("Returning 1");
            return 1;
        }
        int temp = n * factorial(n - 1);
        log.info("Returning:" + temp);
        return temp;
    }


}