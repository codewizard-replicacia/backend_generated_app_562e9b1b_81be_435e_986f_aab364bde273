package com.mycompany.group234.model.complex;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
@Data
public class Person {
  
	
  @Column(name = "\"PersonId\"", nullable = true)
  private Integer personId;
	
  @Column(name = "\"AadharNo\"", nullable = true)
  private Integer aadharNo;
}
