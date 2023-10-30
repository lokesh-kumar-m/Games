package com.hello.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hello.springdemo.game.Contra;
import com.hello.springdemo.game.Mario;
import com.hello.springdemo.game.gameRunner;
import com.hello.springdemo.game.pacman;

@SpringBootApplication
public class Game01Application {

	public static void main(String[] args) {
		//var game=new Mario();
	    //var game=new Contra();
	    var game=new pacman();
		var gameRunner=new gameRunner(game);
		gameRunner.run();
	}

}
