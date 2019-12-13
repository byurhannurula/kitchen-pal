package storage;

import recipe.Recipe;
import java.util.ArrayList;
import java.util.Comparator;

public class SortData implements Storage {

    DataUtils db;

    public SortData() {
        db = new DataUtils();
    }

    @Override
    public ArrayList getData() {
        ArrayList<Recipe> array = db.getData();
        array.sort(Comparator.comparing(Recipe::getName));

        return array;
    }

}
