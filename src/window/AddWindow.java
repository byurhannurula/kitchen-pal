package window;

public class AddWindow extends WindowDecorator {

    BaseWindow bw = new BaseWindow();
    
    public AddWindow(Window wnd) {
        super(wnd);
    }

    @Override
    public void extend() {
        super.extend();
//        super(this.bw.activateAddingMode());
        System.out.println("Activated Add window!");
    }

}

