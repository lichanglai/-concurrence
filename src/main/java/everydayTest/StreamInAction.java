package everydayTest;

import model.Trader;
import model.Transaction;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: test
 * @Date: 2018/8/11 10:35
 * @Author: lichanglai
 * @Description:
 */
public class StreamInAction {
    private static final Log log = LogFactory.getLog(StreamInAction.class);

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");


        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        transactions.stream().filter(e -> e.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        System.out.println(transactions);

        transactions.stream().map(e -> e.getTrader().getCity())
                .distinct()
                .forEach(System.out::print);
        System.out.println("\n" + "=============================");

        transactions.stream()
                .map(Transaction::getTrader)
                .filter(t -> t.getCity().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::print);

        boolean anyMatch = transactions.stream().map(Transaction::getTrader).anyMatch(e -> e.getCity().equals("Cambridge"));
        System.out.println("\n" + anyMatch);
    }


}
