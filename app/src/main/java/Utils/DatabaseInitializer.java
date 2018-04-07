package Utils;

import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.util.Log;

import java.util.List;


import Entities.Assignment;
import Entities.Group;

/**
 * Created by Matt on 4/6/2018.
 * This is the class that that classes for the activites call to interact with the database
 */

public class DatabaseInitializer {

    public static final String TAG = DatabaseInitializer.class.getName();

    public void populateAsync(@NonNull AppDatabase db) {
        PopulateDbAsync task = new PopulateDbAsync(db);
        task.execute();
    }

    //Method to delete a single assignment

    public static void delAssignment(@NonNull AppDatabase db, Assignment a) {
        db.assignmentDao().delHw(a);
        Log.d(TAG, "Deleted item: " + a.getName());
    }

    //Method to get homework List

    public List<Assignment> getHwList(@NonNull AppDatabase db) {
        List<Assignment> hw = db.assignmentDao().getAll();
        Log.d(TAG, "Returned HW list with size of: " + hw.size());
        return hw;
    }

    //Method to get Group List

    public List<Group> getGroupList(@NonNull AppDatabase db) {
        List<Group> groups = db.groupDao().getGroups();
        Log.d(TAG, "Returned Group list with size of: " + groups.size());
        return groups;
    }

    //Method to add a groups

    public void addGroup(@NonNull AppDatabase db, Group c) {
        db.groupDao().insertGroup(c);
        Log.d(TAG, "Added " + c.getGroupName() + " Group");
    }

    //Method to get all homework for group

    public List<Assignment> hwForGroup(@NonNull AppDatabase db, Group x){
        int id = x.getGroupId();
        List<Assignment> hw = db.assignmentDao().getAllForGroup(id);
        Log.d(TAG,"Returned assignments for group: " + x.getGroupName()+" Size: " +hw.size());
        return hw;
    }

    //Method to clear the HW List

    public void nukeHwList(@NonNull AppDatabase db){
        db.assignmentDao().nukeTable();
        Log.d(TAG,"Nuked Hw List");
    }

    //Method to clear the Group List

    public void nukeGroupList(@NonNull AppDatabase db){
        db.groupDao().nukeTable();
        Log.d(TAG,"Nuked Group List");
    }

    private static class PopulateDbAsync extends AsyncTask<Void, Void, Void> {
        private final AppDatabase mDb;

        PopulateDbAsync(AppDatabase db) {
            mDb = db;
        }

        @Override
        protected Void doInBackground(final Void... params) {
            return null;
        }


    }
}
