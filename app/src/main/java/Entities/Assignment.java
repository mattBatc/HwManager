package Entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

import static android.arch.persistence.room.ForeignKey.CASCADE;

/**
 * Created by Matt on 4/4/2018.
 */

@Entity(foreignKeys = @ForeignKey(entity = Class.class, parentColumns = "classId", childColumns = "classId", onDelete = CASCADE))

public class Assignment {

    @PrimaryKey(autoGenerate = true)
    int id;

    @ColumnInfo(name = "asgn_name")
    String name;

    //@ColumnInfo(name = "Due Date")
    Date date;

    @ColumnInfo(name = "classId")
    int classId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }
}

