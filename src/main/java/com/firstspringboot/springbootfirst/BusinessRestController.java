package com.firstspringboot.springbootfirst;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BusinessRestController {

    private BusinessMasterRepository repo;


        @GetMapping("/business")
        public List<Business> getAllBusiness() {
            return repo.findAll();
        }

        @GetMapping("/business/{business_id}")
        public Business getBusiness_id(
                @PathVariable(value = "business_id") Integer business_id) {
            return repo.findBusinessById(business_id);
        }

        @PostMapping("/business")
        @ResponseStatus(HttpStatus.CREATED)
        public Business addBusiness(
                @RequestBody Business business) {
            return repo.save(business);
        }

        @PutMapping("/business/{business_id}")
        public ResponseEntity<Object> updateBusiness(
                @RequestBody Business business,
                @PathVariable Integer business_id) {

            Optional<Business> businessRepo
                    = Optional.ofNullable(
                    repo.findBusinessById(business_id));

            if (!businessRepo.isPresent())
                return ResponseEntity
                        .notFound()
                        .build();

            business.setBusiness_id(business_id);

            repo.save(business);

            return ResponseEntity
                    .noContent()
                    .build();
        }

    }





