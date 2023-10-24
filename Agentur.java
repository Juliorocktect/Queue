import java.util.List;
import java.util.ArrayList;
public class Agentur
{
    private Queue<Statist> statisten;
    public Agentur(){
        statisten = new Queue<>();
    }
    public void neuerStatist(String pName,Geschlecht pGeschl){
        statisten.enqueue(new Statist(pName,pGeschl,0));
    }
    public Statist statistVermitteln(){
        Statist statist = statisten.front();
        statisten.dequeue(); 
        return statist;
    }
    public Queue<Statist> sortByScore()
    {
        List<Statist> sortiert = new ArrayList<>();
        while(!statisten.isEmpty())
        {
            sortiert.add(statisten.front());
            statisten.dequeue();
        }
        for (int i = 0;i < sortiert.size();i++)
        {
            if(sortiert.get(i).getScore() > sortiert.get(i+1).getScore())
            {
                Statist tmp = sortiert.get(i);
                sortiert.set(sortiert.get(i),i+1);
                
            }
        }
        Queue<Statist> sortiert_queue = new Queue<>();
        return sortiert_queue;
    }
    public Queue<Statist> getStatisten(){return statisten;}
    public Statist statistVermitteln(Geschlecht pGeschlecht)
    {
        Statist gefunden = null;
        Queue<Statist> hilf = new Queue<>();
        boolean istGefunden = false;
        while(!statisten.isEmpty() || istGefunden)
        {
            if(statisten.front().getGeschlecht() == pGeschlecht)
            {
                gefunden = statisten.front();
                istGefunden = true;
            }
            else
            {
                hilf.enqueue(statisten.front());
            }
        }
        while(!statisten.isEmpty())
        {  
            hilf.enqueue(statisten.front());
            statisten.dequeue();
        }
        statisten = hilf;
        return gefunden;
    }
}
