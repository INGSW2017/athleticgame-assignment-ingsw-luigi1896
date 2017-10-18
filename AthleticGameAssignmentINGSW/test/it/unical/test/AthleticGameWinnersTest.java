package it.unical.test;

import java.time.Instant;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnersTest {

	static AthleticGame game;
	
	
	
	@BeforeClass
	public static void init() {
		
		game = new AthleticGame("calcio");
		
	}
	
	@After
	public void resetTest() {
		
		game.reset();
		
	}
	
	@Before
	public void startTest() {
		
		game.start();
		
	}
	
	@Test
	public void winnerTest() {
		
		game.addArrival("Luigi", Instant.now().plusMillis(1000));
		game.addArrival("Simone", Instant.now().plusMillis(2000));
		game.addArrival("Angelo", Instant.now().plusMillis(3000));
		
		Assert.assertEquals("Luigi", game.getWinner());
		
	}
	
	
	@Test
	public void winnerTest2() {
		
		game.addArrival("Luigi", Instant.now().plusMillis(100));
		game.addArrival("Simone", Instant.now().plusMillis(100));
		game.addArrival("Francesco", Instant.now().plusMillis(3000));
		
		Assert.assertEquals("Simone", game.getWinner());
		
	}
	
	
	
	
}
