package DAOs;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import Entities.Group;

/**
 * Created by Matt on 4/6/2018.
 */
@Dao
public interface GroupDao {

    @Insert
    void insertGroup(Group...groups);

    @Update
    void updateGroup(Group...groups);

    @Query("SELECT * FROM groups")
    List <Group> getGroups();

    @Query("DELETE FROM groups")
    void nukeTable();

}
