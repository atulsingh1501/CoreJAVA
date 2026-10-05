package PROJRCTS.AudioPlayer;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class AudioPlayer {
    static void main() {
        String filePath = "C:\\Users\\ritik\\IdeaProjects\\MyFirstProject\\src\\PROJRCTS\\AudioPlayer\\Sunflower.wav";
        File file = new File(filePath);

        try( Scanner sc = new Scanner(System.in);
             AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while(!response.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = stop");
                System.out.println("R = reset");
                System.out.println("Q = Quit");
                System.out.println("enter you choice: ");
                response = sc.next().toUpperCase();

                switch(response){
                    case "P" ->clip.start();
                    case "S" ->clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }
        }catch (FileNotFoundException e){
            System.out.println("could not locate file");

        }
        catch (LineUnavailableException e){
            System.out.println("Unable to accces audio resource");

        }
        catch (IOException e){
            System.out.println("Something went Wrong");

        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported");
        }
        finally {
            System.out.println("byee");
        }
    }

}
