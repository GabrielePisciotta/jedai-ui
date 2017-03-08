package wizard;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;

public class WizardData {
    private final StringProperty erType = new SimpleStringProperty();
    private final StringProperty entityProfilesPath = new SimpleStringProperty();
    private final StringProperty groundTruthPath = new SimpleStringProperty();
    private final StringProperty blockBuilding = new SimpleStringProperty();
    private final StringProperty comparisonRefinementMethod = new SimpleStringProperty();
    private final ListProperty<String> blockProcessingMethods = new SimpleListProperty<>();
    private final StringProperty entityMatching = new SimpleStringProperty();
    private final StringProperty profileMatcherParam = new SimpleStringProperty();
    private final StringProperty entityClustering = new SimpleStringProperty();

    public String getErType() {
        return erType.get();
    }

    public StringProperty erTypeProperty() {
        return erType;
    }

    public void setErType(String erType) {
        this.erType.set(erType);
    }

    public ObservableList<String> getBlockProcessingMethods() {
        return blockProcessingMethods.get();
    }

    public ListProperty<String> blockProcessingMethodsProperty() {
        return blockProcessingMethods;
    }

    public void setBlockProcessingMethods(ObservableList<String> blockProcessingMethods) {
        this.blockProcessingMethods.set(blockProcessingMethods);
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

    public String getComparisonRefinementMethod() {
        return comparisonRefinementMethod.get();
    }

    public StringProperty comparisonRefinementMethodProperty() {
        return comparisonRefinementMethod;
    }

    public void setComparisonRefinementMethod(String comparisonRefinementMethod) {
        this.comparisonRefinementMethod.set(comparisonRefinementMethod);
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
        //todo: fix this
        entityProfilesPath.set("");
        groundTruthPath.set("");
        blockBuilding.set("");
        blockProcessingMethods.clear();
        comparisonRefinementMethod.set("");
        entityMatching.set("");
        entityClustering.set("");
        profileMatcherParam.set("");
    }
}
