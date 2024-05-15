/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 8: Lambda Operations on Stream
Topic:  Using IntStream, LongStream, DoubleStream;
*/

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.LongSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreams {
    public static void main(String[] args) {

        // Create a IntStream, using static method range
        // Second argument is exclusive
        IntSummaryStatistics intStats = IntStream.range(1, 10)
                .summaryStatistics();
        System.out.println(intStats);

        // Create LongStream, using static method rangeClosed
        // Second argument is inclusive
        LongSummaryStatistics longStats = LongStream.rangeClosed(1, 10)
                .summaryStatistics();
        System.out.println(longStats);

        // Create DoubleStream, using  iterate
        DoubleSummaryStatistics doubleStats =
                DoubleStream.iterate(1.0, s -> s < 10.0, s -> s + 1)
                        .summaryStatistics();
        System.out.println(doubleStats);
    }
}
/**
 IntSummaryStatistics{count=9, sum=45, min=1, average=5.000000, max=9}
 LongSummaryStatistics{count=10, sum=55, min=1, average=5.500000, max=10}
 DoubleSummaryStatistics{count=9, sum=45.000000, min=1.000000, average=5.000000, max=9.000000}

 */