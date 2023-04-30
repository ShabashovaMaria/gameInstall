import java.io.*;



public class Main {
    public static void main(String[] args) throws IOException {

        createDir("C:\\Users\\shaba\\OneDrive\\Рабочий стол\\Games\\src");
        createDir("C:\\Users\\shaba\\OneDrive\\Рабочий стол\\Games\\savegames");
        createDir("C:\\Users\\shaba\\OneDrive\\Рабочий стол\\Games\\res");
        createDir("C:\\Users\\shaba\\OneDrive\\Рабочий стол\\Games\\temp");
        createDir("C:\\Users\\shaba\\OneDrive\\Рабочий стол\\Games\\src\\main");
        createDir("C:\\Users\\shaba\\OneDrive\\Рабочий стол\\Games\\src\\test");
        createDir("C:\\Users\\shaba\\OneDrive\\Рабочий стол\\Games\\res\\drawables");
        createDir("C:\\Users\\shaba\\OneDrive\\Рабочий стол\\Games\\res\\vectors");
        createDir("C:\\Users\\shaba\\OneDrive\\Рабочий стол\\Games\\res\\icons");

        createFile("C:\\Users\\shaba\\OneDrive\\Рабочий стол\\Games\\src\\main\\Main.java");
        createFile("C:\\Users\\shaba\\OneDrive\\Рабочий стол\\Games\\src\\main\\Utils.java");

        createFile("C:\\Users\\shaba\\OneDrive\\Рабочий стол\\Games\\temp//temp.txt");

    }

    public static void createDir(String nameDir) {
        StringBuilder stringBuilder = new StringBuilder();
        File dir = new File(nameDir);
        if (dir.mkdir()) {
            stringBuilder.append("Директория " + dir.getName() + " создана успешно");
        } else
            System.out.println("Такой директории нет");
        fileWhrite(stringBuilder);
    }

    public static void createFile(String nameFile) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        File file = new File(nameFile);
        if (file.createNewFile()) {
            stringBuilder.append("Файл " + file.getName() + " создан успешно");
        } else
            System.out.println("Такого файла нет");
        fileWhrite(stringBuilder);
    }

    public static void fileWhrite(StringBuilder str) {
        String text = str.toString();
        try (FileWriter writer = new FileWriter("C:\\Users\\in_sd\\IdeaProjects\\Installation\\Games\\temp//temp.txt", true)) {
            writer.write(text);
            writer.append('\n');
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }
    }
}



//    В данной задаче Вы потренируетесь работать с файлами и каталогами
//    в файловой системе, используя язык Java и класс File, и смоделируете
//    процесс установки игры на жесткий диск комьютера.
//
//        Предварительно вручную создайте папку Games в удобном для Вас месте.
//        Имейте ввиду, что у папки Games должны быть права на запись и чтение.
//        Например, в операционной системе macOS можно создать папку
//        по следующему пути /Users/admin/Games. В ОС Windows можете создать
//        папку на одном из доступных жестких дисков, например D://Games.
//
//        Установку программы необходимо производить из Java кода с
//        использованием класса File. Процесс будет состоять из следующих этапов:
//
//        В папке Games создайте несколько директорий: src, res, savegames, temp. ++
//        В каталоге src создайте две директории: main, test.++
//        В подкаталоге main создайте два файла: Main.java, Utils.java.++
//        В каталог res создайте три директории: drawables, vectors, icons.
//        В директории temp создайте файл temp.txt.
//        Файл temp.txt будет использован для записиси в него информации
//        об успешноном или неуспешном создании файлов и директорий.
//
//        Реализация
//        Для работы с файлом или директорией необходимо создать для них
//        свой экземпляр класса File, передав в конструктор адрес к файлу
//        или директории. Создать директорию можно с помощью метода mkdir(),
//        который возвращает true или false в зависимости от того, была ли директория создана успешно.
//
//        Для создания файла можно использовать метод createNewFile(),
//        который так же возвращает boolean. Обратите внимание, что этот
//        метод пробрасывает IOException. Необходимо обернуть его в блок try-catch.
//
//        Для сохранения лога используйте экземпляр класса StringBuilder.
//        Добавляйте в него всю информацию о создании файлов и каталогов.
//        Далее возьмите из него текст и запишите его в файл temp.txt с помощью класса FileWriter.
//
//        В результате выполнения программы, на жестком диске комьютера
//        в папке Games должны появиться вышеуказанные файлы и директории.
//        Файл temp.txt должен содержать информацию о том, что все файлы были созданы успешно.