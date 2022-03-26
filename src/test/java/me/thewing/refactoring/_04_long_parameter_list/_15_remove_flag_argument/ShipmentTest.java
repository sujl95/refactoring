package me.thewing.refactoring._04_long_parameter_list._15_remove_flag_argument;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

class ShipmentTest {

    @Test
    void deliveryDate() {
        LocalDate placedOn = LocalDate.of(2021, 12, 15);
        Order orderFromWA = new Order(placedOn, "WA");

        Shipment shipment = new Shipment();
        assertEquals(placedOn.plusDays(1), shipment.rushDeliveryDate(orderFromWA));
        assertEquals(placedOn.plusDays(2), shipment.regularDeliveryDate(orderFromWA));
    }

}