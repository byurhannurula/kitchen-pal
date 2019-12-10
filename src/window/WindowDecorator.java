package window;

public class WindowDecorator implements Window {

    protected Window wnd;

    public WindowDecorator(Window wnd) {
        this.wnd = wnd;
    }

    public void extend() {
        wnd.extend();
    }

}

