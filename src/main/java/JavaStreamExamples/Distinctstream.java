package JavaStreamExamples;
import java.util.stream.Stream;
public class Distinctstream {

        public static void main(String[] args) {
            Stream.of("Uttam", "udbhav", "Vishal", "shruti", "Uttam", "shruti", "Vishal")
                    .distinct()
                    .forEach(System.out::println);
        }
    }

