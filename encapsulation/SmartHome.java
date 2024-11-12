package com.xworks.encapsulation;

public class SmartHome {

   
    private String homeOwnerName;
    private String address;
    private boolean isSecuritySystemArmed;
    private double currentIndoorTemperature;
    private double currentOutdoorTemperature;
    private int numberOfConnectedDevices;
    private double energyConsumptionToday; 
    private double waterConsumptionToday; 
    private boolean areLightsOn;
    private String thermostatMode; 
    private int smokeAlarmBatteryLevel;
    private boolean isGarageDoorOpen;
    private boolean isFrontDoorLocked;
    private boolean isMotionDetected;
    private double humidityLevel; 
    private String weatherCondition; 
    private int airPurifierStatus; 
    private String lastMaintenanceDate;
    private boolean isSprinklerSystemActive;
    private int solarPanelPowerOutput;
    
    public SmartHome(String homeOwnerName, String address, boolean isSecuritySystemArmed, double currentIndoorTemperature,
            double currentOutdoorTemperature, int numberOfConnectedDevices, double energyConsumptionToday,
            double waterConsumptionToday, boolean areLightsOn, String thermostatMode, int smokeAlarmBatteryLevel,
            boolean isGarageDoorOpen, boolean isFrontDoorLocked, boolean isMotionDetected, double humidityLevel,
            String weatherCondition, int airPurifierStatus, String lastMaintenanceDate, 
            boolean isSprinklerSystemActive, int solarPanelPowerOutput) {
    this.homeOwnerName = homeOwnerName;
    this.address = address;
    this.isSecuritySystemArmed = isSecuritySystemArmed;
    this.currentIndoorTemperature = currentIndoorTemperature;
    this.currentOutdoorTemperature = currentOutdoorTemperature;
    this.numberOfConnectedDevices = numberOfConnectedDevices;
    this.energyConsumptionToday = energyConsumptionToday;
    this.waterConsumptionToday = waterConsumptionToday;
    this.areLightsOn = areLightsOn;
    this.thermostatMode = thermostatMode;
    this.smokeAlarmBatteryLevel = smokeAlarmBatteryLevel;
    this.isGarageDoorOpen = isGarageDoorOpen;
    this.isFrontDoorLocked = isFrontDoorLocked;
    this.isMotionDetected = isMotionDetected;
    this.humidityLevel = humidityLevel;
    this.weatherCondition = weatherCondition;
    this.airPurifierStatus = airPurifierStatus;
    this.lastMaintenanceDate = lastMaintenanceDate;
    this.isSprinklerSystemActive = isSprinklerSystemActive;
    this.solarPanelPowerOutput = solarPanelPowerOutput;
}

	public String getHomeOwnerName() {
		return homeOwnerName;
	}

	public void setHomeOwnerName(String homeOwnerName) {
		this.homeOwnerName = homeOwnerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isSecuritySystemArmed() {
		return isSecuritySystemArmed;
	}

	public void setSecuritySystemArmed(boolean isSecuritySystemArmed) {
		this.isSecuritySystemArmed = isSecuritySystemArmed;
	}

	public double getCurrentIndoorTemperature() {
		return currentIndoorTemperature;
	}

	public void setCurrentIndoorTemperature(double currentIndoorTemperature) {
		this.currentIndoorTemperature = currentIndoorTemperature;
	}

	public double getCurrentOutdoorTemperature() {
		return currentOutdoorTemperature;
	}

	public void setCurrentOutdoorTemperature(double currentOutdoorTemperature) {
		this.currentOutdoorTemperature = currentOutdoorTemperature;
	}

	public int getNumberOfConnectedDevices() {
		return numberOfConnectedDevices;
	}

	public void setNumberOfConnectedDevices(int numberOfConnectedDevices) {
		this.numberOfConnectedDevices = numberOfConnectedDevices;
	}

	public double getEnergyConsumptionToday() {
		return energyConsumptionToday;
	}

	public void setEnergyConsumptionToday(double energyConsumptionToday) {
		this.energyConsumptionToday = energyConsumptionToday;
	}

	public double getWaterConsumptionToday() {
		return waterConsumptionToday;
	}

	public void setWaterConsumptionToday(double waterConsumptionToday) {
		this.waterConsumptionToday = waterConsumptionToday;
	}

	public boolean isAreLightsOn() {
		return areLightsOn;
	}

	public void setAreLightsOn(boolean areLightsOn) {
		this.areLightsOn = areLightsOn;
	}

	public String getThermostatMode() {
		return thermostatMode;
	}

	public void setThermostatMode(String thermostatMode) {
		this.thermostatMode = thermostatMode;
	}

	public int getSmokeAlarmBatteryLevel() {
		return smokeAlarmBatteryLevel;
	}

	public void setSmokeAlarmBatteryLevel(int smokeAlarmBatteryLevel) {
		this.smokeAlarmBatteryLevel = smokeAlarmBatteryLevel;
	}

	public boolean isGarageDoorOpen() {
		return isGarageDoorOpen;
	}

	public void setGarageDoorOpen(boolean isGarageDoorOpen) {
		this.isGarageDoorOpen = isGarageDoorOpen;
	}

	public boolean isFrontDoorLocked() {
		return isFrontDoorLocked;
	}

	public void setFrontDoorLocked(boolean isFrontDoorLocked) {
		this.isFrontDoorLocked = isFrontDoorLocked;
	}

	public boolean isMotionDetected() {
		return isMotionDetected;
	}

	public void setMotionDetected(boolean isMotionDetected) {
		this.isMotionDetected = isMotionDetected;
	}

	public double getHumidityLevel() {
		return humidityLevel;
	}

	public void setHumidityLevel(double humidityLevel) {
		this.humidityLevel = humidityLevel;
	}

	public String getWeatherCondition() {
		return weatherCondition;
	}

	public void setWeatherCondition(String weatherCondition) {
		this.weatherCondition = weatherCondition;
	}

	public int getAirPurifierStatus() {
		return airPurifierStatus;
	}

	public void setAirPurifierStatus(int airPurifierStatus) {
		this.airPurifierStatus = airPurifierStatus;
	}

	public String getLastMaintenanceDate() {
		return lastMaintenanceDate;
	}

	public void setLastMaintenanceDate(String lastMaintenanceDate) {
		this.lastMaintenanceDate = lastMaintenanceDate;
	}

	public boolean isSprinklerSystemActive() {
		return isSprinklerSystemActive;
	}

	public void setSprinklerSystemActive(boolean isSprinklerSystemActive) {
		this.isSprinklerSystemActive = isSprinklerSystemActive;
	}

	public int getSolarPanelPowerOutput() {
		return solarPanelPowerOutput;
	}

	public void setSolarPanelPowerOutput(int solarPanelPowerOutput) {
		this.solarPanelPowerOutput = solarPanelPowerOutput;
	}
	
	public void toggleLights(boolean turnOn) {
        areLightsOn = turnOn;
        if (areLightsOn) {
            System.out.println("The lights are now ON.");
        } else {
            System.out.println("The lights are now OFF.");
        }
    }
	public void toggleGarageDoor(boolean open) {
        isGarageDoorOpen = open;
        if (isGarageDoorOpen) {
            System.out.println("The garage door is now OPEN.");
        } else {
            System.out.println("The garage door is now CLOSED.");
        }
    }
	public void printdetails() {
		System.out.println("Owner name:" +homeOwnerName);
		System.out.println("address: " +address);
		System.out.println("security system armed: " +isSecuritySystemArmed);
		System.out.println("indoor temperature: " +currentIndoorTemperature);
		System.out.println(" current Outdoor Temperature: " + currentOutdoorTemperature);
		System.out.println(" number Of Connected Devices: " + numberOfConnectedDevices);
		System.out.println("energy Consumption Today: " +energyConsumptionToday);
		System.out.println("water Consumption Today:" +waterConsumptionToday);
		System.out.println("are Lights On: " +areLightsOn);
		System.out.println("thermo statMode: " +thermostatMode);
		System.out.println("smoke Alarm BatteryLevel: " +smokeAlarmBatteryLevel);
		System.out.println("is GarageDoor Open: " +isGarageDoorOpen);
		System.out.println("is FrontDoor Locked: " +isFrontDoorLocked);
		System.out.println("is Motion Detected: " +isMotionDetected);
		System.out.println("humidity Level: " +humidityLevel);
		System.out.println("weather Condition Owner : " +weatherCondition);
		System.out.println("air Purifier Status: " +airPurifierStatus);
		System.out.println("last Maintenance Date: " +lastMaintenanceDate);
		System.out.println("is Sprinkler System Active: " +isSprinklerSystemActive);
		System.out.println("solar PanelPowerOutput: " +solarPanelPowerOutput);
		
	}                                                         

  
     
    
}