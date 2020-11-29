public class Player {
    private int atk;
    private int def;
    private int life;
    private String name;
    public Player(){};
    public Player(int atk,int def,String name,int life){
        this.setAtk(atk);
        this.setDef(def);
        this.setName(name);
        this.setLife(life);
    }
    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getAtk() {
        return atk;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getDef() {
        return def;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setLife(int life) {
        this.life = life;
    }

    public int getLife() {
        return life;
    }

}
