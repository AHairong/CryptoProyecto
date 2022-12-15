package gui;

public class raceChart {

	
	import javafx.application.Application;
	import javafx.collections.ObservableList;
	import javafx.geometry.Insets;
	import javafx.geometry.Pos;
	import javafx.scene.Scene;
	import javafx.scene.chart.CategoryAxis;
	import javafx.scene.chart.LineChart;
	import javafx.scene.chart.NumberAxis;
	import javafx.scene.chart.XYChart;
	import javafx.scene.control.Label;
	import javafx.scene.layout.VBox;
	import javafx.stage.Stage;

	public class RaceChartExample extends Application {

	  @Override
	  public void start(Stage stage) {
	    // Create the chart
	    final CategoryAxis xAxis = new CategoryAxis();
	    final NumberAxis yAxis = new NumberAxis();
	    final LineChart<String, Number> lineChart = new LineChart<>(xAxis, yAxis);

	    // Create the data for the chart
	    ObservableList<XYChart.Series<String, Number>> data =
	        FXCollections.observableArrayList();

	    // Add data for each task
	    XYChart.Series<String, Number> task1 = new XYChart.Series<>();
	    task1.setName("Task 1");
	    task1.getData().add(new XYChart.Data<>("Day 1", 10));
	    task1.getData().add(new XYChart.Data<>("Day 2", 20));
	    task1.getData().add(new XYChart.Data<>("Day 3", 30));
	    task1.getData().add(new XYChart.Data<>("Day 4", 40));
	    data.add(task1);

	    XYChart.Series<String, Number> task2 = new XYChart.Series<>();
	    task2.setName("Task 2");
	    task2.getData().add(new XYChart.Data<>("Day 1", 20));
	    task2.getData().add(new XYChart.Data<>("Day 2", 10));
	    task2.getData().add(new XYChart.Data<>("Day 3", 40));
	    task2.getData().add(new XYChart.Data<>("Day 4", 30));
	    data.add(task2);

	    // Set the data for the chart
	    lineChart.setData(data);

	    // Create a label for the chart
	    Label label = new Label("Race Chart Example");

	    // Create a layout for the chart and label
	    VBox layout = new VBox(10);
	    layout.setPadding(new Insets(10, 10, 10, 10));
	    layout.setAlignment(Pos.CENTER);
	    layout.getChildren().addAll(label, lineChart);

	    // Create the scene and add the layout to the stage
	    Scene scene = new Scene(layout);
	    stage.setScene(scene);
	    stage.

}
