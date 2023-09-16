/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;

/**
 *
 * @author gauri
 */
public class Vehiclehistory {
    private ArrayList<Vehicle> history;
    private ArrayList<Vehicle> tmplst;
    private ArrayList<String> manflst;
    private LocalDateTime Updt;
    
    public Vehiclehistory(){
        this.history = new ArrayList<Vehicle>();
        this.tmplst= new ArrayList<Vehicle>();
        this.manflst = new ArrayList<String>();
    }

    public ArrayList<String> getManflst() {
        return manflst;
    }

    public void setManflst(ArrayList<String> manflst) {
        this.manflst = manflst;
    }

    public LocalDateTime getUpdt() {
        return Updt;
    }

    public void setUpdt(LocalDateTime Updt) {
        this.Updt = Updt;
    }
    
    

    public ArrayList<Vehicle> getTmplst() {
        return tmplst;
    }

    public void setTmplst(ArrayList<Vehicle> tmplst) {
        this.tmplst = tmplst;
    }

    public ArrayList<Vehicle> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Vehicle> history) {
        this.history = history;
    }
   public Vehicle addNewVehicles(){
       Vehicle newVehicles = new Vehicle();
       history.add(newVehicles);
       return newVehicles;
       
   }
   public int availveh(){
       int cnt1 = 0;
       for(Vehicle vehicle : history){
           if(vehicle.isAvail()){
               cnt1++;
           }
       }
       return cnt1;
   }
   public int unavailveh(){
       int cnt2 = 0;
       for(Vehicle vehicle: history){
           if(!vehicle.isAvail()){
               cnt2++;
           }
       }
       return cnt2;
       
   }
   public void firstveh(){
       int x=0;
       for(Vehicle vehicle : history){
           if(vehicle.isAvail() && x==0){
               tmplst.add(vehicle);
               x++;   
           }
       }
   }
   public void manfname(String Manf){
       for(Vehicle veh : history){
           if(Manf.equals(veh.getCompname())){
               tmplst.add(veh);
           }
       }
   }
   public void manfyear(int mfyr){
       for(Vehicle veh : history){
           if(mfyr==veh.getManfyear()){
               tmplst.add(veh);
           }
       }
   }
   public void seats(int noofseats){
       for(Vehicle veh : history){
           if(noofseats==veh.getSeats()){
               tmplst.add(veh);
           }
       }
   }
   
   public void serialno(String SrNo){
       for(Vehicle veh : history){
           if(SrNo.equals(veh.getSerialno())){
               tmplst.add(veh);
           }
       }
   }
   public void modelno(String MNo){
       for(Vehicle veh : history){
           if(MNo.equals(veh.getModelno())){
               tmplst.add(veh);
           }
       }
   }
   public void city(String cty){
       for(Vehicle veh : history){
           if(cty.equals(veh.getCity())){
               tmplst.add(veh);
           }
       }
   }
   public void expcert(){
       try{
       for(Vehicle veh : history){
       Date dt = new SimpleDateFormat("MM-dd-yyyy").parse(veh.getExpcert());
       Date sysDate = new Date();
       if(dt.compareTo(sysDate)<0){
           tmplst.add(veh);
       }
       }
   }
       catch(Exception x){
           System.out.println("No Vehicle");
       }
         
     }  
   
  

   public void TempClr(){
       tmplst.clear();
   }

   public ArrayList<String> UberAff(){
       for(Vehicle veh : history){
           if(veh.isUberaff()){
               manflst.add(veh.getCompname());
               manflst = (ArrayList) manflst.stream().distinct().collect(Collectors.toList());
               
           }
       }
      return manflst; 
   }
  public String UpDt(){
      String Updt = getUpdt().toString();
      return Updt;
   }

}