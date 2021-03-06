package com.amenity_reservation_system.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ReservationDTO {

    private Long id;

    private LocalDate reservationDate;

    @Schema(type = "string", example = "14:30")
    private LocalTime startTime;

    @Schema(type = "string", example = "14:30")
    private LocalTime endTime;

    @NotNull
    private Long user;

}
