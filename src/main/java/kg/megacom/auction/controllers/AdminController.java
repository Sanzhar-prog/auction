package kg.megacom.auction.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.auction.models.dtos.LotDto;
import kg.megacom.auction.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/admin")
@Api(description = "Admin controller")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping(value = "/lot/save")
    @ApiOperation(value = "Lot saving Controller")
    public ResponseEntity<?> saveLot(@Valid @RequestBody LotDto lotDto){
          return new ResponseEntity<>(adminService.createLot(lotDto), HttpStatus.OK);
    }
}
