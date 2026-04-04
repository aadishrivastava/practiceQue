package dev.lpa;

import java.util.*;

public class Main414 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vehicle[] v=new Vehicle[4];
        for (int i = 0; i < 4; i++) {
            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            double cost=sc.nextDouble();
            sc.nextLine();
            String type=sc.nextLine();
            boolean isServiced=sc.nextBoolean();
            sc.nextLine();
            v[i]=new Vehicle(id,name,cost,type,isServiced);
        }
        String vehicleType=sc.nextLine();
        boolean isServiced=sc.nextBoolean();

        double avg=findAverageServiceCostByType(v,vehicleType);
        System.out.println(avg>0?avg:"No vehicles serviced");

        Vehicle[] v2=searchServicedVehicles(v,isServiced);
        if (v2==null){
            System.out.println("No vehicles serviced");
        }else{
            for (Vehicle vehicle : v2) {
                System.out.println(vehicle.getVehicleId());
            }
        }
    }
    public static double findAverageServiceCostByType(Vehicle[] v, String vehicleType){
        int count=0;
        double cost=0;
        for (int i = 0; i < v.length; i++) {
            if (v[i].getVehicleType().equalsIgnoreCase(vehicleType)){
                cost+=v[i].getServiceCost();
                count++;
            }
        }
        return count==0?0:cost/count;
    }
    public static Vehicle[] searchServicedVehicles(Vehicle[] v, boolean isServiced){
        List<Vehicle> list=new ArrayList<>();
        for (int i = 0; i < v.length; i++) {
            if(v[i].getIsServiced()==isServiced){
                list.add(v[i]);
            }
        }
        list.sort((a,b)->Double.compare(b.getServiceCost(),a.getServiceCost()));
        if(list.isEmpty()){
            return null;
        }
        return list.toArray(new Vehicle[0]);
    }

}

class Vehicle{
    private int vehicleId;
    private String vehicleName;
    private double serviceCost;
    private String vehicleType;
    private boolean isServiced;

    public Vehicle(int vehicleId, String vehicleName, double serviceCost, String vehicleType, boolean isServiced) {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.serviceCost = serviceCost;
        this.vehicleType = vehicleType;
        this.isServiced = isServiced;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public boolean getIsServiced() {
        return isServiced;
    }

    public void setServiced(boolean serviced) {
        isServiced = serviced;
    }
}
