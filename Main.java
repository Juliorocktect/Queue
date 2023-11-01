public class Main {
    public static void main(String[] args) {

        Agentur ag = new Agentur();
        ag.neuerStatist("asd", Geschlecht.MALE, 33);
        ag.neuerStatist("asd", Geschlecht.WEIBLICH, 983);
        ag.neuerStatist("asd", Geschlecht.MALE, 43);
        ag.neuerStatist("asd", Geschlecht.WEIBLICH, 5);
        ag.neuerStatist("asd", Geschlecht.MALE, 333);
        ag.neuerStatist("asd", Geschlecht.WEIBLICH, 324);
        ag.neuerStatist("asd", Geschlecht.MALE, 4543);
        ag.neuerStatist("asd", Geschlecht.MALE, 44);
        System.out.println(ag.statistVermitteln().getScore());
        System.out.println(ag.statistVermitteln().getScore());
        System.out.println(ag.statistVermitteln().getScore());
        System.out.println(ag.statistVermitteln().getScore());
        System.out.println(ag.statistVermitteln().getScore());
        System.out.println(ag.statistVermitteln().getScore());
        System.out.println(ag.statistVermitteln().getScore());
        System.out.println(ag.statistVermitteln().getScore());
        System.out.println("\n");
        while (!queue.isEmpty()) {
            System.out.println(queue.front().getScore());
            queue.dequeue();
        }
        /*
         * Queue<Integer> queue = new Queue<>();
         * System.out.println(queue.isEmpty());
         * queue.enqueue(23);
         * System.out.println(queue.isEmpty());
         * queue.enqueue(34);
         * System.out.println(queue.front());
         * queue.dequeue();
         * System.out.println(queue.front());
         * queue.dequeue();
         * System.out.println(queue.front());
         * System.out.println(queue.isEmpty());
         */

    }
}
