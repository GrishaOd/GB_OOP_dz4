package task3;

public class Entity implements PersonalData{

    private String name;

    private String inn;

    public Entity(String name, String inn) {
        this.name = name;
        this.inn = inn;
    }

    @Override
    public String getInn() {
        return null;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s; %s", name, inn);
    }
}
