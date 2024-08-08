package objectData;

public class WebTableObject extends GeneralObject {
    private String firstNameValue;
    private String lastNameValue;
    private String userEmailValue;
    private String ageValue;
    private String salaryValue;
    private String departmentValue;
    private String editSalaryValue;
    private String editDepartmentValue;

    public WebTableObject(String filePath) {
        fromJsonToObject(filePath);
    }

    public String getFirstNameValue() {
        return firstNameValue;
    }

    public void setFirstNameValue(String firstNameValue) {
        this.firstNameValue = firstNameValue;
    }

    public String getLastNameValue() {
        return lastNameValue;
    }

    public void setLastNameValue(String lastNameValue) {
        this.lastNameValue = lastNameValue;
    }

    public String getUserEmailValue() {
        return userEmailValue;
    }

    public void setUserEmailValue(String userEmailValue) {
        this.userEmailValue = userEmailValue;
    }

    public String getAgeValue() {
        return ageValue;
    }

    public void setAgeValue(String ageValue) {
        this.ageValue = ageValue;
    }

    public String getSalaryValue() {
        return salaryValue;
    }

    public void setSalaryValue(String salaryValue) {
        this.salaryValue = salaryValue;
    }

    public String getDepartmentValue() {
        return departmentValue;
    }

    public void setDepartmentValue(String departmentValue) {
        this.departmentValue = departmentValue;
    }

    public String getEditSalaryValue() {
        return editSalaryValue;
    }

    public void setEditSalaryValue(String editSalaryValue) {
        this.editSalaryValue = editSalaryValue;
    }

    public String getEditDepartmentValue() {
        return editDepartmentValue;
    }

    public void setEditDepartmentValue(String editDepartmentValue) {
        this.editDepartmentValue = editDepartmentValue;
    }
}