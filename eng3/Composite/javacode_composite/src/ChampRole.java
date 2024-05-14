public class ChampRole implements Champion{
    private String nome;
    private Boolean mage;
    private Boolean fighter;
    private Boolean support;

    public ChampRole(String nome, Boolean mage, Boolean fighter, Boolean support){
        this.nome = nome;
        this.mage= mage;
        this.fighter = fighter;
        this.support = support;
    }

    public String getnome(){
        return this.nome;
    }
    public Boolean getMage(){
        return this.mage;
    }
    public Boolean getFighter(){
        return this.fighter;
    }
    public Boolean getSupport(){
        return this.support;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setMage(Boolean mage){
        this.mage = mage;
    }
    public void setFighter(Boolean fighter){
        this.fighter = fighter;
    }
    public void setSupport(Boolean support){
        this.support = support;
    }

    @Override
    public void addInfo() {
        System.out.println("Esse Champion " + this.nome + "é Mage? " + this.mage + "e/ou é Fighter?" + this.fighter + "e/ou é Support?" + this.support);
    }
}

