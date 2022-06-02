package chapter1.lambda;

import java.io.BufferedReader;
import java.io.IOException;
/**
 * @author ericlee
 * @Classname BufferedReaderProcessor
 * @Description TODO
 * @Date 2020/8/21 13:18
 * @Created by ericlee
 */
@FunctionalInterface
public interface BufferedReaderProcessor {

    String process(BufferedReader br) throws IOException;
}






















