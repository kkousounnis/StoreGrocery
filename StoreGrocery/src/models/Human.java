package models;

public class Human {

    private String name;

    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Human{name=").append(name);
        sb.append('}');
        return sb.toString();
    }
    
    
}
