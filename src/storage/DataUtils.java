package storage;

import recipe.Recipe;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DataUtils implements Storage {

    private static final String DEFAULT_CSV_PATH = "/Users/byurhanbeyzat/Desktop/kitchen-pal/src/data/data.csv";
    private static final String DEFAULT_CSV_SEPERATOR = ",";

    @Override
    public ArrayList getData() {
        return readFromFile(DEFAULT_CSV_PATH, DEFAULT_CSV_SEPERATOR);
    }

    public void writeLine(ArrayList<Recipe> data) {
        writeToFile(data, DEFAULT_CSV_PATH, DEFAULT_CSV_SEPERATOR);
    }

    // Allows to define custom separator
    public ArrayList<Recipe> readFromFile(String fileName, String separator) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            ArrayList<Recipe> list = new ArrayList<>();
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] array = line.split(separator);
                Recipe newRecipe = new Recipe(array[0], array[1], array[2], array[3], Integer.parseInt(array[4]));
                list.add(newRecipe);
            }

            return list;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void writeToFile(ArrayList<Recipe> data, String fileName, String separator) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            StringBuilder sb = new StringBuilder();

            for (Recipe recipe : data) {
                sb.append(recipe.getName()).append(",");
                sb.append(recipe.getAuthor()).append(",");
                sb.append(recipe.getCategory()).append(",");
                sb.append(recipe.getRecipeDescription()).append(",");
                sb.append(Integer.toString(recipe.getLikes()));
                
                sb.append(System.lineSeparator());

                writer.append(sb);
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//        DataUtils db = new DataUtils();
//
//        ArrayList<Recipe> list = new ArrayList<>();
//        list.add(new Recipe("Example Recipe", "Sef Manchev", "Test description", "Dessert", 0));
//        
//        db.writeLine(list);
//    }
}
