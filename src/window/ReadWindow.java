package window;


public class ReadWindow extends WindowDecorator {

    public ReadWindow(BaseWindow wnd) {
        super(wnd);
    }

    @Override
    public void extend() {
        super.extend();
        wnd.activateReadingMode();
        System.out.println("Activated Read window!");
    }

}

