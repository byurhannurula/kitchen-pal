package window;


public class ReadWindow extends WindowDecorator {

    public ReadWindow(Window wnd) {
        super(wnd);
    }

    @Override
    public void extend() {
        super.extend();
        System.out.println("Activated Read window!");
    }

}

