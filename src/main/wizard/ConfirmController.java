package main.wizard;

import com.google.inject.Inject;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConfirmController {
    private Logger log = LoggerFactory.getLogger(ConfirmController.class);

    @FXML
    TextField tfField1, tfField2, tfField3, tfField4, tfField5, tfField6, tfField7;

    @Inject
    WizardData model;

    @FXML
    public void initialize() {
        tfField1.textProperty().bind(model.datasetProperty());
        tfField4.textProperty().bind(model.blockBuildingProperty());
        tfField5.textProperty().bind(model.blockProcessingProperty());
        tfField6.textProperty().bind(model.entityMatchingProperty());
    }

    @Submit
    public void submit() throws Exception {
        if (log.isDebugEnabled()) {
            log.debug("[SUBMIT] Running algorithm with specified parameters");
        }
    }
}
