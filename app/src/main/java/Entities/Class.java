package Entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Matt on 4/4/2018.
 */
@Entity
public class Class {

    @PrimaryKey(autoGenerate = true)
    int id;

    @ColumnInfo(name = "class_name")
    String className;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
