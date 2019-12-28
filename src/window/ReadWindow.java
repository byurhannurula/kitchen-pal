package window;

import recipe.Recipe;

public class ReadWindow extends WindowDecorator {

    public ReadWindow(BaseWindow wnd) {
        super(wnd);
    }

    @Override
    public void renderWindow() {
        super.renderWindow();
        wnd.activateReadingMode();
    }

    @Override
    public void getRecipeData(Recipe r) {
        wnd.setTitle("CookingPal - " + r.getName());
        wnd.setNameField(r.getName());
        wnd.setAuthorField(r.getAuthor());
        wnd.setCategoryField(r.getCategory());
        wnd.setDescriptionField(r.getRecipeDescription());
    }

}
