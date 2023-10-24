import java.util.List;
import java.util.ArrayList;
public class Agentur
{
    private Queue<Statist> statisten;
    public Agentur(){
        statisten = new Queue<>();
    }
    public void neuerStatist(String pName,Geschlecht pGeschl,int pScore){
        statisten.enqueue(new Statist(pName,pGeschl,pScore));
    }
    public Statist statistVermitteln(){
        Statist statist = statisten.front();
        statisten.dequeue(); 
        return statist;
    }
    public Queue<Statist> sortByScore()
    {
        Queue<Statist> save = statisten;
        List<Statist> sortiert = new ArrayList<>();        
        do{
            sortiert.add(statisten.front());
            statisten.dequeue();
        } while (!statisten.isEmpty());
        for (int i = 0; i < sortiert.size()-1;i++)
        {
            int max = 0;
            for (int j = i+1;i < sortiert.size();j++)
            {
                if (sortiert.get(i).getScore() < sortiert.get(j).getScore())
                {
                    max = j;
                }
            }
            Statist smallerScore = sortiert.get(i);
            sortiert.add(max,sortiert.get(i));
            sortiert.add(i,smallerScore);
        }
        Queue<Statist> QueueSortiert = new Queue<>();
        for (int i = 0;i < sortiert.size();i++)
        {
            QueueSortiert.enqueue(sortiert.get(i));
        }
        return QueueSortiert;
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
