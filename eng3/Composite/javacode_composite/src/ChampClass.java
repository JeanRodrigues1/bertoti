public class ChampClass implements Champion{
    private String nome;
    private Boolean ranged;
    private Boolean melee;

    public ChampClass(String nome, Boolean ranged, Boolean melee){
        this.nome = nome;
        this.ranged = ranged;
        this.melee = melee;
    }

    public String getNome(){
        return this.nome;
    }
    public Boolean getRanged(){
        return this.ranged;
    }
    public Boolean getMelee(){
        return this.melee;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setRanged(Boolean ranged){
        this.ranged = ranged;
    }
    public void setMelee(Boolean melee){
        this.melee = melee;
    }

    @Override
    public void addInfo() {
        System.out.println("Esse Champion " + this.nome + "é melee? " + this.melee + "é ranged?" + this.ranged);
    }
}
