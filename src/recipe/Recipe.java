package recipe;

public class Recipe {

    private String name;
    private String author;
    private String category;
    private String recipeDescription;

    public Recipe() {
    }

    public String getName() {
        return name;
    }

    public void setName(String val) {
        this.name = val;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String val) {
        this.author = val;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String val) {
        this.category = val;
    }

    public String getRecipeDescription() {
        return recipeDescription;
    }

    public void setRecipeDescription(String val) {
        this.recipeDescription = val;
    }
}
