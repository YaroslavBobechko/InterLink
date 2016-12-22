import java.util.ArrayList;
import java.util.List;

public class Window {
	protected List<Drawable> graphicalElements;
	
	public Window() {
		this.graphicalElements = new ArrayList<>();
	}
	
	public void AddGraphicalElement(Drawable item) {
		this.graphicalElements.add(item);
	}
	
	public void Render() {
		for (Drawable item : this.graphicalElements) {
			item.Draw();
		}
	}
}
