package Polimorphism.Animals;

public abstract class Animal {
    private String name;
    private String favoriteFood;

    protected Animal(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
    }

    public String explainSelf() {
        return "I am " + name + "and my favorite food is" + favoriteFood;
    }
}
