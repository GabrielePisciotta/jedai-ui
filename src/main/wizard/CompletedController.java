package main.wizard;

import com.google.inject.Inject;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CompletedController {
    public PieChart f1MeasurePie;
    public PieChart recallPie;
    public PieChart precisionPie;
    private Logger log = LoggerFactory.getLogger(ConfirmController.class);

    @Inject
    WizardData model;

    @FXML
    public void initialize() {
        ObservableList<PieChart.Data> pieChartData1 =
                FXCollections.observableArrayList(
                        new PieChart.Data("Grapefruit", 13),
                        new PieChart.Data("Oranges", 25),
                        new PieChart.Data("Plums", 10));

        ObservableList<PieChart.Data> pieChartData2 =
                FXCollections.observableArrayList(
                        new PieChart.Data("Grapefruit", 13),
                        new PieChart.Data("Oranges", 25),
                        new PieChart.Data("Plums", 10),
                        new PieChart.Data("Pears", 22),
                        new PieChart.Data("Apples", 30));

        ObservableList<PieChart.Data> pieChartData3 =
                FXCollections.observableArrayList(
                        new PieChart.Data("Plums", 10),
                        new PieChart.Data("Pears", 22),
                        new PieChart.Data("Apples", 30));

        f1MeasurePie.setData(pieChartData1);
        recallPie.setData(pieChartData2);
        precisionPie.setData(pieChartData3);
    }
}
