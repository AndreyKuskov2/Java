package fa.ru.exam.task40;

public class Main {
    public static void main(String[] args) {
        Thread timeThread = new Thread(new TimeRunnable());
        Thread messageThread1 = new Thread(new MessageRunnable("Поток 1"));
        Thread messageThread2 = new Thread(new MessageRunnable("Поток 2"));

        timeThread.start();
        messageThread1.start();
        messageThread2.start();

        try {
            // Ожидаем одну минуту
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Останавливаем потоки
        timeThread.interrupt();
        messageThread1.interrupt();
        messageThread2.interrupt();
    }

    static class TimeRunnable implements Runnable {
        @Override
        public void run() {
            try {
                int seconds = 0;
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println("Прошло времени: " + seconds + " секунд");
                    seconds += 5;
                    Thread.sleep(5000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    static class MessageRunnable implements Runnable {
        private String message;

        public MessageRunnable(String message) {
            this.message = message;
        }

        @Override
        public void run() {
            try {
                int seconds = 0;
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println(message + ": Сообщение после " + seconds + " секунд");
                    seconds += 7;
                    Thread.sleep(7000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
