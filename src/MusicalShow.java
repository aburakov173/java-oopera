// Класс MusicalShow (музыкальный спектакль) — наследник Show
class MusicalShow extends Show {
    private final String musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Director director, String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println("Текст либретто спектакля '" + getTitle() + "':");
        System.out.println(librettoText);
    }

    public String getTitle() {
        return super.title;
    }
}