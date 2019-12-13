package window;

public class WindowDecorator implements Window {

    protected BaseWindow wnd;

    public WindowDecorator(BaseWindow wnd) {
        this.wnd = wnd;
    }

    @Override
    public void extend() {
        wnd.extend();
    }

}

