package models;

public class GroceryStore {

    private String name;
    private Human owner;

    public GroceryStore() {
    }

    public GroceryStore(String name, Human owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GenerateStore{name=").append(name);
        sb.append(", owner=").append(owner);
        sb.append('}');
        return sb.toString();
    }

}
