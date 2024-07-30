package net.media.training.designpattern.adapter;

import net.media.training.designpattern.adapter.thirdparty.ThirdPartyLeaveRecord;

public class LeaveRecordAdapter implements LeaveRecord{
    private ThirdPartyLeaveRecord thirdPartyLeaveRecord;

    public LeaveRecordAdapter(ThirdPartyLeaveRecord thirdPartyLeaveRecord){
        this.thirdPartyLeaveRecord = thirdPartyLeaveRecord;
    }
    public String getMostAbsentEmployee(){
        String fullName = thirdPartyLeaveRecord.getMostAbsentEmployee().getName();
        String[] name = fullName.split(", ");
        fullName = name[1] + " " + name[0]; 
        return fullName;
    }
    public int getEmployeeAbsences(String employeeName){
        Employee employee = new Employee(employeeName);
        
        return thirdPartyLeaveRecord.getEmployeeAbsences(employee);
    }
}
