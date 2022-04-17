package me.thewing.refactoring._18_middle_man._40_replace_subclass_with_delegate;

public class PreminumDelegate {

  private Booking host;
  private PremiumExtra extra;

  public PreminumDelegate(Booking host, PremiumExtra extra) {
    this.host = host;
    this.extra = extra;
  }

  public boolean hasTalkback() {
    return this.host.show.hasOwnProperty("talkback");
  }

  public double extendBasePrice(double result) {
    return Math.round(result + this.extra.getPremiumFee());
  }

  public boolean hasDinner() {
    return this.extra.hasOwnProperty("dinner") && !this.host.isPeakDay();
  }
}
