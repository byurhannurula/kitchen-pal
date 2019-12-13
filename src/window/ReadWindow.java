package window;

import recipe.Recipe;

public class ReadWindow extends WindowDecorator {

    public ReadWindow(BaseWindow wnd) {
        super(wnd);
    }

    @Override
    public void extend() {
        super.extend();
        wnd.activateReadingMode();
    }

    @Override
    public void getRecipeData(Recipe r) {
        wnd.setNameField(r.getName());
        wnd.setAuthorField(r.getAuthor());
        wnd.setCategoryField(r.getCategory());
        wnd.setDescriptionField(r.getRecipeDescription());
    }

}
