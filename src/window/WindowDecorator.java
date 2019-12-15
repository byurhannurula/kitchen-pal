package window;

import recipe.Recipe;

public class WindowDecorator implements Window {

    BaseWindow wnd = null;

    public WindowDecorator(BaseWindow wnd) {
        this.wnd = wnd;
    }

    @Override
    public void renderWindow() {
        wnd.renderWindow();
    }

    @Override
    public void getRecipeData(Recipe r) {
    }

}
