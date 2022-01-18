import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Random;

@DatabaseTable(tableName = "entries")
public class Entry {
    private static final Random random = new Random();
    @DatabaseField(id = true)
    private String name;
    @DatabaseField
    private Double number;

    public Entry() {}

    public Entry(String name) {
        this(name, random.nextDouble());
    }

    public Entry(String name, Double number) {
        this.name = name;
        this.number = number;
    }

    public String toString() {
        return getName() + ": " + getNumber();
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    Double getNumber() {
        return number;
    }

    void setNumber(Double number) {
        this.number = number;
    }
}
