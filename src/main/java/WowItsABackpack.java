/*
 *
 */
import java.io.*;
import java.net.*;
import java.util.*;
public class WowItsABackpack {
    public static void main(String[] args) {
        String urlUsed = "http://erdani.com/tdpl/hamlet.txt";
        urlToString(urlUsed);
    }
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }
}
