/* Name: Phạm Đăng Quang - ITCSIU21147
 Purpose: The scale box is the white background around the box when you move it and Enter, the option will be triggered
*/
package menu.obj;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ScaleBox extends Rectangle {

	private boolean filled = false;
	
	public ScaleBox(int x, int y){
		super(10, 15, Color.TRANSPARENT);
		setTranslateX(x);
		setTranslateY(y);
		setStyle("-fx-stroke: white; fx-stroke-width: 1");
	}
	
	public boolean isFilled() {
		return this.filled;
	}
	
	public void setFilled(boolean value) {
		this.setFill(value ? Color.WHITE : Color.TRANSPARENT);
		this.filled = value;
	}
}
