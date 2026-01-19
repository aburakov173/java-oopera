class MusicalShow extends Show {
    private final String musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Director director, String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    // Геттеры для доступа к полям
    public String getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }

    // Метод для вывода либретто
    public void printLibretto() {
        System.out.println("Текст либретто спектакля '" + getTitle() + "':");
        System.out.println(librettoText);
    }
}