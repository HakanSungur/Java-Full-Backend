package projem.northwind.entities.dtos;

import lombok.Data;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

//Dto yu burada trasfer edilen obje olarak nitelendirebiliriz. 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductWithCategoryDto {
	private int id;
	private String productName;
	private String categoryName;
}
