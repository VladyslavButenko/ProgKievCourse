package rectangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        int height = 1;
        int width = 1;

        CharacterToDraw plainCharacter = new CharacterToDraw();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Height is: ");
            height = Integer.parseInt(reader.readLine());
            if (height <= 0)
                throw new IOException("Height can't be 0 or less!");
            System.out.print("Width is: ");
            width = Integer.parseInt(reader.readLine());
            if (width <= 0)
                throw new IOException("Width can't be 0 or less!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Try again");
        }

        for (int currentHeight = 0; currentHeight < height; currentHeight++) {
            for (int currentWidth = 0; currentWidth < width; currentWidth++) {
                if (currentHeight == 0 && currentWidth == 0)
                    plainCharacter.draw('ᒥ');
                else if (currentHeight == 0 && currentWidth == width - 1) {
                    plainCharacter.draw('ᒣ');
                    plainCharacter.draw('\n');
                } else if (currentHeight == height - 1 && currentWidth == 0)
                    plainCharacter.draw('ᒪ');
                else if (currentHeight == height - 1 && currentWidth == width - 1)
                    plainCharacter.draw('ᒧ');
                else if (currentHeight == 0 && currentWidth >= 1)
                    plainCharacter.draw('-');
                else if (currentHeight == height - 1 && currentWidth >= 1)
                    plainCharacter.draw('-');
                else if (currentHeight >= 1 && currentWidth == 0)
                    plainCharacter.draw('|');
                else if (currentHeight >= 1 && currentWidth == width - 1) {
                    plainCharacter.draw('|');
                    plainCharacter.draw('\n');
                } else if (currentHeight >= 1 && currentWidth >= 1)
                    plainCharacter.draw(' ');

            }
        }

    }
}
