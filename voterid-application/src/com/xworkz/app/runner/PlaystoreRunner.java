package com.xworkz.app.runner;

import java.time.LocalDate;

import com.xworkz.app.Dto.PlaystoreDto;
import com.xworkz.app.services.PlaystoreServices;
import com.xworkz.app.constant.AppNameConstant;
import com.xworkz.app.constant.AppTypeConstant;

public class PlaystoreRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         PlaystoreDto shopping = new PlaystoreDto(AppNameConstant.MYNTRA.toString(),"100MB",AppTypeConstant.SHOPPING.toString(),LocalDate.now(),LocalDate.now());
         PlaystoreDto ludo = new PlaystoreDto(AppNameConstant.TEMPLERUN.toString(),"200MB",AppTypeConstant.GAME.toString(),LocalDate.of(2024, 8, 10),LocalDate.of(2024, 8, 15));
         PlaystoreDto youtube = new PlaystoreDto(AppNameConstant.YOUTUBE.toString(),"100MB",AppTypeConstant.ENTERTAINMENT.toString(),LocalDate.of(2023, 1, 1),LocalDate.of(2023, 11, 24));
         PlaystoreServices play = new PlaystoreServices();
         play.save(youtube);
         play.save(ludo);
         play.save(shopping);
         System.out.println("==================");
         play.read();
         System.out.println("==================");
         play.searchApp("ludo");
         System.out.println("==================");
         play.searchByType("game");
         System.out.println("==================");
         play.searchBySize("100MB");
         System.out.println("==================");
         play.searchByRdate("2024, 8, 10");
         
	}

}
