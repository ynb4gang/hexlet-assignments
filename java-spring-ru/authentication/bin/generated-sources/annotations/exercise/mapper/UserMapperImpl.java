package exercise.mapper;

import exercise.dto.UserCreateDTO;
import exercise.dto.UserDTO;
import exercise.model.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-20T11:47:56+0300",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240524-2033, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl extends UserMapper {

    @Override
    public User map(UserCreateDTO dto) {
        encryptPassword( dto );

        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setEmail( dto.getEmail() );
        user.setName( dto.getName() );
        user.setPasswordDigest( dto.getPasswordDigest() );

        return user;
    }

    @Override
    public UserDTO map(User model) {
        if ( model == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setCreatedAt( model.getCreatedAt() );
        userDTO.setEmail( model.getEmail() );
        userDTO.setId( model.getId() );
        userDTO.setName( model.getName() );

        return userDTO;
    }
}
