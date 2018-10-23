package SemaphoreThread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @program: test
 * @Date: 2018/10/22 14:58
 * @Author: lichanglai
 * @Description:
 */
public class ConcurrencyTest {

    //请求总数
    public static final int cl_total = 10000;
    //同时允许的并发数  并行
    private static final int cl_to = 200;

    public static AtomicLong cout = new AtomicLong(0);

    public static void main(String[] args) throws Exception{
        //创建pool线程池
        ExecutorService service = Executors.newCachedThreadPool();
        //每次允许的并发量
        final Semaphore semaphore = new Semaphore(cl_to);
        //总并发数
        final CountDownLatch countDownLatch = new CountDownLatch(cl_total);

        for (int i = 0; i < cl_total; i++) {
            //开启一个线程
            service.execute(() -> {
                try {
                    semaphore.acquire( );
                    add();
                    semaphore.release();
                } catch (Exception e) {

                }
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        service.shutdown();
        System.out.println(cout.get());
    }

    private static void add() {
        cout.incrementAndGet();
    }
}
