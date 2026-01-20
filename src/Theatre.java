
public class Theatre {
    public static void main(String[] args) {

        // 1. Создаём трёх актёров
        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 1.80);
        Actor actor2 = new Actor("Мария", "Петрова", Gender.FEMALE, 1.65);
        Actor actor3 = new Actor("Алексей", "Сидоров", Gender.MALE, 1.75);

        // 2. Создаём двух режиссёров
        Director director1 = new Director("Андрей", "Смирнов", Gender.MALE, 15);
        Director director2 = new Director("Елена", "Васильева", Gender.FEMALE, 10);

        // 3. Создаём автора музыки и хореографа
        String musicAuthor = "Пётр Чайковский";
        String choreographer = "Юрий Григорович";


        // Вывод созданных объектов
        System.out.println("Актёры:");
        System.out.println(actor1);
        System.out.println(actor2);
        System.out.println(actor3);


        System.out.println("\nРежиссёры:");
        System.out.println(director1);
        System.out.println(director2);


        System.out.println("\nАвтор музыки: " + musicAuthor);
        System.out.println("Хореограф: " + choreographer);

        // Создаём спектакли
        Show regularShow = new Show("Гамлет", 180, director1);
        Opera operaShow = new Opera("Евгений Онегин", 240, director2, musicAuthor, "Текст либретто оперы...", 60);
        Ballet balletShow = new Ballet("Лебединое озеро", 150, director1, musicAuthor, "Текст либретто балета...", choreographer);

        // Распределяем актёров по спектаклям
        System.out.println();
        regularShow.addActor(actor1);
        regularShow.addActor(actor2);

        operaShow.addActor(actor1);
        operaShow.addActor(actor3);

        balletShow.addActor(actor2);
        balletShow.addActor(actor3);

        // Выводим списки актёров для каждого спектакля
        System.out.println();
        System.out.println(regularShow);
        System.out.println(operaShow);
        System.out.println(balletShow);

        // Заменяем актёра в одном из спектаклей
        System.out.println("Замена актера:");
        Actor newActor = new Actor("Ольга", "Морозова", Gender.FEMALE, 1.70);
        operaShow.replaceActor(newActor, "Сидоров");


        // Ещё раз выводим список актёров для изменённого спектакля
        System.out.println(operaShow);

        // Пытаемся заменить несуществующего актёра
        System.out.println("Ещё замена актера:");
        regularShow.replaceActor(actor3, "Кузнецов");

        // Выводим либретто для оперного и балетного спектакля
        System.out.println();
        operaShow.printLibretto();
        balletShow.printLibretto();
    }
}