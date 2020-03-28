package com.example.Onlineshoppingweb.endpoint;

import com.example.Onlineshoppingweb.endpoint.dto.response.CityResponse;
import com.example.Onlineshoppingweb.endpoint.dto.response.PageResponse;
import com.example.Onlineshoppingweb.model.CityEntity;
import com.example.Onlineshoppingweb.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping(value = "/api/v1")
public class ShoppingController {

    @Autowired
    private ShoppingService shoppingService;

    @GetMapping("/test")
    ResponseEntity<String> shopping(@RequestParam(required = false) String sort) {
        String a = shoppingService.function1(1) + sort;
        return ResponseEntity.ok(a);
    }

    @GetMapping("/city/{id}")
    ResponseEntity<PageResponse<CityResponse>> shopping(@PathVariable(value = "id") Integer id) {
        CityEntity cityEntity = shoppingService.findCityById(id);
        PageResponse<CityResponse> pageResponse = new PageResponse<>();
        pageResponse.setResults(Arrays.asList(new CityResponse(cityEntity)));
        pageResponse.setCurrentPage(0);
        pageResponse.setNoOfRecordsInPage(1);
        return ResponseEntity.ok(pageResponse);
    }

    @PostMapping("/city")
    ResponseEntity<PageResponse<String>> shopping() {
        return null;
    }


}
