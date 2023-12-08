package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Test {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.naver.com");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");

            int resCode = conn.getResponseCode();
            System.out.println("resCode = " + resCode);

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            StringBuilder sb = new StringBuilder();

            while ((line = br.readLine()) != null) {
                sb.append(line);

            }

            br.close();

            System.out.println("HTTP 응답 내용 \n" + sb);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
