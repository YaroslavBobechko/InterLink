
public class Application {

	public static void main(String[] args) {
		Window mainWindow = new Window();
		mainWindow.AddGraphicalElement(new Rectangle());
		mainWindow.AddGraphicalElement(new Ellipse());
		
		ButtonControl btn = new ButtonControl();
		btn.AttachClickHandler(new Command() {
			@Override
			public void Execute(Object parameter) {
				System.out.println("Click was handled with parameter: " + parameter.toString());
				
			}
		});
		
		mainWindow.AddGraphicalElement(btn);
		
		mainWindow.Render();
		
		for (int i = 0; i < 10; i ++) {
			btn.Click(i);
		}
	}

}
