package chapter1.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2020/8/21 13:31
 * @Created by ericlee
 */
public class Test {
    public static void main(String[] args) {
        try {
            String oneLine = processFile((BufferedReader br) -> br.readLine());
            String twoLine = processFile((BufferedReader br) -> br.readLine() +br.readLine());
            //String threeLine =  (BufferedReader br) -> br.readLine();

            Thread th = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("123");
                }
            });
            th.run();


        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String processFile(BufferedReaderProcessor p) throws IOException{
        /*try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            return p.process(br);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;*/

        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        return p.process(br);
    }

}
