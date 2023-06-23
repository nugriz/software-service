package com.microservice.software.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.*;

@Setter //Untuk Set Paramater
@Getter //Untuk Get Paramater
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@AllArgsConstructor
@NoArgsConstructor
@Builder //
@Entity //Untuk Memberikan Identitas Data yang mengakses ke Database
public class Software {
	
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // Untuk Menggenerate AutoIncrement
    private Long id;

	@Column(name = "nama")
	private String nama;
	
	@Column(name = "harga")
	private Long harga;
	
//	@Column(name = "hardwares")
//	private List<Hardware> hardwares;

	@Override
	public String toString() {
		return "Hardware [id=" + id + ", nama=" + nama + ", harga=" + harga + ", hardwares="
				+ "]";
	}

//	public Long getId() {
//		// TODO Auto-generated method stub
//		return this.id;
//	}
	
	
	
}