import java.math.BigInteger;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimeStream {

    public Stream<Long> primeStream() {
        return Stream.iterate(2, n -> n + 1).map(BigInteger::valueOf).filter($ -> $.isProbablePrime(1))
                .mapToLong(BigInteger::longValue).boxed();
    }

    public LongStream primeLongStream() {
        return Stream.iterate(2, n -> n + 1).map(BigInteger::valueOf).filter($ -> $.isProbablePrime(1))
                .mapToLong(BigInteger::longValue);
    }

}
