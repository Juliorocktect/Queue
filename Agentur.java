
public class Agentur {
    private Queue<Statist> statisten;

    public Agentur() {
        statisten = new Queue<>();
    }

    public void neuerStatist(String pName, Geschlecht pGeschl, int pScore) {
        statisten.enqueue(new Statist(pName, pGeschl, pScore));
    }

    public Statist statistVermitteln() {
        Statist statist = statisten.front();
        statisten.dequeue();
        return statist;
    }

    public void sortByScore() {
        Statist maxStat;
        Queue<Statist> ergQ = new Queue<Statist>();
        Queue<Statist> hilfQ = new Queue<Statist>();
        while (!statisten.isEmpty()) {
            maxStat = statisten.front();
            statisten.dequeue();
            while (!statisten.isEmpty()) {
                if (statisten.front().getScore() < maxStat.getScore()) {
                    hilfQ.enqueue(maxStat);
                    maxStat = statisten.front();
                } else {
                    hilfQ.enqueue(statisten.front());
                }
                statisten.dequeue();
            }
            ergQ.enqueue(maxStat);
            statisten = hilfQ;
            hilfQ = new Queue<Statist>();
        }
        statisten = ergQ;
    }

    public void insertionSort() {
        Queue<Statist> ergQ = new Queue<>();
        Queue<Statist> hilfQ = new Queue<>();
        while(!statisten.isEmpty())
        {
            ergQ.enqueue(statisten.front());
            statisten.dequeue();
            Statist unsorttierterStatist = statisten.front();
            Statist vorne = ergQ.front();
            ergQ.dequeue();
            ergQ.enqueue(vorne);
            while (!ergQ.front().equals(vorne))
            {
                if (ergQ.front().getScore() > unsorttierterStatist.getScore()){
                    ergQ.enqueue(vorne);
                }
                ergQ.enqueue(ergQ.front());
                ergQ.dequeue();
            }
            statisten.dequeue();
            hilfQ.enqueue(statisten.front());
        }
        statisten = hilfQ;
        hilfQ = new Queue<>();
    }

    public Queue<Statist> getStatisten() {
        return statisten;
    }

    public Statist statistVermitteln(Geschlecht pGeschlecht) {
        Statist gefunden = null;
        Queue<Statist> hilf = new Queue<>();
        boolean istGefunden = false;
        while (!statisten.isEmpty() || istGefunden) {
            if (statisten.front().getGeschlecht() == pGeschlecht) {
                gefunden = statisten.front();
                istGefunden = true;
            } else {
                hilf.enqueue(statisten.front());
            }
        }
        while (!statisten.isEmpty()) {
            hilf.enqueue(statisten.front());
            statisten.dequeue();
        }
        statisten = hilf;
        return gefunden;
    }
}
