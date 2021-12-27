package app;

import core.CapabilityBuilder;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class FrameworkApp {

    public static void main(String[] args){
        System.out.println("welcome to automation framework...");
    }

    /*********** public methods ***********/
    public void initFramework(){
        System.out.println("framework initiated");
    }
    public void terminateFramework(){
        System.out.println("stopping framework");
    }

}
