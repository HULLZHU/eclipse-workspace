import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class SimpleCalculator extends Application {
	//pane dataField
	private BorderPane pane = new BorderPane();
	private HBox showPane = new HBox(3);
	private HBox buttonPane = new HBox(5);
	//button dataField
	private Button addButton = new Button("ADD");
	private Button subButton = new Button("SUBTRACT");
	private Button multiButton = new Button("MULTIPLY");
	private Button divButton = new Button("DIVIDE");
	//label dataField
	private Label number1 = new Label("Number 1");
	private Label number2 = new Label("Number 2");
	private Label result = new Label("Result");
	//textField dataField
	private TextField field1 = new TextField("0");
	private TextField field2 = new TextField("0");
	private TextField field3 = new TextField();
	//define numbers
	private double  num1;
	private double num2;
	private double res;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//set main pane
		pane.setTop(showPane);
		pane.setBottom(buttonPane);
		showPane.getChildren().addAll(number1,field1,number2,field2,result,field3);
		//set TextFields
		field1.setPrefColumnCount(12);
		field2.setPrefColumnCount(12);
		field3.setPrefColumnCount(16);
		field3.setEditable(false);
		//set showPane
		showPane.setAlignment(Pos.CENTER);
		//set buttonPane
		buttonPane.getChildren().addAll(addButton,subButton,multiButton,divButton);
		buttonPane.setAlignment(Pos.CENTER);
		
		//start compute
		getInput();
		setButtons();
		
		
		Scene scene = new Scene (pane,900,70);
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void setButtons() {
		addButton.setOnAction(e->{
			try {
				getInput();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			res = num1 + num2;
			printResult();
			System.out.println(num1 +"+"+num2 +"="+res);
		});
		subButton.setOnAction(e->{
			try {
				getInput();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			res = num1 - num2;
			printResult();
			System.out.println(num1 +"-"+num2 +"="+res);
		});
		multiButton.setOnAction(e ->{
			try {
				getInput();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			res = num1 * num2;
			printResult();
			System.out.println(num1 +"*"+num2 +"="+res);
		});
		divButton.setOnAction(e->{
			try {
				getInput();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			res  = num1 / num2;
			printResult();
			System.out.println(num1 +"/"+num2 +"="+res);
		});
		
	}

	private void printResult() {
		field3.setText(res+"");
	}

	private void getInput() throws Exception {
			num1 = Double.parseDouble(field1.getText());
			num2 = Double.parseDouble(field2.getText());
	}


}
