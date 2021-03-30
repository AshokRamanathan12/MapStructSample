package org.mapstructdemo.models;

import java.util.List;

public class EmployeeDto {

    private String employeeName;
    private EmployeeDto reportsTo;
    private List<EmployeeDto> team;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public EmployeeDto getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(EmployeeDto reportsTo) {
        this.reportsTo = reportsTo;
    }

    public List<EmployeeDto> getTeam() {
        return team;
    }

    public void setTeam(List<EmployeeDto> team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "employeeName='" + employeeName + '\'' +
                ", reportsTo=" + reportsTo +
                ", team=" + team +
                '}';
    }
}

