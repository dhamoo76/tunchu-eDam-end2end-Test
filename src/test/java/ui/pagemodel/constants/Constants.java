package ui.pagemodel.constants;

/**
 * All application level ui.pagemodel.constants declared here.
 */
public final class Constants {

    /**
     * Constant class constructor.
     */
    private Constants() {
        //EMPTY
    }

    /**
     * HTML Target Cucumber reports path.
     */
    public static final String HTML_TARGET_CUCUMBER_REPORTS = "html:target/cucumber-reports/cucumber-pretty";

    /**
     * JSON target cucumber reports path.
     */
    public static final String JSON_TARGET_CUCUMBER_REPORTS_DEFAULT = "json:target/json-cucumber-reports/default/cukejson.json";

    /**
     * XML target TestNG cucumber reports path.
     */
    public static final String XML_TARGET_TESTNG_CUCUMBER_REPORTS = "testng:target/testng-cucumber-reports/cuketestng.xml";

    /**
     * TEMPORARY ASSET FILE.
     */
    public static final String TEMP_ASSET_FILE = System.getProperty("user.dir") + "/src/test/resources/mock.data/asset.jpeg";

    /**
     * Step definitions.
     */
    public static final String GLUE_STEPS = "ui.pagemodel.steps";

    /**
     * Create Button Folder Option.
     */
    public static final String CREATE_FOLDER_OPTION = "folder";

    /**
     * Breadcrumb Label Assets.
     */
    public static final String BREADCRUMB_LABEL_ASSETS = "Assets";

    /**
     * System username property.
     */
    public static final String TEST_USER_PROP_KEY = "edam.test.user";

    /**
     * System pass property.
     */
    public static final String TEST_PASS_PROP_KEY = "edam.test.pass";

    /**
     * Timeout short.
     */
    public static final long TIMEOUT_LONG = 3000;

    /**
     * Polling wait.
     */
    public static final long POLLING_LONG = 20000;

    /**
     * Timeout short.
     */
    public static final long TIMEOUT_SHORT = 1000;

    /**
     * Polling short.
     */
    public static final long POLLING_SHORT = 10000;

    /**
     * Robot timeout.
     */
    public static final int ROBOT_POLLING_LONG = 500;

}
