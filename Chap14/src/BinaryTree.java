import javafx.scene.paint.*;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.event.*;

public class BinaryTree extends Pane {
private Color colorOfNodes =Color.GREEN;
private Color colorOfLine = Color.RED;
private Color colorOfText = Color.BLACK;
private int stepNumber = 12;
private double riskfreeRate = 0.06;
private double volatility = 0.1;
private double stockPrice = 10;
private double deltaT = 1.0/12;
private double u = Math.exp(Math.sqrt(deltaT)*volatility);
private double d = Math.exp(-Math.sqrt(deltaT)*volatility);
private double a = Math.exp(riskfreeRate*deltaT);
private double upProb = (a-d)/(u-d);
private Circle[][] nodes = new Circle[stepNumber][];
private boolean lineVisible =true;
private double startPointY =stepNumber*50;
private double startPointX = 50;
private double [][] prices = new double[stepNumber][];
private double [] counts = new double[stepNumber];
private double totalHeight =800;
private int testNumber;
private Button enlargeNodes = new Button("Enlarge");
private Button shrinkNodes = new Button("Shrink");

public BinaryTree(double riskfreeRate,double volatility, double stockPrice,double deltaT,int stepNumber) {
	this.riskfreeRate = riskfreeRate;
	this.volatility = volatility;
	this.stockPrice = stockPrice;
	this.deltaT = deltaT;
	setStepNumber(stepNumber);
    u = Math.exp(Math.sqrt(deltaT)*volatility);
    d = Math.exp(-Math.sqrt(deltaT)*volatility);
	a = Math.exp(riskfreeRate*deltaT);
	upProb = (a-d)/(u-d);
	nodes = new Circle[stepNumber+1][];
	startPointY =stepNumber*50;
	startPointX = 50;
	prices = new double[stepNumber+1][];
	counts = new double[stepNumber+1];
	this.getChildren().add(enlargeNodes);
	this.getChildren().add(shrinkNodes);
	setEnlargeNodes();
	setShrinkNodes();
}
private void setShrinkNodes() {
	shrinkNodes.setLayoutX(enlargeNodes.getLayoutX() + 150);
	shrinkNodes.setOnAction((ActionEvent e)->{
		for ( int i = 0; i < nodes.length ; i ++ ) {
			for ( int j = 0; j < nodes[i].length ; j ++ ) {
				if (nodes[i][j].getRadius()>2)
				nodes[i][j].setRadius(nodes[i][j].getRadius()-1);
			}
		}
	});	
	
}
private void setEnlargeNodes() {
	enlargeNodes.setOnAction((ActionEvent e)->{
		for ( int i = 0; i < nodes.length ; i ++ ) {
			for ( int j = 0; j < nodes[i].length ; j ++ ) {
				nodes[i][j].setRadius(nodes[i][j].getRadius()+1);
			}
		}
	});	
}



public void setStepNumber(int stepNumber) {
	this.stepNumber = stepNumber;}
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


public void getSimulation(int testNumber) {
	this.testNumber = testNumber;
	addSummary();
	drawNodes();
	if (lineVisible)
	  drawLines();
	getPrices();
	
	//start test
	for ( int i = 0 ; i < testNumber ; i ++ ) {
		startTest();
	}
	//add the frequency text
	addFinalResultDescription();
	//add statistical bar charts
	addBars();
	
}
private void addBars() {
	double barWidth = 20;
	for (int i = 0; i < counts.length ;i ++ ) {
		double ratio =counts[i]/this.testNumber;
		double barHeight = totalHeight*ratio;
		Rectangle bar = new Rectangle();
		bar.setHeight(barWidth);
		bar.setWidth(barHeight);
		bar.setX(nodes[nodes.length-1][i].getCenterX()+100);
		bar.setY(nodes[nodes.length-1][i].getCenterY()-10);
		bar.setFill(Color.LIGHTGREEN);
		this.getChildren().add(bar);
	}
	
}
private void addFinalResultDescription() {
	for ( int i = 0 ; i < counts.length ; i ++ ) {
		Text text = new Text((int)counts[i]+"");
		text.setX(nodes[nodes.length-1][i].getCenterX()+30);
		text.setY(nodes[nodes.length-1][i].getCenterY()+5);
		this.getChildren().add(text);
	}
}
private void startTest() {
	int status = 0;
	for ( int i = 0 ; i < stepNumber  ; i ++ ) {
		double temp = Math.random();
		if ( temp >= upProb)
			status ++;
		else
			continue;
	}
	counts[status]++;
}

private void getPrices() {
	for ( int i = 0; i < prices.length ; i ++ ) {
		prices[i]  = new double[nodes[i].length];
		for ( int j = 0; j < prices[i].length; j++) {
			if ( i == 0 )
				prices[i][j]=stockPrice;
			else if ( j < prices[i].length - 1)
				prices[i][j]= prices[i - 1][j]*(1+volatility);
			else if ( j == prices[i].length -1)
				prices[i][j] = prices[i-1][j-1]/(1+volatility);
			
			Text priceText = new Text(Math.round(prices[i][j]*100)/(100.0)+"");
			priceText.setX(nodes[i][j].getCenterX()-15);
			priceText.setY(nodes[i][j].getCenterY()+15);
			this.getChildren().add(priceText);
		}
	}
	
}

private void drawLines() {
	for ( int i = 0; i < nodes.length; i ++ ) {
		Line line = new Line();
		line.setStartX(nodes[i][i].getCenterX());
		line.setStartY(nodes[i][i].getCenterY());
		line.setEndX(nodes[nodes.length-1][i].getCenterX());
		line.setEndY(nodes[nodes.length-1][i].getCenterY());
		this.getChildren().add(line);
	}
	
	for ( int i = 0; i < stepNumber; i ++ ) {
		Line line = new Line();
		line.setStartX(nodes[i][0].getCenterX());
		line.setStartY(nodes[i][0].getCenterY());
		line.setEndX(nodes[nodes.length-1][nodes.length-i-1].getCenterX());
		line.setEndY(nodes[nodes.length-1][nodes.length-i-1].getCenterY());
		this.getChildren().add(line);
	}
	
	
	
	
}

public void setStartPoint(double x,double y) {
	this.startPointX =x;
	this.startPointY =y;
}

public void setLineVisible(boolean visible) {
	lineVisible = visible;
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
	String string = "Risk Free Rate: "+ this.riskfreeRate*100+ "\nVolatility: "+this.getVolatility()+"\ndeltaT: "+this.deltaT+"\nu:"+this.u
			+"\nd:"+this.d+"\nupProb:"+this.upProb;
	Text text = new Text(this.startPointX-15,this.startPointY+30*stepNumber,string);
	this.getChildren().add(text);
}
}
