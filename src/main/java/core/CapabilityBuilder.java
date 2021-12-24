package core;

import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilityBuilder {

    /**
     * Which automation engine to use
     * Appium (default), or UiAutomator2, Espresso, or UiAutomator1 for Android,
     * or XCUITest or Instruments for iOS, or YouiEngine for application built with You.i Engine
     */
    private String automationName = "Appium";


    /**
     * Which mobile OS platform to use ex- iOS, Android, or FirefoxOS
     */
    private String platformName;

    /**
     * Mobile OS version e.g., 7.1, 4.4
     */
    private String platformVersion;

    /**
     * The kind of mobile device or emulator to use
     * iPhone Simulator, iPad Simulator, iPhone Retina 4-inch,
     * Android Emulator, Galaxy S4, etc.... On iOS, this should be one of
     * the valid devices returned by instruments with instruments -s devices or
     * xctrace with xcrun xctrace list devices (since Xcode 12). On Android this
     * capability is currently ignored, though it remains required.
     */
    private String deviceName;

    /**
     * The absolute local path or remote http URL to a .ipa file (IOS), .app folder (IOS Simulator),
     * .apk file (Android) or .apks file (Android App Bundle), or a .zip file containing one of these.
     */
    private String appPath;

    /**
     * App or list of apps
     */
    private String[] otherApps;

    /**
     * Name of mobile web browser to automate. Should be an empty string if automating an app instead
     */
    private String browserName = "";

    /**
     * How long (in seconds) Appium will wait for a new command from the client before assuming the client
     * quit and ending the session
     */
    private int newCommandTimeout;

    /**
     * Language to set for iOS (XCUITest driver only) and Android.
     */
    private String language = "en";

    /**
     * Locale to set for iOS (XCUITest driver only) and Android.
     * fr_CA format for iOS. CA format (country name abbreviation) for Android
     */
    private String locale;

    /**
     * Unique device identifier of the connected physical device
     */
    private String deviceUdid;

    /**
     * (Sim/Emu-only) start in a certain orientation
     * LANDSCAPE or PORTRAIT
     */
    private String orientation;

    /**
     * Move directly into Webview context. Default false
     */
    private boolean autoWebview;

    /**
     * Don't reset app state before this session. See here for more details
     */
    private boolean noReset;

    /**
     * Perform a complete reset. See here for more details
     */
    private boolean fullReset;

    /**
     * Enable or disable the reporting of the timings for various Appium-internal events
     * (e.g., the start and end of each command, etc.). Defaults to false. To enable, use true.
     * The timings are then reported as events property on response to querying the current session.
     * See the event timing docs for the the structure of this response.
     */
    private boolean eventTimings;

    /**
     * (Web and webview only) Enable Chromedriver's (on Android) or Safari's (on iOS) performance
     * logging (default false)
     */
    private boolean enablePerformanceLogging;

    /**
     * When a find operation fails, print the current page source. Defaults to false
     */
    private boolean printPageSourceOnFindFailure;

    /**
     * Delete any generated files at the end of a session. Default to false
     */
    private boolean clearSystemFiles;


    //Property Methods

    public CapabilityBuilder setAutomationName(String automationName) {
        this.automationName = automationName;
        return this;
    }

    public CapabilityBuilder setPlatformName(String platformName) {
        this.platformName = platformName;
        return this;
    }

    public CapabilityBuilder setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }

    public CapabilityBuilder setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    public CapabilityBuilder setAppPath(String appPath) {
        this.appPath = appPath;
        return this;
    }

    public CapabilityBuilder setOtherApps(String[] otherApps) {
        this.otherApps = otherApps;
        return this;
    }

    public CapabilityBuilder setBrowserName(String browserName) {
        this.browserName = browserName;
        return this;
    }

    public CapabilityBuilder setNewCommandTimeout(int newCommandTimeout) {
        this.newCommandTimeout = newCommandTimeout;
        return this;
    }

    public CapabilityBuilder setLanguage(String language) {
        this.language = language;
        return this;
    }

    public CapabilityBuilder setLocale(String locale) {
        this.locale = locale;
        return this;
    }

    public CapabilityBuilder setDeviceUdid(String deviceUdid) {
        this.deviceUdid = deviceUdid;
        return this;
    }

    public CapabilityBuilder setOrientation(String orientation) {
        this.orientation = orientation;
        return this;
    }

    public CapabilityBuilder setAutoWebview(boolean autoWebview) {
        this.autoWebview = autoWebview;
        return this;
    }

    public CapabilityBuilder setNoReset(boolean noReset) {
        this.noReset = noReset;
        return this;
    }

    public CapabilityBuilder setFullReset(boolean fullReset) {
        this.fullReset = fullReset;
        return this;
    }

    public CapabilityBuilder setEventTimings(boolean eventTimings) {
        this.eventTimings = eventTimings;
        return this;
    }

    public CapabilityBuilder setEnablePerformanceLogging(boolean enablePerformanceLogging) {
        this.enablePerformanceLogging = enablePerformanceLogging;
        return this;
    }

    public CapabilityBuilder setPrintPageSourceOnFindFailure(boolean printPageSourceOnFindFailure) {
        this.printPageSourceOnFindFailure = printPageSourceOnFindFailure;
        return this;
    }

    public CapabilityBuilder setClearSystemFiles(boolean clearSystemFiles) {
        this.clearSystemFiles = clearSystemFiles;
        return this;
    }

    public DesiredCapabilities build(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityMapper.AUTOMATION_NAME, this.automationName);
        capabilities.setCapability(CapabilityMapper.PLATFORM_NAME, this.automationName);
        capabilities.setCapability(CapabilityMapper.PLATFORM_VERSION, this.automationName);
        capabilities.setCapability(CapabilityMapper.DEVICE_NAME, this.automationName);
        capabilities.setCapability(CapabilityMapper.APP_Path, this.automationName);
        capabilities.setCapability(CapabilityMapper.OTHER_APPS, this.automationName);
        capabilities.setCapability(CapabilityMapper.BROWSER_NAME, this.automationName);
        capabilities.setCapability(CapabilityMapper.NEW_COMMAND_TIMEOUT, this.automationName);
        capabilities.setCapability(CapabilityMapper.LANGUAGE, this.automationName);
        capabilities.setCapability(CapabilityMapper.LOCALE, this.automationName);
        capabilities.setCapability(CapabilityMapper.DEVICE_UDID, this.automationName);
        capabilities.setCapability(CapabilityMapper.ORIENTATION, this.automationName);
        capabilities.setCapability(CapabilityMapper.AUTO_WEB_VIEW, this.automationName);
        capabilities.setCapability(CapabilityMapper.NO_RESET, this.automationName);
        capabilities.setCapability(CapabilityMapper.FULL_RESET, this.automationName);
        capabilities.setCapability(CapabilityMapper.EVENT_TIMINGS, this.automationName);
        capabilities.setCapability(CapabilityMapper.ENABLE_PERFORMANCE_LOGGING, this.automationName);
        capabilities.setCapability(CapabilityMapper.PRINT_PAGE_SOURCE_ON_FIND_FAILURE, this.automationName);
        capabilities.setCapability(CapabilityMapper.CLEAR_SYSTEM_FILES, this.automationName);
        return capabilities;
    }
}
