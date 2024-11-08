package base64encoder;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import java.io.IOException;

public class Base64ClassImportUtil {

    public static void main(String[] args) {
        try {
            // src 폴더 아래의 input.txt 파일 읽기
            String content = new String(Files.readAllBytes(Paths.get("src/base64encoder/input.txt")));

            // Base64 인코더와 디코더 생성
            Base64.Encoder encoder = Base64.getEncoder();
            Base64.Decoder decoder = Base64.getDecoder();

            // Base64 인코딩
            String encodedString = encoder.encodeToString(content.getBytes());

            // Base64 디코딩
            byte[] decodedBytes = decoder.decode(encodedString);
            String decodedString = new String(decodedBytes);

            // 결과 출력
//            System.out.println("원본 내용:");
//            System.out.println(content);
//            System.out.println("\n인코딩된 내용:");
            System.out.println(encodedString);
//            System.out.println("\n디코딩된 내용:");
//            System.out.println(decodedString);

            // 원본과 디코딩된 내용이 같은지 확인
//            System.out.println("\n원본과 디코딩된 내용이 일치" + (content.equals(decodedString) ? "합니다." : "하지 않습니다."));

        } catch (IOException e) {
            System.err.println("파일을 읽는 중 오류가 발생했습니다: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
