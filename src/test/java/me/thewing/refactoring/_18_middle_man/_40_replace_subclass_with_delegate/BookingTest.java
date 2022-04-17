package me.thewing.refactoring._18_middle_man._40_replace_subclass_with_delegate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import org.junit.jupiter.api.Test;

class BookingTest {

    @Test
    void talkback() {
        Show noTalkbackShow = new Show(List.of(), 120);
        Show talkbackShow = new Show(List.of("talkback"), 120);
        LocalDateTime nonPeekady = LocalDateTime.of(2022, 1, 20, 19, 0);
        LocalDateTime peekady = LocalDateTime.of(2022, 1, 15, 19, 0);

        assertFalse(Booking.createBooking(noTalkbackShow, nonPeekady).hasTalkback());
        assertTrue(Booking.createBooking(talkbackShow, nonPeekady).hasTalkback());
        assertFalse(Booking.createBooking(talkbackShow, peekady).hasTalkback());

        PremiumExtra premiumExtra = new PremiumExtra(List.of(), 50);
        assertTrue(Booking.createPremiumBooking(talkbackShow, peekady, premiumExtra).hasTalkback());
        assertFalse(Booking.createPremiumBooking(noTalkbackShow, peekady, premiumExtra).hasTalkback());
    }

    @Test
    void basePrice() {
        Show lionKing = new Show(List.of(), 120);
        LocalDateTime weekday = LocalDateTime.of(2022, 1, 20, 19, 0);

        Booking booking = Booking.createBooking(lionKing, weekday);
        assertEquals(120, booking.basePrice());

        Booking premium = Booking.createPremiumBooking(lionKing, weekday, new PremiumExtra(List.of(), 50));
        assertEquals(170, premium.basePrice());
    }

    @Test
    void basePrice_on_peakDay() {
        Show lionKing = new Show(List.of(), 120);
        LocalDateTime weekend = LocalDateTime.of(2022, 1, 15, 19, 0);

        Booking booking = Booking.createBooking(lionKing, weekend);
        assertEquals(138, booking.basePrice());

        Booking premium = Booking.createPremiumBooking(lionKing, weekend, new PremiumExtra(List.of(), 50));
        assertEquals(188, premium.basePrice());
    }

    @Test
    void hasDinner() {
        Show lionKing = new Show(List.of(), 120);
        LocalDateTime weekday = LocalDateTime.of(2022, 1, 20, 19, 0);
        LocalDateTime weekend = LocalDateTime.of(2022, 1, 15, 19, 0);
        PremiumExtra premiumExtra = new PremiumExtra(List.of("dinner"), 50);

        assertTrue(Booking.createPremiumBooking(lionKing, weekday, premiumExtra).hasDinner());
        assertFalse(Booking.createPremiumBooking(lionKing, weekend, premiumExtra).hasDinner());
    }

}