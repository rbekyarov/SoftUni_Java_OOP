package OOP_06_Exercise_Inheritance.P3PlayersAndMonsters;

public class MuseElf extends Elf {
    public MuseElf(String username, int level){
        super(username,level);
    }
    @Override
    public String toString() {
        return String.format("Type: %s Username: %s Level: %s", this.getClass().getName(),
                this.getUsername(),
                this.getLevel());
    }
}
