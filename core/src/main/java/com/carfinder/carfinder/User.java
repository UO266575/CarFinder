package com.carfinder.carfinder;

import java.time.LocalDate;

enum Tipo {
  ADMIN,
  SEARCHER
};

public record User(String name, String lastName, String dni, String userName, String password, LocalDate d, Tipo t){
    
}
