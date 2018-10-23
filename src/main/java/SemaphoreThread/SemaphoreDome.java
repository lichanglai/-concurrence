package SemaphoreThread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @program: 线程池
 * @Date: 2018/8/24 17:21
 * @Author: lichanglai
 * @Description:
 */
public class SemaphoreDome {

    /**
     * 执行任务类，获取信号量和释放信号量
     */
    class SemaphoreRunnable implements Runnable {
        private Semaphore semaphore;//信号量
        private int user;//记录第几个用户

        public SemaphoreRunnable(Semaphore semaphore, int user) {
            this.semaphore = semaphore;
            this.user = user;
        }

        @Override
          public void run() {
            try {

                semaphore.acquire();//获取信号量的方法
                System.out.println("当前用户" + user + "进入窗口买票,准备买票。。。。。");
                Thread.sleep(Long.valueOf((long) Math.random() * 10000));
                System.out.println("当前用户" + user + "买票完成,准备离开。。。。。");
                Thread.sleep(Long.valueOf((long) Math.random() * 10000));
                System.out.println("当前用户" + user + "离开窗口。。。。。");
                semaphore.release();//释放信号量
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void execute() {
        //定义并发数
        final Semaphore semaphore = new Semaphore(3);
        //定义线程池 newCachedThreadPool一种
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 20; i++) {
            //执行买票
            executorService.execute(new SemaphoreRunnable(semaphore, i + 1));
        }
        executorService.shutdown();
    }

    public static void main(String[] args) {
        SemaphoreDome sb = new SemaphoreDome();
        sb.execute();
    }

}
