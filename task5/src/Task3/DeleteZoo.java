package Task3;

import Task2.Zoo;

public class DeleteZoo {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.setAnimals();
        zoo.getAnimals().remove(3);
        zoo.getAnimals().remove(5);
        //Эту команду выполнить невозможно потому
        // что после удаления двух предыдущих элементов
        // размер массива уменшается и выдается
        // ошибка выход за переделы массива
        //zoo.getAnimals().remove(7);
        System.out.println(zoo.getAnimals().size());

    }
}
