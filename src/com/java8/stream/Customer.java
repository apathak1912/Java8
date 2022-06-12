package com.java8.stream;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@Entity
@NoArgsConstructor
public class Customer {
  //@Id
  //@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  private String name;
  private Integer tier;
}