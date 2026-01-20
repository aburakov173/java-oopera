import java.util.ArrayList;
import java.util.List;

// Класс Show (спектакль)
class Show {
    private String title;
    private int duration;
    private Director director;
    private List<Actor> listOfActors;

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public List<Actor> getListOfActors() {
        return listOfActors;
    }


    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration; // длительность в минутах
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor + " уже участвует в спектакле «" + title + "».");
        } else {
            listOfActors.add(actor);
            System.out.println("Актёр " + actor + " добавлен в спектакль «" + title + "».");
        }
    }

    public void replaceActor(Actor newActor, String surnameToReplace) {
        int index = -1;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surnameToReplace)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Актёра с фамилией " + surnameToReplace + " не найдено в спектакле «" + title + "».");
        } else {
            listOfActors.set(index, newActor);
            System.out.println("Актёр с фамилией " + surnameToReplace + " заменён на " + newActor + " в спектакле «" + title + "».");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Спектакль '" + title + "':\n");
        sb.append("  Длительность: " + duration + " мин\n");
        sb.append("  Режиссёр: " + director + "\n");
        sb.append("  Список актёров:\n");

        for (Actor actor : listOfActors) {
            sb.append("    - " + actor + "\n");  // используем toString() у Actor
        }

        return sb.toString();
    }
}