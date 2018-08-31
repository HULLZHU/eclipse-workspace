import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class InvestmentValueCalculator extends Application {
	private GridPane pane = new GridPane();
	//labels
	private Label lbInvesetmentAmount = new Label("Investment Amount");
	private Label lbNumberOfYear = new Label("Number Of Year");
	private Label lbInterestRate = new Label("Annual Interest Rate");
	private Label lbFutureValue = new Label("Fture Value");
	//textFields
	private TextField tfAmount = new TextField();
	private TextField tfYears = new TextField();
	private TextField tfIR = new TextField();
	private TextField tfFutureValue = new TextField();
	//button
	private Button calculateButton = new Button("Calculate");
	//key parameters
	double investAmount;
	double numberOfYears;
	double annualInterestRate;
	double futureValue;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//set layout
		pane.setHgap(2);
		pane.setVgap(2);
		pane.add(lbInvesetmentAmount, 0, 0);
		pane.add(lbNumberOfYear, 0, 1);
		pane.add(lbInterestRate, 0, 2);
		pane.add(lbFutureValue, 0, 3);
		pane.add(tfAmount, 1, 0);
		pane.add(tfYears, 1, 1);
		pane.add(tfIR,1,2);
		pane.add(tfFutureValue, 1, 3);
		pane.add(calculateButton, 1, 4);
		pane.setAlignment(Pos.CENTER);
		tfFutureValue.setEditable(false);
		
		setButton();
		
		
		
		
		Scene scene = new Scene(pane,300,150);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

	private void setButton() {
		calculateButton.setOnAction(e ->{
			getInput();
			double result = investAmount*Math.pow(1+annualInterestRate/12, 12*numberOfYears);
			tfFutureValue.setText(result+"");
		});
		
	}

	private void getInput() {
		investAmount = Double.parseDouble(tfAmount.getText());
		numberOfYears = Double.parseDouble(tfYears.getText());
		annualInterestRate = Double.parseDouble(tfIR.getText());
	}
}
