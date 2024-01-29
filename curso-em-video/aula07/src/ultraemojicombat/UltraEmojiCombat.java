package ultraemojicombat;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty boy", "França", 68.9f, 1.75f, 31, 11, 2, 1);

        l[1] = new Lutador("Putscript", "Brasil", 57.5f, 1.68f, 29, 14, 2, 3);

        l[2] = new Lutador("Snapshadow", "EUA", 80.9f, 1.65f, 35, 12, 2, 1);

        l[3] = new Lutador("Dead Code", "Autralia", 81.6f, 1.93f, 28, 13, 0, 2);

        l[4] = new Lutador("UFoCobol", "Brasil", 119.3f, 1.70f, 37,  5, 4, 3);

        l[5] = new Lutador("Nerdaart", "EUA", 105.7f, 1.81f, 30,  12, 2, 4);


        Lutar UEC01 = new Lutar();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
    }
}
