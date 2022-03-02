package ui.pagemodel.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import ui.pagemodel.pages.AbstractPage;
import ui.pagemodel.pages.CreateFlow;

import java.util.List;
import java.util.Map;

/**
 * Create Folder in EDAM.
 */
public class CreateFlowSteps extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(CreateFlowSteps.class);
    private final CreateFlow createFolderFlow = new CreateFlow();

    /**
     * User enters data in the form and save.
     * @param formDataTable to fill in selected operation.
     */
    @Then("user enters data in the form and save")
    public void userEntersDataInFolderCreationFormAndSave(DataTable formDataTable) {
        List<Map<String, String>> mapList = formDataTable.asMaps();
        boolean isClicked = createFolderFlow.enterDataAndSave(mapList);
        Assert.assertTrue(isClicked);
    }

    /**
     * user delete selected folder or file.
     * @param table taking from feature file
     */
    @And("user delete selected folder or asset")
    public void userDeleteSelectedFolderOrAsset(DataTable table) {
        List<Map<String, String>> mapList = table.asMaps();
        boolean isDeleted = createFolderFlow.deleteSelectedFolderOrAsset(mapList);
        Assert.assertTrue(isDeleted);
    }
}
