import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.application.*;

public class LoanCalculator extends GridPane{
	private Label annualInterestRate = new Label("Annual Interest Rate");
	private Label NumberOfYears = new Label("Number Of Years");
	private Label LoanAmount = new Label("Loan Amount");
	private Label MonthlyPayment = new Label("Monthly Payment");
	private Label totalPayment = new Label("Total Payment");
	private Button calculate = new Button("Calculate");
	private TextField tfAnnualInterestRate = new TextField();
	private TextField tfNumberOfYear = new TextField();
	private TextField tfLoanAmount = new TextField();
	private TextField tfMonthlyPayment = new TextField();
	private TextField tfTotalPayment = new TextField();
	private double annualIR;
	private double numberOfYear ;
	private double loanAmount ;
	
	public LoanCalculator() {
		this.setHgap(5);
		this.setVgap(5);
		this.add(annualInterestRate, 0, 0);
		this.add(NumberOfYears, 0, 1);
		this.add(LoanAmount, 0, 2);
		this.add(MonthlyPayment,0,3);
		this.add(totalPayment, 0, 4);
		this.add(calculate, 1, 5);
		this.add(tfAnnualInterestRate, 1, 0);
		this.add(tfNumberOfYear, 1, 1);
		this.add(tfLoanAmount, 1, 2);
		this.add(tfMonthlyPayment, 1, 3);
		this.add(tfTotalPayment, 1, 4);
		calculate.setOnAction(new CalculateHandler());
		this.setAlignment(Pos.CENTER);
		tfMonthlyPayment.setEditable(false);
		tfTotalPayment.setEditable(false);
	}
	
	class CalculateHandler implements EventHandler<ActionEvent>{
		@Override
		public void handle(ActionEvent e) {
			annualIR = Double.parseDouble(tfAnnualInterestRate.getText());
			numberOfYear = Double.parseDouble(tfNumberOfYear.getText());
			loanAmount = Double.parseDouble(tfLoanAmount.getText());
			double monthlyPayment = getMonthlyPayment();
			double totalPayment = getTotalPayment();
			tfMonthlyPayment.setText(monthlyPayment+"");
			tfTotalPayment.setText(totalPayment+"");
		}

		private double getTotalPayment() {
			return loanAmount+ loanAmount*annualIR*numberOfYear;
		}

		private double getMonthlyPayment() {
			return (loanAmount/(12*numberOfYear))+(loanAmount*annualIR/(12*numberOfYear));
		}
		
	}
	
}
