/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.5).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package grimsi.accservermanager.backend.api;

import grimsi.accservermanager.backend.dto.UserDto;
import grimsi.accservermanager.backend.dto.ErrorDto;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@javax.annotation.Generated(value = "grimsi.accservermanager.backend.codegen.v3.generators.java.SpringCodegen", date = "2019-03-10T17:37:16.729Z[GMT]")
@Api(value = "login", description = "the login API")
public interface LoginApi {

    @ApiOperation(value = "Authorize the client", nickname = "auth", notes = "", response = String.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "a JWT token", response = String.class),
        @ApiResponse(code = 500, message = "unexpected error", response = ErrorDto.class) })
    @RequestMapping(value = "/login",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<String> auth(@ApiParam(value = "A JSON object containing user credentials" ,required=true )  @Valid @RequestBody UserDto body);

}