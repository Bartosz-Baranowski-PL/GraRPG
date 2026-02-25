package game.Hero.Stats;

public class Condicion {
    private static Condicion instance;

    private Condicion() {}

    public static Condicion getInstance() {
        if (instance == null) {
            instance = new Condicion();
        }
        return instance;
    }

    private int level;
    private int expCondicionOnNextLevel;
    private int maxCondicion;
    private int condicion;

    public int changeCondicion(int amount){
        condicion+=amount;
        System.out.println("Odzyskano część kondycji");
        if (condicion>maxCondicion){
            condicion=maxCondicion;
            return condicion;
        }
        return condicion;
    }

    public void changeMaxCondicion(int amount){
        maxCondicion+=amount;
        System.out.println("Zwiększyłeś maksymalną kondycję o "+amount);
    }
}
