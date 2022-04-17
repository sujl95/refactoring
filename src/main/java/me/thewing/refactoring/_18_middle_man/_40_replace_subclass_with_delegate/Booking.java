package me.thewing.refactoring._18_middle_man._40_replace_subclass_with_delegate;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Booking {

    protected Show show;

    protected LocalDateTime time;

    protected PreminumDelegate preminumDelegate;

    public Booking(Show show, LocalDateTime time) {
        this.show = show;
        this.time = time;
    }

    public static Booking createBooking(Show show, LocalDateTime time) {
        return new Booking(show, time);
    }

    public static Booking createPremiumBooking(Show show, LocalDateTime time, PremiumExtra extra) {
        Booking booking = createBooking(show, time);
        booking.preminumDelegate = new PreminumDelegate(booking, extra);
        return booking;
    }

    public boolean hasTalkback() {
        return (this.preminumDelegate != null) ? this.preminumDelegate.hasTalkback() :
                this.show.hasOwnProperty("talkback") && !this.isPeakDay();
    }

    protected boolean isPeakDay() {
        DayOfWeek dayOfWeek = this.time.getDayOfWeek();
        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
    }

    public double basePrice() {
        double result = this.show.getPrice();
        if (this.isPeakDay()) result += Math.round(result * 0.15);
        return (this.preminumDelegate != null) ? this.preminumDelegate.extendBasePrice(result)
            : result;
    }

    public boolean hasDinner() {
        return this.preminumDelegate != null && this.preminumDelegate.hasDinner();
    }
}
