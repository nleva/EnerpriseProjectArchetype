#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dto.request;

import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ${package}.dto.UserDto;

@Data
@EqualsAndHashCode(callSuper=false)
@JsonTypeName("CUR")
public class CreateUserRequest extends UserDto{
}
