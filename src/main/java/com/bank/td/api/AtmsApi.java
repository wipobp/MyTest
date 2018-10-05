package com.bank.td.api;

import com.bank.td.model.InlineResponse200;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-10-05T08:09:56.577Z")

@Api(value = "atms", description = "the atms API")
public interface AtmsApi {

    @ApiOperation(value = "Get ATMs", notes = "Read from DB", response = InlineResponse200.class, tags={ "ATM_APIs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = InlineResponse200.class) })
    @RequestMapping(value = "/atms",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<InlineResponse200> 10(@ApiParam(value = "Lat") @RequestParam(value = "lat", required = false) String lat



,@ApiParam(value = "Long") @RequestParam(value = "lon", required = false) String lon



,@ApiParam(value = "Redius in Meter") @RequestParam(value = "redius", required = false) Integer redius



) {
        // do some magic!
        return new ResponseEntity<InlineResponse200>(HttpStatus.OK);
    }

}
