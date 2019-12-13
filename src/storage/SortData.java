package storage;

import recipe.Recipe;
import java.util.ArrayList;
import java.util.Collections;

public class SortData implements Storage {
    
    DataUtils dt;

    public SortData () {
        dt = new DataUtils();
    }

    @Override
    public ArrayList getData () {
        ArrayList<Recipe> unsorted = dt.getData();
        Collections.sort(unsorted);
        return unsorted;
    }

}

