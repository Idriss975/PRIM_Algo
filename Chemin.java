import java.util.List;

public class Chemin{
    public List <Arret> Arrets;
    public List <Sommet> Sommets;
    public int Value;
    public Chemin()
    {

    }
    public Chemin(List <Arret> A)
    {
        this.Arrets=A;
        for(int i=0;i<Arrets.size();i++)
        {
            if(i==0)
            {
                this.Sommets.add(this.Arrets.get(0).sommets.get(0));
                this.Sommets.add(this.Arrets.get(0).sommets.get(1));
            }

            this.Sommets.add(this.Arrets.get(i).sommets.get(1));
        }
       
    }
    //fonction isCycle()
    boolean isCycle()
    {
        boolean result;
        
        
        for(int i=0;i<Sommets.size();i++)
        {
            String temp;
            temp=Sommets.get(0).nom;
            for(int j=0;j<Sommets.size();j++)
            {
                if(t[i]==t[j])
                {
                    j++;
                }
                if(temp == Sommets.get(i).nom)
                {

                }

            }
            
          

        }

        return result;
    }



        
    }