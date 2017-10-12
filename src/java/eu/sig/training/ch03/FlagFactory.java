package eu.sig.training.ch03;

import java.awt.Color;
import java.util.*;

public class FlagFactory {

    private static Map<Nationality, List<Color>> flags = new HashMap<>();
    static {
        flags.put(Nationality.DUTCH, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
        flags.put(Nationality.GERMAN, Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW));
        flags.put(Nationality.BELGIAN, Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED));
        flags.put(Nationality.FRENCH, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
        flags.put(Nationality.ITALIAN, Arrays.asList(Color.GREEN, Color.WHITE, Color.RED));
        flags.put(Nationality.ROMANIA, Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED));
        flags.put(Nationality.IRELAND, Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE));
        flags.put(Nationality.HUNGARIAN, Arrays.asList(Color.RED, Color.WHITE, Color.GREEN));
        flags.put(Nationality.BULGARIAN, Arrays.asList(Color.WHITE, Color.GREEN, Color.RED));
        flags.put(Nationality.RUSSIA, Arrays.asList(Color.WHITE, Color.BLUE, Color.RED));
    }

    public List<Color> getFlagColors(Nationality nationality) {
        List<Color> result = flags.get(nationality);

        return result != null ? result : Arrays.asList(Color.GRAY);
    }

}