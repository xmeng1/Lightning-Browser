package acr.browser.lightning.utils;

import junit.framework.Assert;

import org.junit.Test;

import java.util.regex.Pattern;

/**
 * Created by mengxin on 15/07/2017.
 */

public class PatternMatchTest {

    @Test
    public void testMatcher(){
        String url =  "http://www.dnvod.tv/upload/gaming/f46977401e7a4198a7570a451e8e1672.jpg";
        String url2 = "http://static.dnvod.tv/upload/gaming/59408cf049c543d699e337e5231b8ce7.jpg";

        String pattern1 = "http://www.dnvod.tv/upload/gaming.*";
        String pattern2 = "http://static.dnvod.tv/upload/gaming.*";

        boolean a1 = Pattern.matches(pattern1,url);
        Assert.assertEquals(true, a1);

        boolean a2 = Pattern.matches(pattern2,url2);
        Assert.assertEquals(true, a2);
    }
}
