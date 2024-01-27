package org.krylov.entity.baseReadings;


//засчет этого класса можно производить расширения путем добавления новых показаний
public class Readings extends ReadingsAbstract {

    //формальное новое показание для теста
    int electricity;
    //формальный конструктор для передачи нового показания
    public Readings(int hot_waters, int cold_waters, int heating, int electricity) {
        super(hot_waters, cold_waters, heating);
        this.electricity = electricity;
    }

    public Readings(int hot_waters, int cold_waters, int heating) {
        super(hot_waters, cold_waters, heating);
    }

    public Readings() {
    }
}
