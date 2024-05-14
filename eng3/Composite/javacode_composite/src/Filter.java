
public class Filter implements Champion {
    private List<Champion> champions;
    private String nome;

    public Filter(){
        this.champions = new ArrayList<>();
        this.nome = "";
    }

    @Override
    public void addInfo(){
        System.out.println("Champion Info:" + this.nome);
    }


    public void addChampion(Champion champions){
        champions.add(champion);
        this.nome += champion.getNome();
    }

    public List<Champion> getNome(){
        return champions;
    }

    @Override
    public String getNome(){
        return this.nome;
    }
}
