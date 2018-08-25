import javafx.scene.paint.*;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class BinaryTree extends Pane {
private Color colorOfNodes =Color.GREEN;
private Color colorOfLine = Color.RED;
private Color colorOfText = Color.BLACK;
private int stepNumber = 10;
private double riskfreeRate = 0.06;
private double volatility = 0.1;
private double stockPrice = 10;
private double deltaT = 1.0/12;
private double u = Math.exp(Math.sqrt(deltaT)*volatility);
private double d = Math.exp(-Math.sqrt(deltaT)*volatility);
private double a = Math.exp(riskfreeRate*deltaT);
private double upProb = (a-d)/(u-d);
private Circle[][] nodes = new Circle[stepNumber][];
private int testTime = 100;

private double startPointY =stepNumber*40;
private double startPointX = 50;


public BinaryTree(double riskfreeRate,double volatility, double stockPrice,double deltaT,int stepNumber) {
	this.riskfreeRate = riskfreeRate;
	this.volatility = volatility;
	this.stockPrice = stockPrice;
	this.deltaT = deltaT;
	this.stepNumber = stepNumber;
    u = Math.exp(Math.sqrt(deltaT)*volatility);
    d = Math.exp(-Math.sqrt(deltaT)*volatility);
	a = Math.exp(riskfreeRate*deltaT);
	upProb = (a-d)/(u-d);
	nodes = new Circle[stepNumber][];
}

public double getRiskfreeRate() {
	return riskfreeRate;
}

public void setRiskfreeRate(double riskFreeRate) {
	this.riskfreeRate = riskFreeRate;
}

public double getVolatility() {
	return volatility;
}

public void setVolatility(double volatility) {
	this.volatility = volatility;
}

public double getStockPrice() {
	return stockPrice;
}

public void setStockPrice(double stockPrice) {
	this.stockPrice = stockPrice;
}

public double getDeltaT() {
	return deltaT;
}

public void setDeltaT(double deltaT) {
	this.deltaT = deltaT;
}



public void getSimulation() {
	addSummary();
	drawNodes();
	drawLines();
	addDescriptions();
}

private void addDescriptions() {
	
	
}

private void drawLines() {
	for ( int i = 0; i < stepNumber; i ++ ) {
		Line line = new Line();
		line.setStartX(nodes[i][i].getCenterX());
		line.setStartY(nodes[i][i].getCenterY());
		line.setEndX(nodes[stepNumber-1][i].getCenterX());
		line.setEndY(nodes[stepNumber-1][i].getCenterY());
		this.getChildren().add(line);
	}
	
	for ( int i = 0; i < stepNumber; i ++ ) {
		Line line = new Line();
		line.setStartX(nodes[i][0].getCenterX());
		line.setStartY(nodes[i][0].getCenterY());
		line.setEndX(nodes[stepNumber-1][stepNumber-i-1].getCenterX());
		line.setEndY(nodes[stepNumber-1][stepNumber-i-1].getCenterY());
		this.getChildren().add(line);
	}
	
	
	
	
}

public void setStartPoint(double x,double y) {
	this.startPointX =x;
	this.startPointY =y;
}

private void drawNodes() {
	
	for ( int i = 0; i < nodes.length ; i++) {
		nodes[i] = new Circle[i + 1];
		nodes[i][0] = new Circle();
		nodes[i][0].setCenterX(startPointX+60*i);
		nodes[i][0].setCenterY(startPointY-30*i);
		this.getChildren().add(nodes[i][0]);
		nodes[i][0].setRadius(10);
		nodes[i][0].setFill(colorOfNodes);
		for ( int j = 1; j <nodes[i].length; j ++ ) {
			nodes[i][j] = new Circle();
			nodes[i][j].setCenterX(nodes[i][0].getCenterX());
			nodes[i][j].setCenterY(nodes[i][0].getCenterY()+60*j);
			this.getChildren().add(nodes[i][j]);
			nodes[i][j].setRadius(10);
			nodes[i][j].setFill(colorOfNodes);
		}
	}
	
}

private void addSummary() {
	String string = "Risk Free Rate: "+ this.riskfreeRate+ "\nVolatility: "+this.getVolatility()+"\ndeltaT: "+this.deltaT+"\nu:"+this.u
			+"\nd:"+this.d+"\nupProb:"+this.upProb;
	Text text = new Text(this.startPointX-15,this.startPointY+30*stepNumber,string);
	this.getChildren().add(text);
}




}
