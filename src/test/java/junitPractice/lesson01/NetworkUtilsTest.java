package junitPractice.lesson01;

import junitPractice.lesson01.NetworkUtils;
import org.junit.Test;

public class NetworkUtilsTest {

    @Test(timeout = 1000)
        public void getConnectionShouldReturnFasterThenOneSecond(){
        NetworkUtils.getConnection();
    }
}
