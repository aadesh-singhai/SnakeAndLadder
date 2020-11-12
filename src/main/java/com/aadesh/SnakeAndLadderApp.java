package com.aadesh;

import java.util.ArrayList;
import java.util.HashMap;

import javax.imageio.IIOException;

import com.aadesh.service.GameRegister;
import com.aadesh.service.SnakeAndLadder;
import com.aadesh.service.SnakeAndLadderImpl;
import com.aadesh.utils.FileParser;
import com.aadesh.utils.FileParserFactory;

/**
 * Description - This is the main executable class, that is reponsible for
 * starting the whole process of Playing Snake & Ladder.
 * 
 * 
 * @author Aadesh Singhai
 * @version 0.0.1
 */

public class SnakeAndLadderApp {

	/**
	 * Description - This is main method of the Program, responsible for - 
	 * 			1.Reading the input file path. 
	 * 			2.Executing the File Parser, to read the contents of the file. 
	 * 			3.Starting the process of GameRegister. 
	 * 			4.Staring the automatic snake and ladder game.
	 * 
	 * @param args - Command line arguements passed, here File path passed that will
	 *             contain the input players,snakes and ladders
	 *
	 */
	public static void main(String[] args) {
		try {
			String uri = args[0];
			if (uri.length() == 0)
				throw new IIOException("No File Path Found");
			FileParser fileParser = FileParserFactory.INSTANCE.getFileParser("txt", uri);
			ArrayList<HashMap<String,String>> input = fileParser.parseFile();
			GameRegister game = new GameRegister(input);
			SnakeAndLadder snlGame = new SnakeAndLadderImpl();
			snlGame.startGame(game);

		} catch (Exception e) {
			System.out.println("[ERROR!] "+e.getMessage());
		}

	}
}
