package Entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Matt on 4/4/2018.
 * This is to manage the different classes, had to call them groups becuase Class interferes with java
 */

@Entity(tableName = "groups")
public class Group {

    @PrimaryKey(autoGenerate = true)
    private int groupId;

    @ColumnInfo(name = "groups_name")
    private String groupName;

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
