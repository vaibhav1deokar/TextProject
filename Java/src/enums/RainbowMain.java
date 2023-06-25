package enums;

import java.util.Arrays;

public class RainbowMain {

	public static void main(String[] args) {

		RainbowColour c1 = RainbowColour.BLUE;
		c1.discription();

		RainbowColour c2 = RainbowColour.RED;
		c2.discription();
		
		RainbowColour rb [] = RainbowColour.values();
		System.out.println(Arrays.toString(rb));
	}
}
