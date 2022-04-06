package me.thewing.refactoring._07_divergent_change._26_extract_class;

public class TelephoneNumber {

  private String areaCode;
  private String number;

  public TelephoneNumber(String areaCode, String number) {
    this.areaCode = areaCode;
    this.number = number;
  }

  public String getAreaCode() {
    return areaCode;
  }

  public String getNumber() {
    return number;
  }

  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  @Override
  public String toString() {
    return this.areaCode + " " + this.number;
  }
}