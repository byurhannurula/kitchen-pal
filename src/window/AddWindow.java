package window;

public class AddWindow extends WindowDecorator {

    public AddWindow(BaseWindow wnd) {
        super(wnd);
    }

    @Override
    public void renderWindow() {
        super.renderWindow();
        wnd.activateAddingMode();
    }
}
