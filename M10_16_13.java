package M10;


/*
 * Program name: M10_16_13.java
 * Author: Gabriel Dennett
 * Date: 04/08/20
 * Purpose: Display multiple payments
 * */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Date;

public class M10_16_13 extends Application{
	
	// textfields and button object declarations
	private TextField numberOfYears = new TextField();
	private TextField principleAmount = new TextField();
	private Text monthlyAmount1 = new Text();
	private Text monthlyAmount2 = new Text();
	private Text monthlyAmount3 = new Text();
	private Text monthlyAmount4 = new Text();
	private Text monthlyAmount5 = new Text();
	private Text monthlyAmount6 = new Text();
	private Text monthlyAmount7 = new Text();
	private Text monthlyAmount8 = new Text();
	private Text monthlyAmount9 = new Text();
	private Text totalAmount1 = new Text();
	private Text totalAmount2 = new Text();
	private Text totalAmount3 = new Text();
	private Text totalAmount4 = new Text();
	private Text totalAmount5 = new Text();
	private Text totalAmount6 = new Text();
	private Text totalAmount7 = new Text();
	private Text totalAmount8 = new Text();
	private Text totalAmount9 = new Text();
	private Text interest1 = new Text("5%");
	private Text interest2 = new Text("5.375%");
	private Text interest3 = new Text("5.75%");
	private Text interest4 = new Text("6.125%");
	private Text interest5 = new Text("6.5%");
	private Text interest6 = new Text("6.875%");
	private Text interest7 = new Text("7.25%");
	private Text interest8 = new Text("7.625%");
	private Text interest9 = new Text("8%");
	
	private Button btCalculate = new Button("Calculate");
	Text calculate = new Text();
	
	
	@Override
	public void start(Stage mainStage) {
		//object declarations
		GridPane pane = new GridPane();
		Button btCalculate = new Button("Calculate");
		
		pane.setVgap(10);
		pane.setHgap(10);
		
		
		// pane adjustments
		pane.setAlignment(Pos.CENTER);
		
		// pane labels and textfields
		pane.add(new Label("Principal:"), 0, 0);
		pane.add(principleAmount, 1, 0);
		pane.add(new Label("Amount of years:"), 0, 1);
		pane.add(numberOfYears, 1, 1);
		pane.add(btCalculate, 2, 1);
		
		pane.add(new Label("Monthly:"), 0, 3);
		pane.add(monthlyAmount1, 0, 4);
		pane.add(monthlyAmount2, 0, 5);
		pane.add(monthlyAmount3, 0, 6);
		pane.add(monthlyAmount4, 0, 7);
		pane.add(monthlyAmount5, 0, 8);
		pane.add(monthlyAmount6, 0, 9);
		pane.add(monthlyAmount7, 0, 10);
		pane.add(monthlyAmount8, 0, 11);
		pane.add(monthlyAmount9, 0, 12);
		
		pane.add(new Label("Total:"), 1, 3);
		pane.add(totalAmount1, 1, 4);
		pane.add(totalAmount2, 1, 5);
		pane.add(totalAmount3, 1, 6);
		pane.add(totalAmount4, 1, 7);
		pane.add(totalAmount5, 1, 8);
		pane.add(totalAmount6, 1, 9);
		pane.add(totalAmount7, 1, 10);
		pane.add(totalAmount8, 1, 11);
		pane.add(totalAmount9, 1, 12);
		
		
		interest1.setUnderline(true);
		interest2.setUnderline(true);
		interest3.setUnderline(true);
		interest4.setUnderline(true);
		interest5.setUnderline(true);
		interest6.setUnderline(true);
		interest7.setUnderline(true);
		interest8.setUnderline(true);
		interest9.setUnderline(true);
		
		pane.add(new Label("Interest:"), 2, 3);
		pane.add(interest1, 2, 4);
		pane.add(interest2, 2, 5);
		pane.add(interest3, 2, 6);
		pane.add(interest4, 2, 7);
		pane.add(interest5, 2, 8);
		pane.add(interest6, 2, 9);
		pane.add(interest7, 2, 10);
		pane.add(interest8, 2, 11);
		pane.add(interest9, 2, 12);
		
		
		/*
		btCalculate.setOnKeyPressed(e -> {
			if(e.getCode() == KeyCode.ENTER) {
				calculatePotentialAmount();
			}
		});
		*/
		
		
		// lambda event for clicking "Calculate" on GUI
		numberOfYears.setOnAction(e -> calculatePotentialAmount());
		btCalculate.setOnAction(e -> calculatePotentialAmount());
		
		
		
		
		// stage, scene and pane display
		Scene scene = new Scene(pane, 1000, 1000);
		mainStage.setTitle("Loan Calculator");
		mainStage.setScene(scene);
		mainStage.show();
}
	
	// method for lambda event btCalculate
	private void calculatePotentialAmount() {
		double interest = 5.00;
		int years = Integer.parseInt(numberOfYears.getText());
		double principle = Double.parseDouble(principleAmount.getText());
		Loan loan = new Loan(interest, years, principle);
		
		monthlyAmount1.setText(String.format("$%.2f", loan.getMonthlyPayment(interest)));
		totalAmount1.setText(String.format("$%.2f", loan.getTotalPayment(interest)));
		
		interest = 5.375;
		monthlyAmount2.setText(String.format("$%.2f", loan.getMonthlyPayment(interest)));
		totalAmount2.setText(String.format("$%.2f", loan.getTotalPayment(interest)));
		
		interest = 5.75;
		monthlyAmount3.setText(String.format("$%.2f", loan.getMonthlyPayment(interest)));
		totalAmount3.setText(String.format("$%.2f", loan.getTotalPayment(interest)));
		
		interest = 6.125;
		monthlyAmount4.setText(String.format("$%.2f", loan.getMonthlyPayment(interest)));
		totalAmount4.setText(String.format("$%.2f", loan.getTotalPayment(interest)));
		
		interest = 6.5;
		monthlyAmount5.setText(String.format("$%.2f", loan.getMonthlyPayment(interest)));
		totalAmount5.setText(String.format("$%.2f", loan.getTotalPayment(interest)));
		
		interest = 6.875;
		monthlyAmount6.setText(String.format("$%.2f", loan.getMonthlyPayment(interest)));
		totalAmount6.setText(String.format("$%.2f", loan.getTotalPayment(interest)));
		
		interest = 7.25;
		monthlyAmount7.setText(String.format("$%.2f", loan.getMonthlyPayment(interest)));
		totalAmount7.setText(String.format("$%.2f", loan.getTotalPayment(interest)));
		
		interest = 7.625;
		monthlyAmount8.setText(String.format("$%.2f", loan.getMonthlyPayment(interest)));
		totalAmount8.setText(String.format("$%.2f", loan.getTotalPayment(interest)));
		
		interest = 8.00;
		monthlyAmount9.setText(String.format("$%.2f", loan.getMonthlyPayment(interest)));
		totalAmount9.setText(String.format("$%.2f", loan.getTotalPayment(interest)));
	}

	public static void main(String[] args){
		Application.launch(args);
	}




class Loan{
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;
	
	
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate() {
		this.annualInterestRate = annualInterestRate;
	}
	
	public int getNumberOfYears() {
		return numberOfYears;
	}
	
	public void setNumberOfYears() {
		this.numberOfYears = numberOfYears;
	}
	
	public double getLoanAmount() {
		return loanAmount;
	}
	
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	public double getMonthlyPayment(double interest) {
		double monthlyInterestRate = interest / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 -(1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}
	
	public double getTotalPayment(double interest) {
		double totalPayment = getMonthlyPayment(interest) * numberOfYears * 12;
		return totalPayment;
	}
	
	public java.util.Date getLoanDate(){
		return loanDate;
	}
}
}
