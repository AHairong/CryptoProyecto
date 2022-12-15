package gui;

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

import java.util.List;


public class raceChart extends Application {
	
	private List<Task> tasks;
	
	
	public RaceChartExample(List<Task> tasks) {
	    this.tasks = tasks;
	  }
	
	 @Override
	  public void start(Stage stage) {
	    // Create the chart
	    final CategoryAxis xAxis = new CategoryAxis();
	    final NumberAxis yAxis = new NumberAxis();
	    final LineChart<String, Number> lineChart = new LineChart<>(xAxis, yAxis);
	    // Create the scene and add the layout to the stage
	    Scene scene = new Scene(layout);
	    stage.setScene(scene);
	    stage.show();
	  }
	 
	 // Create the data for the chart
	    ObservableList<XYChart.Series<String, Number>> data =
	        FXCollections.observableArrayList();
	  
	    for (Task task : tasks) {
	        XYChart.Series<String, Number> series = new XYChart.Series<>();
	        series.setName(task.getName());
	        for (TaskData taskData : task.getData()) {
	          series.getData().add(new XYChart.Data<>(taskData.getDay(), taskData.getProgress()));
	        }
	        data.add(series);
	      }

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
	      stage.show();

	  

	}

	
