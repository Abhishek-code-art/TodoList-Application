module JavaFx_TodoList_Application {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	
	opens com.abhishektiwari.todolist to javafx.graphics, javafx.fxml;
}
