package wizard;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;
import utils.JedaiOptions;

public class WizardData {
    private final StringProperty erType = new SimpleStringProperty();
    private final StringProperty entityProfilesPath = new SimpleStringProperty();
    private final StringProperty entityProfilesD1Type = new SimpleStringProperty();
    private final StringProperty entityProfilesD2Path = new SimpleStringProperty();
    private final StringProperty entityProfilesD2Type = new SimpleStringProperty();
    private final StringProperty groundTruthPath = new SimpleStringProperty();
    private final StringProperty groundTruthType = new SimpleStringProperty();

    private final StringProperty blockBuilding = new SimpleStringProperty();
    private final StringProperty comparisonCleaningMethod = new SimpleStringProperty();
    private final ListProperty<String> blockCleaningMethods = new SimpleListProperty<>();

    private final StringProperty entityMatching = new SimpleStringProperty();
    private final StringProperty profileMatcherParam = new SimpleStringProperty();
    private final StringProperty representationModelParam = new SimpleStringProperty();

    private final StringProperty entityClustering = new SimpleStringProperty();

    public String getRepresentationModelParam() {
        return representationModelParam.get();
    }

    public StringProperty representationModelParamProperty() {
        return representationModelParam;
    }

    public void setRepresentationModelParam(String representationModelParam) {
        this.representationModelParam.set(representationModelParam);
    }

    public String getEntityProfilesD1Type() {
        return entityProfilesD1Type.get();
    }

    public StringProperty entityProfilesD1TypeProperty() {
        return entityProfilesD1Type;
    }

    public void setEntityProfilesD1Type(String entityProfilesD1Type) {
        this.entityProfilesD1Type.set(entityProfilesD1Type);
    }

    public String getEntityProfilesD2Type() {
        return entityProfilesD2Type.get();
    }

    public StringProperty entityProfilesD2TypeProperty() {
        return entityProfilesD2Type;
    }

    public void setEntityProfilesD2Type(String entityProfilesD2Type) {
        this.entityProfilesD2Type.set(entityProfilesD2Type);
    }

    public String getGroundTruthType() {
        return groundTruthType.get();
    }

    public StringProperty groundTruthTypeProperty() {
        return groundTruthType;
    }

    public void setGroundTruthType(String groundTruthType) {
        this.groundTruthType.set(groundTruthType);
    }

    public String getEntityProfilesD2Path() {
        return entityProfilesD2Path.get();
    }

    public StringProperty entityProfilesD2PathProperty() {
        return entityProfilesD2Path;
    }

    public void setEntityProfilesD2Path(String entityProfilesD2Path) {
        this.entityProfilesD2Path.set(entityProfilesD2Path);
    }

    public String getErType() {
        return erType.get();
    }

    public StringProperty erTypeProperty() {
        return erType;
    }

    public void setErType(String erType) {
        this.erType.set(erType);
    }

    public ObservableList<String> getBlockCleaningMethods() {
        return blockCleaningMethods.get();
    }

    public ListProperty<String> blockCleaningMethodsProperty() {
        return blockCleaningMethods;
    }

    public void setBlockCleaningMethods(ObservableList<String> blockCleaningMethods) {
        this.blockCleaningMethods.set(blockCleaningMethods);
    }

    public String getGroundTruthPath() {
        return groundTruthPath.get();
    }

    public StringProperty groundTruthPathProperty() {
        return groundTruthPath;
    }

    public void setGroundTruthPath(String groundTruthPath) {
        this.groundTruthPath.set(groundTruthPath);
    }

    public String getEntityProfilesPath() {
        return entityProfilesPath.get();
    }

    public StringProperty entityProfilesPathProperty() {
        return entityProfilesPath;
    }

    public void setEntityProfilesPath(String entityProfilesPath) {
        this.entityProfilesPath.set(entityProfilesPath);
    }

    public String getBlockBuilding() {
        return blockBuilding.get();
    }

    public StringProperty blockBuildingProperty() {
        return blockBuilding;
    }

    public void setBlockBuilding(String blockBuilding) {
        this.blockBuilding.set(blockBuilding);
    }

    public String getComparisonCleaningMethod() {
        return comparisonCleaningMethod.get();
    }

    public StringProperty comparisonCleaningMethodProperty() {
        return comparisonCleaningMethod;
    }

    public void setComparisonCleaningMethod(String comparisonCleaningMethod) {
        this.comparisonCleaningMethod.set(comparisonCleaningMethod);
    }

    public String getEntityMatching() {
        return entityMatching.get();
    }

    public StringProperty entityMatchingProperty() {
        return entityMatching;
    }

    public void setEntityMatching(String entityMatching) {
        this.entityMatching.set(entityMatching);
    }

    public String getEntityClustering() {
        return entityClustering.get();
    }

    public StringProperty entityClusteringProperty() {
        return entityClustering;
    }

    public void setEntityClustering(String entityClustering) {
        this.entityClustering.set(entityClustering);
    }

    public String getProfileMatcherParam() {
        return profileMatcherParam.get();
    }

    public StringProperty profileMatcherParamProperty() {
        return profileMatcherParam;
    }

    public void setProfileMatcherParam(String profileMatcherParam) {
        this.profileMatcherParam.set(profileMatcherParam);
    }

    public void reset() {
        // Reset block cleaning list
        blockCleaningMethodsProperty().clear();

        // Reset radio buttons
        blockBuildingProperty().setValue(JedaiOptions.STANDARD_TOKEN_BUILDING);
        comparisonCleaningMethodProperty().setValue(JedaiOptions.NO_CLEANING);
        entityMatchingProperty().setValue(JedaiOptions.GROUP_LINKAGE);
        profileMatcherParamProperty().setValue(JedaiOptions.REPRESENTATION);
        entityClusteringProperty().setValue(JedaiOptions.CENTER_CLUSTERING);
    }
}
