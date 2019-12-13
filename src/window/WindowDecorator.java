package window;

import recipe.Recipe;

public class WindowDecorator implements Window {

    protected BaseWindow wnd;

    public WindowDecorator(BaseWindow wnd) {
        this.wnd = wnd;
    }

    @Override
    public void extend() {
        wnd.extend();
    }

    @Override
    public void getRecipeData(Recipe r) {
    }

}
