package window;

public class AddWindow extends WindowDecorator {
    
    public AddWindow(BaseWindow wnd) {
        super(wnd);
    }
    
    @Override
    public void extend() {
        super.extend();
        wnd.activateAddingMode();
        System.out.println("Activated Add window!");
    }
}

