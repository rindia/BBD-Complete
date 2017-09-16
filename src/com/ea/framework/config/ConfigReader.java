package com.ea.framework.config;

import com.ea.framework.base.BrowserType;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by Karthik-pc on 12/3/2016.
 */
public class ConfigReader {


    public static  void PopulateSettings() throws IOException {
        ConfigReader reader = new ConfigReader();
        reader.ReadProperty();
    }



    private void ReadProperty() throws IOException {
        //Create Property Object
        Properties p = new Properties();
        //Load the Property file available in same package
        p.load(getClass().getResourceAsStream("GlobalConfig.properties"));
        //Get AUTConnection String
        Settings.AUTConnectionString = p.getProperty("AUTConnectionString");
        //Get Reporting String
        Settings.ReportingConnectionString = p.getProperty("ReportingConnectionString");
        //Get LogPath
        Settings.LogPath = p.getProperty("LogPath");
        //Get DriverType
        Settings.DriverType = p.getProperty("DriverType");
        //GEt ExcelSheetPath
        Settings.ExcelSheetPath = p.getProperty("ExcelSheetPath");
        //Get AUT
        Settings.AUT = p.getProperty("AUT");
        //Browser Type
        Settings.BrowserType = BrowserType.valueOf(p.getProperty("BrowserType"));
    }

}
