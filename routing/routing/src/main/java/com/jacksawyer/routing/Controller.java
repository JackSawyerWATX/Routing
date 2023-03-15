package com.jacksawyer.routing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

//Class
public class Controller {

 @GetMapping("/q/{city}/{county}/{state}")

 public String insert(@PathVariable("city") String city,
                      @PathVariable("county") String county,
                      @PathVariable("state") String state) {

     // Print and display name and age
     return ("City: " + city + " County: " + county + " State: " + state);
 }
}