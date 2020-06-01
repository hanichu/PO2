package myThings.first;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class dungeon {

    // in una situazione con piú files sarebbe da mettere insieme al main
    public static double maxScore(@Nullable Room start){
        if (start == null) return 0.;
       return maxScore(start.n) + maxScore(start.o) + maxScore(start.s) + maxScore(start.e);
    }

    private static Random rnd = new Random();

    public static void main(String[] args) {
        Room r11 = new Room(null, null, null, null);

        double score;
    }

    //static perché tutte in una classe, altrimenti non serve statico
    public static class Room {
        @NotNull
        private Collection<Treasure> treasures;
        @Nullable
        final Room n, o, s, e;

        public Room(@NotNull Collection<Treasure> treasures, @Nullable Room n, @Nullable Room o, @Nullable Room s, @Nullable Room e){
            this.treasures = treasures;
            this.n = n;
            this.o = o;
            this.s = s;
            this.e = e;
        }

        public Room(@Nullable Room n, @Nullable Room o, @Nullable Room s, @Nullable Room e) {
            Collection<Treasure> ts = new ArrayList<>();
            for (int i = 0; i < rnd.nextInt(10); i++){
                ts.add(new Treasure(rnd.nextInt(10), rnd.nextInt(50), rnd.nextInt(100)));
            }
            this.treasures = ts;
            this.n = n;
            this.o = o;
            this.s = s;
            this.e = e;
        }

        public double getScore() {
            double r = 0.;
            for (Treasure t : treasures){
                r += t.getValue();
            }
            return r;
        }
    }

    public static class Treasure {
        private int gold, silver, bronze;

        public Treasure(int g, int s, int b){
            this.gold = g;
            this.silver = s;
            this.bronze = b;
        }


        public double getValue(){
            return gold*5 + silver*2 + bronze;
        }
    }
}
