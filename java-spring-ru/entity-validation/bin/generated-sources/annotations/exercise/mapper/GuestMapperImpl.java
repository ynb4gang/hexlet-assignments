package exercise.mapper;

import exercise.dto.GuestCreateDTO;
import exercise.dto.GuestDTO;
import exercise.model.Guest;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-15T10:31:07+0300",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240524-2033, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class GuestMapperImpl extends GuestMapper {

    @Override
    public Guest map(GuestCreateDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Guest guest = new Guest();

        guest.setCardValidUntil( dto.getCardValidUntil() );
        guest.setClubCard( dto.getClubCard() );
        guest.setEmail( dto.getEmail() );
        guest.setName( dto.getName() );
        guest.setPhoneNumber( dto.getPhoneNumber() );

        return guest;
    }

    @Override
    public GuestDTO map(Guest model) {
        if ( model == null ) {
            return null;
        }

        GuestDTO guestDTO = new GuestDTO();

        guestDTO.setCardValidUntil( model.getCardValidUntil() );
        guestDTO.setClubCard( model.getClubCard() );
        guestDTO.setCreatedAt( model.getCreatedAt() );
        guestDTO.setEmail( model.getEmail() );
        guestDTO.setId( model.getId() );
        guestDTO.setName( model.getName() );
        guestDTO.setPhoneNumber( model.getPhoneNumber() );

        return guestDTO;
    }
}
