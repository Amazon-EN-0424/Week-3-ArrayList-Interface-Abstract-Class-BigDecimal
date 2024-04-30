import java.util.ArrayList;

public class videoGameShop {

    public static void main(String[] args) {



                var videoGames = new ArrayList<String>();
                videoGames.add("FC24");
                videoGames.add("Assassin's Creed");
                videoGames.add("Among us");
                videoGames.add("Rocket League");
                System.out.println(videoGames);
                videoGames.remove(2);
                videoGames.set(2, "Harry Potter");
                System.out.println(videoGames);





    }

}
