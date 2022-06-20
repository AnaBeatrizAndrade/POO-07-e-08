public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Pretty", "França", 31, 1.75f, 68.9f, 11, 2, 1);

        l[1] = new Lutador("Put", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);

        l[2] = new Lutador("Show", "EUA", 35, 165f, 80.9f, 12, 2, 1);

        l[3] = new Lutador("Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);

        l[4] = new Lutador("UFO", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);

        l[5] = new Lutador("Nerd", "EUA", 30, 1.81f, 105.f, 12, 2, 4);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[4], l[5]);
        UEC01.lutar();
        l[0].status();
        l[1].status();
    }
}
