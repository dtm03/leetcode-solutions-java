import java.util.List;
import java.util.stream.Collectors;

public class BinaryStream {

    public List<String> binaryStrings(int min, int max) {
        return java.util.stream.IntStream.rangeClosed(min, max)
                .mapToObj(Integer::toBinaryString)
                // .mapToObj(x -> Integer.toBinaryString(x))
                .collect(Collectors.toList());
    }
}
