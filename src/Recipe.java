import java.util.ArrayList;

public class Recipe {

    private String name;
    private String author;
    private String category;
    private String recipeDescription;
    private int likes;

    /**
     *
     * @param name
     * @param author
     * @param category
     * @param recipeDescription
     * @param likes
     */
    public Recipe(String name, String author, String category, String recipeDescription, int likes) {
        this.name = name;
        this.author = author;
        this.category = category;
        this.recipeDescription = recipeDescription;
        this.likes = likes;
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
    
    public int getLikes() {
        return likes;
    }

    public void setLikes(int val) {
        this.likes = val;
    }
    
    public void downloadRecipe() {}

}

