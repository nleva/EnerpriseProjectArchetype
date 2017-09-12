#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.sendto.dto.Dto;

@Data
@EqualsAndHashCode(callSuper=false)
@JsonTypeName("UD")
public class UserDto extends Dto {
	long id;
	String login;
	String password;
}
