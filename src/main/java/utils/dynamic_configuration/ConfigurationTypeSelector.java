package utils.dynamic_configuration;

import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.scene.layout.VBox;
import utils.JedaiOptions;
import utils.RadioButtonHelper;

import java.util.List;

public class ConfigurationTypeSelector extends VBox {
    public ConfigurationTypeSelector(StringProperty modelProperty) {
        this.setSpacing(5.);

        // Create the radio buttons
        List<String> buttons = FXCollections.observableArrayList(
                JedaiOptions.DEFAULT_CONFIG,
                JedaiOptions.AUTOMATIC_CONFIG,
                JedaiOptions.MANUAL_CONFIG
        );

        RadioButtonHelper.createButtonGroup(this, buttons, modelProperty);
    }
}
