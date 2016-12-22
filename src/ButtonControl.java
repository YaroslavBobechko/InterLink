
public class ButtonControl implements Drawable {

	@Override
	public void Draw() {
		System.out.println("Drawing button on canvas");
	}
	
	protected Command clickHandler;
	
	public void AttachClickHandler(Command command) {
		this.clickHandler = command;
	}
	
	public void DetachClickHandler() {
		this.clickHandler = null;
	}
	
	public void Click(Object parameter) {
		if (this.clickHandler != null) {
			clickHandler.Execute(parameter);
		}
	}
}
